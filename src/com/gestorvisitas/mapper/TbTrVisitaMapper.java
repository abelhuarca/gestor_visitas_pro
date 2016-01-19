package com.gestorvisitas.mapper;

import com.gestorvisitas.model.TbTrVisita;
import com.gestorvisitas.model.TbTrVisitaExample;
import com.gestorvisitas.model.TbTrVisitaKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbTrVisitaMapper {
     
    int countByExample(TbTrVisitaExample example);

     
    int deleteByExample(TbTrVisitaExample example);

     
    int deleteByPrimaryKey(TbTrVisitaKey key);

     
    int insert(TbTrVisita record);

     
    int insertSelective(TbTrVisita record);

     
    List<TbTrVisita> selectByExample(TbTrVisitaExample example);

     
    TbTrVisita selectByPrimaryKey(TbTrVisitaKey key);

     
    int updateByExampleSelective(@Param("record") TbTrVisita record, @Param("example") TbTrVisitaExample example);

     
    int updateByExample(@Param("record") TbTrVisita record, @Param("example") TbTrVisitaExample example);

     
    int updateByPrimaryKeySelective(TbTrVisita record);

     
    int updateByPrimaryKey(TbTrVisita record);
}