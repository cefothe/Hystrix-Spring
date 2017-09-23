package com.cefothe.hystrixclient.rest;

import com.cefothe.hystrixclient.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ReadingController {

    private final BookService bookService;

    @Autowired
    public ReadingController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping("/to-read")
    public String toRead(){
        return bookService.readingList();
    }
}
