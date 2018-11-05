package Test.itcast.service;

import Test.itcast.dao.BoobDao;
import Test.itcast.domain.book;

import java.util.List;

public class BookService {
    BoobDao dao=new BoobDao();
    public List<book> findAll(){
        List<book> books = dao.find();
        return books;
    }
    public int addService(book book){
        int add = dao.add(book);
        return add;
    }
}
