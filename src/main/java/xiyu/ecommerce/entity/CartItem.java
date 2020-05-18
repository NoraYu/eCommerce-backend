package xiyu.ecommerce.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="cartItem")
@Data
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="image_Url")
    private String imageUrl;
    @Column(name="quantity")
    private int quantity;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "carts_items",
            joinColumns = {@JoinColumn(name = "Item_ID")},
            inverseJoinColumns = {@JoinColumn(name = "Cart_ID")})
    private Set<Cart> carts=new HashSet<>();


}
