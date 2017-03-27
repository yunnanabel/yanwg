package xyz.yanwg.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import xyz.yanwg.util.QQMailUtil;

@WebServlet("/accept")
public class AcceptServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AcceptServlet() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("发送邮件！");
		List<String> dests = new ArrayList<String>();
		dests.add("982572686@qq.com");
		QQMailUtil.sendEmail(dests, "商品声明", "邹荣荣同学：\n你好！该商品）一经售出，概不退还，且长相以实物为准，照片仅供参考！", null);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
