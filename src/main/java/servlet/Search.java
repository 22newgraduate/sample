package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Search")
public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		// リクエストパラメータの取得
//	    request.setCharacterEncoding("UTF-8");
//	    String user_id = request.getParameter("user_id");
//	    String pass = request.getParameter("password");
//	    
	    
	    //get
	    String[] check = request.getParameterValues("os");
	    
	    
	    request.getRequestDispatcher("/searchResult.jsp").forward(request, response);
	    
//	   // if (checkEnsyu[0]) {
//	      
//	    
//	      // index画面にフォワード
//		    RequestDispatcher dispatcher =
//		        request.getRequestDispatcher
//		            ("/WEB-INF/searchResult.jsp");
//		    dispatcher.forward(request, response);	
//		    
//		    	
//		
//		
//		
//		
//	//}else {
//    	//再度ログイン画面に繊維
//    	RequestDispatcher dispatcher =
//		        request.getRequestDispatcher
//		            ("/serch.jsp");
//    	dispatcher.forward(request, response);	
    }
	}
	


	