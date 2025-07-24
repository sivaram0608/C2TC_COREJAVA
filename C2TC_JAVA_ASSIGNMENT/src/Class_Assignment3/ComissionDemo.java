package Class_Assignment3;

public class ComissionDemo {
public static void main(String[]args) {

    Comission emp = new Comission();
    emp.setName("Sivaram");
    emp.setAddress("13, odai Street");
    emp.setPhone("9876790110");
    emp.setSalesAmount(78000);

    emp.calculateCommission();
}
}