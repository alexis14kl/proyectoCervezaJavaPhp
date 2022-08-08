package code.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import code.backend.implementacionesservices.ImplementsServiceUser;
import code.backend.models.User;

@RestController
@CrossOrigin(origins="*")
public class ControllerRegisterUser {
	
	@Autowired
	private ImplementsServiceUser implementsServiceUser;
//	@CrossOrigin(origins="http://192.168.75.175/")
	@GetMapping("/validEmailS")
	public String validEmail(@RequestParam("email") String email) {
		try {
			implementsServiceUser.ObtenerEmail(email);
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage().toString());
			return e.getLocalizedMessage().toString();
		}
		return "error";
	}
	
	@GetMapping("/saveUser")
	@ResponseBody
	public String registerUser(@RequestParam("name") String name , 
			@RequestParam("lastname") String lastname,
			@RequestParam("email") String email,
			@RequestParam("password") String password, 
			@RequestParam("profile") String profile) {
		User newUser = new User();
		newUser.setName_User(name);
		newUser.setLastName_User(lastname);
		newUser.setEmail_User(email);
		newUser.setPassword_User(password);
	    int userProfile = Integer.parseInt(profile);
		newUser.setId_Rol_User(userProfile);
		try {
			implementsServiceUser.saveNewUser(newUser);
		} catch (Exception e) {
			return e.getLocalizedMessage().toString();
		}
		return "Fin del proceso" ;
	}
	
	@PostMapping("/ProfileUser")
	@ResponseBody
	private String ProfileUser(@RequestParam("idProfile") String idProfile) {
		try {
			implementsServiceUser.ProfileUser(idProfile);
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage().toString());
			return e.getLocalizedMessage().toString();
		}
		return "hola mundo";
	}
	
	

}
