package com.management.restcontrollers;

import com.management.entities.Plat;
import com.management.services.PlatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class PlatRestController {
    @Autowired
    PlatService platService;

    @GetMapping("/plats")
    List<Plat> getAllPlats(){
        return platService.getAllPlats();
    }

    @GetMapping("/plats/{idPlat}")
    public Plat getPlatById(@PathVariable("idPlat") Long idPlat){
        return platService.getPlatById(idPlat);
    }

//    @GetMapping("/plats/category/{idCategory}")
//    public List<Plat> getAllPlatsByCategory(@PathVariable("idCategory") Long idCategory){
//        return platService.findAllPlatsByIdCategory(idCategory);
//    }

    @PostMapping("/plats/save")
    public Plat createPlat(@RequestBody Plat plat){
        return platService.savePlat(plat);
    }

    @PutMapping("/plats/update")
    public Plat updatePlat(@RequestBody Plat plat){
        return platService.updatePlat(plat);
    }

    @DeleteMapping("/plats/{idPlat}")
    public void deletePlatById(@PathVariable("idPlat") Long idPlat){
        platService.deletePlatById(idPlat);
    }



}
