/**
 * Created by magnusfinvik on 18.01.2016.
 */
public class Cup {

    private int temperature;
    private String content;
    private boolean lidOn = true;
    private boolean filled = false;
    private Lid lid;
    private String color = "white";

    public Cup(boolean lidOn, String color){
        lid = new Lid();
        this.lidOn = lidOn;
        this.color = color;
    }

    public int getTemperature() {
        return temperature;
    }

    public String getContent() {
        return content;
    }

    public boolean isTheLidOn() {
        return lidOn;
    }

    public boolean isTheCupFilled() {
        return filled;
    }

    public void heatTheContentTo(int temperature) {
        this.temperature = temperature;
    }

    public void fillCup(String content) {
        if(filled == false) {
            this.content = content;
            filled = true;
        } else
            System.out.println("this cup is already filled");

    }

    public void putLidOn() {
        if(lidOn)
            System.out.println("The lid is already on");
        else
            lidOn = true;
    }

    public void takeLidOff() {
        if(!lidOn)
            System.out.println("the lid is already off");
        else
            lidOn = false;
    }

    public void emptyCup() {
        filled = false;
    }

    public void openLid(){
        lid.openLid();
    }

    public void closeLid(){
        lid.closeLid();
    }

    public boolean isTheLidOpen() {
        return lid.isTheLidOpen();
    }
}
