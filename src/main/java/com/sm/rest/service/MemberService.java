package com.sm.rest.service;

import com.sm.rest.domain.Member;

import java.util.List;

/**
 * Created by seongmin Park on 2017. 5. 3..
 */
public interface MemberService {
    List<Member> findAll();
}
