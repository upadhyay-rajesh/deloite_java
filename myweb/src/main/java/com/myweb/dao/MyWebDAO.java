package com.myweb.dao;

import java.util.List;

import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.myweb.entity.MyWebEntity;

public class MyWebDAO implements MyWebDAOInterface {

	@Override
	public int createProfileDAO(MyWebEntity w) {
		int i=0;
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session ss=sf.openSession();
		EntityTransaction et=ss.getTransaction();
		et.begin();
			ss.save(w);
		et.commit();
		i=1;
		return i;
	}

	@Override
	public boolean loginProfileDAO(MyWebEntity m) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session ss=sf.openSession();
		
		Query q=ss.createQuery("from com.myweb.entity.MyWebEntity m where m.email=:em1 and m.password=:ps");
		q.setParameter("em1", m.getEmail());
		q.setParameter("ps", m.getPassword());
		
		List<MyWebEntity> ll=q.getResultList();
		
		if(ll.size()>0) {
			return true;
		}
		
		return false;
	}

	@Override
	public MyWebEntity viewprofileDAO(MyWebEntity m) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session ss=sf.openSession();
		
		Query q=ss.createQuery("from com.myweb.entity.MyWebEntity m where m.email=:em1");
		q.setParameter("em1", m.getEmail());
		
		MyWebEntity mb=(MyWebEntity)q.getSingleResult();
		
		return mb;
	}

	@Override
	public List<MyWebEntity> searchrofileDAO(MyWebEntity m) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session ss=sf.openSession();
		
		Query q=ss.createQuery("from com.myweb.entity.MyWebEntity m where m.name=:em1");
		q.setParameter("em1", m.getName());
		
		List<MyWebEntity> ll=q.getResultList();
		return ll;
	}

	@Override
	public int deleteProfileDAO(MyWebEntity m) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session ss=sf.openSession();
		
		EntityTransaction et=ss.getTransaction();
		et.begin();
		
		Query q=ss.createQuery("delete from com.myweb.entity.MyWebEntity m where m.email=:em1");
		q.setParameter("em1", m.getEmail());
		
		int i=q.executeUpdate();
		
		et.commit();
		return i;
	}

}




















