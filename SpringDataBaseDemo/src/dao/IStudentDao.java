package dao;

import java.util.List;

import data.student;

public interface IStudentDao {
	      /*this is the method to be used to initiliaze database
	      resources ie connection*/
	
        public void create(student student);
       /* This is the method to be used to list down a record from the
        student table corresponding to a passed student id
         */
        public student getstudent(int id);
        public List<student> listStudents();
        public void delete(int id);
        public void update(student student);
        public boolean saveStudentByPst(final student s);
}
