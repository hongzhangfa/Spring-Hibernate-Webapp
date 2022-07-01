package com.hzf.Dao;

import java.util.List;
import com.hzf.Entity.Phone;

public interface PhoneDao {

	public List<Phone> getPhone();

	public void addPhone(Phone phone);

	public Phone getPhone(int phoneid);

	public void deletePhone(int phoneid);

}
