package com.sm.rest.service;

import com.sm.rest.domain.Board;

import java.util.List;

/**
 * Created by seongmin Park on 2017. 5. 3..
 */
public interface BoardService {
    List<Board> findByWriter(String email);
}
