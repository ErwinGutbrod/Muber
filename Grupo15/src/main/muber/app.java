package main.muber;

import DAO.DriverDAO;
import DAOHibernateImpl.DriverDAOHibernateImpl;

public class app {

	public static void main(String[] args) {
		DriverDAO driverDAO = new DriverDAOHibernateImpl();
	}

}
