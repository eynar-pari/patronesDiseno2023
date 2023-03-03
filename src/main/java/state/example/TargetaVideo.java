package state.example;

public class TargetaVideo {

    private int percentageUse;
    private String total;
    private String description;

    public TargetaVideo(){}
    public TargetaVideo(int percentageUse, String total, String description) {
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
        System.out.println("TargetaVideo> total: "+total);
        System.out.println("TargetaVideo> description: "+description);
        System.out.println("TargetaVideo> percentageUse: "+percentageUse+"%");
    }
}
