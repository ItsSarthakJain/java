/******************
 * Following is the main function we are using internally.
 * Refer this for completing the ComplexNumbers class
 * 
 
 public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int real1 = s.nextInt();
		int imaginary1 = s.nextInt();

		int real2 = s.nextInt();
		int imaginary2 = s.nextInt();

		ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
		ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);

		int choice = s.nextInt();
		 
		if(choice == 1) {
			// Add
			c1.plus(c2);
			c1.print();
		}
		else if(choice == 2) {
			// Multiply
			c1.multiply(c2);
			c1.print();
		}
		else {
			return;
		}
	}
 ******************/

public class ComplexNumbers {
	int real;
    int imag;
  	ComplexNumbers(int real,int imag)
    {
      this.real=real;
      this.imag=imag;
    }
  public void plus(ComplexNumbers c)
  {
    this.real+=c.real;
    this.imag+=c.imag;
  }
   
  public void multiply(ComplexNumbers c)
  {
    int rl=(this.real*c.real)-(this.imag*c.imag);
    int im=(this.real*c.imag)+(this.imag*c.real);
    this.real=rl;
    this.imag=im;
  } 
	
  public void print()
  {
    if(this.imag<0)
    System.out.println(this.real+" - i"+(-1*this.imag));
    else
    System.out.println(this.real+" + i"+this.imag);  
  }
}
