package HomeWork1;


public class HomeWork1 {
    public static void main(String[] args) {
        int first = 5;
        int second = 10;
        /*int temp = first;
        first = second;
        second = temp;*/

        /*Your implementation*/

        first = second + first;
        second = first - second;
        first = first - second;

        System.out.println("First = " + first + " , second = " + second);
    }
}