package com.sm.rest.web;

import com.sm.rest.domain.Board;
import com.sm.rest.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by seongmin Park on 2017. 5. 3..
 */

@RestController
@RequestMapping("/board")
public class BoardController {

    @Autowired
    BoardService boardService;

    @GetMapping("/writer/{email}")
    public List<Board> findByWriter(@PathVariable String email){
        return boardService.findByWriter(email);
    }
}
