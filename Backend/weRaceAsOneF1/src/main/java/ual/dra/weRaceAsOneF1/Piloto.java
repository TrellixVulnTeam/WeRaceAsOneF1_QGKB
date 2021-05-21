package ual.dra.weRaceAsOneF1;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table
public class Piloto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String nombre;

    private String pais;

    @ManyToOne
    @JoinColumn(name="escuderia_id")
    private Escuderia escuderia;

    
    private String fotoPiloto;
    private Integer numPodios;
    private Integer numPuntos;
    private Integer numPoles;

    private Integer posicion;

    public Piloto(){

    }

    public Piloto (String nombre, String fotoPiloto, Escuderia escuderia, String pais, Integer numPodios, Integer numPuntos, Integer posicion, Integer numPoles) {
        super();
        this.nombre = nombre;
        this.pais = pais;
        this.numPodios = numPodios;
        this.numPuntos = numPuntos;
        this.posicion = posicion;
        this.numPoles = numPoles;
        this.escuderia = escuderia;
        this.fotoPiloto = fotoPiloto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Integer getNumPodios() {
        return numPodios;
    }

    public void setNumPodios(Integer numPodios) {
        this.numPodios = numPodios;
    }

    public Integer getNumPuntos() {
        return numPuntos;
    }

    public void setNumPuntos(Integer numPuntos) {
        this.numPuntos = numPuntos;
    }

    public Integer getPosicion() {
        return posicion;
    }

    public void setPosicion(Integer posicion) {
        this.posicion = posicion;
    }

    public Integer getNumPoles() {
        return numPoles;
    }

    public void setNumPoles(Integer numPoles) {
        this.numPoles = numPoles;
    }

    public Escuderia getEscuderia() {
        return escuderia;
    }

    public void setEscuderia(Escuderia escuderia) {
        this.escuderia = escuderia;
    }

    public String getFotoPiloto() {
        return fotoPiloto;
    }

    public void setFotoPiloto(String fotoPiloto) {
        this.fotoPiloto = fotoPiloto;
    }
    
}