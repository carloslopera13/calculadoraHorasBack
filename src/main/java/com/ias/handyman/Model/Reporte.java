package com.ias.handyman.Model;


public class Reporte {
    private String idTecnico;
    private String idServico;
    private String fechaInicio;
    private String fechaFin;


    public Reporte(String idTecnico, String idServico, String fechaInicio, String fechaFin) {
        this.idTecnico = idTecnico;
        this.idServico = idServico;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }


    public String getIdTecnico() {
        return idTecnico;
    }

    public Reporte setIdTecnico(String idTecnico) {
        this.idTecnico = idTecnico;
        return this;
    }


    public String getIdServico() {
        return idServico;
    }

    public Reporte setIdServico(String idServico) {
        this.idServico = idServico;
        return this;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public Reporte setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
        return this;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public Reporte setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
        return this;
    }
}
