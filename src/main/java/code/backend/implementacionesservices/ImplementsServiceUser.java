package code.backend.implementacionesservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import code.backend.interfacesservices.InterfaxServiceUser;
import code.backend.jparepositorys.JpaRepositoryUser;
import code.backend.models.User;
import dtosConsultas.DtoUserConsultData;

@Service
public class ImplementsServiceUser implements InterfaxServiceUser {
	
	@Autowired
	private JpaRepositoryUser jpaRepositoryUser;

	@Override
	public List<User> ObtenerEmail(String email) throws Exception {
		if(email.isEmpty()) {
			throw new Exception("no hay correo");
		}else {
			List<User>UserObtenido = jpaRepositoryUser.ObtenerEmail(email);
			if(!UserObtenido.isEmpty()) {
				throw new Exception("yes");
			}else {
				throw new Exception("no");
			}
		}
	}

	@Override
	public int saveNewUser(User newUser) throws Exception {
		if(newUser.equals(null)) {
			throw new Exception("data error");
		}else {
			jpaRepositoryUser.save(newUser);
			throw new Exception("Register");
		}
	}

	@Override
	public List<DtoUserConsultData> ProfileUser(String idProfile) throws Exception {
		List<DtoUserConsultData>profile = jpaRepositoryUser.ProfileUser(idProfile);
		throw new Exception(profile.get(0).getPerfil_Users().toString());
	}

	@Override
	public List<User> ObtenerProfilexEmail(String email) throws Exception {
		List<User>profilexEmail = jpaRepositoryUser.ObtenerEmail(email);
		if(!profilexEmail.isEmpty()) {
			String idUser = String.valueOf(profilexEmail.get(0).getId_User());
			throw new Exception(idUser);
		}
		return null;
	}
}
