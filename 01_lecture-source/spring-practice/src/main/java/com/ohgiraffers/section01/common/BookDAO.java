package com.ohgiraffers.section01.common;

import java.util.List;

public interface BookDAO {
    List<BookDTO> selectBookList();

    BookDTO selectBookByNo(int no);
}
