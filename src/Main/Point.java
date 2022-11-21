package Main;

public class Point {
    private int x;
    private int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int distanceXY(Point point){
        int distanceXY;
        distanceXY =(int) Math.sqrt((Math.pow(point.x-this.x, 2)+
                Math.pow(point.y-this.y,2)));
        return distanceXY;
    }
}
