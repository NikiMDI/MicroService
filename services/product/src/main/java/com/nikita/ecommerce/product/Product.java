package com.nikita.ecommerce.product;

import com.nikita.ecommerce.category.Category;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
public class Product {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String description;
    private double avalilableQuantity;
    private BigDecimal price;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
