package mains;

import java.sql.SQLException;

import dao.UsersDao;

public class TestUser {

	public static void main(String[] args) throws SQLException {
		UsersDao us=new UsersDao("jdbc:mysql://localhost:3306/cts","root","root");
		DispalyMenu dispaly=new DispalyMenu();
		dispaly.showMenuOptions();

	}

}
