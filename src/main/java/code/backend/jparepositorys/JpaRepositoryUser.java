package code.backend.jparepositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import code.backend.models.User;
import dtosConsultas.DtoUserConsultData;

@Repository
public interface JpaRepositoryUser extends JpaRepository<User, Integer> {
	
	@Query(value = "SELECT * FROM usuarios WHERE Email_User =:email", nativeQuery = true)
	List<User>ObtenerEmail(String email);
	
	//profile user consult database
	@Query(value = "SELECT usuarios.Id_Rol_User, perfiles.Id_Perfil, perfiles.Perfil_Users"
			+ " FROM usuarios usuarios"
			+ " JOIN perfiles perfiles"
			+ " on usuarios.Id_Rol_User = perfiles.Id_Perfil"
			+ " WHERE usuarios.Id_User =:idProfile", nativeQuery = true)
	List<DtoUserConsultData>ProfileUser(String idProfile);
	

}
