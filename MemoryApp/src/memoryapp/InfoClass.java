package memoryapp;
import java.util.ArrayList;
import Memory.MemoryDeficit;
import Memory.Alzheimer;
import Memory.Amnesia;

public class InfoClass {
    public static ArrayList<MemoryDeficit> memoryArrayList = new ArrayList<>();

    public static void addMemory(MemoryDeficit def) {
        memoryArrayList.add(memoryArrayList.size(), def);
    }

    public static String getAllMemory() {
        String str = "";
        int size = memoryArrayList.size();
        for(int i=0; i < size; i++) {
            str += memoryArrayList.get(i).toString();
        }
        return str;
    }

    public static String getAmnesia() {
        String str = "";
        int size = memoryArrayList.size();
        for(int i=0; i < size; i++) {
            if(memoryArrayList.get(i) instanceof Amnesia) {
                str = memoryArrayList.get(i).toString();
            }
        }
        return str;
    }

    public static String getAlzheimer() {
        String str = "";
        int size = memoryArrayList.size();
        for(int i=0; i < size; i++) {
            if(memoryArrayList.get(i) instanceof Alzheimer) {
                str = memoryArrayList.get(i).toString();
            }
        }
        return str;
    }

    public static MemoryDeficit searchMemory(String id) {
        MemoryDeficit mem = null;
        int size = memoryArrayList.size();
        for(int i=0; i < size; i++) {
            mem = memoryArrayList.get(i);
            if(id == mem.getDeficit_id()) {
                return mem;
            }
        }
        return null;
    }

    public static String showTotalMemory() {
        return "Total Deficits: " + MemoryDeficit.getTotalDeficit() +
                "\nTotal Alzheimers: " + Alzheimer.getTotalAlzheimer() +
                "\nTotal Amnesics: " + Amnesia.getTotalAmnesia();
    }

}
