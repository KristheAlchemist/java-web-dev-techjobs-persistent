package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotNull(message="Location is required.")
    @NotBlank(message="Location is required.")
    @Size(max=82, message="Location is too long.")
//    @Max(value=1, message="Only one location at this time.")
    private String location;

    @OneToMany
    @JoinColumn
    private List<Job> jobs = new ArrayList<>();

    public Employer() {};

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
