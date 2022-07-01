package com.hzf.Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hzf.Entity.Phone;

@Repository
public class PhoneDaoImpl implements PhoneDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Phone> getPhone() {
		Session theSession = sessionFactory.getCurrentSession();
		Query<Phone> phoneQuery = theSession.createQuery("from Phone", Phone.class);
		List<Phone> phones = phoneQuery.getResultList();
		return phones;
	}

	@Override
	public void addPhone(Phone phone) {
		Session theSession = sessionFactory.getCurrentSession();
//		theSession.save(phone);
		theSession.saveOrUpdate(phone);
	}

	@Override
	public Phone getPhone(int phoneid) {
		Session theSession = sessionFactory.getCurrentSession();
		Phone phone = theSession.get(Phone.class, phoneid);
		return phone;
	}

	@Override
	public void deletePhone(int phoneid) {
		Session theSession = sessionFactory.getCurrentSession();
		Phone phone = theSession.get(Phone.class, phoneid);
	
		theSession.delete(phone);	
	}

}
