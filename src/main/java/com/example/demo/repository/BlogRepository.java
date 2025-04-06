package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Blog;

public interface BlogRepository extends JpaRepository<Blog, Integer> {

}

//同じプロジェクト内ならどこからでもアクセス可能　中身を持たないメソッド　継承（何を？）　JpaRepositoryを　＜対応するエンティティ名, 主キー（DBで唯一性のある識別を担うカラム）＞