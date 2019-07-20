package pl.connectis.programator;

import java.util.*;

public class PatientManagerClass/* implements PatientManager*/{

    List<Patient> patientList;

    //@Override
    public boolean addPatient(Patient patient) {
        patientList.add(patient);
        return true;
    }

    //@Override
    public List<Patient> sortByName(List<Patient> patientList) {
        Collections.sort(patientList);
        return patientList;
    }

    //@Override
    public List<Patient> sortByYob(List<Patient> patientList) {
       patientList.sort(Comparator.comparing(Patient::getYob));
            //@Override
           // public int compare(Patient patient1, Patient patient2) {
              //  return patient1.getYob().compareTo(patient2.getYob());
           // }
      //  });
        return patientList;
    }
}
