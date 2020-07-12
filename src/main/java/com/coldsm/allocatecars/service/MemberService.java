package com.coldsm.allocatecars.service;

import com.coldsm.allocatecars.domain.Member;
import com.coldsm.allocatecars.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    /**
     * 멤버등록
     */
    @Transactional
    public void join(Member member) {
        validateMember(member);
        memberRepository.save(member);
    }

    private void validateMember(Member member) {

    }

}
