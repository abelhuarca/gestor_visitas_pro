package com.gestorvisitas.mapper;

import com.gestorvisitas.model.TbTrCliente;
import com.gestorvisitas.model.TbTrClienteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbTrClienteMapper {
     
    int countByExample(TbTrClienteExample example);

     
    int deleteByExample(TbTrClienteExample example);

     
    int deleteByPrimaryKey(Integer cliRuc);

     
    int insert(TbTrCliente record);

     
    int insertSelective(TbTrCliente record);

     
    List<TbTrCliente> selectByExample(TbTrClienteExample example);

     
    TbTrCliente selectByPrimaryKey(Integer cliRuc);

     
    int updateByExampleSelective(@Param("record") TbTrCliente record, @Param("example") TbTrClienteExample example);

     
    int updateByExample(@Param("record") TbTrCliente record, @Param("example") TbTrClienteExample example);

     
    int updateByPrimaryKeySelective(TbTrCliente record);

     
    int updateByPrimaryKey(TbTrCliente record);
}