/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helloworld.apispring.controller;


import com.helloworld.apispring.model.entity.Carro;
import com.helloworld.apispring.model.entity.Conductor;
import com.helloworld.apispring.model.entity.Reserva;
import com.helloworld.apispring.model.entity.Usuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class Controller {

    @Autowired
    private UsuarioServicio usuarioServicio;
    private ConductorServicio conductorServicio;
    private CarroServicio carroServicio;
    private ReservaServicio reservaServicio;
    
    //Metodo que lista todos los usuarios por GET.

    @RequestMapping(value = "/usuarios/", method = RequestMethod.GET)
    public ResponseEntity<List<Usuario>> obtenerUsuarios() {
        List<Usuario> usuarios = usuarioServicio.getAllUsuario();
        return new ResponseEntity<List<Usuario>>(usuarios, HttpStatus.OK);
    }
    
    //Método que crea usuarios por POST
    
    @RequestMapping(value = "/usuarios/", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> crearUsuario(@RequestBody Usuario usuario) {
        String resultado = usuarioServicio.crearUsuario(usuario);
        return new ResponseEntity<String>(resultado, HttpStatus.OK);
    }
            
     //Metodo que lista todos los conductores por GET.

    @RequestMapping(value = "/conductores/", method = RequestMethod.GET)
    public ResponseEntity<List<Conductor>> obtenerConductores() {
        List<Conductor> conductores = conductorServicio.getAllConductor();
        return new ResponseEntity<List<Conductor>>(conductores, HttpStatus.OK);
    }
    //Método que crea condutores por POST.
    
    @RequestMapping(value = "/conductores/", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> crearConductor(@RequestBody Conductor conductor) {
        String resultado = conductorServicio.crearConductor(conductor);
        return new ResponseEntity<String>(resultado, HttpStatus.OK);
    }
               
    //Metodo que lista todos los carros por GET.

    @RequestMapping(value = "/carros/", method = RequestMethod.GET)
    public ResponseEntity<List<Carro>> obtenerCarros() {
        List<Carro> carros = carroServicio.getAllCarro();
        return new ResponseEntity<List<Carro>>(carros, HttpStatus.OK);
    }
    //Método que crea carros por POST.
    
    @RequestMapping(value = "/carros/", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> crearCarro(@RequestBody Carro carro) {
        String resultado = carroServicio.crearCarro(carro);
        return new ResponseEntity<String>(resultado, HttpStatus.OK);
    }
    
    //Metodo que lista todas lass reservas por GET.

    @RequestMapping(value = "/reservas/", method = RequestMethod.GET)
    public ResponseEntity<List<Reserva>> obtenerReservas() {
        List<Reserva> reservas = reservaServicio.getAllReserva();
        return new ResponseEntity<List<Reserva>>(reservas, HttpStatus.OK);
    }
    //Método que crea reservas por POST.
    
    @RequestMapping(value = "/reservas/", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> crearReserva(@RequestBody Reserva reserva) {
        String resultado = reservaServicio.crearReserva(reserva);
        return new ResponseEntity<String>(resultado, HttpStatus.OK);
    }
    
    //Metodo que lista las reservas por usuario.
    
    @RequestMapping(value = "/reservasUsuario", method = RequestMethod.GET)
    public ResponseEntity <List<Reserva>> obtenerUsuariosReserva(@RequestParam("User")String usuario){
        List<Reserva> reservas = reservaServicio.getReservasUsuario(usuario);
        return new ResponseEntity<List<Reserva>>(reservas, HttpStatus.OK);
    }
    
     //Metodo que lista las reservas por conductor.
    
    @RequestMapping(value = "/reservasConductor", method = RequestMethod.GET)
    public ResponseEntity <List<Reserva>> obtenerConductorReserva(@RequestParam("User")String usuarioConductor){
        List<Reserva> reservas = reservaServicio.getConductorReserva(usuarioConductor);
        return new ResponseEntity<List<Reserva>>(reservas, HttpStatus.OK);
    }
        
    //login usuario
    
    @RequestMapping(value = "/loginUsuario/", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> LoginUsuario(@RequestParam ("correo")String correo,@RequestParam("password")String password) {
        String resultado = usuarioServicio.LoginUsuario(correo,password);
        return new ResponseEntity<String>(resultado, HttpStatus.OK);
    }
    
    
       
}
