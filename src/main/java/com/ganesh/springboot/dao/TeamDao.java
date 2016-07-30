package com.ganesh.springboot.dao;

import com.ganesh.springboot.domain.Team;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 * Created by Ganesh on 7/30/16.
 */
@RestResource(path = "teams",rel = "teams")
public interface TeamDao extends CrudRepository<Team, Long> {
}
