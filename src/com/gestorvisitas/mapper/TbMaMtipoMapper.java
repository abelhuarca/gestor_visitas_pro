package com.gestorvisitas.mapper;

import com.gestorvisitas.model.TbMaMtipo;
import com.gestorvisitas.model.TbMaMtipoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbMaMtipoMapper {
     
    int countByExample(TbMaMtipoExample example);

     
    int deleteByExample(TbMaMtipoExample example);

     
    int deleteByPrimaryKey(Integer mtiCodigo);

     
    int insert(TbMaMtipo record);

     
    int insertSelective(TbMaMtipo record);

     
    List<TbMaMtipo> selectByExample(TbMaMtipoExample example);

     
    TbMaMtipo selectByPrimaryKey(Integer mtiCodigo);

     
    int updateByExampleSelective(@Param("record") TbMaMtipo record, @Param("example") TbMaMtipoExample example);

     
    int updateByExample(@Param("record") TbMaMtipo record, @Param("example") TbMaMtipoExample example);

     
    int updateByPrimaryKeySelective(TbMaMtipo record);

     
    int updateByPrimaryKey(TbMaMtipo record);
}