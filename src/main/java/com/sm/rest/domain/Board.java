package com.sm.rest.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by seongmin park on 2017. 5. 3..
 */

@Entity(name = "BOARD")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.)
    @Column(name = "BOARD_ID")
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EMAIL")
    private Member member;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "CONTENT")
    private String content;

    @Column(name = "REG_DATE")
    private Date regDate;

    @Column(name = "MODIFY_DATE")
    private Date modifyDate;

    @Column(name = "DEL_FLAG")
    private boolean delFlag;

    public Board(Member member, String title, String content){
        this.member = member;
        this.title = title;
        this.content = content;
    }
}
