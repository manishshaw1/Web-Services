/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.82
 * Generated at: 2017-12-05 16:20:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import com.myproject.bean.Track;

public final class FindTrack_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
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
      out.write("    \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\tfieldset {\r\n");
      out.write("\t\tmargin-left: 30%;\r\n");
      out.write("    \tmargin-right: 30%;\r\n");
      out.write("\t}\r\n");
      out.write("\tth, tr {\r\n");
      out.write("\t\ttext-align: left;\r\n");
      out.write("    \tpadding: 15px;\r\n");
      out.write("\t}\r\n");
      out.write("\t.button {\r\n");
      out.write("\t\tmargin-left: 45%;\r\n");
      out.write("\t    position: absolute;\r\n");
      out.write("\t    top: 40%;\r\n");
      out.write("\t}\r\n");
      out.write("\t.button1 {\r\n");
      out.write("\t\tmargin-left: 50%;\r\n");
      out.write("\t    position: absolute;\r\n");
      out.write("\t    top: 40%;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("<script>\r\n");
      out.write("function goBack() {\r\n");
      out.write("    window.history.back();\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Find Track</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<form method=\"post\" action=\"TrackController?action=Search\">\r\n");
      out.write("\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t<legend align=\"center\"><h1>Search an Entry</h1></legend>\r\n");
      out.write("\t\t\t\t<table align=\"center\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th>Choose : </th>\r\n");
      out.write("\t\t\t\t<th><select name=\"criteria\">\r\n");
      out.write("\t\t\t\t  <option value=\"title\">Title</option>\r\n");
      out.write("\t\t\t\t  <option value=\"singer\">Singer</option>\r\n");
      out.write("\t\t\t\t</select></th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>Title/Singer  : </th>\r\n");
      out.write("\t\t\t\t\t<th><input type=\"text\" name=\"searchText\" required=\"true\"></th>\r\n");
      out.write("\t\t\t\t</tr>\t\t\t\t\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\t\t\t</fieldset>\r\n");
      out.write("\t\t\t<input class=\"button\" type=\"submit\" value=\"Search\">\r\n");
      out.write("\t\t\t<button class=\"button1\" onclick=\"goBack()\">Back</button>\r\n");
      out.write("\t \t</form>\r\n");
      out.write("\t \t\r\n");
      out.write("\t \t");
String mode = (String) request.getAttribute("mode");
	 	if("results".equalsIgnoreCase(mode)){
      out.write("\r\n");
      out.write("\t \t\r\n");
      out.write("\t \t<table border=\"1\">\r\n");
      out.write("\t<thead>\r\n");
      out.write("\t\t<tr><th>Title</th><th>Singer</th></tr>\r\n");
      out.write("\t</thead>\r\n");
      out.write("\t<tbody>\r\n");
      out.write("\t\t");
 List<Track> trackList = (List<Track>) request.getAttribute("trackList"); 
		if(trackList!=null && trackList.size()>0){
		for(Track track : trackList){
      out.write("\r\n");
      out.write("\t\t\t<tr><td>");
      out.print(track.getTitle() );
      out.write("</td><td>");
      out.print(track.getSinger() );
      out.write("</td></tr>\r\n");
      out.write("\t\t");
} }else{
      out.write("\r\n");
      out.write("\t\t<tr colspan=\"2\"><td>No Results to Display</td></tr>\r\n");
      out.write("\t\t");
} }
      out.write("\r\n");
      out.write("\t</tbody>\t\t\r\n");
      out.write("\t</table>\r\n");
      out.write("\t</div>\r\n");
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
