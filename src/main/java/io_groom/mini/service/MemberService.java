package io_groom.mini.service;

import io_groom.mini.mapper.MemberMapper;
import io_groom.mini.domain.Member;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Slf4j
@org.springframework.stereotype.Service
public class MemberService {


    @Autowired
    private MemberMapper memberMapper;

    @Autowired
    public MemberService(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }


    public List<Member> findAll() {

        return memberMapper.selectAll();
    }

    public Member find(Long memberSeq) {

        return memberMapper.selectById(memberSeq);
    }

    public int save(Member member) {

        return memberMapper.insert(member);
    }

    public int update(Member member) {

        return memberMapper.update(member);
    }

    public int updatePublishYn(Member member) {

        return memberMapper.updateUseYn(member);
    }

}
