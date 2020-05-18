package xiyu.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import xiyu.ecommerce.entity.Cart;

import java.util.ArrayList;

//@CrossOrigin
//@RepositoryRestResource(collectionResourceRel="carts", path="carts")
public interface CartRepository extends JpaRepository<Cart, Long> {
    Cart findByActive(boolean x);

    }


