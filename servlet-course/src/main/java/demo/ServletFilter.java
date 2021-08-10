package demo;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter(urlPatterns = {"/*"}, initParams = {
		@WebInitParam(name="count", value="100")
})
public class ServletFilter implements Filter {
	
	private int count;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		count++;
		System.out.println("Filter 1 with Filter Config count = " + count);
		chain.doFilter(request, response); // cho phep request den servlet dich
		response.setContentType("text/html");
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		String c = filterConfig.getInitParameter("count"); // get filter config from @WebInitParam
		count = Integer.valueOf(c != null ? c : "0");
	}
	
	
}
