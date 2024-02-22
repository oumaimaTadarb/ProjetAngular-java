package com.management.services;

import com.management.entities.Category;
import com.management.entities.Plat;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PlatService
{
    Plat savePlat(Plat plat);
    Plat updatePlat(Plat plat);
    Plat getPlatById(Long id);
    List<Plat> getAllPlats();
    void deletePlatById(Long id);
    //void deleteAllPlats();

    List<Plat> findAllPlatsByPrice(double pricePlat);
    List<Plat> findAllPlatsByNamePrice(@Param("namePlat") String namePlat , @Param("pricePlat") double pricePlat);
    //List<Plat> findAllPlatsByCategory(Category category);

    //List<Plat> findAllPlatsByIdCategory(Long idCategory);
    List<Plat> findAllPlatsByNameSort();

    Page<Plat> getAllPlatsByPage(int page, int size);

}
