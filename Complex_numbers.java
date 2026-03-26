 import java.util.Scanner;

class ComplexNumbers 
{

	  int realpart;
	  int imaginary;
	  ComplexNumbers(int real,int imaginary)
	  {
        this.realpart=real;
		this.imaginary=imaginary;
	  }
	  void plus(ComplexNumbers c)
	  {
		this.realpart+=c.realpart;
		this.imaginary+=c.imaginary;
	  }
	  void print()
	  {
           System.out.println(realpart+" + i"+imaginary);
	  }
	  void multiply(ComplexNumbers c)
	  {
		int r=((this.realpart)*(c.realpart)) - ((this.imaginary)*c.imaginary);
		int w=((this.realpart)*(c.imaginary))+((c.realpart)*(this.imaginary));
		this.realpart=r;
		this.imaginary=w;	  
		
	  }

	  

}

class complex_numbers {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int real1, imaginary1, real2, imaginary2;
		real1 = sc.nextInt();
		imaginary1 = sc.nextInt();
		real2 = sc.nextInt();
		imaginary2 = sc.nextInt();

		ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
		ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);

		int choice = sc.nextInt();
		if (choice == 1) {
			c1.plus(c2);
			c1.print();
		} else if (choice == 2) {
			c1.multiply(c2);
			c1.print();
		}

	}
}
 