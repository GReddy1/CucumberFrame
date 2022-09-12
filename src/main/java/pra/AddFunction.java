package pra;

public class AddFunction {

	public int  add(int num1,int num2) {
return num1*num2;
	}

	public int mul(int num1,int num2,int num3) {
		return num1+num2+num3;
	}
	
	
	
	public void applyBreak() {
System.out.println("break applyed");
	}
	

		
public static void main(String[] args) {
	
	AddFunction ad = new AddFunction();
	System.out.println(ad.add(20, 4));
	ad.applyBreak();
System.out.println(ad.mul(10, 20, 30));
	
	
}
		
	
		
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

