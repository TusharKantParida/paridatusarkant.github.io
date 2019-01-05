package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.model.ShipmentType;
import com.app.model.Uom;
import com.app.service.IUomService;

@Controller
@RequestMapping("/uom")
public class UomController {
	
	@Autowired
	private IUomService service;
	

	//1.show register page
	@RequestMapping("/register")
	public String showReg(ModelMap map) {
		map.addAttribute("uomR",new Uom());
		return "UomRegister";
	}
	//2.insert data
		@RequestMapping(value="/insert",method=RequestMethod.POST)
		public String save(@ModelAttribute("uomR") Uom uom,ModelMap map){
			int uid=service.saveUom(uom);
			String msg="Saved With Id"+uid;
			map.addAttribute("message", msg);
			return "UomRegister";
		}
		//3.fetch all records
		@RequestMapping("/all")
		public String viewAll(ModelMap map) {
			List<Uom> obs=service.getAllUom();
			map.addAttribute("lis",obs);
			return "UomData";
		}
		@RequestMapping(value="/delete",method=RequestMethod.GET)
		public String delete(@RequestParam("uid")Integer id,ModelMap map) {
			try {
			service.deleteUom(id);
			List<Uom> obs=service.getAllUom();
			map.addAttribute("lis",obs);
			map.addAttribute("message","Record is deleted"+id);
		}catch(Exception e) {
			System.out.println("Record deleted");
		}
			return "UomData";
		}
		@RequestMapping("/viewOne")
		public String view(@RequestParam Integer uid,ModelMap map) {
			Uom sh=service.getUomById(uid);
			map.addAttribute("lis",sh);
			return "UomView";
			
		}
		@RequestMapping("/editOne")
		public String showEdit(@RequestParam Integer uid,ModelMap map) {
			Uom sh=service.getUomById(uid);
			map.addAttribute("uomR",sh);
			return "UomEdit";
			
		}
		@RequestMapping(value="/update",method=RequestMethod.POST)
		public String update(@ModelAttribute("uomR")Uom uom,ModelMap map) {
			service.updateUom(uom);
			map.addAttribute("message","Uom is updated");
			map.addAttribute("lis",service.getAllUom());
			return "UomData";
			
		}

}
