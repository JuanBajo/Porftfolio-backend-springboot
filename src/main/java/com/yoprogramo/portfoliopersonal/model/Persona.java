package com.yoprogramo.portfoliopersonal.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "personas")
public class Persona {

    public Persona(Integer id) {
        this.id = id;
    }

    public Persona() {
    }

    public Persona(Integer id, String nombre, String apellido, String email, String foto, String titulo, String about, boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.foto = foto;
        this.titulo = titulo;
        this.about = about;
        this.activo = activo;
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "email")
    private String email;

    @Column(name = "foto")
    private String foto;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "about")
    private String about;

    @Column(name = "activo")
    private boolean activo;

}
