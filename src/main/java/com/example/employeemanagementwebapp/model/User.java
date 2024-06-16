package com.example.employeemanagementwebapp.model;

import jakarta.persistence.*;
import org.hibernate.sql.ast.tree.expression.Collation;

import javax.management.relation.Role;
import java.util.Collection;

@Entity
@Table(name = "user",uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;

    private String email;
    private String password;

    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(
                    name = "user_id",referencedColumnName = "id"),
                    inverseJoinColumns = @JoinColumn(
                            name = "role_id",referencedColumnName = "id"))

    private Collection<Role> roles;

    public User() {

    }



}
