import java.util.Scanner;

class Negage extends Exception
{
    public String getMessage()
    {
        return "Age cannot be negative";
    }
}

class Invalidage extends Exception
{
    public String getMessage()
    {
        return "Son's age cannot be greater than Father's age";
    }
}

class Father
{
    int f;
    Father(int age) throws Negage
    {
        if(age<=0)
            throw new Negage();
        f = age;
    }

}

class Son extends Father
{
    int l;
    Son(int agef, int agel) throws Invalidage,Negage
    {
        super(agef);
        if(agel<=0)
            throw new Negage();
        if(agel>agef)
            throw new Invalidage();
        l = agel;
    }
}

public class Exc
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Father's age and son's age");
            try {
                Son son = new Son(sc.nextInt(), sc.nextInt());
                System.out.println("Sons age: " + son.l + "\n" + "Father's age: " + son.f);
            } catch (Negage n) {
                System.out.println(n.getMessage());
            } catch (Invalidage i) {
                System.out.println(i.getMessage());
            }
        }
    }
}