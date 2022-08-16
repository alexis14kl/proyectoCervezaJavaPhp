package code.backend.controllers;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;




@RestController
@CrossOrigin(origins="*")
public class ControllerPruebaConsumeServiceApiRestJs {
	
//	http://localhost:8080/apiRest
	@CrossOrigin(value = "http://localhost:8080/apiRest")
	@RequestMapping(value = "/apiRest", consumes="application/json", method = RequestMethod.POST)
	public String dataUserJson(@RequestBody String json) throws Exception {
		JSONArray jsonArray =new JSONArray(json.toString());
		JSONObject jsonObject = jsonArray.getJSONObject(0);
			System.out.println(jsonObject.getString("Name_User"));
	  return null;
	}
	
	

}

