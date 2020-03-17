package eventListeners;

public class Helloworld {
	private String message;
	private int id;
	public String getmessage() {
		return message;
	}

	public void setMessage(String message) {
	 this.message=message ;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
   public void getme()
   {
	   System.out.println("service");
   }
   public void init()
   {
	   System.out.println("hello world init");
   }

}
