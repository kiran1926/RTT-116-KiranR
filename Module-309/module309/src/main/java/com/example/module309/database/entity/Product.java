package com.example.module309.database.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "products")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<OrderDetail> orderDetails;

    @Column( name = "product_code")
    private String productCode;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "productline_id")
    private int productlineId;

    @Column(name = "product_scale")
    private String productScale;

    @Column(name = "product_vendor")
    private String productVendor;

    @Column(name = "product_description", columnDefinition = "text")
    private String productDescription;

    @Column(name = "quantity_in_stock", columnDefinition = "smallint")
    private int quantityInStock;

    @Column(name = "buy_price", columnDefinition = "decimal")
    private Double buyPrice;

    @Column(name = "msrp", columnDefinition = "decimal")
    private Double msrp;




}
