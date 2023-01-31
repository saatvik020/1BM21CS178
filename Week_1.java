{\rtf1\ansi\ansicpg1252\deff0\nouicompat\deflang1033{\fonttbl{\f0\fnil\fcharset0 Calibri;}}
{\*\generator Riched20 10.0.19041}\viewkind4\uc1 
\pard\sa200\sl240\slmult1\f0\fs22\lang9 import java.util.Scanner;\par
import java.lang.Math;\par
class Quadratic\par
\{\par
\tab public static void main(String args[])\par
\{\par
\tab Scanner s=new Scanner(System.in);\par
\tab int a,b,c;\par
\tab double d,r1,r2;\par
\tab System.out.println("Enter coefficiencts a,b,c:");\par
\tab a=s.nextInt();\par
\tab b=s.nextInt();\par
\tab c=s.nextInt();\par
\{\tab\par
\tab if(a==0)\par
\tab System.out.println("Invalid Equation");\par
\tab else\par
\{\par
\tab d=(b*b-4*a*c);\par
\tab if(d==0)\par
\{\tab System.out.println("Real and equal roots\\n");\par
\tab System.out.println("r1=r2="+(-b/2*a));\par
\}\tab\par
\tab else if(d>0)\par
\{\tab r1=(-b+Math.sqrt(d)/2*a);\par
\tab r2=(-b-Math.sqrt(d)/2*a);\par
\tab System.out.println("Real and distinct roots\\n");\par
\tab System.out.println("r1="+r1+"r2="+r2);\par
\}\par
\tab else if(d<0)\par
\{\tab System.out.println("Imaginary roots\\n");\par
\tab System.out.println("r1="+(-b/2*a)+"+i"+(Math.sqrt(-d)/2*a));\par
\tab System.out.println("r2="+(-b/2*a)+"-i"+(Math.sqrt(-d)/2*a));\par
\}\}\}\}\}\par
}
�
