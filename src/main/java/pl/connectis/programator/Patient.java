package pl.connectis.programator;

import java.util.Objects;

public class Patient implements  Comparable{
    String name;
    String surname;
    int yob;

    public Patient(String name, String surname, int yob) {
        this.name = name;
        this.surname = surname;
        this.yob = yob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return yob == patient.yob &&
                Objects.equals(name, patient.name) &&
                Objects.equals(surname, patient.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, yob);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", yob=" + yob +
                '}';
    }


    @Override
    public int compareTo(Object o) {

        Patient patient = (Patient) o;
        if (this == patient){
            return 0;
        }


            if (this.surname.equals(patient.getSurname())) {
                return this.name.compareTo(patient.getName());
            }

            return this.surname.compareTo(patient.getSurname());
        }


}
