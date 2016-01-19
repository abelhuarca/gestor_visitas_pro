package com.gestorvisitas.mapper;

import com.gestorvisitas.model.TbSeRol;
import com.gestorvisitas.model.TbSeRolExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSeRolMapper {
     
    int countByExample(TbSeRolExample example);

     
    int deleteByExample(TbSeRolExample example);

     
    int deleteByPrimaryKey(Integer rolCodigo);

     
    int insert(TbSeRol record);

     
    int insertSelective(TbSeRol record);

     
    List<TbSeRol> selectByExample(TbSeRolExample example);

     
    TbSeRol selectByPrimaryKey(Integer rolCodigo);

     
    int updateByExampleSelective(@Param("record") TbSeRol record, @Param("example") TbSeRolExample example);

     
    int updateByExample(@Param("record") TbSeRol record, @Param("example") TbSeRolExample example);

     
    int updateByPrimaryKeySelective(TbSeRol record);

     
    int updateByPrimaryKey(TbSeRol record);
}