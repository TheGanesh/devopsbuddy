package com.ganesh.springboot.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Ganesh on 7/30/16.
 */
@Entity
public class Player {

    @Id
    @GeneratedValue
    Long id;

    String name;
    String posotion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPosotion() {
        return posotion;
    }

    public void setPosotion(String posotion) {
        this.posotion = posotion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
