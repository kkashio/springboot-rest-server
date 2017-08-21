package com.sm.rest;

import com.sm.rest.domain.Board;
import com.sm.rest.domain.Member;
import com.sm.rest.repository.BoardRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RestApplicationTests {

	@Test
	public void contextLoads() {
		Member member1 = new Member("bnbgg@naver.com","1234","바턴미니");
		Member member2 = new Member("abc@naver.com","1234","안나푸르나");
		Member member3 = new Member("zz1793@daum.com","1234","오키상");
		Member member4 = new Member("gogegy@google.com","1234","외로운달토키");
		Member member5 = new Member("soundisgood@naver.com","1234","비천");
		Member member6 = new Member("power174@yahoo.com","1234","오함마가지고와");
		Member member7 = new Member("suddenAttack@suden.com","1234","밤바나무");

		Board board1 = new Board(member1, "오늘은 비가올것 같다", "내 등골이 시린것을 보니 오늘은 비가 올것 같다 하지만 난 두려워하지 않으리 우산이 있으니 말이다");
		Board board2 = new Board(member2, "그녀가 바람이 난것 같다", "난 우연히 극장앞에서 다른 남자와 손을 잡고 있는 그녀의 모습을 보았따 화가 나지만 나에겐 자격이 없다 나는 짝사라잉기때문이다");
		Board board3 = new Board(member3, "님들 이거보셈 ㅇㅇㅈㅇㅇㅈ", "제곧네");
		Board board4 = new Board(member4, "빛은 소리보다 빠르다", "냄새는 소리보다 빠른가??");
	}

}
