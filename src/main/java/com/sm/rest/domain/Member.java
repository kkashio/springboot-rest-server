package com.sm.rest.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

/**
 * Created by seongmin Park on 2017. 5. 3..
 */

@Entity(name = "MEMBER")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Member {
    @Id
    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "NICKNAME")
    private String nickname;

    @Column(name = "REG_DATE")
    private Date regDate;

    public Member(String email, String password, String nickname){
        this.email=email;
        this.password=password;
        this.nickname=nickname;
    }
}
