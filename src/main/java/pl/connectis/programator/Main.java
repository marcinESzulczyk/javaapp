package pl.connectis.programator;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*DescriptiveStatistics stats = new DescriptiveStatistics();

        for (int i =1;i<=5;i++){
            stats.addValue(i);
        }

        double mean = stats.getMean();
        double std = stats.getStandardDeviation();
        double median = stats.getPercentile(50);
        System.out.println(mean);
        System.out.println(std);
        System.out.println(median);*/

        PatientManagerClass patientManagerClass = new PatientManagerClass();

        List<Patient> patientList = new ArrayList<>();
        Patient patient1= new Patient("Michał", "Bajor", 1987);
        Patient patient2 = new Patient("Marek", "Zagórski",1976);
        Patient patient3 = new Patient( "Kinga", "Kowalska", 1960);
        patientList.add(patient1);
        patientList.add(patient2);
        patientList.add(patient3);

        for (Patient patient:patientList){
            System.out.println(patient);
        }

        patientManagerClass.sortByName(patientList);
        for (Patient patient:patientList){
            System.out.println(patient);
        }
        //AssertJ

        patientManagerClass.sortByYob(patientList);
        for (Patient patient:patientList){
            System.out.println(patient);
        }
    }

}
