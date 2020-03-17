import java.util.Set;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
class Product
{
	int id;
	String name;
	int pri;
	public Product(int id, String name, int pri) {
		super();
		this.id = id;
		this.name = name;
		this.pri = pri;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", pri=" + pri + "]";
	}
	
}
	
public class ProductList {

	public static void main(String[] args) {
		Product p1=new Product(1001,"Apple",50000);
		Product p2=new Product(1002,"sony",40000);
		Product p3=new Product(1003,"Voltos",20000);
		Product p4=new Product(1004,"Mi",10000);
		Product p5=new Product(1004,"Apple",70000);
		Product p6=new Product(1004,"Voltos",30000);
		Product p7=new Product(1004,"Mi",10000);
		Product p8=new Product(1004,"Mi",10000);
         ArrayList<Product>li=new ArrayList<Product>();
           li.add(p1);
           li.add(p2);
   		   li.add(p3);
   		   li.add(p4);
   		   li.add(p5);
   		   li.add(p6);
		   li.add(p7);
		   li.add(p8);
		List<Product> n =li.stream().filter((x)->x.name=="Apple").collect(Collectors.toList());
         System.out.println(n);      
	}

}
 