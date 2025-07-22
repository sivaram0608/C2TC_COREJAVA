package DAY2.entity1;

public class CustromerDemo {
	
	public static void main(String[]args) {
		Customer c1=new Customer();
		c1.setId(101);
		c1.setName("sivaram");
		c1.setCity("chennai");
	
		System.out.println(c1);
		
		Customer c2=new Customer();
		c2.setId(102);
		c2.setName("rohith");
		c2.setCity("pondy");
		
		System.out.print("customer 1 city:" +c2.getCity() + " ;customer 2 city: "+c1.getCity());
		
	 
	}

}
