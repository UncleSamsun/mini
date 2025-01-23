package io_groom.mini.mapper;

import io_groom.mini.domain.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AdminMapper {

    List<Admin> selectAll();

    Admin selectById(@Param("adminSeq") Long adminSeq);

    int insert(@Param("admin") Admin admin);

    int update(@Param("admin") Admin admin);

    int updateUseYn(@Param("admin") Admin admin);

    int delete(@Param("adminSeq") Long adminSeq);

}
