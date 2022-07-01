package com.hzf.Service;

import java.util.List;
import com.hzf.Entity.Phone;

public interface PhoneService {
	
	public List<Phone> getPhone();

	public void addPhone(Phone phone);

	public Phone getPhone(int phoneid);

	public void deletePhone(int phoneid);
	
}
