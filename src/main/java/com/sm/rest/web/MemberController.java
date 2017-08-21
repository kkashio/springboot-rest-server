package com.sm.rest.web;

import com.sm.rest.domain.Member;
import com.sm.rest.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by seongmin Park on 2017. 5. 3..
 */

@RestController
@RequestMapping("/member")
public class MemberController {

    @Autowired
    MemberService memberService;

    @RequestMapping("/findAll")
    public List<Member> findAll(){
        return memberService.findAll();
    }
}
