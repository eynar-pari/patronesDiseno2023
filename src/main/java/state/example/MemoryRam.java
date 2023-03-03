package state.example;

public class MemoryRam {

    private int percentageUse;
    private String total;
    private String description;

    public MemoryRam(){}
    public MemoryRam(int percentageUse, String total, String description) {
        this.percentageUse = percentageUse;
        this.total = total;
        this.description = description;
    }

    public int getPercentageUse() {
        return percentageUse;
    }

    public void setPercentageUse(int percentageUse) {
        this.percentageUse = percentageUse;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void show(){
        System.out.println("MemoryRam>total: "+total);
        System.out.println("MemoryRam>description: "+description);
        System.out.println("MemoryRam>percentageUse: "+percentageUse+"%");
    }
}
