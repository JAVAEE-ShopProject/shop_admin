package com.igeek.shop_admin.controller;

import com.igeek.shop_admin.entity.Admin;
import com.igeek.shop_admin.service.AdminService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.net.URLEncoder;

@WebServlet(name = "AdminServlet",urlPatterns = "/Admin")
public class AdminServlet extends BasicServlet {
   private AdminService service = new AdminService();

   //管理员登录
    public void loginAdmin(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        Admin admin = service.loginAdmin(username, password);

        //将用户存储在session域中
        HttpSession session = request.getSession();
        session.setAttribute("admin",admin);

        if (admin!=null){
            //记住用户名
            String remember = request.getParameter("remember");
            //自动登录
            String free = request.getParameter("free");

            if (remember!=null && "remember".equals(remember)){
                Cookie usernameCookie = new Cookie("username", URLEncoder.encode(username, "UTF-8"));
                usernameCookie.setMaxAge(7*24*60*60);
                response.addCookie(usernameCookie);
            }

            if (free!=null && "free".equals(free)){
                Cookie usernameCookie = new Cookie("username", URLEncoder.encode(username, "UTF-8"));
                Cookie passwordCookie = new Cookie("password", URLEncoder.encode(password, "UTF-8"));
                usernameCookie.setMaxAge(7*24*60*60);
                passwordCookie.setMaxAge(7*24*60*60);
                response.addCookie(usernameCookie);
                response.addCookie(passwordCookie);
            }

            //登录成功
            response.sendRedirect(request.getContextPath()+"admin/admin_index.jsp");
        }else {
            //登录失败 继续跳转到登录界面
            request.setAttribute("msg","用户名与密码不匹配！");
            request.getRequestDispatcher("admin/admin_login.jsp").forward(request,response);
        }
    }

}
