package figures;

public class rectangle {

    double width;
    double length;

    public rectangle(double w, /*width*/ double l/*length*/){
        length = l;
        width = w;
    }

    public double square() {
        return width*length;
    }
}
