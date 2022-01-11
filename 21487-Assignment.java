
1.
package technical;

public class Max {

	public static void main(String[] args) {
		int a=12 , b=25 , c=89;
		if ((a>b) && (a>c)) 
			System.out.println(a + " is max");
		else if ((b>c) && (b>a))
			System.out.println(b + " is max");
		else
			System.out.println(c + " is max");
		}
}



2.

package technical;

public class Natural {

	public static void main(String[] args) {
		int i,n=10;
		for (i=1;i<=n;i++) {
			System.out.println(i);
		}
		// TODO Auto-generated method stub

	}

}


3.


package technical;

public class Cubes {

	public static void main(String[] args) {
		int i=2;
		
			System.out.println(i*i*i);
		
		// TODO Auto-generated method stub

	}

}

4.
package technical;

public class Sum {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int sum=0,i;
		for(i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println("sum:" + sum);
		
		// TODO Auto-generated method stub

	}

}


5.

package technical;
public class JavaEx {
	  public static boolean contains(int[] arr, int item) {
	      for (int num : arr) {
	         if (item == num) {
	            return true;
	         }
	      }
	      return false;
	   }
	   public static void main(String[] args) {
	          int[] my_array1 = {1,2,3,4,5,6,7,8,9,10};
	      System.out.println(contains(my_array1, 10));
	      System.out.println(contains(my_array1, 20));
	   }
	}




6.

package technical;

public class Rev {

	public static void main(String[] args) {
		
		
		
			int [] arr = new int [] {1, 2, 3, 4, 5};  
	        System.out.println("Original array: ");  
	        for (int i = 0; i < arr.length; i++) {  
	            System.out.print(arr[i] + " ");  
	        }  
	        System.out.println();  
	        System.out.println("Array in reverse order: ");  
	        //Loop through the array in reverse order  
	        for (int i = arr.length-1; i >= 0; i--) {  
	            System.out.print(arr[i] + " ");

		}
		// TODO Auto-generated method stub

	}

}


7.
package technical;

public class Student {
	public int stdId;
	public String stdName;
	public int stdClass;
}


package technical;

public class Stu {
	public static void main(String args[]) {
		Student s1=new Student();
		s1.stdId=100;
		s1.stdName="Ram";
		s1.stdClass=5;
		System.out.println(s1.stdId);
		System.out.println(s1.stdName);
		System.out.println(s1.stdClass);
		Student s2=new Student();
		s2.stdId=200;
		s2.stdName="sai";
		s2.stdClass=6;
		System.out.println(s2.stdId);
		System.out.println(s2.stdName);
		System.out.println(s2.stdClass);
		
		
		
		// TODO Auto-generated method stub

	}

}


8.
package technical;

public class Product {
	public int ProId;
	public String ProName;
	public static int ProPrice;
	public static int ProTax;
	
	public static double calcPrice() {
		return ProPrice+ProTax;
	}
	

}


package technical;

public class Product1 {

	public static void main(String[] args) {
		Product p1=new Product();
		p1.ProId=2121;
		p1.ProName="sony";
		p1.ProPrice=5000;
		p1.ProTax=500;
		System.out.println(p1.ProId);
		System.out.println(p1.ProName);
		double calcPrice=Product.calcPrice();
		System.out.println(calcPrice);
		
		// TODO Auto-generated method stub

	}

}


9.
package technical;
import java.util.*;


public class Iphone1 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int M=sc.nextInt();
		
		switch(M) {
		case 128:
			System.out.println("the cost of 128 GB Iphone is 64,900 rs");
			break;
		case 256:
			System.out.println("the cost of 256 GB Iphone is 79,900 rs");
			break;
		case 64:
			System.out.println("the cost of 64 GB Iphone is 53,900 rs");
			break;
		default:
			System.out.println("invalid memory size");
		}
		
		
		// TODO Auto-generated method stub

	}

}


10.
package technical;

public class Employee {
	
	public int empno;
	public String empname;
	public int salcal;
	
	public void display() {
		System.out.println("display the empno");
	}
	
	public void salcal() {
		System.out.println("calculate the salary");
	}

}

package technical;

public class Manager extends Employee {
	
	public String empname;
	public int calsal;
	
	public void display() {
		System.out.println("Calculate the salary");
		
	}

}

package technical;

public class Developer extends Manager {
	
	public String empname;
	public int calsal;
	
	public void display() {
		System.out.println("Salary calculation of emp");
		

}
	
}

package technical;

public class Tester extends Developer {
	
	public String empname;
	public int calsal;
	
	public void display() {
		System.out.println("Cal Emp Salary");
		

}

}
package technical;

public class EmpMain {

	public static void main(String[] args) {
		
		Manager m1 = new Manager();
		m1.display();
		
		Developer d1 = new Developer();
		d1.display();
		
		Tester t1 = new Tester();
		t1.display();
		
		
	}

}

11.

package technical;

public abstract class Shape {
	private double height; 
	   private double width; 

	   
	   public void setValues(double height, double width)
	   {
	      this.height = height;
	      this.width = width;
	   }

	   
	   public double getHeight() 
	   {
	       return height;
	   }
	     
	  
	   public double getWidth() 
	   {
	       return width;
	   } 

	 
	  

	   public abstract double getArea();
	}

package technical;

public class Triangle extends Shape
{ 
   
    public double getArea() 
    {
        return (getHeight() * getWidth()) / 2;
    }
}       

package technical;

public class Rectangle extends Shape
{
   
    public double getArea()
    {
        return getHeight() * getWidth();
    }
}

package technical;

public class Square extends Shape
{
    
    public double getArea()
    {
        return getHeight() * getWidth();
    }
}		
		

package technical;

public class AbsDemo {

	public static void main(String[] args) {
		
		Shape shape;
        Rectangle rect = new Rectangle();
        
        shape = rect;
        shape.setValues(12, 3);
        
        
        System.out.println("Area of rectangle : " + shape.getArea());
        
        
        Triangle tri = new Triangle();
        
              
        shape = tri;
        

        shape.setValues(44,13);
        
       
        System.out.println("Area of triangle : " + shape.getArea());
        
       
        Rectangle rect1 = new Rectangle();
        
        
        shape = rect1;

       
        shape.setValues(12, 12);
        
       
        System.out.println("Area of square : " + shape.getArea());
        
       
        Square squ1 = new Square();
        
             
        shape = squ1;
       
	}

}