package Test.itcast.Servlet;

import Test.itcast.domain.book;
import Test.itcast.service.BookService;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/addBookServlet")
public class addBookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("utf-8");
        response.setContentType("text/html;charset=utf-8;");
        Map<String, String[]> pm = request.getParameterMap();
        book bk=new book();
        try {
            BeanUtils.populate(bk,pm);
            // 调用方法传入对象
            BookService bs=new BookService();
            int i = bs.addService(bk);
            if (i>0){
                request.getSession().setAttribute("adds","添加成功");
            }else {
                request.getSession().setAttribute("adds","添加失败");
            }
            response.sendRedirect("/chaxun.jsp");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
