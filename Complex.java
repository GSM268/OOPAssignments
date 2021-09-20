package lab;
import java.util.*;
public class Complex {
	private double real, imaginary;

	public Complex() {
		real =0 ;
		imaginary=0 ;
	}

	public Complex add(Complex n1, Complex n2) {
		Complex temp = new Complex();
		temp.real = n1.real +n2.real;
		temp.imaginary = n1.imaginary + n2.imaginary;
		//System.out.println("The addition of the complex numbers is " + temp.real + "+i" + temp.imaginary);
		return temp;
	}
	public Complex sub(Complex n1, Complex n2) {
		Complex temp = new Complex();
		temp.real = n1.real - n2.real;
		temp.imaginary = n1.imaginary -n2.imaginary;
		//System.out.println("The addition of the complex numbers is " + subtraction.real + "+i" + subtraction.imaginary);
		return temp;
	}
	public Complex mul(Complex n1, Complex n2) {
		Complex temp = new Complex();
		temp.real = (n1.real*n2.real) - (n1.imaginary * n2.imaginary);
		temp.imaginary = (n1.real*n2.imaginary) + (n1.imaginary*n2.real);
		//System.out.println("The addition of the complex numbers is " + multiply.real + "+i" + multiply.imaginary);
		return temp;
	}
	public Complex div(Complex n1, Complex n2) {
		Complex temp = new Complex();
		temp.real = ((n1.real*n2.real) + (n1.imaginary * n2.imaginary))/((n2.real * n2.real)+(n2.imaginary*n2.imaginary));
		temp.imaginary = ((n1.imaginary*n2.real)-(n1.real*n2.imaginary))/((n2.real * n2.real)+(n2.imaginary*n2.imaginary));
		//System.out.println("The addition of the complex numbers is " + division.real + "+i" + division.imaginary);
		return temp;
	}
	public void showC() {
		System.out.println(real + " + "+ imaginary + " i");	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Welcome to Complex Arithmetic Program");
		System.out.println("Enter real part of 1st complex number:");
		double a1 = s.nextDouble();
		System.out.println("Enter imaginary part of 1st complex number:");
		double b1 = s.nextDouble();
		System.out.println("Enter real part of 2nd complex number:");
		double a2 = s.nextDouble();
		System.out.println("Enter imaginary part of 2nd complex number:");
		double b2 = s.nextDouble();	
		Complex c1 = new Complex();
		c1.real =a1;
		c1.imaginary=b1;
		Complex c2 = new Complex();
		c2.real =a2;
		c2.imaginary=b2;
		Complex c3 = new Complex();
		while (true) {
			System.out.println("Menu:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit\nChoose your operation: ");
			int ch = s.nextInt();
			switch(ch) {
			case 1:
				System.out.println("*".repeat(60));
				c3=c3.add(c1,c2);
				System.out.println("The Addition of your complex numbers is: ");
				c3.showC();
				System.out.println("*".repeat(60));
				break;
			case 2:
				System.out.println("*".repeat(60));
				c3=c3.sub(c1,c2);
				System.out.println("The Subtraction of your complex numbers is: ");
				c3.showC();
				System.out.println("*".repeat(60));
				break;
			case 3:
				System.out.println("*".repeat(60));
				c3=c3.mul(c1, c2);
				System.out.println("The Multiplication of your complex numbers is: ");
				c3.showC();
				System.out.println("*".repeat(60));
				break;
			case 4:
				System.out.println("*".repeat(60));
				c3=c3.div(c1, c2);
				System.out.println("The Division of your complex numbers is: ");
				c3.showC();
				System.out.println("*".repeat(60));
				break;
			case 5:
				System.out.println("*".repeat(60));
				System.out.println("Now exiting the program.");
				System.out.println("*".repeat(60));
				System.exit(0);
			}
			
		}
	}
}
