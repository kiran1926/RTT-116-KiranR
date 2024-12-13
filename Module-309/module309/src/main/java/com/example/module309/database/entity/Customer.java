package com.example.module309.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Entity
@Table(name = "customers")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Customer {

    // To add a one to many relationship steps
    // 1) Goto the example website and create the @OneToMany and @ManyToOne annoations
    // 2) In the entity with the foreign key mark that colum as insertable = false and updateable = false
    // 3) Add the @ToString.Exclude annotation to both sides

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "sales_rep_employee_id")
    @ToString.Exclude
    private Employee employee;

    // now that we have the @ManyToOne mapping using the same column name for the@JOINColumn
    // hibernate is confused as the column sales_rep_employee_id is not ambiguous to hibernate
    //to solve this problem, we make this field read only by adding insertable = false and updatable = false
    //TLDR - the foreign key must be marked as read only for hibernate
    @Column(name = "sales_rep_employee_id", insertable = false, updatable = false)
    private Integer salesRepEmployeeId;

    @Column(name = "customer_name")
    private String customerName;

    @Column(name ="contact_lastname")
    private String contactLastname;

    @Column(name ="contact_firstname")
    private String contactFirstname;

    @Column(name = "phone")
    private String phone;

    @Column(name = "address_line1")
    private  String addressLine1;

    @Column(name = "address_line2")
    private String addressLine2;

    @Column(name = "city")
    private String city;

    @Column (name = "state")
    private String state;

    @Column(name = "postal_code")
    private String postalCode;

    @Column(name = "country")
    private String country;

    @Column(name = "credit_limit", columnDefinition = "DECIMAL")
    private Double creditLimit;

    //practice of .equals() or use @EqualsAndHashCode annotation at the top and add at employee column @EqualsAndHashCode.Exclude like we did for @toString.Exclude
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id) && Objects.equals(salesRepEmployeeId,
                customer.salesRepEmployeeId) && Objects.equals(customerName, customer.customerName) &&
                Objects.equals(contactLastname, customer.contactLastname) &&
                Objects.equals(contactFirstname, customer.contactFirstname) &&
                Objects.equals(phone, customer.phone) && Objects.equals(addressLine1, customer.addressLine1) &&
                Objects.equals(addressLine2, customer.addressLine2) && Objects.equals(city, customer.city) &&
                Objects.equals(state, customer.state) && Objects.equals(postalCode, customer.postalCode) &&
                Objects.equals(country, customer.country) && Objects.equals(creditLimit, customer.creditLimit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, salesRepEmployeeId, customerName, contactLastname, contactFirstname, phone, addressLine1, addressLine2, city, state, postalCode, country, creditLimit);
    }

}
