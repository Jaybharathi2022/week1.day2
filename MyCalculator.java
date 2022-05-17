package week1.day2.assignment;

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator myCalc=new Calculator();
		System.out.println("Add :"+myCalc.addNums(1, 2, 3));
		System.out.println("Sub :"+myCalc.subNums(6, 4));
		System.out.println("Multiply :"+myCalc.mulNums(45, 15));
		System.out.println("Divide :"+myCalc.divNums(12.25f, 5.5f));

	}

}
