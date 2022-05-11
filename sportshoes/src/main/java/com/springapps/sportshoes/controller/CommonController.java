package com.springapps.sportshoes.controller;

import java.sql.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springapps.sportshoes.entity.Cart;
import com.springapps.sportshoes.entity.Order;
import com.springapps.sportshoes.entity.Product;
import com.springapps.sportshoes.entity.User;
import com.springapps.sportshoes.service.CartService;
import com.springapps.sportshoes.service.OrderService;
import com.springapps.sportshoes.service.ProductService;
import com.springapps.sportshoes.service.UserService;

@Controller
public class CommonController {

	@Autowired
	ProductService productService;

	@Autowired
	UserService userService;

	@Autowired
	CartService cartService;

	@Autowired
	OrderService orderService;

	@RequestMapping("/home")
	public ModelAndView home() {
		ModelAndView modelandview = new ModelAndView();
		modelandview.setViewName("home");
		return modelandview;
	}

	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String signupMethod() {
		return "signupForm";
	}

	@RequestMapping(value = "/signupredirect", method = RequestMethod.POST)
	public String signupRedirect(@ModelAttribute("user") User user, ModelMap model) {
		userService.save(user);
		String msg = "Successfully signed up";
		model.addAttribute("result", msg);
		return "signupForm";
	}

	@RequestMapping(value = "/signin", method = RequestMethod.GET)
	public String signinMethod() {
		return "signinForm";
	}

	@RequestMapping(value = "/signinredirect", method = RequestMethod.POST)
	public String signinRedirect(@ModelAttribute("user") User user, ModelMap model) {
		User userbynameandpass = userService.findByName(user.getUsername());
		if (userbynameandpass == null) {
			String msg = "Invalid Credentials";
			model.addAttribute("result", msg);
			return "signinForm";
		} else if (userbynameandpass.getUsername().equals("Praneetha")
				&& userbynameandpass.getPassword().equals(user.getPassword())) {
			model.addAttribute("name", "Admin");
			return "adminHome";
		} else if (userbynameandpass.getPassword().equals(user.getPassword())) {
			model.addAttribute("name", userbynameandpass.getUsername());
			return "userlogin";
		} else {
			String msg = "Invalid Credentials";
			model.addAttribute("result", msg);
			return "signinForm";
		}

//		if(user.getUsername().equals("Varsha")&&user.getPassword().equals("varsha"))
//		{
//			model.addAttribute("name","Varsha");
//			return "userlogin";
//		}
//		else if(user.getUsername().equals("Praneetha")&&user.getPassword().equals("admin"))
//		{
//			model.addAttribute("name","Admin");
//			return "adminlogin";
//		}
//		else {
//			String msg="Invalid Credentials";
//			model.addAttribute("result",msg);
//			return "signinForm";
//		}

	}

	@RequestMapping("/menshoes")
	public String showmenshoes(ModelMap model) {
		List<Product> products = productService.getProducts();
		model.addAttribute("products", products);
		return "menshoes";
	}

	@RequestMapping("/womenshoes")
	public String showwomenshoes(ModelMap model) {
		List<Product> products = productService.getProducts();
		model.addAttribute("products", products);
		return "womenshoes";
	}

	@RequestMapping(value = "/addToCart", method = RequestMethod.POST)
	public String addtocart(@ModelAttribute("cart") Cart cart, ModelMap model) {
		int result = cartService.save(cart);
		List<Cart> cartitems = cartService.getCart();
		model.addAttribute("cart", cartitems);
		return "cart";
	}

	@RequestMapping("/cart")
	public String showcartitems(ModelMap model) {
		List<Cart> cart = cartService.getCart();
		model.addAttribute("cart", cart);
		return "cart";
	}

	@RequestMapping(value = "/deleteitem", method = RequestMethod.POST)
	public String deleteitem(int cartid, ModelMap model) {
		Cart cart = new Cart();
		cart.setCartid(cartid);
		cartService.delete(cart);
		List<Cart> cartitems = cartService.getCart();
		model.addAttribute("cart", cartitems);
		return "cart";
	}

	@RequestMapping("/buy")
	public String userdetails(ModelMap model) {
		List<Cart> cart = cartService.getCart();
		model.addAttribute("cart", cart);
		return "buy";
	}

