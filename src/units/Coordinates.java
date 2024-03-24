package units;

import java.util.ArrayList;
import java.util.List;

public class Coordinates {
    protected int x, y;
    private static int width;
    private static int height;
    public Coordinates(int x, int y){
        this.x = x;
        this.y = y;
    }
    public List<Integer> getPosition(){
        List<Integer> list = new ArrayList<>();
        list.add(x);
        list.add(y);
        return list;
    }
    public int getX(){
        return x;
    }
    public  int getY(){
        return y;
    }

    public double getDistance(Coordinates target){
        double targetDistance = Math.sqrt(Math.pow(target.x - x, 2) + (Math.pow(target.y - y, 2)));
        return targetDistance;

    }
    public boolean isMove(int x, int y)
    {
        return x >= 0 && x < width && y >= 0 && y < height;
    }
    public void moveTo(int dx, int dy)
    {
        if (isMove(x +dx, y +dy))
        {
            x += dx;
            y += dy;
        }
    }
    public float distanceTo(Coordinates target)
    {
        float x = getX() - target.getX();
        float y = getY() - target.getY();
        return (float) Math.sqrt(x*x + y*y);
    }

}