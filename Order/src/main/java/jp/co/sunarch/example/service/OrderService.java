package jp.co.sunarch.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.sunarch.example.entity.Order;
import jp.co.sunarch.example.repository.ProductRepository;

@Service
public class OrderService {
	/**
	 * 商品情報 Repository
	 */
	@Autowired
	ProductRepository productRepository;

	public List<Order> search() {
		// 商品情報テーブルから取得
		return productRepository.findAll();
	}
}
