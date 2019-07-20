package pl.connectis.programator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SortTest {

    PatientManagerClass patientManagerClass = new PatientManagerClass();

@BeforeEach
    void prepareData(){
        System.out.println("Wykonuję inicjację danych");
        List<Patient> patientList = new ArrayList<>();
        Patient patient1= new Patient("Michał", "Bajor", 1987);
        Patient patient2 = new Patient("Marek", "Zagórski",1976);
        Patient patient3 = new Patient( "Kinga", "Kowalska", 1960);
        patientList.add(patient1);
        patientList.add(patient2);
        patientList.add(patient3);
    }
@Test
    void checkSortByName(){




    }
}
