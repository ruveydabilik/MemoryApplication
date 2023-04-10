package Memory;

public abstract class MemoryDeficit {

    protected String deficit_id;
    protected String memory_loss;
    protected static int totalDeficit = 0;

    public MemoryDeficit(String deficit_id, String memory_loss) {
        this.deficit_id = deficit_id;
        this.memory_loss = memory_loss;
        totalDeficit++;
    }

    public static int getTotalDeficit() {
        return totalDeficit; 
    }

    public String getMemory_loss() {
        return memory_loss;
    }

    public String getDeficit_id() {
        return deficit_id;
    }

    @Override
    public String toString() {
        String s = "";
        s += "Deficit ID: " + deficit_id + "\nMemory loss: " + memory_loss + "\n";
        return s;
    }
}
