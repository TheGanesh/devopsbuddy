package com.ganesh.springboot;

import com.ganesh.springboot.dao.TeamDao;
import com.ganesh.springboot.domain.Player;
import com.ganesh.springboot.domain.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Ganesh on 7/30/16.
 */
@RestController
public class TeamController {

    @Autowired
    TeamDao teamDao;

    @PostConstruct
    public void init() {

        Team team = new Team();
        team.setId(0l);
        team.setLocation("Harlem");
        team.setName("Globetrotters");

        Set<Player> players = new HashSet<>();
        Player player = new Player();
        player.setId(1l);
        player.setName("Sachin");
        player.setPosotion("10");

        players.add(player);

        team.setPlayers(players);
        teamDao.save(team);
    }

    @RequestMapping("/hi")
    public Iterable<Team> getTeams() {
        return teamDao.findAll();
    }


}
