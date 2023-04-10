package Memory;
import ClinicalCase.ClinicalCase;

public class Alzheimer extends MemoryDeficit {

    private String declining_area;
    private static int totalAlzheimer = 0;
    private ClinicalCase clin;

    public Alzheimer(String deficit_id , String memory_loss , String declining_area ,
            String patient_id,String patient_name, String patient_surname, int age, String gender) {
        
        super(deficit_id, memory_loss);
        this.declining_area = declining_area;
        this.clin = new ClinicalCase(patient_id, patient_name, patient_surname, age, gender);        
        totalAlzheimer++;
    }

    public static int getTotalAlzheimer() {
        return totalAlzheimer;
    }

    public String getDeclining_area() {
        return declining_area;
    }

    @Override
    public String toString() {
        String s = "";
        s += super.toString() + clin.toString() + "\nDeclining area: " + declining_area  ;
        return s;
    }

}
