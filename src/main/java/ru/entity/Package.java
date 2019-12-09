package ru.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Package data entity.
 */
@AllArgsConstructor
@Data
public class Package {
    /**
     * Id of a package.
     */
    private Integer id;

    /**
     * Name of parcel's owner.
     */
    private String owner;

    /**
     * Weight of parcel in kilograms.
     */
    private Integer weight;

    public Package(int id, String owner, int weight) {
        this.id=id;
        this.owner= owner;
        this.weight=weight;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
