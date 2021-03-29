package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @NotBlank(message="Description is required.")
    @NotNull(message="Description is required.")
    @Size(max=256, message="Description is too long.")
    private String description;

    public Skill() {};

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}