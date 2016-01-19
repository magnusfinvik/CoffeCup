
/**
 * Created by magnusfinvik on 18.01.2016.
 */
public class Main {

    public static void main(String[] args){
        Cup myCup = new Cup(true, "white");
        myCup.fillCup("coffee");
        myCup.heatTheContentTo(80);
        myCup.isTheCupFilled();
        System.out.println(myCup.getContent() + " " + myCup.isTheLidOpen());
    }
}
