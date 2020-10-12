package com.ias.handyman.controllers;

import com.ias.handyman.Model.Reporte;
import com.ias.handyman.service.ItecnicoService;
import com.ias.handyman.service.TecnicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/")
@CrossOrigin("*")
public class Controler {


    @Autowired
    ItecnicoService service = new TecnicoService();

    @PostMapping("guardar")
    public boolean insert(@RequestBody Reporte reporte) {
        return service.guardar(reporte);
    }

    @GetMapping("reportes")
    public List<Reporte> obtenerReportes() {
        return service.getReportes();
    }


}


