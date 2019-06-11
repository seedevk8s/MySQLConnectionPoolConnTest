package sec02.ex01;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/member2")
public class MemberServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request,HttpServletResponse response)  throws ServletException, IOException{
      response.setContentType("text/html;charset=utf-8");
      PrintWriter out=response.getWriter();	
      MemberDAO dao=new MemberDAO();
      List list=dao.listMembers();
	
      out.print("<html><body>");
      out.print("<table border=1><tr align='center' bgcolor='lightgreen'>");
      out.print("<td>MNO</td><td>MNAME</td><td>EMAIL</td><td>CRE_DATE</td></tr>");
     
     for (int i=0; i<list.size();i++){
		MemberVO memberVO = (MemberVO) list.get(i);
		String MNO = memberVO.getMNO();
		String MNAME = memberVO.getMNAME();
		String EMAIL = memberVO.getEMAIL();
		String CRE_DATE = memberVO.getCRE_DATE();
		out.print("<tr><td>"+MNO+"</td><td>"
			                +MNAME+"</td><td>"
			                +EMAIL+"</td><td>"
			                +CRE_DATE+"</td></tr>");		
	 }
	 out.print("</table></body></html>");
   }
}