package org.xiyoulinux.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class CharsetAllEncodingFilter
 */

public class CharsetAllEncodingFilter implements Filter
{

    /**
     * Default constructor.
     */
    private String encoding = null;

    public void init(FilterConfig filterConfig) throws ServletException
    {
        encoding = filterConfig.getInitParameter("encoding");

    }

    public void destroy()
    {}

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException
    {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        if(httpRequest.getMethod().equalsIgnoreCase("POST"))
        {
            request.setCharacterEncoding(encoding);
        }
        chain.doFilter(request, response);
    }
}
