package ual.dra.weRaceAsOneF1;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table
public class Escuderia implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(max = 65)
    private String nombre;

    @Size(max = 65)
    private String ubicacion;

    @OneToMany(mappedBy="escuderia")
    private List<Piloto> pilotos;

    private String jefe;
    private String motor;
    private Integer numMundiales;
    private Integer numPodios;
    private Integer numPoles;
    private Integer numVueltasRapidas;
    private String escudo;

    public Escuderia() {

    }

    public Escuderia(String nombre, List<Piloto> pilotos, String ubicacion, String jefe, String motor, Integer numMundiales, Integer numPodios, Integer numPoles, Integer numVueltasRapidas, String escudo){
        super();
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.jefe = jefe;
        this.numMundiales = numMundiales;
        this.numPodios = numPodios;
        this.numPoles = numPoles;
        this.numVueltasRapidas = numVueltasRapidas;
        this.escudo = escudo;
        this.pilotos = pilotos;
        this.motor = motor;
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

    public String getJefe() {
        return jefe;
    }

    public void setJefe(String jefe) {
        this.jefe = jefe;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public Integer getNumMundiales() {
        return numMundiales;
    }

    public void setNumMundiales(Integer numMundiales) {
        this.numMundiales = numMundiales;
    }

    public Integer getNumPodios() {
        return numPodios;
    }

    public void setNumPodios(Integer numPodios) {
        this.numPodios = numPodios;
    }

    public Integer getNumPoles() {
        return numPoles;
    }

    public void setNumPoles(Integer numPoles) {
        this.numPoles = numPoles;
    }

    public Integer getNumVueltasRapidas() {
        return numVueltasRapidas;
    }

    public void setNumVueltasRapidas(Integer numVueltasRapidas) {
        this.numVueltasRapidas = numVueltasRapidas;
    }

    public String getEscudo() {
        return escudo;
    }

    public void setEscudo(String escudo) {
        this.escudo = escudo;
    }

    public List<Piloto> getPilotos() {
        return pilotos;
    }

    public void setPilotos(List<Piloto> pilotos) {
        this.pilotos = pilotos;
    }

    

}