package xiyu.ecommerce.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xiyu.ecommerce.dao.CartItemRepository;
import xiyu.ecommerce.dao.CartRepository;
import xiyu.ecommerce.entity.Cart;
import xiyu.ecommerce.entity.CartItem;

import javax.validation.Valid;
import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class CartController {
    @Autowired
    private CartItemRepository cartItemRepository;

    @Autowired
    private CartRepository cartRepository;

    @GetMapping("/carts")
    public List<Cart> getAllCarts(){
        return cartRepository.findAll();
    }

    @PostMapping("/cartItems")
    public void createCartItem(@Valid @RequestBody CartItem item ) {
        Cart cart=cartRepository.findByActive(true);
        item.getCarts().add(cart);
        cart.getItems().add(item);
        cartRepository.save(cart);
        cartItemRepository.save(item);
    }

    @GetMapping("/cartItems")
    public List<CartItem> getAllCartsItems(){
        return cartItemRepository.findAll();
    }

    @PostMapping("/carts")
    public void createCart(@Valid @RequestBody Cart cart ) {
        cartRepository.save(cart);
    }

    @PutMapping("/carts/")
    public void updateCart(@Valid @RequestBody Cart cart ) {
        cartRepository.save(cart);
    }
}
