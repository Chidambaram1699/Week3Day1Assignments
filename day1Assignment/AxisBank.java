package week3.day1Assignment;

public class AxisBank extends BankInfo{
	public void deposit(){
		System.out.println("deposit");
	}
	public static void main(String[] args) {
		AxisBank obj=new AxisBank();
		obj.saving();
		obj.fixed();
		obj.deposit();
	}

}
