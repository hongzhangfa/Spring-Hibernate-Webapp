package com.hzf.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hzf.Dao.PhoneDao;
import com.hzf.Entity.Phone;

@Service
public class PhoneServiceImpl implements PhoneService {

	@Autowired
//	@Qualifier("PhoneDaoImpl")
	private PhoneDao phoneDao;
	
	@Override
	@Transactional
	public List<Phone> getPhone() {
		return phoneDao.getPhone();
	}

	@Override
	@Transactional
	public void addPhone(Phone phone) {
		phoneDao.addPhone(phone);
	}

	@Override
	@Transactional
	public Phone getPhone(int phoneid) {
		return phoneDao.getPhone(phoneid);
	}

	@Override
	@Transactional
	public void deletePhone(int phoneid) {
		phoneDao.deletePhone(phoneid);
	}

}
