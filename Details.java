import java.io.*;
import java.util.*;
class Book{
	String Title,Author;
	int pages;
	double price;
	
	Book()
	{
		Title="xyz";
		Author="abc";
		price=0.0;
		pages=0;
	}
	
	void Set_Title(String t)
	{
		Title=t;
	}

	void Set_Author(String a)
	{
		Author=a;
	}

	void Set_price(double p)
	{
	price=p;
	}

	void Set_pages(int x)
	{
	pages=x;
	}

	public String toString()
	{
	return Title+"\t"+Author+"\t"+price+"\t"+pages+"\n";
	}
}
class Details
{
	public static void main(String args[])
	{
	String t,a;
	double p;
	int x,n,i;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the no of books:");
	n=s.nextInt();
	Book b[]=new Book[n];
	for(i=0;i<n;i++)
		{
		System.out.println("Enter the title of the book:");
		t=s.next();		
		System.out.println("Enter the author of the book:");
		a=s.next();
		System.out.println("Enter the price of the book:");
		p=s.nextDouble();
		System.out.println("Enter the no of pages of the book:");
		x=s.nextInt();
		b[i]= new Book();
		b[i].Set_Title(t);
		b[i].Set_Author(a);
		b[i].Set_price(p);
		b[i].Set_pages(x);
		}
	System.out.println("Title\tAuthor\tPrice\tPages\n");
	for(i=0;i<n;i++)
		{
		System.out.println(b[i]);
		}
	}
}