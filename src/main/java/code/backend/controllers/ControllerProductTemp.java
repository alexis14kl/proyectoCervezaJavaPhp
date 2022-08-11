package code.backend.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import code.backend.implementacionesservices.ImplementsServiceProductTemp;

@RestController
public class ControllerProductTemp {
	
	@Autowired
	private ImplementsServiceProductTemp implementsServiceProductTemp;
	
	@PostMapping("/deleteProductTemp")
	@ResponseBody
	public String deleteProductTemp(@RequestParam("id") int id) {
	    try {
			implementsServiceProductTemp.deleteProductTemp(id);
		} catch (Exception e) {
			return e.getLocalizedMessage().toString();
		}
		return "yes";
	}

}
