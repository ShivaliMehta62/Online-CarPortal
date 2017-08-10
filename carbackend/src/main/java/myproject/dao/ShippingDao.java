package myproject.dao;

import java.util.List;


import myproject.model.Shipping;

public interface ShippingDao {

	public boolean saveaddress(Shipping s);
	List<Shipping> getAllShipAdd();
	Shipping getShipAddByID(String ShipAdd);
	
}
