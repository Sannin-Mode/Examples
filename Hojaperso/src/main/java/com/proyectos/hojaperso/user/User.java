/*
Clase para instanciar los distintos usuarios
 */

package com.proyectos.hojaperso.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class User {

    private int id;
    private String nombre;
    private String correo;
    private String password;


}
