package ClinicalCase;
import Memory.MemoryDeficit;

public class ClinicalCase {

    private String patient_id;
    private String patient_name;
    private String patient_surname;
    private int age;
    private String gender;

    public ClinicalCase(String patient_id, String patient_name, String patient_surname, int age, String gender) {
        this.patient_id = patient_id;
        this.patient_name = patient_name;
        this.patient_surname = patient_surname;
        this.age = age;
        this.gender = gender;
    }

    public String getPatient_id() {
        return patient_id;
    }

    public String getPatient_name() {
        return patient_name;
    }

    public String getPatient_surname() {
        return patient_surname;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        String s = "";
        s += "\nPatient ID: " + patient_id + "\nPatient Name: "+ patient_name + "\nPatient Surname:" +
                   patient_surname + "\nAge: " + age + "\nGender: " + gender ;
        return s;
    }
    
}
