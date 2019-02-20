
/* Signature of four required functions is given in the code. You can create other functions as well if you need.
*  Also you should submit your code even if you are not done with all the functions. 
*/

// Main used internally is shown here just for your reference.
/*public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int degree1[] = new int[n];
		for(int i = 0; i < n; i++){
			degree1[i] = s.nextInt();
		}
		int coeff1[] = new int[n];
		for(int i = 0; i < n; i++){
			coeff1[i] = s.nextInt();
		}
		Polynomial first = new Polynomial();
		for(int i = 0; i < n; i++){
			first.setCoefficient(degree1[i],coeff1[i]);
		}
		n = s.nextInt();
		int degree2[] = new int[n];
		for(int i = 0; i < n; i++){
			degree2[i] = s.nextInt();
		}
		 int coeff2[] = new int[n];
		for(int i = 0; i < n; i++){
			coeff2[i] = s.nextInt();
		}
		Polynomial second = new Polynomial();
		for(int i = 0; i < n; i++){
			second.setCoefficient(degree2[i],coeff2[i]);
		}
		int choice = s.nextInt();
		Polynomial result;
		switch(choice){
		// Add
		case 1: 
			 result = first.add(second);
			result.print();
			break;
		// Subtract	
		case 2 :
			 result = first.subtract(second);
			result.print();
			break;
		// Multiply
		case 3 :
			 result = first.multiply(second);
			result.print();
			break;
		}

	}
  */


public class Polynomial {

	
	int arr[]=new int[10000];
      
	public void setCoefficient(int degree, int coeff)
    {
	   arr[degree]=coeff;
	}
	
	// Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree. 
	public void print()
    {
		for(int i=0;i<10000;i++)
          if(arr[i]!=0)
            System.out.print(arr[i]+"x"+i+" ");
	}

	
	// Adds two polynomials and returns a new polynomial which has result
	public Polynomial add(Polynomial p)
    {
		for(int i=0;i<10000;i++)
        {
          if(this.arr[i]!=0||p.arr[i]!=0)
            this.arr[i]+=p.arr[i];
        }
      return this;
	}
	
	// Subtracts two polynomials and returns a new polynomial which has result
	public Polynomial subtract(Polynomial p)
    {
		for(int i=0;i<10000;i++)
        {
          if(this.arr[i]!=0||p.arr[i]!=0)
            this.arr[i]-=p.arr[i];
        }
      return this;	
	}
	
	// Multiply two polynomials and returns a new polynomial which has result
	public Polynomial multiply(Polynomial p)
    {
      Polynomial mul=new Polynomial();
      for(int i=0;i<10000;i++)
      {
        if(this.arr[i]!=0)
        for(int j=0;j<10000;j++)
          if(p.arr[j]!=0)
            mul.arr[i+j]=this.arr[i]*p.arr[j]+mul.arr[i+j];
      }
		return mul;
	}

}
