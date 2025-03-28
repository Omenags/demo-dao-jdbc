package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("=== TESTE 1: seller findById ===");

		Seller seller = sellerDao.findById(3);

		System.out.println(seller);

		System.out.println("\n=== TESTE 2: seller findByDepartmentId ===");

		Department dep = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(dep);

		for (Seller obj : list) {
			System.out.println(obj);
		}
		System.out.println("\n=== TESTE 3: seller findAll ===");
		list = sellerDao.findAll();

		for (Seller obj : list) {
			System.out.println(obj);
		}


	
		System.out.println("\n=== TESTE 5: seller update ===");

		seller = sellerDao.findById(9);
		
		
		seller.setEmail("sirius@gmail.com");
		
		sellerDao.update(seller);
		
		System.out.println("Update complete");
	}

}
