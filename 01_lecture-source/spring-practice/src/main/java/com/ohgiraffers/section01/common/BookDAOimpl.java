package com.ohgiraffers.section01.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("bookDAO")
public class BookDAOimpl implements BookDAO {

    private final Map<Integer, BookDTO> booklist;
    public BookDAOimpl() {
        booklist = new HashMap<>();
        booklist.put(1, new BookDTO(1, 1234, "자바가 제일 쉬웠어요", "김용욱", "하이출판", new Date()));
        booklist.put(2, new BookDTO(2, 1234, "자바가 제일 쉬웠어요", "김용욱", "하이출판", new Date()));

    }


    @Override
    public List<BookDTO> selectBookList() {
        return new ArrayList<>(booklist.values());
    }

    @Override
    public BookDTO selectBookByNo(int no) {
        return booklist.get(no);
    }
}
