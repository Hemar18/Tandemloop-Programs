package package1;

import java.util.Scanner;

public class Program1 {
	    private double a;
	    private double b;
	    public Program1(double a, double b) {
	        this.a = a;
	        this.b = b;
	    }
	    public double add() {
	        return a + b;
	    }
	    public double subtract() {
	        return a - b;
	    }
	    public double multiply() {
	        return a * b;
	    }
	    public double divide() {
	    	if(b==0){
	    		throw new ArithmeticException("division by 0 not possible");
	    	}else{
	    		return a/b;
	    	}
	    }

	    public static void main(String[] args) {
	    	Scanner scan = new Scanner(System.in);
	        while(true){
	        	System.out.println("Enter the value of a:");
		        double a = scan.nextDouble();
		        System.out.println("Enter the value of b:");
		        double b = scan.nextDouble();
		        System.out.println("Enter the operation");
		        String operation = scan.next();
		        Program1 calci = new Program1(a, b);
	        	 switch (operation) {
		            case "add":
		                System.out.println(calci.add());
		                break;
		            case "subtract":
		                System.out.println(calci.subtract());
		                break;
		            case "multiply":
		                System.out.println( calci.multiply());
		                break;
		            case "divide":
		            	try {
		            		 System.out.println(calci.divide());
						} catch (Exception e) {
							System.out.println(e.getMessage());
						}
		                break;
		            default:
		                System.out.println("Invalid choice.");
		                System.exit(0);
		        }
	        }
	    }
}