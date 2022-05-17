package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.LoginLogic;
import model.User;

/**
 * Servlet implementation class Index
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// リクエストパラメータの取得
	    request.setCharacterEncoding("UTF-8");
	    String user_id = request.getParameter("user_id");
	    String pass = request.getParameter("password");
	    
	    
	    // Userインスタンス（ユーザー情報）の生成
	    User user = new User(user_id, pass);
	    
	    // ログイン処理
	    LoginLogic loginLogic = new LoginLogic();
	    boolean isLogin = loginLogic.execute(user);
	    
	    // ログイン成功時の処理
	    if (isLogin) {
	      // ユーザー情報をセッションスコープに保存
	      HttpSession session = request.getSession();
	      session.setAttribute("loginUser", user);
	      // index画面にフォワード
		    RequestDispatcher dispatcher =
		        request.getRequestDispatcher
		            ("/WEB-INF/jsp/index.jsp");
		    dispatcher.forward(request, response);	
		    
		    
	    }else {
	    	//再度ログイン画面に繊維
	    	RequestDispatcher dispatcher =
			        request.getRequestDispatcher
			            ("/login.jsp");
	    	dispatcher.forward(request, response);	
	    }
	    
	    
		
	}

}
