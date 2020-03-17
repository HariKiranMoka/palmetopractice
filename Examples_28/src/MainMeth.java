import java.util.List;
import java.sql.SQLException;
import java.util.Scanner;

public class MainMeth {

	public static void main(String[] args) throws SQLException,SQLException {
		BookDAO b=new BookDAO("jdbc:mysql://localhost:3306/cts","root","root");
		b.connect();
		Book book =new Book(1009,"java","hari",45);
		Scanner sc=new Scanner(System.in);
		int ch=0;
		while(True)
		{
		System.out.println("************Book cruds********");
		System.out.println("1.insert Book");
		System.out.println("2.Update Book");
		System.out.println("3.Delete Book");
		System.out.println("4.Show All Books");
		System.out.println("5.exit");
		System.out.println("enter ur choice");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:b.insertBook(book);
		       System.out.println("Book inserted");
		       break;
		case 2:b.updateBook(book);
		       System.out.println("Book Updated");
		       break;
		case 3:b.deleteBook(book);
		       System.out.println("book deleted");
		       break;
		case 4:List<Book> b1= b.listAllBooks();
		       for(Book b2:b1)
		       {
		    	   System.out.println(b2.getTitle()+" "+b2.getAuthor());
		       }
		       break;
		case 5:System.exit(0);
		default:System.out.println("wrong choice");
		}
		}
	}

}
