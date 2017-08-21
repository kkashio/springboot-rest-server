package com.sm.rest.repository;

import com.sm.rest.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.stream.Stream;

/**
 * Created by seongmin Park on 2017. 5. 3..
 */
public interface MemberRepository extends JpaRepository<Member, String>{
    List<Member> findByNickname(String nickname);
}
