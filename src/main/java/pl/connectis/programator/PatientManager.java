package pl.connectis.programator;

import java.util.List;

public interface PatientManager {
//wyrzuca wyjątek TooManyPatients jeśli wiecej niż 5ciu
    // zwraca false jeśli próbujemy dodać pacjenta który istnieje
    // assertThrows(AritmeticExceptions.class, () ->calculator.divide(1,0));
    public boolean addPatient(Patient patient);

    public List<Patient> sortByName();

    public List<Patient> sortByYob();

}
