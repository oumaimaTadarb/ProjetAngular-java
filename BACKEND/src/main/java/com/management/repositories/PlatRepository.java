package com.management.repositories;

import com.management.entities.Category;
import com.management.entities.Plat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "rest")
public interface PlatRepository extends JpaRepository<Plat, Long> {
    @Query("select Plat from Plat Plat where Plat.pricePlat >?1")
    List<Plat> findAllPlatsByPrice(double pricePlat);

    @Query("select Plat from Plat Plat where Plat.namePlat like %:namePlat and Plat.pricePlat >:pricePlat")
    List<Plat> findAllPlatsByNamePrice(@Param("namePlat") String namePlat , @Param("pricePlat") double pricePlat);

//    @Query("select Plat from Plat Plat where Plat.categoryPlat =?1")
//    List<Plat> findAllPlatsByCategory(Category category);

    @Query("select Plat from Plat Plat order by Plat.namePlat")
    List<Plat> findAllPlatsByNameSort();

    //List<Plat> findByCategoryIdCategory(Long idCatgory);

}
