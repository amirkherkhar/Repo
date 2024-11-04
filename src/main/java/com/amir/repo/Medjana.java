package com.amir.repo;

import static jakarta.persistence.GenerationType.SEQUENCE;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;


@Entity
@Table(
        name = "medjana",
        uniqueConstraints = {
            @UniqueConstraint(name ="medjana_email_unique", columnNames ="email")
        }
)

public class Medjana{
    @Id
    @SequenceGenerator(
        name = "medjana_sequence",
        sequenceName =  "medjana_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = SEQUENCE,
        generator = "medjana_sequence"
    )
     @Column(
        name ="id",
        updatable =false
     )
    private long id;
    @Column(
        name = "email",
        nullable = false,
        columnDefinition = "TEXT"
       
       
     )
    private String email;
    @Column(
        name = "first_name",
        nullable = false,
        columnDefinition = "TEXT"

     )
    private String firstname;
     @Column(
        name = "last_name",
        nullable = false,
        columnDefinition = "TEXT"

     )
    private String lastname;
    @Column(
        name ="age"
        
     )
    private int age;

    

    public Medjana( String email, String firstname, String lastname, int age) {
        
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Medjana [id=" + id + ", email=" + email + ", firstname=" + firstname + ", lastname=" + lastname
                + ", age=" + age + "]";
    }

    
}