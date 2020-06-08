package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.exemple.demo.entite.Produit;

@SpringBootApplication
public class ServeurGestionStockProduitsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServeurGestionStockProduitsApplication.class, args);
		Produit a = new Produit();
	a.setPrixUnitaire(10);
	a.setQuantite(20);
	a.setRef("tes");
	System.out.println(a.toString());
	}

}
