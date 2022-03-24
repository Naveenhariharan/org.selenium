package org.phone;

public class Phone {
  public void phoneInfo (int id,String name,long l) {
	  System.out.println("phone id is "+id);
	  System.out.println("phone name is "+name);
	  System.out.println("phone number is "+l);
  }
  public void phoneInfo(String name)  {
	  System.out.println("phone made in "+name);
	 
  }
  public static void main(String[] args) {
	Phone p = new Phone();
	p.phoneInfo(54768, "Samsung", 947368822l);
	p.phoneInfo("China");
 

}
}
