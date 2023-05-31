public class Point
{
    int x, y;
    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public double dist(Point p)
    {

        // The distance between vertices `(x1, y1)` & `(x2,
        // y2)` is `√((x2 − x1) ^ 2 + (y2 − y1) ^ 2)`
        return Math.sqrt((this.x - p.x) * (this.x - p.x)
                + (this.y - p.y) * (this.y - p.y));
    }
}