import java.util.Scanner;

public class Lab2
{
    public static void main(String[] args) {
        // ask user for a set of 3 numbers
        // ask user for another set of 3 numbers
        // set the points to cords: x1, y1, z1 as well as x2, y2, and z2

        Scanner input = new Scanner(System.in);
        //prompt user for first 3 numbers
        System.out.println("Enter the x-coordinate of point 1:");
        double cordx1 = input.nextDouble();
        System.out.println("Enter the y-coordinate of point 1:");
        double cordy1 = input.nextDouble();
        System.out.println("Enter the z-coordinate of point 1:");
        double cordz1 = input.nextDouble();

        // ask user for the other 3 numbers
        System.out.println("Enter x-coordinates of point 2:");
        double cordx2 = input.nextDouble();
        System.out.println("Enter y-coordinate of point 2:");
        double cordy2 = input.nextDouble();
        System.out.println("Enter z-coordinate of point2:");
        double cordz2 = input.nextDouble();

        double distance = (Math.sqrt(Math.pow((cordx1-cordx2),2)) + (Math.pow((cordy1-cordy2),2)) + (Math.pow((cordz1-cordz2),2)));
        System.out.println("The distance between point 1 and point 2 is:"+ distance);

        // int distance0=(int)... print equation...
    }

}