	@RequestMapping(value = "/ordersuccess", method = RequestMethod.POST)
	public String ordersuccess(@ModelAttribute("order") Order order, ModelMap model) {
		List<Cart> cart = cartService.getCart();
		model.addAttribute("name", order.getUsername());
		model.addAttribute("result", "Order Placed");
		Cart cartitem = new Cart();
		for (Cart item : cart) {
			order.setPrice(item.getPrice());
			order.setPcode(item.getCode());
			order.setCategory(item.getCategory());
			orderService.save(order);
			cartitem.setCartid(item.getCartid());
			cartService.delete(cartitem);
		}
		Order o = new Order();
		o.setUsername(order.getUsername());
		List<Order> orders = orderService.getOrders();
		model.addAttribute("orders", orders);
		return "userorders";
	}

	@RequestMapping(value = "/userorders", method = RequestMethod.GET)
	public String showuserorders(@RequestParam String username, ModelMap model) {
		Order o = new Order();
		o.setUsername(username);
		model.addAttribute("name", username);
		List<Order> orders = orderService.getOrders();
		model.addAttribute("orders", orders);
		return "userorders";
	}

	@RequestMapping("/adminmenshoes")
	public String showadminmenshoes(ModelMap model) {
		List<Product> products = productService.getProducts();
		model.addAttribute("products", products);
		return "adminmenshoes";
	}

	@RequestMapping("/adminwomenshoes")
	public String showadminwomenshoes(ModelMap model) {
		List<Product> products = productService.getProducts();
		model.addAttribute("products", products);
		return "adminwomenshoes";
	}

	@RequestMapping(value = "/adminDeleteProduct", method = RequestMethod.POST)
	public String admindeleteproduct(int code, ModelMap model) {
		Product pro = new Product();
		pro.setCode(code);
		productService.delete(pro);
		List<Product> products = productService.getProducts();
		model.addAttribute("products", products);
		return "adminmenshoes";
	}

	@RequestMapping("/products")
	public String products() {
		return "products";
	}

	@RequestMapping(value = "/addproduct", method = RequestMethod.POST)
	public String addproduct(@ModelAttribute("product") Product product, ModelMap model) {

		int result = productService.save(product);
		String msg = "Product added";
		model.addAttribute("result", msg);
		return "products";
	}

	@RequestMapping("/orders")
	public String showorders(ModelMap model) {
		List<Order> orders = orderService.getOrders();
		model.addAttribute("orders", orders);
		return "orders";
	}

	@RequestMapping(value = "/orderssearch", method = RequestMethod.GET)
	public String ordersearch(@RequestParam Date date, @RequestParam String category, ModelMap model) {
		Order o = new Order();
		o.setDate(date);
		o.setCategory(category);
		model.addAttribute("date", date);
		model.addAttribute("category", category);
		List<Order> orders = orderService.getOrders();
		model.addAttribute("orders", orders);
		return "orders";
	}

	@RequestMapping("/users")
	public String showusers(ModelMap model) {
		List<User> users = userService.getUsers();
		model.addAttribute("users", users);
		return "users";
	}

	@RequestMapping(value = "/userssearch", method = RequestMethod.GET)
	public String usersearch(@RequestParam String freeText, ModelMap model) {
		User u = new User();
		u.setUsername(freeText);
		model.addAttribute("name", freeText);
		List<User> users = userService.getUsers();
		model.addAttribute("users", users);
		return "users";
	}

	@RequestMapping("/changepassword")
	public String changepassword(ModelMap model) {
		User userbyname = userService.findByName("Praneetha");
		model.addAttribute("dbpass", userbyname.getPassword());
		return "changepassword";
	}

	@RequestMapping(value = "/changepasswordindb", method = RequestMethod.POST)
	public String changepasswordindb(@ModelAttribute("user") User user, ModelMap model) {
		user.setEmail("adminp@gmail.com");
		user.setMobile("6453998018");
		user.setAge(39);
		user.setGender("F");
		userService.update(user);
		model.addAttribute("result", "Password changed successfully");
		return "changepassword";
	}

	@RequestMapping(value = "/adminHome", method = RequestMethod.GET)
	public String adminHome() {
		return "adminHome";
	}

	@RequestMapping("/admin")
	public ModelAndView admin() {
		ModelAndView modelandview = new ModelAndView();
		modelandview.setViewName("adminlogin");
		return modelandview;
	}

	@RequestMapping("/userlogin")
	public String userhome() {
		return "userlogin";
	}

}
