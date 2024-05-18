package practice;

public class Tea {
	public void prepareTea() {
		System.out.println("Preparea a basic tea with hot water and tea leaves");

	}

	public void addMilk() {

		System.out.println("addMilk to the basic tea");
	}

	public void addSugar() {
System.out.println("addSugar to the basic tea");
	}
	
	public static void main () {
		Tea object1=new Tea ();
		object1.prepareTea();
		
		BlackTea o1=new BlackTea();
		o1.prepareTea();
		
		GreenTea o2=new GreenTea();
		o2.prepareTea();
		
		HerbalTea o3=new HerbalTea();
		o3.prepareTea();
		
	}

}

class BlackTea extends Tea{
	@Override
	public void prepareTea(){
		System.out.println("Blacktea prepared with hot water and 3roses leaves");
		
	}
	
}
class GreenTea extends Tea{
	@Override
	public void prepareTea() {
	System.out.println("greeTea prepared with green leaves and hotwater");
	
	}
	
}
class HerbalTea extends Tea{
	@Override
	public void prepareTea() {
		System.out.println("herbalTea prepared herbal powder and hot water");
		
		
	}
	
	
}