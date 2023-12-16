package com.movil.miexamen;
import java.util.Date;

public class Entrevista {
    private int idOrden;
    private String descripcion;
    private String periodista;
    private Date fecha;
    private String imagen;
    private String audio;

    // Constructor vacío requerido por Firebase
    public Entrevista() {
    }

    public Entrevista(int idOrden, String descripcion, String periodista, Date fecha, String imagen, String audio) {
        this.idOrden = idOrden;
        this.descripcion = descripcion;
        this.periodista = periodista;
        this.fecha = fecha;
        this.imagen = imagen;
        this.audio = audio;
    }

    // Métodos getter y setter

    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPeriodista() {
        return periodista;
    }

    public void setPeriodista(String periodista) {
        this.periodista = periodista;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }
}

