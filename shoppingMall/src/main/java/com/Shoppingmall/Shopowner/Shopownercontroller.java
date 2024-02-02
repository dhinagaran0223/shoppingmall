package com.Shoppingmall.Shopowner;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Shopownercontroller {

	@Autowired
	Shopownerservice shservice;
	
	@PostMapping("/addowners")
	public void add (@RequestBody Shopowner own)
	{
		shservice.save(own);
	}
	
	@PostMapping("/getowners")
	public List<Shopowner> getallowners()
	{
		return shservice.getAllShopowners();
	}
	
	@PostMapping("/getownerbyid/{id}")
	public Optional<Shopowner> getownersbyid(@PathVariable Integer id)
	{
		return shservice.getShopownerById(id);
	}
	
	@PutMapping("/updateownerbyid/{id}")
	public ResponseEntity<String> updateownerbyid(@PathVariable Integer id,@RequestBody Shopowner updatedOwner)
	{
		shservice.updateShopowner(id, updatedOwner);
		return ResponseEntity.ok("owner has been updated successfully");
	}
	
	@PostMapping("deleteownerbyid/{id}")
	public void deleteownersbyid(@PathVariable Integer id)
	{
		shservice.deleteShopowner(id);
	}
}
