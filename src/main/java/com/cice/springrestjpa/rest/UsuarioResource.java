package com.cice.springrestjpa.rest;

import com.cice.springrestjpa.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioResource {

    @Autowired
    private IUsuarioService usuarioService;

    @RequestMapping(method = RequestMethod.POST, path = "/login")
    public String loginUsuario(@RequestParam(name = "user") String user, @RequestParam(name = "pass") String pass){

        return usuarioService.login(user, pass);

    }


}
