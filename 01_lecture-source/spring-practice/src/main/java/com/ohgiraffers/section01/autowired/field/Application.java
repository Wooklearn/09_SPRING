package com.ohgiraffers.section01.autowired.field;

import com.ohgiraffers.section01.common.BookDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.ohgiraffers.section01");

        BookService service = context.getBean("fieldService", BookService.class);

        List<BookDTO> bookList = service.selectAllBook();
        for (BookDTO book : bookList) {
            System.out.println("book = " + book);
        }


        BookDTO book = service.selectOneBook(1);
        System.out.println(book);

    }

}
