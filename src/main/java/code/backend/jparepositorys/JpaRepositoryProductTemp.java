package code.backend.jparepositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import code.backend.models.ProductTemp;

@Repository
public interface JpaRepositoryProductTemp extends JpaRepository<ProductTemp, Integer> {

}
