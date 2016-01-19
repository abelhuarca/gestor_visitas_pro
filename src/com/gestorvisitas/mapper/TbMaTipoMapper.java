package com.gestorvisitas.mapper;

import com.gestorvisitas.model.TbMaTipo;
import com.gestorvisitas.model.TbMaTipoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbMaTipoMapper {
     
    int countByExample(TbMaTipoExample example);

     
    int deleteByExample(TbMaTipoExample example);

     
    int deleteByPrimaryKey(Integer tipCodigo);

     
    int insert(TbMaTipo record);

     
    int insertSelective(TbMaTipo record);

     
    List<TbMaTipo> selectByExample(TbMaTipoExample example);

     
    TbMaTipo selectByPrimaryKey(Integer tipCodigo);

     
    int updateByExampleSelective(@Param("record") TbMaTipo record, @Param("example") TbMaTipoExample example);

     
    int updateByExample(@Param("record") TbMaTipo record, @Param("example") TbMaTipoExample example);

     
    int updateByPrimaryKeySelective(TbMaTipo record);

     
    int updateByPrimaryKey(TbMaTipo record);
}