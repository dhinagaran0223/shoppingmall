package com.Shoppingmall.Shopowner;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Shopowner {
	@Id
 private int ownerid;
 private String ownername;
 private String ownermailid;
 private String ownershopname;
 private String owneraddress;
public int getOwnerid() {
	return ownerid;
}
public void setOwnerid(int ownerid) {
	this.ownerid = ownerid;
}
public String getOwnername() {
	return ownername;
}
public void setOwnername(String ownername) {
	this.ownername = ownername;
}
public String getOwnermailid() {
	return ownermailid;
}
public void setOwnermailid(String ownermailid) {
	this.ownermailid = ownermailid;
}
public String getOwnershopname() {
	return ownershopname;
}
public void setOwnershopname(String ownershopname) {
	this.ownershopname = ownershopname;
}
public String getOwneraddress() {
	return owneraddress;
}
public void setOwneraddress(String owneraddress) {
	this.owneraddress = owneraddress;
}
public Shopowner() {
	super();
	// TODO Auto-generated constructor stub
}
public Shopowner(int ownerid, String ownername, String ownermailid, String ownershopname, String owneraddress) {
	super();
	this.ownerid = ownerid;
	this.ownername = ownername;
	this.ownermailid = ownermailid;
	this.ownershopname = ownershopname;
	this.owneraddress = owneraddress;
}
@Override
public String toString() {
	return "Shopowner [ownerid=" + ownerid + ", ownername=" + ownername + ", ownermailid=" + ownermailid
			+ ", ownershopname=" + ownershopname + ", owneraddress=" + owneraddress + "]";
}
 
}
