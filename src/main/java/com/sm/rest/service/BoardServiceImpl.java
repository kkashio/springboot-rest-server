package com.sm.rest.service;

import com.sm.rest.domain.Board;
import com.sm.rest.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by seongmin Park on 2017. 5. 3..
 */

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    BoardRepository boardRepository;

    @Override
    public List<Board> findByWriter(String email) {
        return boardRepository.findByMember(email).collect(Collectors.toList());
    }
}
