/**
 * Created by magnusfinvik on 18.01.2016.
 */
public class Lid {
    private boolean open;

    public Lid(){
        open = false;
    }

    public void openLid(){
        open = true;
    }

    public void closeLid() {
        open = false;
    }

    public boolean isTheLidOpen() {
        return open;
    }
}
