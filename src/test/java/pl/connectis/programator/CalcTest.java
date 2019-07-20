package pl.connectis.programator;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;


public class CalcTest {

    //System Under Test -> SUT
    Calc calc = new Calc();
    @Test
    @DisplayName("Special Adding")
    @Tag("important")
    void checkAdding(){
        System.out.println("Testowanie dodawania");
        assertEquals(5, calc.sum(2,3));
    }

    @Test

    void div(){

    }



    @BeforeEach
    void prepareData(){
        System.out.println("Wykonuję inicjację danych");
        List<Double> values = new ArrayList<>();
        values.add(1.0);
        values.add(2.0);
        values.add(3.0);
        values.add(4.0);
        values.add(5.0);
        calc.setValues(values);
    }
    @AfterEach
    void cleanUp(){
        System.out.println("Czyszczenie po każdym teście");
        calc.clear();
    }

    @Test
    void checkMean(){
        System.out.println("Testowanie średniej");
//assertEquals(3.0,calc.mean(values),() -> {
   // System.out.println("obliczam");
   // return "Błąd w obliczeniu sredniej";
//});
        assertEquals(3.0,calc.mean(),() -> "Błąd w obliczniu średniej");
    }

    @Test
    @Tag("time_consuming")
    void checkStd(){
        System.out.println("Testowanie odchylenia");


        assertEquals(1.5811388300841898,calc.std(),"Błąd w obliczaniu: " + calc.std());
    }
    @ParameterizedTest
    @ValueSource(ints = {2,4,6,8,12,132})
    void checkIsEven(int l){
        assertTrue(calc.isEven(l));
    }
    @ParameterizedTest
    @CsvSource({"2,3,5","3,4,7","2,6,8"})
    void checkAdding(int l1, int l2, int result){
        assertEquals(result,calc.sum(l1,l2));
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/numbers.csv")
    void checkAddingFromFile(int l1, int l2, int result){
        assertEquals(result,calc.sum(l1,l2));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/isEven.csv")
    void checkAddingFromFile(int l1, boolean result){
        assertEquals(result,calc.isEven(l1));
    }
    @Test
    void checkTimeout(){
        assertTimeout(Duration.ofMillis(1000),()->{
            Thread.sleep(398);
           // calc.mean()
        });
    }
    @Test
    void checkdiv(){
        assertEquals(2.0, calc.div(4.0,2.0));
    }










}
