package com.crick.apis.services;

import com.crick.apis.entities.Match;

import java.util.List;
import java.util.Map;

public interface MatchService {
    //get all matches
    List<Match> getAllMathes();

    //get live matches
    List<Match> getLiveMatches();

    //get cwc2023 point table
    List<List<String>> getPointTable();

}
