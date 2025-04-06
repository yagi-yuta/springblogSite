package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}

/* * findAll() → 全件取得

findById(id) → IDで検索

save(category) → 新規登録 or 更新

deleteById(id) → IDで削除
 * */
