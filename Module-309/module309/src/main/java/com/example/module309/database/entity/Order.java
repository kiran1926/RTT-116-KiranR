package com.example.module309.database.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name ="orders")
@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToMany(mappedBy = "order", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<OrderDetail> orderDetails;

    @Column (name = "customer_id")
    private int customerId;

    @Column(name = "order_date", columnDefinition = "date")
    @Temporal(TemporalType.DATE)
    private Date orderDate;

    @Column(name = "required_date", columnDefinition = "date")
    @Temporal(TemporalType.DATE)
    private Date requiredDate;

    @Column(name = "shipped_date", columnDefinition = "date")
    @Temporal(TemporalType.DATE)
    private Date shippedDate;

    @Column(name = "status")
    private String status;

    @Column( name = "comments", columnDefinition = "text")
    private String comments;

}
