package code.backend.implementacionesservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import code.backend.interfacesservices.InterfaxServicesProductTemp;
import code.backend.jparepositorys.JpaRepositoryProductTemp;

@Service
public class ImplementsServiceProductTemp implements InterfaxServicesProductTemp{
	
	@Autowired
	private JpaRepositoryProductTemp jpaRepositoryProductTemp;

	@Override
	public String deleteProductTemp(int id) throws Exception {
		jpaRepositoryProductTemp.deleteById(id);
		throw new Exception("yes");
		
	}

}
