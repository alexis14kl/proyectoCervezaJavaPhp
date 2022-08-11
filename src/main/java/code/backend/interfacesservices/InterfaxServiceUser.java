package code.backend.interfacesservices;

import java.util.List;

import code.backend.models.User;
import dtosConsultas.DtoUserConsultData;

public interface InterfaxServiceUser {
	
	public List<User>ObtenerEmail(String email) throws Exception;
	public List<User>ObtenerProfilexEmail(String email) throws Exception;
	public int saveNewUser(User newUser) throws Exception;
	List<DtoUserConsultData>ProfileUser(String idProfile) throws Exception;

}
