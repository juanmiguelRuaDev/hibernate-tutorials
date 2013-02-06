package org.hibernate.tutorial.exercices.annotations;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import junit.framework.TestCase;

public class LocalConnectionTest extends TestCase {
	
	private SessionFactory sessionFactory;
	
	@Override
	protected void setUp() throws Exception {
		// A SessionFactory is set up once for an application
        sessionFactory = new Configuration()
                .configure() // configures settings from hibernate.cfg.xml
                .buildSessionFactory();
	}

	@Override
	protected void tearDown() throws Exception {
		if ( sessionFactory != null ) {
			sessionFactory.close();
		}
	}

	public void testBasicUsage() {
		// create a couple of events...
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save( new OperationModel( new Date() ) );
		session.save( new OperationModel(  new Date() ) );
		session.getTransaction().commit();
		session.close();

		// now lets pull events from the database and list them
		session = sessionFactory.openSession();
        session.beginTransaction();
        List result = session.createQuery( "from OperationModel" ).list();
		for ( OperationModel om : (List<OperationModel>) result ) {
			System.out.println( "OperationModel (" + om.getDate() + ") : " + om.getId() );
		}
        session.getTransaction().commit();
        session.close();
	}

}
