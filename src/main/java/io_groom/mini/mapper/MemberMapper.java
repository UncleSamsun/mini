package io_groom.mini.mapper;

import io_groom.mini.domain.Member;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MemberMapper {

    List<Member> selectAll();

    Member selectById(@Param("memberSeq") Long memberSeq);

    int insert(@Param("member") Member member);

    int update(@Param("member") Member member);

    int updateUseYn(@Param("member") Member member);

    int delete(@Param("memberSeq") Long memberSeq);

}
