package com.mycorp.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mycorp.services.ZendeskService;
import com.mycorp.support.Constantes;
import com.mycorp.support.ResponseUtils;
import com.mycorp.support.ValueCode;

import util.datos.UsuarioAlta;

@RestController
public class ZendeskController {
	
	private final ZendeskService zendeskService;
	
	public ZendeskController (final ZendeskService zendeskService){
		this.zendeskService = zendeskService;
		
	}

    /**
     * Crea un ticket en Zendesk. Si se ha informado el nÂº de tarjeta, obtiene los datos asociados a dicha tarjeta de un servicio externo.
     * @param usuarioAlta
     * @param userAgent
     */
    @RequestMapping( value = Constantes.URL_ZENDESK, method = RequestMethod.GET)
    public ResponseEntity<List <ValueCode>> altaTicketZendesk( @RequestParam(required=false, value ="usuarioAlta" ) UsuarioAlta usuarioAlta, @RequestParam (required=false, value ="userAgent" )String userAgent){
    	return ResponseUtils.createResponse(zendeskService.altaTicketZendesk(usuarioAlta, userAgent), HttpStatus.OK);
    			
    			

    }
}