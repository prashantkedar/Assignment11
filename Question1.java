/*Create a class "Calculator" with overloaded methods for addition,
subtraction, multiplication, and division. Implement methods for both
integers and doubles. Write a java program to test the implementation. */

import java.util.Scanner;
class Calculator{
    public Calculator(){
        
    }
    public int getaddition(int a , int b){
        return a + b ;
    }
    public double addition(double a , double b){
        return a + b ;
    }
    public int getsubtraction(int a , int b){
        return a - b;
    }
    public double subtraction(double a , double b){
        return a - b;
    }
    public int getmultiplication(int a , int b){
        return a * b;
    }
    public double multiplication(double a , double b){
        return a * b;
    }
    public int getdivision(int a , int b){
        return a / b;
    }
     public double division(double a , double b){
        return a / b;
    }
}

class Question1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculations with Integer values");

        System.out.println("Enter the values of a : ");
        int a = sc.nextInt();
        System.out.println("Enter the values of b : ");
        int b = sc.nextInt();

        Calculator calcy = new Calculator();

        System.out.println("Calculations: ");

        System.out.println("addition: "+calcy.getaddition(a , b));
        System.out.println("subtraction: "+calcy.getsubtraction(a , b));
        System.out.println("multiplication: "+calcy.getmultiplication(a , b));
        System.out.println("division: "+calcy.getdivision(a , b));

        System.out.println("Calculations with double values");

       System.out.println("Enter the value 1: ");
       double c = sc.nextDouble();
       System.out.println("Enter the value 2: ");
       double d = sc.nextDouble();

       System.out.println("Calculations: ");  

        System.out.println("addition : "+calcy.addition(c , d));
        System.out.println("subtraction : "+calcy.subtraction(c , d));
        System.out.println("multiplication : "+calcy.multiplication(c , d));
        System.out.println("division : "+calcy.division(c , d));





    }
}