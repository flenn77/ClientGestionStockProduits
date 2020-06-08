package com.example.demo.service;
import java.util.List;
import com.exemple.demo.entite.Produit;;

public interface IProduit {

	
	
		List<Produit> getProduits();
		void addProduiit(Produit produit);
		void updateProduit(Produit produit);
		void deletProduit(String ref);
		
}
