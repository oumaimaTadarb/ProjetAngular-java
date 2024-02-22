package com.management.services;

import com.management.entities.Category;
import com.management.entities.Plat;
import com.management.repositories.PlatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class PlatServiceImpl implements PlatService {
    @Autowired
    PlatRepository platRepository;
    @Override
    public Plat savePlat(Plat plat) {
        return platRepository.save(plat);
    }

    @Override
    public Plat updatePlat(Plat plat) {
        return platRepository.save(plat);
    }

    @Override
    public Plat getPlatById(Long id) {
        return platRepository.findById(id).get();
    }

    @Override
    public List<Plat> getAllPlats() {
        return platRepository.findAll();
    }

    @Override
    public void deletePlatById(Long id) {
        platRepository.deleteById(id);
    }

    @Override
    public List<Plat> findAllPlatsByPrice(double pricePlat) {
        return platRepository.findAllPlatsByPrice(1000.00);
    }

    @Override
    public List<Plat> findAllPlatsByNamePrice(String namePlat, double pricePlat) {
        return platRepository.findAllPlatsByNamePrice("TV", 3000.00);
    }

//    @Override
//    public List<Plat> findAllPlatsByCategory(Category category) {
//        return platRepository.findAllPlatsByCategory(category);
//    }

//    @Override
//    public List<Plat> findAllPlatsByIdCategory(Long idCategory) {
//        return platRepository.findByCategoryIdCategory(idCategory);
//    }

    @Override
    public List<Plat> findAllPlatsByNameSort() {
        return platRepository.findAllPlatsByNameSort();
    }

    @Override
    public Page<Plat> getAllPlatsByPage(int page, int size) {
        return platRepository.findAll(PageRequest.of(page, size));
    }
}
