package myproject.dao;

import java.util.List;

import myproject.model.Billing;
import myproject.model.Brand;

public interface BillingDao {

	public boolean saveAddress(Billing bl );
		List<Billing> getAllBillAdd();
	Billing getBillAddByID(String BillAdd);
}
