package com.ganesh.springboot.dao;

import com.ganesh.springboot.domain.Player;
import com.ganesh.springboot.domain.Team;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 * Created by Ganesh on 7/30/16.
 */
@RestResource(path = "players",rel = "players")
public interface PlayerDao extends CrudRepository<Player, Long> {
}
