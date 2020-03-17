package dao;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import dto.Book;
public interface BookDao {
       public Connection getCoonection();
      // public void closeConnection();
       public void insertBookDao(Connection con,Book book) throws SQLException;
      // public List<Book> showAllBookDao();
      // public void deleteBookDao(int id);
      // public void showBookDao(int id);
     // public void updateBookDao(Book book);
}
