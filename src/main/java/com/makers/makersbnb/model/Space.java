package com.makers.makersbnb.model;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

// @Entity - instances of this class map to database records
@Entity
@Getter @Setter @NoArgsConstructor
// @Table - those records can be found in the spaces table
@Table(name = "spaces")
public class Space {

    // the following field (id) is the primary key for this Entity
    @Id
    // the value of id is generated automatically
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // a field that holds the name of each space
    private String name;

    // a field that holds the name of each space
    private String description;

    // a field that holds the name of each space
    private float price;

    // a field that holds the name of each space

    private String rules;

    // a zero-arguments constructor
    //public Space() {}


    // a one-argument constructor
    public Space(String name) {
        this.name = name;
    }

    /*
    // methods that get and set name
    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }

    // methods that get and set description
    public String getDescription() { return this.description; }
    public void setDescription(String description) { this.description = description; }

    // methods that get and set price
    public float getPrice() { return this.price; }
    public void setPrice(float price) { this.price = price; }
     */
}

