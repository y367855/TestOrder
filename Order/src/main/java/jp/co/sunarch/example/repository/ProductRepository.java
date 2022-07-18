package jp.co.sunarch.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.co.sunarch.example.entity.Order;
/**
 * ユーザー情報 Repository
 */
@Repository
public interface ProductRepository extends JpaRepository<Order, Long> {
}
