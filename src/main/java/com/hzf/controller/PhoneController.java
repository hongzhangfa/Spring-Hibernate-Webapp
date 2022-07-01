package com.hzf.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hzf.Entity.Phone;
import com.hzf.Service.PhoneService;

@Controller
@RequestMapping("/phone")
public class PhoneController {
	
	@Autowired
	private PhoneService phoneService;
	

	
//	@GetMapping("/list")
	@RequestMapping(path="/list", method=RequestMethod.GET)
	public String getPhoneList(Model model) {	
//		Phone phone = new Phone();
//		String features = phone.getFeatures();
		
		List<Phone> phones = phoneService.getPhone();	 
		model.addAttribute("phoneList", phones);
		return "list_phone";
		
	}

	//  ����������󡪡�����תadd_phone.jsp
		@GetMapping("/addPhone")
		public String addPhone(Model model) {
			Phone phone = new Phone();			
			model.addAttribute("phone", phone);
			return "add_phone";			
		}
		
		// �������������
		@PostMapping("/addPhoneProcess")
		public String ProcessAddPhoneForm(@ModelAttribute("phone") Phone thePhone) {
			phoneService.addPhone(thePhone);
			return "redirect:/phone/list";
		}

		// ���������������
		@GetMapping("/editPhone")
		public String showUpdatePhoneForm(@RequestParam("phoneid") int phoneid, Model model) {
			Phone phone = phoneService.getPhone(phoneid);
			String featuresStr = phone.getFeatures();
			String featureOptions = "NFC,����ʶ��,���߳��,������";
			
			String [] result = featuresStr.split(",");
			String [] options = featureOptions.split(",");
	        
            for(int i = 0; i<result.length; i++){
                System.out.print(result[i]+"\t");
            }
            
            for(int i = 0; i<options.length; i++){
                System.out.print("options: "+ options[i]+"\t");
            }
			model.addAttribute("phone", phone);
			model.addAttribute("featureList", result);
			model.addAttribute("optionsList", options);
		
			return "update_phone";
		}
		
		// ����ɾ����������
		@GetMapping("/deletePhone")
		public String deleteStudent(@RequestParam("phoneid") int phoneid) {
			phoneService.deletePhone(phoneid);
			return "redirect:/phone/list";
		}		 
		
		
		
}
