package Test.itcast.dao;

import Test.itcast.Utils.utils;
import Test.itcast.domain.book;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class BoobDao {
    private JdbcTemplate jt=new JdbcTemplate(utils.getDs());
    // 查询数据库
    public List<book> find(){
        String sql="select * from book";
        List<book> query=null;
        try {
            query = jt.query(sql, new BeanPropertyRowMapper<>(book.class));
        }catch ( EmptyResultDataAccessException e){
            return null;
        }
        return query;
    }
    // 添加数据
    public int add(book book){
        String sql ="insert into book values(null,?,?,?,?)";
        int update = jt.update(sql, book.getName(), book.getAuthor(), book.getTime(), book.getType());
        return update;
    }
}
