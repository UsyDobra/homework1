package HomeWork3;

/**
 * Created by Bums2 on 5/6/2017.
 */
public class HomeWork3 {
    public static void main(String[] args) {
        int x1 = 1, y1 = 1;
        int x2 = 10, y2 = 7;
        int x3 = -3, y3 = 4;



        /*your code here*/

        double h = (Math.sqrt((Math.pow((x2-x1), 2)) + (Math.pow((y2-y1), 2))));
        double a = (Math.sqrt((Math.pow(Math.abs(((x3-x1))), 2)) + (Math.pow((y3-y1), 2))));
        double c = (Math.sqrt((Math.pow((a), 2)) + (Math.pow((h), 2))));
        double square = (a * h) / 2;
        double length = a + h + c;



        System.out.println("Length of all sides is " + length);
        System.out.println("Square is " + square);

    }
}

