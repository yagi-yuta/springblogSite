package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "blogs")
public class Blog {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //valueを作るアノテーション（方式 = 作り方：DBに任せる）

	private Integer id;

	@Column(name = "category_id")
	private Integer categoryId; // カテゴリーID

	@Column(name = "user_id")
	private Integer userId; // ユーザーID

	private String title;

	private String text;

	//ゲッター

	public Integer getId() {
		return id;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public Integer getUserId() {
		return userId;
	}

	public String getTitle() {
		return title;
	}

	public String getText() {
		return text;
	}
}

//CRUDのうち、Create / Update ではセッターが必要
// 今はReadだけなのでゲッターのみでOK
// 必要になったら set〇〇() を追加