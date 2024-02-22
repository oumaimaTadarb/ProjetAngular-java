package com.management;

import com.management.entities.Category;
import com.management.entities.Plat;
import com.management.repositories.PlatRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MainApplicationApplicationTests {
	@Autowired
	PlatRepository PlatRepository;

	@Test
	public void TestCreatePlat(){
		//Plat Plat = new Plat("Apple TV", 3000.00, new Date());
		//PlatRepository.save(Plat);
	}
	@Test
	public  void TestUpdatePlat(){
		Plat plat = PlatRepository.findById(1L).get();
		plat.setPricePlat(2500.00);
		PlatRepository.save(plat);
	}
	@Test
	public void TestFindPlatById(){
		Plat plat = PlatRepository.findById(1L).get();
		System.out.println(plat);
	}
	@Test
	public void TestFindAllPlats(){
		List<Plat> plats = PlatRepository.findAll();
		for (Plat p : plats){
			System.out.println(p);
		}
		plats.forEach(System.out::println);
	}
	@Test
	public void TestDeletePlatById(){
		PlatRepository.deleteById(1L);
	}
	@Test
	public void TestDeleteAllPlats(){
		PlatRepository.deleteAll();
	}

	@Test
	public void TestFindAllPlatsByPrice(){
		List<Plat> plats = PlatRepository.findAllPlatsByPrice(5000.00);
		plats.forEach(System.out::println);
	}
	@Test
	public void TestFindAllPlatsByNamePrice(){
		List<Plat> plats = PlatRepository.findAllPlatsByNamePrice("TV", 5000.00);
		plats.forEach(System.out::println);
	}

	@Test
	public void TestFindAllPlatsByNameSort(){
		List<Plat> plats = PlatRepository.findAllPlatsByNameSort();
		plats.forEach(System.out::println);
	}

}
