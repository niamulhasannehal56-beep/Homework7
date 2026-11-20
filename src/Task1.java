
public class Task1 {

    // Method for integer values
    public static int calculateArea(int length, int width) {
        return length * width;
    }

    // Method for double values
    public static double calculateArea(double length, double width) {
        return length * width;
    }

    public static void main(String[] args) {

        int area1 = calculateArea(5, 4);
        double area2 = calculateArea(5.5, 4.2);

        System.out.println("Integer area: " + area1);
        System.out.println("Double area: " + area2);
    }
}
