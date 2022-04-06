import java.util.*;
class Product
{
String pname;
int pcode;
int price;
void display_first()
{
	

System.out.println("the code of the product is"+pcode);
System.out.println("the name of the product is "+pname);
System.out.println("the price of the product is "+price+"\n");

}
}
public class ProductDetails
{
	public static void main(String args[])
	{
		Product obj=new Product();
		System.out.println("The details of First Product are");	
		obj.pcode=101;
		obj.pname="oreo";
		obj.price=10;
		

obj.display_first();
Product obj1=new Product();
System.out.println("The details of Second Product are");	
        obj1.pcode=102;
		obj1.pname="dark fantasy";
		obj1.price=30;
		
		obj1.display_first();
		Product obj2=new Product();
		System.out.println("The details of third Product are");	
        obj2.pcode=103;
		obj2.pname="chocolate";
		obj2.price=20;
		
		obj2.display_first();
		if(obj.price<obj1.price && obj.price<obj2.price)
		{
			System.out.println("The First Product price is lowest");	
		}
		else if(obj1.price < obj2.price )
		{
			System.out.println("The Second Product price is lowest");	
		}
		else
		{
		System.out.println("The Third Product price is lowest");
		}
		
	}
}