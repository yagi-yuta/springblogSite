package com.example.demo.controller;

import jakarta.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.User;

@Controller
public class UserController {
	@Autowired //@Autowired @Componentで保存した情報でインスタンス化（スプリングコンテナに保存されたクラスをもとにデータを生成）
	HttpSession session;

	@Autowired //@Autowired @Componentで保存した情報でインスタンス化（スプリングコンテナに保存されたクラスをもとにデータを生成）
	User user;//モデル作成からここ！

	@GetMapping({ "/users/new" })
	public String newUsers() {

		return "userAdd"; //タスク① newメソッドは仕えない　なぜか仕様書にはその旨の指示があるが使用できないメソッドなので変更 new()→newUsers()
	}

	@PostMapping({ "/users/add" })
	public String add(
			@RequestParam(name = "name", defaultValue = "") String name,
			@RequestParam(name = "email", defaultValue = "") String email,
			@RequestParam(name = "password", defaultValue = "") String password,
			@RequestParam(name = "passwordConfirm", defaultValue = "") String passwordConfirm,
			Model model) {

		if (!password.equals(passwordConfirm)) {
			model.addAttribute("message", "パスワードが一致しません");
			return "userAdd";
		}
		user.setName(name);
		user.setEmail(email);
		user.setPassword(password);
		user.setPasswordConfirm(passwordConfirm);
		return "redirect:/login";
	}

	@GetMapping({ "/", "/login" })
	public String index() {
		return "login";
	}

}

//!password.equals(passwordConfirm) !マークは否定の意味　passwordを参照してequalsで比較。何と比較？→(passwordConfirm)
