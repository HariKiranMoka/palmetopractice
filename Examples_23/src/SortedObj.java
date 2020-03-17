import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
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
public class SortedObj {

	public static void main(String[] args) {
		Product p1=new Product(1001,"Apple",50000);
		Product p2=new Product(1002,"sony",40000);
		Product p3=new Product(1003,"Voltos",20000);
		Product p4=new Product(1004,"Mi",10000);
		Product p5=new Product(1004,"Mi",10000);
		Product p6=new Product(1004,"Mi",10000);
		Product p7=new Product(1004,"Mi",10000);
		Product p8=new Product(1004,"Mi",10000);
   p9=new  Product( i",10000);
		Product p4=new Product(1004,"Mi",10000);
		
		ArrayList<Product>p=new ArrayList<Product>();
		p.add(p1);
		p.add(p2);
		p.add(p3);
		p.add(p4);
	List<Product>li=p.stream().filter(pro->pro.pri<=20000).map(pro->pro).collect(Collectors.toList());
	System.out.println(li);
		
	}

}
