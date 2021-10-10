package model;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "servicios")
public class Servicio {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "fecha_creacion_solicitud")
    private Date fechaCreacionSolicitud;

    @ManyToOne
    @JoinColumn(name = "id")
    private Cuidador cuidadorSolicitante;

    @Column(name = "nombre_solicitud")
    private String nombreSolicitud;

    @Column(name = "descripcion_solicitud")
    private String descripcionSolicitud;

    @Column(name = "tiempoSolicitud")
    private int tiempoSolicitud;

    @Column(name = "pago_solicitud")
    private double pagoSolicitud;

    @ManyToOne
    @JoinColumn(name = "id")
    private Asistente asistenteAsignado;

    public Servicio() {
    }

    public Servicio(int id,
                    Date fechaCreacionSolicitud,
                    Cuidador cuidadorSolicitante,
                    String nombreSolicitud,
                    String descripcionSolicitud,
                    int tiempoSolicitud,
                    double pagoSolicitud,
                    Asistente asistenteAsignado) {
        this.id = id;
        this.fechaCreacionSolicitud = fechaCreacionSolicitud;
        this.cuidadorSolicitante = cuidadorSolicitante;
        this.nombreSolicitud = nombreSolicitud;
        this.descripcionSolicitud = descripcionSolicitud;
        this.tiempoSolicitud = tiempoSolicitud;
        this.pagoSolicitud = pagoSolicitud;
        this.asistenteAsignado = asistenteAsignado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechaCreacionSolicitud() {
        return fechaCreacionSolicitud;
    }

    public void setFechaCreacionSolicitud(Date fechaCreacionSolicitud) {
        this.fechaCreacionSolicitud = fechaCreacionSolicitud;
    }

    public Cuidador getCuidadorSolicitante() {
        return cuidadorSolicitante;
    }

    public void setCuidadorSolicitante(Cuidador cuidadorSolicitante) {
        this.cuidadorSolicitante = cuidadorSolicitante;
    }

    public String getNombreSolicitud() {
        return nombreSolicitud;
    }

    public void setNombreSolicitud(String nombreSolicitud) {
        this.nombreSolicitud = nombreSolicitud;
    }

    public String getDescripcionSolicitud() {
        return descripcionSolicitud;
    }

    public void setDescripcionSolicitud(String descripcionSolicitud) {
        this.descripcionSolicitud = descripcionSolicitud;
    }

    public int getTiempoSolicitud() {
        return tiempoSolicitud;
    }

    public void setTiempoSolicitud(int tiempoSolicitud) {
        this.tiempoSolicitud = tiempoSolicitud;
    }

    public double getPagoSolicitud() {
        return pagoSolicitud;
    }

    public void setPagoSolicitud(double pagoSolicitud) {
        this.pagoSolicitud = pagoSolicitud;
    }

    public Asistente getAsistenteAsignado() {
        return asistenteAsignado;
    }

    public void setAsistenteAsignado(Asistente asistenteAsignado) {
        this.asistenteAsignado = asistenteAsignado;
    }

    @Override
    public String toString() {
        return "Servicio{" +
                "id=" + id +
                ", fechaCreacionSolicitud=" + fechaCreacionSolicitud +
                ", cuidadorSolicitante=" + cuidadorSolicitante +
                ", nombreSolicitud='" + nombreSolicitud + '\'' +
                ", descripcionSolicitud='" + descripcionSolicitud + '\'' +
                ", tiempoSolicitud=" + tiempoSolicitud +
                ", pagoSolicitud=" + pagoSolicitud +
                ", asistenteAsignado=" + asistenteAsignado +
                '}';
    }
}
