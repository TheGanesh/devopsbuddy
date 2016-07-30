package com.ganesh.springboot.domain;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Ganesh on 7/30/16.
 */
@Entity
public class Team {
    @Id
    @GeneratedValue
    Long id;

    String name;
    String location;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "teamId")
    Set<Player> players;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Set<Player> players) {
        this.players = players;
    }
}
