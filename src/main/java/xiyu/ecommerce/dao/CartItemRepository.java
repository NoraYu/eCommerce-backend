package xiyu.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import xiyu.ecommerce.entity.CartItem;

//@CrossOrigin
//@RepositoryRestResource
//@CrossOrigin("http://localhost:4200")
public interface CartItemRepository extends JpaRepository<CartItem, Long> {
}
