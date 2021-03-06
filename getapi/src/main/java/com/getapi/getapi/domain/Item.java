package com.getapi.getapi.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "items")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private Integer price;
	@Column(nullable = false)
	private String imgPath;
}

// public class Item {
// 	@Id
// 	@GeneratedValue(strategy = GenerationType.IDENTITY)
// 	private Integer id;
// 	@Column(nullable = false)
// 	private String name;
// 	@Column(nullable = false)
// 	private Integer price;
// 	private String imgPath;

// 	public long getId() {
// 			return this.id;
// 	}

// 	public String getName() {
// 			return this.name;
// 	}

// 	public long getPrice() {
// 		return this.price;
// 	}

// 	public String getImgPath() {
// 			return this.imgPath;
// 	}

// 	public void setId(final Integer id) {
// 			this.id = id;
// 	}

// 	public void setName(final String name) {
// 			this.name = name;
// 	}

// 	public void setPrice(final Integer price) {
// 			this.price = price;
// 	}

// 	public void setImgPath(final String imgPath) {
// 		this.imgPath = imgPath;
// 	}
// }
