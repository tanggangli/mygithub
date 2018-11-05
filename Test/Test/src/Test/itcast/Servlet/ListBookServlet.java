package Test.itcast.Servlet;

import Test.itcast.domain.book;
import Test.itcast.service.BookService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/listBookServlet")
public class ListBookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置编码
        request.setCharacterEncoding("utf-8");
        // 调用BookService查询
        BookService bs=new BookService();
        List<book> allBook = bs.findAll();
        request.setAttribute("book",allBook);
        request.getRequestDispatcher("/book.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
