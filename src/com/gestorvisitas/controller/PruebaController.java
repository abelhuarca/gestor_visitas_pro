package com.gestorvisitas.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gestorvisitas.mapper.TbSeRolMapper;
import com.gestorvisitas.mapper.TbSeUsuarioMapper;
import com.gestorvisitas.model.TbSeRol;
import com.gestorvisitas.model.TbSeRolExample;
import com.gestorvisitas.model.TbSeUsuario;
import com.gestorvisitas.model.TbSeUsuarioExample;


@Controller
@RequestMapping(value="/registration")
public class PruebaController {
	int respuesta;
	private TbSeRolMapper tbSeRolMapper=null;
	TbSeUsuarioMapper usuarioMapper;
	TbSeUsuario usuario= new TbSeUsuario();
	TbSeUsuarioExample usuarioExample = new TbSeUsuarioExample();
	
	
	
	
	public TbSeRolMapper getTbSeRolMapper() {
		return tbSeRolMapper;
	}
	
	@Autowired
	public void setTbSeRolMapper(TbSeRolMapper tbSeRolMapper) {
		this.tbSeRolMapper = tbSeRolMapper;
	}
	
	
	@RequestMapping(method=RequestMethod.GET)
	public String showForm(ModelMap model){
		List<TbSeUsuario>listaUsuarios = new ArrayList<>();  
		   usuarioExample.createCriteria().andUsuCorreoEqualTo("correo").andUsuPasswordEqualTo("123456");
		   listaUsuarios=usuarioMapper.selectByExample(usuarioExample);
		   
		   if (listaUsuarios.size()==0){
			   respuesta=0;
			   System.out.println("no hay ");
			   
		   }
		   if (listaUsuarios.size()==1){
			   respuesta=1;
			   System.out.println("si    hay ");
		   }
		//System.out.println(users.size());
		//User user = new User();
		//user.setId(UUID.randomUUID().toString());
		//model.addAttribute("user", user);
		return "registration";
	}

	public TbSeUsuarioMapper getUsuarioMapper() {
		return usuarioMapper;
	}

	@Autowired
	public void setUsuarioMapper(TbSeUsuarioMapper usuarioMapper) {
		this.usuarioMapper = usuarioMapper;
	}

	public TbSeUsuario getUsuario() {
		return usuario;
	}

	public void setUsuario(TbSeUsuario usuario) {
		this.usuario = usuario;
	}
	
	
	//private RegistrationValidator validator = null;
	//private UserService userService = null;
		
	/*

	@Autowired
	public void setValidator(RegistrationValidator validator) {
		this.validator = validator;
	}

	@RequestMapping(method=RequestMethod.GET)
	public String showForm(ModelMap model){
		List<User> users = userService.getAllUser();
		model.addAttribute("users", users);
		User user = new User();
		user.setId(UUID.randomUUID().toString());
		model.addAttribute("user", user);
		return "registration";
	}

	@RequestMapping(value="/add", method=RequestMethod.POST)
	public ModelAndView add(@ModelAttribute(value="user") User user,BindingResult result){
		validator.validate(user, result);
		ModelAndView mv = new ModelAndView("registration");
		if(!result.hasErrors()){
			userService.saveUser(user);
			user = new User();
			user.setId(UUID.randomUUID().toString());
			mv.addObject("user", user);
		}
		mv.addObject("users", userService.getAllUser());
		return mv;
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public ModelAndView update(@ModelAttribute(value="user") User user,BindingResult result){
		validator.validate(user, result);
		ModelAndView mv = new ModelAndView("registration");
		if(!result.hasErrors()){
			userService.updateUser(user);
			user = new User();
			user.setId(UUID.randomUUID().toString());
			mv.addObject("user", user);
		}
		mv.addObject("users", userService.getAllUser());
		return mv;
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public ModelAndView delete(@ModelAttribute(value="user") User user,BindingResult result){
		validator.validate(user, result);
		ModelAndView mv = new ModelAndView("registration");
		if(!result.hasErrors()){
			userService.deleteUser(user.getId());
			user = new User();
			user.setId(UUID.randomUUID().toString());
			mv.addObject("user", user);
		}
		mv.addObject("users", userService.getAllUser());
		return mv;
	}
*/

}
