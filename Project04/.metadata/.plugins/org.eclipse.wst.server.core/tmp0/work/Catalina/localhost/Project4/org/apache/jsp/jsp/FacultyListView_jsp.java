/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.36
 * Generated at: 2021-12-21 11:02:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.rays.pro4.Model.FacultyModel;
import com.rays.pro4.bean.FacultyBean;
import com.rays.pro4.Util.HTMLUtility;
import java.util.Iterator;
import java.util.List;
import com.rays.pro4.controller.FacultyListCtl;
import com.rays.pro4.Util.DataUtility;
import com.rays.pro4.Util.ServletUtility;
import com.rays.pro4.controller.LoginCtl;
import com.rays.pro4.bean.RoleBean;
import com.rays.pro4.bean.UserBean;
import com.rays.pro4.controller.ORSView;

public final class FacultyListView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/jsp/Footer.jsp", Long.valueOf(1637751371616L));
    _jspx_dependants.put("/jsp/Header.jsp", Long.valueOf(1640081260038L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.rays.pro4.controller.FacultyListCtl");
    _jspx_imports_classes.add("java.util.Iterator");
    _jspx_imports_classes.add("com.rays.pro4.Model.FacultyModel");
    _jspx_imports_classes.add("com.rays.pro4.bean.UserBean");
    _jspx_imports_classes.add("com.rays.pro4.bean.FacultyBean");
    _jspx_imports_classes.add("com.rays.pro4.controller.LoginCtl");
    _jspx_imports_classes.add("com.rays.pro4.Util.ServletUtility");
    _jspx_imports_classes.add("com.rays.pro4.bean.RoleBean");
    _jspx_imports_classes.add("com.rays.pro4.Util.HTMLUtility");
    _jspx_imports_classes.add("com.rays.pro4.controller.ORSView");
    _jspx_imports_classes.add("com.rays.pro4.Util.DataUtility");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"icon\" type=\"image/png\" href=\"");
      out.print(ORSView.APP_CONTEXT);
      out.write("/img/logo.png\" sizes=\"16*16\"/>\r\n");
      out.write("<title> Faculty List</title>\r\n");
      out.write("\r\n");
      out.write("<script src=\"");
      out.print(ORSView.APP_CONTEXT );
      out.write("/js/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(ORSView.APP_CONTEXT );
      out.write("/js/Checkbox11.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body >\r\n");
      out.write("\t");

    UserBean userBean = (UserBean)session.getAttribute("user");
    boolean userLoggedIn = userBean != null;
    String welcomeMsg = "Hi, ";
    if (userLoggedIn) {
        String role = (String)session.getAttribute("role");
        welcomeMsg += userBean.getFirstName() + " (" + role + ")";
    } else {
        welcomeMsg += "Guest";
    }
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table >\r\n");
      out.write("    <tr ><th></th>\r\n");
      out.write("       <td width=\"90%\" >\r\n");
      out.write("      \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.WELCOME_CTL);
      out.write("\">Welcome</b></a> |\r\n");
      out.write("      \r\n");
      out.write("            \t");

            		if (userLoggedIn) {
      		 	 
      out.write(" \r\n");
      out.write("       <a href=\" ");
      out.print(ORSView.LOGIN_CTL);
      out.write("?operation=");
      out.print(LoginCtl.OP_LOG_OUT);
      out.write("\">Logout</b></a>\r\n");
      out.write("\r\n");
      out.write("            ");

                } else {
            
      out.write(" \r\n");
      out.write("            <a href=\"");
      out.print(ORSView.LOGIN_CTL);
      out.write("\">Login</b></a> \r\n");
      out.write("            ");

  			   }
			 
      out.write("\r\n");
      out.write(" \t\t</td>\r\n");
      out.write("        <td rowspan=\"2\" >\r\n");
      out.write("            <h1 align=\"right\" >\r\n");
      out.write("                <img src= \"");
      out.print(ORSView.APP_CONTEXT );
      out.write("/img/customLogo.jpg\"  width=\"175\" height=\"50\">\r\n");
      out.write("            </h1>\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("\r\n");
      out.write("\t\t    <tr><th></th>\r\n");
      out.write("\t\t      <td>\r\n");
      out.write("        <h3>");
      out.print(welcomeMsg);
      out.write("</h3>\r\n");
      out.write("      </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("   \r\n");
      out.write("    ");

        if (userLoggedIn) {
    
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <tr><th></th>\r\n");
      out.write("        <td colspan=\"2\" >     \r\n");
      out.write("        <font style=\"font-size: 18px\">\r\n");
      out.write("       \t \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.MY_PROFILE_CTL);
      out.write("\">MyProfile</b></a> |       \r\n");
      out.write("         <a href=\"");
      out.print(ORSView.CHANGE_PASSWORD_CTL);
      out.write("\">Change Password</b></a> |\r\n");
      out.write("       \t <a href=\"");
      out.print(ORSView.GET_MARKSHEET_CTL);
      out.write("\">Get Marksheet</b></a> |              \r\n");
      out.write("       \t <a href=\"");
      out.print(ORSView.MARKSHEET_MERIT_LIST_CTL);
      out.write("\">Marksheet MeritList</b></a> |\r\n");
      out.write("        \r\n");
      out.write("        ");

            if (userBean.getRoleId() == RoleBean.ADMIN) {
        
      out.write(" \r\n");
      out.write("       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.MARKSHEET_CTL);
      out.write("\">Add Marksheet</b></a> |       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.MARKSHEET_LIST_CTL);
      out.write("\">Marksheet List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.USER_CTL);
      out.write("\">Add User</b></a> | \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.USER_LIST_CTL);
      out.write("\">User List</b></a> |         \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.COLLEGE_CTL);
      out.write("\">Add College</b></a> |        \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.COLLEGE_LIST_CTL);
      out.write("\">College List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.ROLE_CTL);
      out.write("\">Add Role</b></a> |        \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.ROLE_LIST_CTL);
      out.write("\">Role List</b></a> |\r\n");
      out.write("        <br>\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.STUDENT_CTL);
      out.write("\">Add Student</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.STUDENT_LIST_CTL);
      out.write("\">Student List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.COURSE_CTL );
      out.write("\" >Add Course</b></a> |       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.COURSE_LIST_CTL );
      out.write("\">Course List</b></a> |       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.SUBJECT_CTL );
      out.write("\" >Add Subject</b></a> |       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.SUBJECT_LIST_CTL );
      out.write("\" >Subject List</b></a> |          \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.FACULTY_CTL );
      out.write("\" >Add Faculty</b></a> |       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.FACULTY_LIST_CTL );
      out.write("\">Faculty List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.TIMETABLE_CTL );
      out.write("\" >Add TimeTable</b></a> |       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL );
      out.write("\">TimeTable List</b></a> |\r\n");
      out.write("        <a target=\"blank\" href=\"");
      out.print(ORSView.JAVA_DOC_VIEW);
      out.write("\">Java Doc</b></a> |\r\n");
      out.write("       ");

     		}
 		
      out.write("\r\n");
      out.write(" \t\t ");

            if (userBean.getRoleId() == RoleBean.STUDENT) {
        
      out.write(" \r\n");
      out.write("       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.COLLEGE_LIST_CTL);
      out.write("\">College List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.STUDENT_LIST_CTL);
      out.write("\">Student List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.COURSE_LIST_CTL );
      out.write("\">Course List</b></a> |       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.SUBJECT_LIST_CTL );
      out.write("\">Subject List</b></a> |       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.FACULTY_LIST_CTL );
      out.write("\">Faculty List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL );
      out.write("\">TimeTable List</b></a> |\r\n");
      out.write("       ");

     		}
 		
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write(" \t\t");

            if (userBean.getRoleId() == RoleBean.KIOSK) {
        
      out.write(" \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.COLLEGE_LIST_CTL);
      out.write("\">College List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL );
      out.write("\">TimeTable List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.COURSE_LIST_CTL );
      out.write("\">Course List</b></a> |       \r\n");
      out.write("       ");

     		}
 		
      out.write("\r\n");
      out.write(" \t\t ");

            if (userBean.getRoleId() == RoleBean.FACULTY) {
           // System.out.println("======>><><>"+userBean.getRoleId());	
        
      out.write(" \r\n");
      out.write("       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.MARKSHEET_CTL);
      out.write("\">Add Marksheet</b></a> |       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.MARKSHEET_LIST_CTL);
      out.write("\">Marksheet List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.COLLEGE_LIST_CTL);
      out.write("\">College List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.STUDENT_CTL);
      out.write("\">Add Student</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.STUDENT_LIST_CTL);
      out.write("\">Student List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.COURSE_LIST_CTL );
      out.write("\">Course List</b></a> |       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.SUBJECT_CTL );
      out.write("\" >Add Subject</b></a> |   \r\n");
      out.write("        <br>    \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.SUBJECT_LIST_CTL);
      out.write("\">Subject List</b></a> |       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.TIMETABLE_CTL );
      out.write("\" >Add TimeTable</b></a> |       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL );
      out.write("\">TimeTable List</b></a> |\r\n");
      out.write("       ");

     		}
 		
      out.write("\r\n");
      out.write(" \t\t ");

            if (userBean.getRoleId() == RoleBean.COLLEGE) {
       //    System.out.println("======>><><>"+userBean.getRoleId());	
          
      out.write(" \r\n");
      out.write("       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.MARKSHEET_CTL);
      out.write("\">Add Marksheet</b></a> |       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.MARKSHEET_LIST_CTL);
      out.write("\">Marksheet List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.STUDENT_CTL);
      out.write("\">Add Student</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.STUDENT_LIST_CTL);
      out.write("\">Student List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.FACULTY_LIST_CTL );
      out.write("\">Faculty List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL );
      out.write("\">TimeTable List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.COURSE_LIST_CTL );
      out.write("\">Course List</b></a> |       \r\n");
      out.write("       ");

     		}
 		
      out.write("\r\n");
      out.write(" \t\t\r\n");
      out.write(" \t\t</font>\r\n");
      out.write(" \t\t</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    \t");

        	}
   		 
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("<hr>\r\n");
      out.write("</body>\t\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      com.rays.pro4.bean.FacultyBean bean = null;
      bean = (com.rays.pro4.bean.FacultyBean) _jspx_page_context.getAttribute("bean", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (bean == null){
        bean = new com.rays.pro4.bean.FacultyBean();
        _jspx_page_context.setAttribute("bean", bean, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write('\r');
      out.write('\n');
      com.rays.pro4.bean.CollegeBean colbean = null;
      colbean = (com.rays.pro4.bean.CollegeBean) _jspx_page_context.getAttribute("colbean", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (colbean == null){
        colbean = new com.rays.pro4.bean.CollegeBean();
        _jspx_page_context.setAttribute("colbean", colbean, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write('\r');
      out.write('\n');
      com.rays.pro4.bean.CourseBean corbean = null;
      corbean = (com.rays.pro4.bean.CourseBean) _jspx_page_context.getAttribute("corbean", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (corbean == null){
        corbean = new com.rays.pro4.bean.CourseBean();
        _jspx_page_context.setAttribute("corbean", corbean, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<center>\r\n");
      out.write("<form action=\"");
      out.print(ORSView.FACULTY_LIST_CTL );
      out.write("\" method=\"post\">\r\n");
      out.write("\t\r\n");
      out.write("\t<div align=\"center\">\r\n");
      out.write("\t\t\t<h1>Faculty List</h1>\r\n");
      out.write("\t\t\t<h3><font style=\"color: green\">");
      out.print(ServletUtility.getSuccessMessage(request));
      out.write("</font> </h3>\r\n");
      out.write("\t\t\t<h3><font style=\"color: red\">");
      out.print(ServletUtility.getErrorMessage(request) );
      out.write("</font> </h3>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t   ");
 
	             List clist=(List)request.getAttribute("CollegeList");
	              
	              List colist=(List)request.getAttribute("CourseList");
	              
	              int next=DataUtility.getInt(request.getAttribute("nextlist").toString());

	    		
      out.write("\r\n");
      out.write("\t    \r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t");

	int pageNo = ServletUtility.getPageNo(request);
	int pageSize = ServletUtility.getPageSize(request);
	
	int index=(pageNo-1)*pageSize+1;
	List list = ServletUtility.getList(request);
	Iterator<FacultyBean> it = list.iterator();
	
		if(list.size() !=0){
	
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<table width =\"100%\" align=\"center\">\r\n");
      out.write("\t\t<tr><th></th>\r\n");
      out.write("\t\t<td align=\"center\">\r\n");
      out.write("\t\t<label>First Name :</label>\r\n");
      out.write("\t\t<input type=\"text\" name=\"firstname\" placeholder=\"Enter First Name\" value=");
      out.print(ServletUtility.getParameter("firstname", request) );
      out.write(">\r\n");
      out.write("\t\t&nbsp;\r\n");
      out.write("\t\t<label>College Name :</label>\r\n");
      out.write("\t\t ");
      out.print(HTMLUtility.getList("collegeid", String.valueOf(bean.getCollegeId()), clist) );
      out.write("\r\n");
      out.write("                   \t\r\n");
      out.write("\t\t&nbsp;\r\n");
      out.write("\t\t<label>Course Name :</label>\r\n");
      out.write("\t\t");
      out.print(HTMLUtility.getList("courseid", String.valueOf(bean.getCourseId()), colist) );
      out.write("\t\t\r\n");
      out.write("\t\t&nbsp;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<input type=\"submit\" name=\"operation\" value=\"");
      out.print(FacultyListCtl.OP_SEARCH);
      out.write("\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<input type=\"submit\" name=\"operation\" value=\"");
      out.print(FacultyListCtl.OP_RESET );
      out.write("\">\r\n");
      out.write("\t\t</td></tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<br>\t\r\n");
      out.write("\t<table border=\"1\" width=\"100%\" align=\"center\" cellpadding=8px cellspacing=\".2\">\r\n");
      out.write("\t\t\r\n");
      out.write("             <tr style=\"background: skyblue\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<th ><input type=\"checkbox\" id=\"select_all\" name =\"Select\">Select All.</th>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<th>S.No.</th>\r\n");
      out.write("\t\t\t<th>First Name.</th>\r\n");
      out.write("\t\t\t<th>Last Name.</th>\r\n");
      out.write("\t\t\t<th>EmailId.</th>\r\n");
      out.write("\t\t\t<th>College Name.</th>\r\n");
      out.write("\t\t\t<th>Course Name.</th>\r\n");
      out.write("\t\t\t<th>Subject Name.</th>\r\n");
      out.write("\t\t\t<th>DOB.</th>\r\n");
      out.write("\t\t\t<th>Mobile No.</th>\r\n");
      out.write("\t\t\t<th>Edit</th>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");

		while(it.hasNext()){
	 	bean =it.next();	
		
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td><input type = \"checkbox\" class=\"checkbox\" name=\"ids\" value=\"");
      out.print(bean.getId() );
      out.write("\"></td>\r\n");
      out.write("\t\t<td>");
      out.print(index++);
      out.write("</td>\r\n");
      out.write("\t\t<td>");
      out.print(bean.getFirstName() );
      out.write("</td>\r\n");
      out.write("\t\t<td>");
      out.print(bean.getLastName() );
      out.write("</td>\r\n");
      out.write("\t\t<td>");
      out.print(bean.getEmailId() );
      out.write("</td>\r\n");
      out.write("\t\t<td>");
      out.print(bean.getCollegeName() );
      out.write("</td>\r\n");
      out.write("\t\t<td>");
      out.print(bean.getCourseName() );
      out.write("</td>\r\n");
      out.write("\t\t<td>");
      out.print(bean.getSubjectName() );
      out.write("</td>\r\n");
      out.write("\t\t<td>");
      out.print(bean.getDob() );
      out.write("</td>\r\n");
      out.write("\t\t<td>");
      out.print(bean.getMobileNo() );
      out.write("</td>\r\n");
      out.write("\t\t<td><a href=\"FacultyCtl?id=");
      out.print(bean.getId());
      out.write("\">Edit </a></td>\r\n");
      out.write("\t\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t\t");
 
		}
		
      out.write("\r\n");
      out.write("\t</table>\r\n");
      out.write("\r\n");
      out.write("\t<table width = \"100%\">\r\n");
      out.write("\t\t<tr><th></th>\r\n");
      out.write("\t\t");
 if(pageNo == 1){ 
      out.write("\r\n");
      out.write("\t\t<td align=\"left\" ><input type=\"submit\" name=\"operation\" disabled=\"disabled\" value=\"");
      out.print(FacultyListCtl.OP_PREVIOUS );
      out.write("\"></td>\r\n");
      out.write("\t\t ");
}else{ 
      out.write("\r\n");
      out.write("\t\t <td align=\"left\" ><input type=\"submit\" name=\"operation\" value=\"");
      out.print(FacultyListCtl.OP_PREVIOUS );
      out.write("\"></td>\r\n");
      out.write("\t\t ");
} 
      out.write("\r\n");
      out.write("\t\t\t<td><input type=\"submit\" name=\"operation\" value=\"");
      out.print(FacultyListCtl.OP_DELETE);
      out.write("\"></td>\r\n");
      out.write("\t\t\t<td><input type=\"submit\" name=\"operation\" value=\"");
      out.print(FacultyListCtl.OP_NEW);
      out.write("\"></td>\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t");
      out.write("\t\r\n");
      out.write("                    <td align=\"right\"><input type=\"submit\"  name=\"operation\" value=\"");
      out.print(FacultyListCtl.OP_NEXT);
      out.write('"');
      out.write(' ');
      out.print((list.size()<pageSize||next==0)?"disabled":"" );
      out.write("> </td>\r\n");
      out.write("\t\t\t        \r\n");
      out.write("                 \r\n");
      out.write(" \t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t");
}if(list.size() == 0){ 
      out.write("\r\n");
      out.write("            \t\t<td align=\"center\"><input type=\"submit\" name=\"operation\" value=\"");
      out.print(FacultyListCtl.OP_BACK);
      out.write("\"></td>\t\r\n");
      out.write("            \t\t");
 } 
      out.write("\r\n");
      out.write("            \t\t\r\n");
      out.write("\t\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"pageNo\" value=\"");
      out.print(pageNo );
      out.write("\">\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"pageSize\" value=\"");
      out.print(pageSize);
      out.write("\">\r\n");
      out.write("</form>\r\n");
      out.write("</br>\r\n");
      out.write("</br>\r\n");
      out.write("                   </br>\r\n");
      out.write("                   </br>\r\n");
      out.write("                   </br>\r\n");
      out.write("</br>\r\n");
      out.write("</center>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("  <style type=\"text/css\">\r\n");
      out.write("#footer {\r\n");
      out.write("    \r\n");
      out.write("    position: fixed;\r\n");
      out.write("    left:0;\r\n");
      out.write("    width:100%; \r\n");
      out.write("    bottom:0;\r\n");
      out.write("    background-color:white;\r\n");
      out.write("    color:black;\r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("   text-align:center;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write(" \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div id =\"footer\">\r\n");
      out.write("<CENTER><hr>\r\n");
      out.write("    <H3>&copy; Copyrights RAYS Technologies</H3>\r\n");
      out.write("</CENTER>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
