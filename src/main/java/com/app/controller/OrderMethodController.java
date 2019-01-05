package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.model.OrderMethod;
import com.app.model.ShipmentType;
import com.app.model.Uom;
import com.app.service.IOrderMethodService;

@Controller
@RequestMapping("/order")
public class OrderMethodController{

	@Autowired
	private IOrderMethodService service;

	@RequestMapping("/register")
	private String showReg(ModelMap map) {
		map.addAttribute("orderMethod", new OrderMethod());
		return "OrderRegister";
	}
	//2.insert data
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public String save(@ModelAttribute OrderMethod orderMethod,ModelMap map){
		int id=service.saveOrderMethod(orderMethod);
		String msg="Saved With Id"+id;
		map.addAttribute("message", msg);
		return "OrderRegister";
	}

	//3.fetch all records
	@RequestMapping("/all")
	public String viewAll(ModelMap map) {
		List<OrderMethod> obs=service.getAllOrderMethods();
		map.addAttribute("lis",obs);
		return "OrderMethodData";
	}

	//Delete REcords
	@RequestMapping("/delete")
	public String delete(@RequestParam Integer oid,ModelMap map) {
		try {
			service.deleteOrderMethod(oid);
			List<OrderMethod> obs=service.getAllOrderMethods();
			map.addAttribute("lis",obs);
			map.addAttribute("message","Record is deleted"+oid);
		}catch(Exception e) {
			System.out.println("record deleted");	
		}
		return "OrderMethodData";
	}
	@RequestMapping("/viewOne")
	public String view(@RequestParam Integer oid,ModelMap map) {
		OrderMethod sh=service.getOrderMethodById(oid);
		map.addAttribute("lis",sh);
		return "OrderMethodView";

	}
	@RequestMapping("/editOne")
	public String showEdit(@RequestParam Integer oid,ModelMap map) {
		OrderMethod sh=service.getOrderMethodById(oid);
		map.addAttribute("orderMethod",sh);
		return "OrderMethodEdit";

	}
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String update(@ModelAttribute OrderMethod orderMethod,ModelMap map) {
		service.updateOrderMethod(orderMethod);
		map.addAttribute("message","OrderMethod id updated");
		map.addAttribute("lis",service.getAllOrderMethods());
		return "OrderMethodData";

	}


}
