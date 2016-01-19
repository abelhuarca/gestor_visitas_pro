package com.gestorvisitas.mapper;

import com.gestorvisitas.model.TbSeUsuario;
import com.gestorvisitas.model.TbSeUsuarioExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSeUsuarioMapper {
     
    int countByExample(TbSeUsuarioExample example);

     
    int deleteByExample(TbSeUsuarioExample example);

     
    int deleteByPrimaryKey(Integer usuCodigo);

     
    int insert(TbSeUsuario record);

     
    int insertSelective(TbSeUsuario record);

     
    List<TbSeUsuario> selectByExample(TbSeUsuarioExample example);

     
    TbSeUsuario selectByPrimaryKey(Integer usuCodigo);

     
    int updateByExampleSelective(@Param("record") TbSeUsuario record, @Param("example") TbSeUsuarioExample example);

     
    int updateByExample(@Param("record") TbSeUsuario record, @Param("example") TbSeUsuarioExample example);

     
    int updateByPrimaryKeySelective(TbSeUsuario record);

     
    int updateByPrimaryKey(TbSeUsuario record);
}