/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.72
 * Generated at: 2023-03-22 15:35:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class complex_005fform_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-5.3.22.jar", Long.valueOf(1678218867490L));
    _jspx_dependants.put("jar:file:/C:/Users/2203944/OneDrive%20-%20Cognizant/Desktop/eclipse%20project/ToolSuite/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/springmvcsearch/WEB-INF/lib/spring-webmvc-5.3.22.jar!/META-INF/spring-form.tld", Long.valueOf(1657768256000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody;

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
    _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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
      response.setContentType("text/html");
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
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <!-- Required meta tags -->\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\" \r\n");
      out.write("    integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" z\r\n");
      out.write("    crossorigin=\"anonymous\">\r\n");
      out.write("	 \r\n");
      out.write("	 <title>Hello, world!</title>\r\n");
      out.write("	 </head>\r\n");
      out.write("	 <body class=\"\" style=\"background: #e2e2e2;\">\r\n");
      out.write("		\r\n");
      out.write("		<div class=\"container mt-4\">\r\n");
      out.write("		\r\n");
      out.write("			<div class=\"row\">\r\n");
      out.write("				<div class=\"col-md-8 offset-md-2\">\r\n");
      out.write("					<div class=\"card\">\r\n");
      out.write("						<div class=\"card-body\">\r\n");
      out.write("							<h3 class=\"text-center\">Complex Form</h3> \r\n");
      out.write("							<div class=\"alert alert-danger\" role=\"alert\">\r\n");
      out.write("								");
      //  form:errors
      org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_005ferrors_005f0 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
      boolean _jspx_th_form_005ferrors_005f0_reused = false;
      try {
        _jspx_th_form_005ferrors_005f0.setPageContext(_jspx_page_context);
        _jspx_th_form_005ferrors_005f0.setParent(null);
        // /WEB-INF/views/complex_form.jsp(27,8) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_form_005ferrors_005f0.setPath("student.*");
        int[] _jspx_push_body_count_form_005ferrors_005f0 = new int[] { 0 };
        try {
          int _jspx_eval_form_005ferrors_005f0 = _jspx_th_form_005ferrors_005f0.doStartTag();
          if (_jspx_th_form_005ferrors_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            return;
          }
        } catch (java.lang.Throwable _jspx_exception) {
          while (_jspx_push_body_count_form_005ferrors_005f0[0]-- > 0)
            out = _jspx_page_context.popBody();
          _jspx_th_form_005ferrors_005f0.doCatch(_jspx_exception);
        } finally {
          _jspx_th_form_005ferrors_005f0.doFinally();
        }
        _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody.reuse(_jspx_th_form_005ferrors_005f0);
        _jspx_th_form_005ferrors_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_form_005ferrors_005f0, _jsp_getInstanceManager(), _jspx_th_form_005ferrors_005f0_reused);
      }
      out.write("\r\n");
      out.write("							</div>\r\n");
      out.write("							<form action=\"handleform\" method=\"post\">\r\n");
      out.write("								<div class=\"form-group\">\r\n");
      out.write("								<label for=\"exampleInputEmail1\">Your name</label> \r\n");
      out.write("								<input\r\n");
      out.write("									name=\"name\" type=\"text\" class=\"form-control\" \r\n");
      out.write("									id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\" \r\n");
      out.write("									placeholder=\"Enter Name\"> \r\n");
      out.write("								\r\n");
      out.write("									\r\n");
      out.write("									<small id=\"emailHelp\"\r\n");
      out.write("									class=\"form-text text-muted\">We'll never share your \r\n");
      out.write("										name with anyone else.</small>\r\n");
      out.write("							</div>\r\n");
      out.write("								\r\n");
      out.write("								\r\n");
      out.write("								<div class=\"form-group\">\r\n");
      out.write("								<label for=\"exampleInputEmailI\">Your id</label><input \r\n");
      out.write("								name= \"id\" \r\n");
      out.write("									type=\"text\" class=\"form-control\" id=\"exampleInputEmailI\" \r\n");
      out.write("									aria-describedby=\"emailHelp\" placeholder=\"Enter ID\">\r\n");
      out.write("							</div>\r\n");
      out.write("					\r\n");
      out.write("					\r\n");
      out.write("							<div class=\"form-group\">\r\n");
      out.write("							<label for=\"exampleInputEmaill\">Your DOB</label> \r\n");
      out.write("							<input \r\n");
      out.write("								name=\"date\" type=\"date\" class=\"form-control\" \r\n");
      out.write("								id=\"exampleInputEmailI\" placeholder=\"dd/mm/yyy\"\r\n");
      out.write("								aria-describedby=\"emailHelp\">\r\n");
      out.write("							</div>\r\n");
      out.write("\r\n");
      out.write("							<div class=\"form-group\">\r\n");
      out.write("								<label for=\"exampleFormControlSelectI\">Select Courses</label> <select\r\n");
      out.write("								name=\"courses\" class=\"form-control\" \r\n");
      out.write("								id= \"exampleFormControlSelectI\" multiple> \r\n");
      out.write("								<option>Java</option>\r\n");
      out.write("								<option>Python <option>\r\n");
      out.write("								<option>C++</option> \r\n");
      out.write("								<option>Django</option> \r\n");
      out.write("								<option>Spring Framework</option>\r\n");
      out.write("								</select> \r\n");
      out.write("							</div> \r\n");
      out.write("							\r\n");
      out.write("							<div class=\"form-group\">\r\n");
      out.write("							<span class=\"mr-3\"> Select Gender </span> \r\n");
      out.write("							<div class= \"form-check form-check-inline\">\r\n");
      out.write("								<input class=\"form-check-input\" type=\"radio\" name=\"gender\"\r\n");
      out.write("								id=\"inlineRadiol\" value=\"male\"> <label \r\n");
      out.write("								class=\"form-check-label\" for=\"inlineRadiol\">Male</label>\r\n");
      out.write("							</div>\r\n");
      out.write("	\r\n");
      out.write("							<div class=\"form-check form-check-inline\">\r\n");
      out.write("								<input class=\"form-check-input\" type=\"radio\" name=\"gender\"\r\n");
      out.write("										id=\"inlineRadio2\" value=\"female\"> <label \r\n");
      out.write("										class= \"form-check-label\" for= \"inlineRadio2\">Female</label>\r\n");
      out.write("							</div>\r\n");
      out.write("							</div>\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("							<div class=\"form-group\"> \r\n");
      out.write("								<label for=\"\">Select Type</label> <select class=\"form-control\"\r\n");
      out.write("								name= \"type\">\r\n");
      out.write("								<option value=\"oldstudent\">Old Student</option> \r\n");
      out.write("								<option value= \"normalstudent\">Normal Student</option>\r\n");
      out.write("								</select>\r\n");
      out.write("							</div>	\r\n");
      out.write("							\r\n");
      out.write("							\r\n");
      out.write("							<div class=\"card\">\r\n");
      out.write("							\r\n");
      out.write("							<div class=\"card-body\">\r\n");
      out.write("							\r\n");
      out.write("							<p>Your address</p>\r\n");
      out.write("							\r\n");
      out.write("							<div class=\"form-group\">\r\n");
      out.write("								<input type=\"text\" \r\n");
      out.write("									name=\"address.street\"\r\n");
      out.write("									class=\"form-control\" \r\n");
      out.write("									placeholder=\"Enter Street\"/>\r\n");
      out.write("							\r\n");
      out.write("							</div>\r\n");
      out.write("\r\n");
      out.write("							<div class=\"form-group\">\r\n");
      out.write("								<input type=\"text\" \r\n");
      out.write("									name=\"address.city\"\r\n");
      out.write("									class=\"form-control\" \r\n");
      out.write("									placeholder=\"Enter City\"/>\r\n");
      out.write("							\r\n");
      out.write("							</div>							\r\n");
      out.write("							\r\n");
      out.write("							</div>\r\n");
      out.write("							\r\n");
      out.write("							</div>\r\n");
      out.write("							\r\n");
      out.write("							\r\n");
      out.write("							<div>\r\n");
      out.write("								<div class=\"container text-center\">\r\n");
      out.write("									<button type=\"submit\" class=\"bt btn-primary\">Submit</button> \r\n");
      out.write("							</div>\r\n");
      out.write("							</div>\r\n");
      out.write("					</form>\r\n");
      out.write("				</div> \r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Optional JavaScript -->\r\n");
      out.write("    <!-- jQuery first, then Popper.js, then Bootstrap JS -->\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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