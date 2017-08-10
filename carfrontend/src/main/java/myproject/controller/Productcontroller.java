package myproject.controller;

import java.io.FileOutputStream;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import myproject.dao.Branddao;
import myproject.dao.ProductDao;

import myproject.model.Product;

@Controller
public class Productcontroller {


	@Autowired
	ProductDao productDao;
	@Autowired
	Branddao brandDao;
	
	@RequestMapping(value="/addProduct",method=RequestMethod.POST )
	
	public String addproduct(@ModelAttribute("product")Product p, HttpSession session)
	{
		if(p.getProRn()==null||p.getProRn().isEmpty())
		{
		productDao.addProduct(p);
		
		MultipartFile mp=p.getImage();
		System.out.println(mp.getOriginalFilename());
		ServletContext context=session.getServletContext();
		String filelocation=context.getRealPath("/Resources/carrental");
		System.out.println(filelocation);
		String filename=filelocation+"\\"+p.getProRn()+".jpg";
		System.out.println(filename);
		try{
			byte b[]=mp.getBytes();
		FileOutputStream fos=new FileOutputStream(filename);
		fos.write(b);
		fos.close();
		}
		catch(Exception e){}
		
		}
		else
		{
			productDao.updateProduct(p);
		}
		return "redirect:/product";
	}	
   @RequestMapping(value="/updateProduct/{prorn}",method=RequestMethod.GET)
	public String updateproduct(@PathVariable("prorn")String prorn,Model model)
	{
		model.addAttribute("product",productDao.getProductById(prorn));
		model.addAttribute("brandlist",brandDao.getAllBrands());
		model.addAttribute("productList",productDao.getAllProduct());
		return "product";
		}
   
   @RequestMapping(value="/deleteProduct/{prorn}",method=RequestMethod.GET)
  	public String deleteproduct(@PathVariable("prorn")String prorn,Model model)
  	{
  		model.addAttribute("product",productDao.getProductById(prorn));
  		productDao.deleteProduct(prorn);
  		model.addAttribute("productList",productDao.getAllProduct());
  		return "product";
  		}

}
