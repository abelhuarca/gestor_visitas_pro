package com.gestorvisitas.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.gestorvisitas.mapper.TbMaMtipoMapper;
import com.gestorvisitas.mapper.TbSeRolMapper;
import com.gestorvisitas.mapper.TbSeUsuarioMapper;
import com.gestorvisitas.model.TbSeUsuario;
import com.gestorvisitas.model.TbSeUsuarioExample;

@Path("/WebServices")
public class Servicios {
	private int respuesta=0;
	TbSeUsuarioMapper usuarioMapper;
	TbSeUsuario usuario;
	TbSeUsuarioExample usuarioExample;
	
	   @GET
	   @Path("/login")
	   @Produces(MediaType.APPLICATION_JSON)
	   public int login(
	   @QueryParam("usuario") String usuario,
	   @QueryParam("clave") String clave	   
	    ){
		   List<TbSeUsuario>listaUsuarios = new ArrayList<>();  
		   usuarioExample.createCriteria().andUsuCorreoEqualTo(usuario).andUsuPasswordEqualTo(clave);
		   listaUsuarios=usuarioMapper.selectByExample(usuarioExample);
		   System.out.println("llego hasta quiiiii");
		   if (listaUsuarios.size()==0){
			   respuesta=0;
			   
		   }
		   if (listaUsuarios.size()==1){
			   respuesta=1;
		   }
		   
	   return respuesta;
	   }

}
