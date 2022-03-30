package com.ma.service;

import com.ma.pojo.Books;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {
    //增加一个Book
    int addBook(Books book);

    //根据id删除一个Book
    int deleteBookById(int id);

    //更新Book
    int updateBook(Books book);

    //根据id查询，返回一个Book
    Books queryBookById(int id);

    //查询全部的Book，返回一个List集合
    List<Books> queryAllBook();

    //通过书名查询书籍
    Books queryBookByName(String bookName);
}
