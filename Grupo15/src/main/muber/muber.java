package main.muber;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class muber {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
	}

}
