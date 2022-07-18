package jp.co.sunarch.example.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * 商品情報 Entity
 */
@Entity
@Data
@Table(name = "product_info")
public class Order {
	/**
	 * ID
	 */
	@Id
	@Column(name = "product_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productId;
	/**
	 * 商品名
	 */
	@Column(name = "product_name")
	private String productName;
	/**
	 * 値段
	 */
	@Column(name = "product_price")
	private int productPrice;
	/**
	 * 登録日時
	 */
	@Column(name = "create_date")
	private Date createDate;
	/**
	 * 更新日時
	 */
	@Column(name = "update_date")
	private Date updateDate;
	/**
	 * 表示フラグ
	 */
	@Column(name = "show_flg")
	private boolean showFlg;
}
