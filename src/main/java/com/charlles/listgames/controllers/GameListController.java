package com.charlles.listgames.controllers;

import com.charlles.listgames.dto.GameDTO;
import com.charlles.listgames.dto.GameListDTO;
import com.charlles.listgames.dto.GameMinDTO;
import com.charlles.listgames.dto.ReplacementDTO;
import com.charlles.listgames.entities.Game;
import com.charlles.listgames.services.GameListService;
import com.charlles.listgames.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value ="/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll() {
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }

    @GetMapping(value ="/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId) {
        List<GameMinDTO> result = gameService.findByList(listId);
        return result;
    }

    @PostMapping(value ="/{listId}/replacement")
    public void move(@PathVariable Long listId,  @RequestBody ReplacementDTO body) {
        gameListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());
    }
}
