package com.devsuperior.dslist.controllers;
import com.devsuperior.dslist.dto.GameListDto;
import com.devsuperior.dslist.dto.GameMinDto;
import com.devsuperior.dslist.dto.ReplacementDTO;
import com.devsuperior.dslist.services.GameListService;
import com.devsuperior.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "/lists")
public class GameListController {

        @Autowired
        private GameListService gameListService;
        @Autowired
        private GameService gameService;
        @GetMapping
        public List<GameListDto> findAll(){
            List<GameListDto> result = gameListService.findAll();
            return result;
        }
        @GetMapping(value = "/{id}")
        public GameListDto findById(@PathVariable Long id){
            GameListDto result = gameListService.findById(id);
            return result;
        }
    @GetMapping(value = "/{listId}/games")
    public List<GameMinDto> findByList(@PathVariable Long listId){
        List<GameMinDto> result = gameService.findByList(listId);
        return result;
    }
    @PostMapping(value = "/{listId}/replacement")
    public void move(@PathVariable Long listId, @RequestBody ReplacementDTO body) {
        gameListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());
    }


    }
