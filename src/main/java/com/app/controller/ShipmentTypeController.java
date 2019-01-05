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
import com.app.service.IShipmentTypeService;

@Controller
@RequestMapping("/shipment")

public class ShipmentTypeController {
	@Autowired
	private IShipmentTypeService service;
	
	//1.show register page
	@RequestMapping("/register")
	public String showReg(ModelMap map) {
		map.addAttribute("shipment",new ShipmentType());
		return "ShipmentTypeRegister";
	}
	//2.insert data
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public String save(@ModelAttribute("shipment") ShipmentType shipment,ModelMap map) {
		int id=service.saveShipmentType(shipment);
		String msg="Saved With Id"+id;
		map.addAttribute("message", msg);
		return "ShipmentTypeRegister";
	}
	//3.fetch all records
	@RequestMapping("/all")
	public String viewAll(ModelMap map) {
		List<ShipmentType> obs=service.getAllShipmentTypes();
		map.addAttribute("lis",obs);
		return "ShipmentTypeData";
	}
	
	@RequestMapping(value="/delete",method=RequestMethod.GET)
	public String delete(@RequestParam Integer uid,ModelMap map) {
		service.deleteShipmentType(uid);
		List<ShipmentType> obs=service.getAllShipmentTypes();
		map.addAttribute("lis",obs);
		map.addAttribute("message","Record is deleted"+uid);
		return "ShipmentTypeData";
	}
	@RequestMapping("/viewOne")
	public String view(@RequestParam Integer uid,ModelMap map) {
		ShipmentType sh=service.getShipmentTypeById(uid);
		map.addAttribute("lis",sh);
		return "ShipmentTypeView";
		
	}
	@RequestMapping("/editOne")
	public String showEdit(@RequestParam Integer uid,ModelMap map) {
		ShipmentType sh=service.getShipmentTypeById(uid);
		map.addAttribute("shipment",sh);
		return "ShipmentTypeEdit";
		
	}
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String update(@ModelAttribute("shipment") ShipmentType shipment,ModelMap map) {
		service.updateShipmentType(shipment);
		map.addAttribute("message","shipment idupdated");
		map.addAttribute("lis",service.getAllShipmentTypes());
		return "ShipmentTypeData";
		
	}
}
