package week4method;
// Write a distance() function which
//        return distance from (0.0 , 0.0) to (a) :distance(int, int)
//        return the distance from a to be, if method distance get 4 int parameters:
//         distance(int x1 , int x2, int x3, int x4) where (x1, x2) are the coordinates of a


public class Task9Distance {
    static double distance(int x1, int x2) {
        double distance = Math.sqrt(x1 * x1 + x2 * x2);
        return distance;
    }
    static double distance (int x1, int x2, int x3, int x4){
        double distance = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(x4 - x2, 2));
        return distance;
    }

    public static void main(String[] args) {
        System.out.println(distance(6, 4, 13, 3));
    }
}
