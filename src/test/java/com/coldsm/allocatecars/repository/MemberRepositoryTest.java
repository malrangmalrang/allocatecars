package com.coldsm.allocatecars.repository;

import com.coldsm.allocatecars.domain.Member;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@Transactional
class MemberRepositoryTest {

    @Autowired MemberRepository memberRepository;

    @Test
    void memberTest() {
        Member member = new Member("TEST");
        Long savedId = memberRepository.save(member);

        Member findMember = memberRepository.findOne(savedId);

        assertEquals(member.getId(), findMember.getId());
        assertEquals(member.getName(), findMember.getName());
    }
}