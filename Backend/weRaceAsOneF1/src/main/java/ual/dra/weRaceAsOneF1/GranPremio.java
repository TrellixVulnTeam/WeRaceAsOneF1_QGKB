package ual.dra.weRaceAsOneF1;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table
public class GranPremio implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(max = 65)
    private String nombre;

    @Size(max = 65)
    private String ubicacion;
    private String imagenCircuito;
    private String pais;
    private Integer numVueltas;
    private Integer kmCircuito;
    private Integer kmCarrera;

    // Hibernate requires a no-arg constructor
    public GranPremio() {

    }

    public GranPremio(String nombre, String ubicacion, String pais, Integer numVueltas, Integer kmCircuito, Integer kmCarrera, String imagenCircuito){
        super();
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.pais = pais;
        this.numVueltas = numVueltas;
        this.kmCircuito = kmCircuito;
        this.kmCarrera = kmCircuito * numVueltas;
        this.imagenCircuito = imagenCircuito;
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

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Integer getNumVueltas() {
        return numVueltas;
    }

    public void setNumVueltas(Integer numVueltas) {
        this.numVueltas = numVueltas;
    }

    public Integer getKmCircuito() {
        return kmCircuito;
    }

    public void setKmCircuito(Integer kmCircuito) {
        this.kmCircuito = kmCircuito;
    }

    public Integer getKmCarrera() {
        return kmCarrera;
    }

    public void setKmCarrera(Integer kmCarrera) {
        this.kmCarrera = kmCarrera;
    }
   
	public String getImagenCircuito() {
        return imagenCircuito;
    }

    public void setImagenCircuito(String imagenCircuito) {
        this.imagenCircuito = imagenCircuito;
    }
}