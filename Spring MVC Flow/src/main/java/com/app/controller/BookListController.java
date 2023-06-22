package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.app.service.BookService;

@Controller
@RequestMapping("/book")
public class BookListController {
	@Autowired
	private BookService bookService;

	public BookListController() {
		System.out.println("in Book List Constructor" + getClass());

	}

	@GetMapping("/list")
	public ModelAndView fetchAllBook() {

		return new ModelAndView("/book/list", "book_list", bookService.getAllBooks());
	}

}
