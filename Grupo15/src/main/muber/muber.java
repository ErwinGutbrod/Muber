package main.muber;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class muber {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure("/main/java/hibernate/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
	}

}
