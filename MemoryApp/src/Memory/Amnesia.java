
package Memory;
import ClinicalCase.ClinicalCase;

public class Amnesia extends MemoryDeficit {

    private String amnesia_type;
    private String cause;
    private String location;
    private ClinicalCase clin;
    private static int totalAmnesia = 0;

    public Amnesia(String deficit_id, String memory_loss,String amnesia_type, String cause, String location,
            String patient_id, String patient_name, String patient_surname, int age, String gender ) {
        super(deficit_id, memory_loss);
        this.amnesia_type = amnesia_type;
        this.cause = cause;
        this.location = location;
        this.clin = new ClinicalCase(patient_id, patient_name, patient_surname, age, gender);        
        totalAmnesia++;
    }

    public static int getTotalAmnesia() {
        return totalAmnesia;
    }

    @Override
    public String toString() {
        String s = "";
        s += super.toString() + clin.toString() + "\nAmnesia type: "+ amnesia_type + "\nCause: " + cause + "\nLocation" + location ;
        return s;
    }

}
