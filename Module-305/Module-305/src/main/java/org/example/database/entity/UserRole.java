package org.example.database.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "productlines")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "user_id")
    private int userId;

    @Column (name = "role_name")
    private String roleName;


}
