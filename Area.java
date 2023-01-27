import java.util.Scanner;
abstract class Shape{
    int l;
    int b;
    public abstract void printArea();
}

class Rectangle extends Shape{
    public void printArea(){
        System.out.println("enter values");
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(l*b);
    }
}

class Triangle extends Shape{
    public void printArea(){
        System.out.println("enter values");
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(0.5*l*b);
    }
}

class Circle extends Shape{
    public void printArea(){
        System.out.println("enter values");
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        System.out.println((3.14)*l*l);
    }
}

public class Area{

    public static void main(String args[]){

        Rectangle r = new Rectangle();
        r.printArea();
        Triangle t = new Triangle();
        t.printArea();
        Circle c = new Circle();
        c.printArea();
    }
}