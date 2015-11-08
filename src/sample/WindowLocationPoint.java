package sample;

/**
 * Created by brian on 11/8/15
 * at 17 : 36 ,
 * working on StickyNotes.
 */
public class WindowLocationPoint {
    private double x,y;
    public WindowLocationPoint(double x,double y){
        this.x=x;
        this.y=y;
    }
    public WindowLocationPoint(){

    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }
}
