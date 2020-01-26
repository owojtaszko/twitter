package com.sda.twetter.filters;

import com.sda.twetter.persistance.entities.TbUser;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter("/add-article.jsp")
public class LoginFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse response, FilterChain chain)

            throws IOException, ServletException {

        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        HttpSession session = httpServletRequest.getSession();
        TbUser currentUser = (TbUser) session.getAttribute("currentUser");
        if (currentUser == null) {

            final String requestURI = httpServletRequest.getRequestURI();
            httpServletRequest.setAttribute("currentURI", requestURI);
            final RequestDispatcher requestDispatcher = servletRequest.getRequestDispatcher("login.jsp");
            requestDispatcher.forward(servletRequest, response);
        }
        chain.doFilter(servletRequest, response);

    }
}
