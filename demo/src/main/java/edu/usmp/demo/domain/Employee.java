package edu.usmp.demo.domain;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "t_employee")
public class Employee {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    private String name;
    private double precio;

    /*public Employee(String firstname,String lastname) {
      / this.firstname = firstname;
        this.lastname = lastname;
    }*/

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }



    public String getname() {
        return this.name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public double getprecio() {
        return this.precio;
    }

    public void setprecio(double precio) {
        this.precio = precio;
    }
}
