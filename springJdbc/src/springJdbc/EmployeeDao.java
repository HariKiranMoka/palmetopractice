package springJdbc;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao {
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public int saveEmployee(Employees e)
	{
		 String query="insert into employees values('"+e.getName()+"',"
		 		+ "'"+e.getDept()+"','"+e.getDesg()+"','"+e.getCompany()+"','"+e.getMobile()+"','"+e.getEmail()+"')";
		return jdbcTemplate.update(query);
	}
	public int UpdateEmployee(Employees e)
	{
		String query="update employees set company='oracle' where company='?'"; 
		
		return jdbcTemplate.update(query);
	}
    
}
