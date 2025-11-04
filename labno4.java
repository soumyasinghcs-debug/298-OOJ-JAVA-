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

public class labno4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the dimensions of the rectangle (length and breadth):");
        int l = sc.nextInt();
        int b = sc.nextInt();
        Rectangle rect = new Rectangle();
        rect.getData(l, b);
        rect.printarea();

     
        System.out.println("Enter the dimensions of the triangle (base and height):");
        int base = sc.nextInt();
        int height = sc.nextInt();
        Triangle tri = new Triangle();
        tri.getData(base, height);
        tri.printarea();

       
        System.out.println("Enter the dimension of the circle (radius):");
        int r = sc.nextInt();
        Circle cir = new Circle();
        cir.getData(r);
        cir.printarea();

        sc.close();
    }
}


