package com.charlles.listgames.controllers;

import com.charlles.listgames.dto.GameDTO;
import com.charlles.listgames.dto.GameListDTO;
import com.charlles.listgames.dto.GameMinDTO;
import com.charlles.listgames.services.GameListService;
import com.charlles.listgames.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value ="/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findAll() {
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }
}