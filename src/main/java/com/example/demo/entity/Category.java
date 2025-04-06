package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "categories")
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //valueを作るアノテーション（方式 = 作り方：DBに任せる）

	private Integer id;

	private String name;

	// ゲッター
	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}

//エンティティは、データベースのテーブルに対応するクラス。
//データベースの情報をオブジェクトとして扱い、レポジトリを使ってそのデータの読み書きを行う