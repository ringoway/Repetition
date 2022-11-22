package Main;

import java.io.Serializable;

abstract public class Heroes implements Serializable {
    private String name;
    private int level=1;
    transient private Point place;

    public Heroes(String name) throws Exception {
        this.name = name;
        place = new Point(0,0);
    }
    abstract public void greet();
}
