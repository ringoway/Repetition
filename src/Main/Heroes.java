package Main;

abstract public class Heroes {
    private String name;
    private int level=1;
    private Point place;

    public Heroes(String name) {
        this.name = name;
        place = new Point(0,0);
    }
    abstract public void greet();
}
