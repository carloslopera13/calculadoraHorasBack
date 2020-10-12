package com.ias.handyman.service;

import com.ias.handyman.Model.Reporte;

import java.util.List;


public interface ItecnicoService {
    public boolean guardar(Reporte reporte);

    public List<Reporte> getReportes();

}
