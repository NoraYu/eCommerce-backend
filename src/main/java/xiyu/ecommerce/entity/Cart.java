package xiyu.ecommerce.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="cart")
@Data
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column
    private boolean active; //后端存档的都是false，active为true是指没付钱的，只存在前端

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "carts")

    private Set<CartItem> items=new HashSet<>();


}
