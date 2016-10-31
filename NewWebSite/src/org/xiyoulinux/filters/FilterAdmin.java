package org.xiyoulinux.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by zhoupan on 10/30/16.
 */
@WebFilter(filterName = "FilterAdmin", urlPatterns = "/admin/*")
public class FilterAdmin implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest)req;
        HttpServletResponse response = (HttpServletResponse)resp;
        String flag = (String) request.getSession().getAttribute("login");
        System.out.println(flag);
        if(flag != null && flag.equals("ok")) {
            System.out.println("execute DoFilter");
            chain.doFilter(request,response);
        }else{
            request.setAttribute("message","您无权访问该目录");
            RequestDispatcher rd = request.getRequestDispatcher("/404.html");
            rd.forward(request,response);
        }
    }

    public void init(FilterConfig config) throws ServletException {

    }
}
