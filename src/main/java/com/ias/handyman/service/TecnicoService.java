package com.ias.handyman.service;

import com.ias.handyman.Model.Reporte;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TecnicoService implements ItecnicoService{

    private final ArrayList<Reporte> listTecnicos = new ArrayList();

    @Override
    public boolean guardar(Reporte reporte) {
        if(reporte.getIdServico() == null || reporte.getIdTecnico() == null || reporte.getFechaFin() == null
            || reporte.getFechaInicio()==null){
            return false;
        }
        listTecnicos.add(reporte);
        return true;
    }

    @Override
    public List<Reporte> getReportes() {
        return listTecnicos;
    }
}
