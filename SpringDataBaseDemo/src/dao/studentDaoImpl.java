package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.PreparedStatementCreatorFactory;
import org.springframework.jdbc.core.ResultSetExtractor;

import data.student;

public class studentDaoImpl implements IStudentDao{
     JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void create(student student) {
		// TODO Auto-generated method stub
		String sql=
		"insert into student values("+student.getId()+",'"+student.getName()+"',"+student.getAge()+")";
        int c=jdbcTemplate.update(sql);
        System.out.println("record inserted"+c);
	}

	@Override
	public student getstudent(int id) {
      return null;
	}

	@Override
	public List<student> listStudents() {
		
		ResultSet rs;
		return jdbcTemplate.query("select * from student",new ResultSetExtractor<List<student>>() {
			@Override
			public List<student> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<student> list=new ArrayList<student>();
				while(rs.next())
				{
					student e=new student();
					e.setId(rs.getInt(1));
					e.setName(rs.getString(2));
					e.setAge(rs.getInt(3));
					list.add(e);
				}
				
				return list;
			}
			});

		}
 
		

	public void delete(int id) {
		int id1=id;
		String q="delete from student where id="+id1;
		 int c=jdbcTemplate.update(q);
		 System.out.println(c+"record deleted");
		}

	public void update(student student) {
		
	}
	public boolean saveStudentByPst(final student s)
	{
		String q="insert into student values(?,?,?)";
		
		return  jdbcTemplate.execute(q,new PreparedStatementCallback<Boolean> (){

			@Override
			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException 
			{
				
				ps.setInt(1,s.getId());
				ps.setString(2,s.getName());
				ps.setInt(3,s.getAge());
			    return ps.execute();
				
			}
		});
}
}
class Understand implements ResultSetExtractor<List<student>>
{
	
 public List<student> extractData(ResultSet rs) throws SQLException, DataAccessException
 {
	 List<student> list=new ArrayList<student>();
		while(rs.next())
		{
			student e=new student();
			e.setId(rs.getInt(1));
			e.setName(rs.getString(2));
			e.setAge(rs.getInt(3));
			list.add(e);
		}
		
		return list;
	
 }
}