import java.util.Scanner;
abstract class shape{
    int a,b;
    abstract void printarea();

}
class Rectangle extends shape{
    void getData (int x, int y){
        a=x;
        b=y;
    }
    void printarea(){
        double area = a*b;
        System.out.println("area of rectangle = "+ area);

    }
}
class Triangle extends shape{
    void getData (int x, int y){
        a=x;
        b=y;
    }
    void printarea (){
        double area = 0.5*a*b;
        System.out.println("area of triangle = " + area);

    }
}
class Circle extends shape{
    void getData (int r){
        a=r;
    }
    void printarea (){
        double area = 3.14159*a*a;
        System.out.println("area of circle = " + area);
        
    }
}

public class labno4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        shape s;

        System.out.println("Choose Shape:");
        System.out.println("1. Rectangle");
        System.out.println("2. Triangle");
        System.out.println("3. Circle");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                s = new Rectangle();
                System.out.print("Enter length and breadth: ");
                int l = sc.nextInt();
                int b = sc.nextInt();
                ((Rectangle) s).getData(l, b);
                s.printarea();
                break;

            case 2:
                s = new Triangle();
                System.out.print("Enter base and height: ");
                int base = sc.nextInt();
                int height = sc.nextInt();
                ((Triangle) s).getData(base, height);
                s.printarea();
                break;

            case 3:
                s = new Circle();
                System.out.print("Enter radius: ");
                int r = sc.nextInt();
                ((Circle) s).getData(r);
                s.printarea();
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}




