package com.sm.rest.repository;

import com.sm.rest.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.stream.Stream;

/**
 * Created by seongmin Park on 2017. 5. 3..
 */
public interface BoardRepository extends JpaRepository<Board, Long>{
    Stream<Board> findByMember(String email);
}
