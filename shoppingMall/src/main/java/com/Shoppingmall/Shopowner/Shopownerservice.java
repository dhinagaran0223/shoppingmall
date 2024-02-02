package com.Shoppingmall.Shopowner;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class Shopownerservice {

	@Autowired
	Shopownerrepository srepo;
	
	public void save (Shopowner own)
	{
		srepo.save(own);
	}
	
	public List<Shopowner> getAllShopowners()
	{
		return srepo.findAll();
	}
	
	public Optional<Shopowner> getShopownerById (Integer id)
	{
		return srepo.findById(id);
	}
	
	public void updateShopowner (Integer id, Shopowner updatedOwner)
	{
		Shopowner existingOwner = srepo.findById(id).orElse(null);
		if (existingOwner != null)
		{
			existingOwner.setOwnername(updatedOwner.getOwnername());
			existingOwner.setOwnermailid(updatedOwner.getOwnermailid());
			existingOwner.setOwneraddress(updatedOwner.getOwneraddress());
			existingOwner.setOwnershopname(updatedOwner.getOwnershopname());
			srepo.save(existingOwner);
		}
	}
	
	public void deleteShopowner (Integer id)
	{
		srepo.deleteById(id);
	}
}
