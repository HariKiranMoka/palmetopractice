package p1;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class StoreData {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
	    Transaction t=session.beginTransaction();
		/*Employee st=new Employee();
		st.setId(844359);
		st.setFirstname("raju");
		st.setLastname("kaju");
		session.save(st);
	    t.commit();
		session.close();
		*/
	    String q="FROM Employee as E where E.id<844358";
	    Query query=session.createQuery(q);
	    List<Employee> list=query.list();
	    for(Employee e:list)
	    {
	    	System.out.println(e.getFirstname()+" "+e.getId()+" "+e.getLastname());
	    }
	    
	}

}
