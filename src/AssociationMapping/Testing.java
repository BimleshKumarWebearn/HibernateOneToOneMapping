package AssociationMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class Testing {
public static void main(String[]args) {
	Configuration cfg=new Configuration();
    cfg.configure("Association.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session session=sf.openSession();
	Transaction tx=session.beginTransaction();
	
	Question q1=new Question();
	q1.setQuestionId(111);
	q1.setQuestion("what is java?");
	
	
	Answer a1=new Answer();
	a1.setAnswerId(222);
	a1.setAnswer("java is a programming language");
	q1.setAnswer(a1);
	a1.setQuestion(q1);
	
	session.save(q1);
	session.save(a1);
	tx.commit();
	session.close();
	sf.close();
	
	
}
}
