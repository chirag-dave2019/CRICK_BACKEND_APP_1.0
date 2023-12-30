package com.crick.apis.repositories;

import com.crick.apis.entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MatchRepo extends JpaRepository<Match, Integer> {
//need to fetch match
    //please provide --> teamHeading
    Optional<Match> findByteamHeading(String teamHeading);
}
