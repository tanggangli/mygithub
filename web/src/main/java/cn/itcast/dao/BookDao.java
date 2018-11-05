package cn.itcast.dao;

import cn.itcast.domain.Book;

import java.util.List;


public interface BookDao {

    public List<Book> findByBook();

    public void del(int id);

}
