package jp.co.sunarch.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jp.co.sunarch.example.entity.Order;
import jp.co.sunarch.example.service.OrderService;

@Controller
public class TestController {
	
	@Autowired
	OrderService orderService;

	@GetMapping("/")
	public String helloWorld(Model model) {
		model.addAttribute("message", "Hello World!!");
		return "index";
	}
	
	/**
	   * トップページを表示
	   * @return トップページのHTML
	   */
	@GetMapping("/top")
	public String top(Model model) {
		return "top";
	}
	
	/**
	   * メニュー表示画面を表示
	   * @param model Model
	   * @return メニュー表示画面のHTML
	   */
	@GetMapping("/menu")
	public String menu(Model model) {
		 List<Order> menuList = orderService.search();
		 model.addAttribute("menuList", menuList);
		return "menu";
	}
	
	/**
	   * カート確認画面を表示
	   * @return カート確認画面のHTML
	   */
	@GetMapping("/cart")
	public String cart(Model model) {
		return "cart";
	}
	
	/**
	   * 確認画面を表示
	   * @return 確認画面のHTML
	   */
	@GetMapping("/confirm")
	public String confirm(Model model) {
		return "confirm";
	}
	
	/**
	   * 会計画面を表示
	   * @return 会計画面のHTML
	   */
	@GetMapping("/cash")
	public String cash(Model model) {
		return "cash";
	}
}
