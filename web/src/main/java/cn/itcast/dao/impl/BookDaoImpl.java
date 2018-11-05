package cn.itcast.dao.impl;

import cn.itcast.dao.BookDao;
import cn.itcast.domain.Book;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.SQLException;
import java.util.List;

//@Repository
//@Scope("prototype")
public class BookDaoImpl implements BookDao {

    private QueryRunner runner;
    public void setRunner(QueryRunner runner) {
        this.runner = runner;
    }
    public List<Book> findByBook() {
        List<Book> query=null;
        try {
            query = runner.query("select * from book",
                    new BeanListHandler<Book>(Book.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return query;
    }

    public void del(int id) {
        try {
            runner.update("delete from book where id=?",id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
