package sample;

public class SortedListOfPoints {
    Point points[];
    int count;
    SortedListOfPoints(){
        points = new Point[20];
        count = 0;
    }
    public void add(Point point){
        Boolean isPlaced = false;
        for(int i = 0; i < count; i++){
            if (point.x < points[i].x) {
                for( int j = count; j >= i; j--){
                    points[j+1] = points[j];
                }
                points[i] = point;
                count++;
                isPlaced = true;
                break;
            }
            if (point.x == points[i].x){
                if (point.y < points[i].y){
                    for( int j = count; j >= i; j--){
                        points[j+1] = points[j];
                    }
                    points[i] = point;
                    count++;
                    isPlaced = true;
                    break;
                }
            }
        }
        if (!isPlaced) points[count++] = point;
    }
    public void show(){
        for (int i = 0; i < count; i++){
            System.out.println("" + points[i].x + " " + points[i].y );
        }
    }
    public Point next(Point point){
        for (int i = 0; i < count; i++){
            if (point.y < points[i].y) {
                Point buf = points[i];
                for (int j = i; j < count; j++) {
                    points[j] = points[j+1];
                }
                count--;
                return buf;
            }
        }
        return null;
    }
    public void delete(int x){
        for(int i = x; i < count; i++){
            points[i] = points[i+1];
        }
        count--;
    }
    public Point getFirst(){
        Point buf = points[0];
        for (int i = 0; i < count; i++){
            points[i] = points[i+1];
        }
        count--;
        return buf;
    }
    public Point[] getArray(){
        Point[] newPoints = new Point[100];
        int count1 = 0;
        newPoints[count1] = points[0];
        delete(0);
        for (int i = 0; i < count; i++){
            if (newPoints[count1].y < points[i].y){
                count1++;
                newPoints[count1] = points[i];
                delete(i);
                i = -1;
            }
        }
        Point[] buf = new Point[++count1];
        for (int i = 0; i < count1; i++){
            buf[i] = newPoints[i];
        }
        return buf;
    }
}
