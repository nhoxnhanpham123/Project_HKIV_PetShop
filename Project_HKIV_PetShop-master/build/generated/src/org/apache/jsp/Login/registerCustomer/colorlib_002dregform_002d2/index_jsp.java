package org.apache.jsp.Login.registerCustomer.colorlib_002dregform_002d2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_setBundle_basename_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_message_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_import_url_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_setBundle_basename_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_import_url_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_fmt_setBundle_basename_nobody.release();
    _jspx_tagPool_fmt_message_key_nobody.release();
    _jspx_tagPool_c_import_url_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <!-- Required meta tags-->\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("        <meta name=\"description\" content=\"Colorlib Templates\">\r\n");
      out.write("        <meta name=\"author\" content=\"Colorlib\">\r\n");
      out.write("        <meta name=\"keywords\" content=\"Colorlib Templates\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Title Page-->\r\n");
      out.write("        <title>Register</title>\r\n");
      out.write("        ");
      if (_jspx_meth_c_import_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        ");
      if (_jspx_meth_fmt_setBundle_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.7.2/angular.min.js\"></script> \r\n");
      out.write("        <!-- Icons font CSS-->\r\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Login/registerCustomer/colorlib-regform-2/vendor/mdi-font/css/material-design-iconic-font.min.css\" rel=\"stylesheet\" media=\"all\">\r\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Login/registerCustomer/colorlib-regform-2/vendor/font-awesome-4.7/css/font-awesome.min.css\" rel=\"stylesheet\" media=\"all\">\r\n");
      out.write("        <!-- Font special for pages-->\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Vendor CSS-->\r\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Login/registerCustomer/colorlib-regform-2/vendor/select2/select2.min.css\" rel=\"stylesheet\" media=\"all\">\r\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Login/registerCustomer/colorlib-regform-2/vendor/datepicker/daterangepicker.css\" rel=\"stylesheet\" media=\"all\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Main CSS-->\r\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Login/registerCustomer/colorlib-regform-2/css/main.css\" rel=\"stylesheet\" media=\"all\">\r\n");
      out.write("        <style>\r\n");
      out.write("            .error-msg {\r\n");
      out.write("                font-size: 90%;\r\n");
      out.write("                font-style: italic;\r\n");
      out.write("                color: red;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"page-wrapper bg-red p-t-180 p-b-100 font-robo\">\r\n");
      out.write("            <div class=\"wrapper wrapper--w960\">\r\n");
      out.write("                <div class=\"card card-2\">\r\n");
      out.write("                    <div class=\"card-heading\"></div>\r\n");
      out.write("                    <div class=\"card-body\" ng-app=\"myApp\" ng-controller=\"myCtrl\">\r\n");
      out.write("                        <h2 class=\"title\">");
      if (_jspx_meth_fmt_message_0(_jspx_page_context))
        return;
      out.write("</h2>\r\n");
      out.write("                        <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Customers/Store\" method=\"post\" name=\"myForm\" ng-submit=\"checkOnSubmit($event)\">\r\n");
      out.write("                            <div class=\"input-group\" >\r\n");
      out.write("                                <input class=\"input--style-3\" type=\"text\" id=\"exampleFirstName\" name=\"regis_name\" placeholder=\"");
      if (_jspx_meth_fmt_message_1(_jspx_page_context))
        return;
      out.write("\" ng-required=\"true\"\r\n");
      out.write("                                       ng-model=\"username\" ng-minlength= \"5\" ng-maxlength= \"20\">\r\n");
      out.write("                                <br/>\r\n");
      out.write("                                <span ng-show=\"myForm.regis_name.$invalid && myForm.regis_name.$dirty\" class=\"error-msg\">\r\n");
      out.write("                                    Name must be(5-20)!\r\n");
      out.write("                                </span>\r\n");
      out.write("                                <br/>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"row row-space\">\r\n");
      out.write("                                <div class=\"col-2\">\r\n");
      out.write("                                    <div class=\"input-group\">\r\n");
      out.write("                                        <input class=\"input--style-3\" type=\"password\" id=\"exampleInputPassword\" name=\"regis_pass\" placeholder=\"");
      if (_jspx_meth_fmt_message_2(_jspx_page_context))
        return;
      out.write("\" ng-model=\"password\"\r\n");
      out.write("                                               ng-minlength= \"5\" ng-maxlength= \"10\" ng-required=\"true\">\r\n");
      out.write("                                        \r\n");
      out.write("                                        <span ng-show=\"myForm.regis_pass.$invalid && myForm.regis_pass.$dirty\" class=\"error-msg\">\r\n");
      out.write("                                            Password must be(5-10)!\r\n");
      out.write("                                        </span>\r\n");
      out.write("                                        \r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                               \r\n");
      out.write("                                <div class=\"col-2\">\r\n");
      out.write("                                    <div class=\"input-group\">\r\n");
      out.write("                                        <div class=\"rs-select2 js-select-simple select--no-search\">\r\n");
      out.write("                                              <input class=\"input--style-3\" type=\"password\" id=\"exampleRepeatPassword\" name=\"regis_pass\" placeholder=\"");
      if (_jspx_meth_fmt_message_3(_jspx_page_context))
        return;
      out.write("\" ng-required=\"true\">\r\n");
      out.write("                                           \r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"input-group\">\r\n");
      out.write("                                <div class=\"rs-select2 js-select-simple select--no-search\">\r\n");
      out.write("                                    <input class=\"input--style-3\" type=\"email\" ng-model=\"txtMail\" id=\"exampleInputEmail\" name=\"regis_mail\" placeholder=\"");
      if (_jspx_meth_fmt_message_4(_jspx_page_context))
        return;
      out.write("\" ng-required=\"true\">\r\n");
      out.write("                                    <br/>\r\n");
      out.write("                                    <span  ng-show=\"myForm.regis_mail.$invalid && myForm.regis_mail.$dirty\" class=\"error-msg\">\r\n");
      out.write("                                        mail must be (name@gmail.com)!\r\n");
      out.write("                                    </span>\r\n");
      out.write("                                    <br/>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"row row-space\">\r\n");
      out.write("                                <div class=\"col-2\">\r\n");
      out.write("                                    <div class=\"input-group\">\r\n");
      out.write("                                        <input class=\"input--style-3\" type=\"text\" id=\"address\" name=\"regis_address\" placeholder=\"");
      if (_jspx_meth_fmt_message_5(_jspx_page_context))
        return;
      out.write("\" ng-required=\"true\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"row row-space\">\r\n");
      out.write("                                <div class=\"col-2\">\r\n");
      out.write("                                    <div class=\"input-group\">\r\n");
      out.write("                                       <input class=\"input--style-3\" type=\"text\" id=\"mobile\" name=\"regis_phone\" placeholder=\"");
      if (_jspx_meth_fmt_message_6(_jspx_page_context))
        return;
      out.write("\" ng-required=\"true\"\r\n");
      out.write("                                                   ng-model=\"phone\" ng-pattern=\"/((09|03|07|08|05|06|04|02|01)+([0-9]{8,10})\\b)/g\">\r\n");
      out.write("                                            <br/>\r\n");
      out.write("                                            <span ng-show=\"myForm.regis_phone.$invalid && myForm.regis_phone.$dirty\" class=\"error-msg\">\r\n");
      out.write("                                                must be in correct format and (10 to 12) Number!\r\n");
      out.write("\r\n");
      out.write("                                            </span>\r\n");
      out.write("                                            <br/>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                                    \r\n");
      out.write("                                    \r\n");
      out.write("                            <div class=\"p-t-30\">\r\n");
      out.write("                                <button class=\"btn btn--radius btn--green checkmobile\"  type=\"submit\" onclick=\"return Validate()\">");
      if (_jspx_meth_fmt_message_7(_jspx_page_context))
        return;
      out.write("</button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"p-t-30\">\r\n");
      out.write("                                <a href=\"https://accounts.google.com/o/oauth2/auth?scope=email&redirect_uri=http://localhost:8080/Project_HKIV_PetShop/loginGoogle&response_type=code\r\n");
      out.write("                                   &client_id=520939530095-juad1qmkst71lhl963fqck8mibnocbhu.apps.googleusercontent.com&approval_prompt=force\" style=\"color: #007bff;\">\r\n");
      out.write("                                    ");
      if (_jspx_meth_fmt_message_8(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"p-t-30\">\r\n");
      out.write("                                <a class=\"small\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Login/loginCustomer/Login_v11/index.jsp\"> ");
      if (_jspx_meth_fmt_message_9(_jspx_page_context))
        return;
      out.write(" </a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"p-t-30\">\r\n");
      out.write("                                <a class=\"small\" href=\"?locale=en\">\r\n");
      out.write("                                    English |\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <a class=\"small\" href=\"?locale=vi\">\r\n");
      out.write("                                    Vietnamese\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            function Validate() {\r\n");
      out.write("                var password = document.getElementById(\"exampleInputPassword\").value;\r\n");
      out.write("                var confirmPassword = document.getElementById(\"exampleRepeatPassword\").value;\r\n");
      out.write("                if (password != confirmPassword) {\r\n");
      out.write("                    alert(\"Passwords do not match.\");\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("                return true;\r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
      out.write("        <script>\r\n");
      out.write("            var app = angular.module(\"myApp\", []);\r\n");
      out.write("\r\n");
      out.write("            app.controller(\"myCtrl\", function($scope) {\r\n");
      out.write("\r\n");
      out.write("                $scope.password = \"\";\r\n");
      out.write("                $scope.username = \"\";\r\n");
      out.write("                $scope.phone = \"\";\r\n");
      out.write("                // Show more error infos.\r\n");
      out.write("                function printErrorInfo() {\r\n");
      out.write("                    console.log($scope.myForm.$error);\r\n");
      out.write("                    if ($scope.myForm.$error.minlength) {\r\n");
      out.write("                        console.log('$error.minlength? ' + $scope.myForm.$error.minlength[0].$invalid);\r\n");
      out.write("                    }\r\n");
      out.write("                    if ($scope.myForm.$error.maxlength) {\r\n");
      out.write("                        console.log('$error.maxlength? ' + $scope.myForm.$error.maxlength[0].$invalid);\r\n");
      out.write("                    }\r\n");
      out.write("\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                $scope.checkOnSubmit = function(event) {\r\n");
      out.write("                    if ($scope.myForm.$invalid) {\r\n");
      out.write("                        alert(\"Something invalid!\");\r\n");
      out.write("\r\n");
      out.write("                        printErrorInfo();\r\n");
      out.write("\r\n");
      out.write("                        // Cancel submit\r\n");
      out.write("                        event.preventDefault();\r\n");
      out.write("                        return false;\r\n");
      out.write("                    }\r\n");
      out.write("\r\n");
      out.write("                    return true;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Jquery JS-->\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Login/registerCustomer/colorlib-regform-2/vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("        <!-- Vendor JS-->\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Login/registerCustomer/colorlib-regform-2/vendor/select2/select2.min.js\"></script>\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Login/registerCustomer/colorlib-regform-2/vendor/datepicker/moment.min.js\"></script>\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Login/registerCustomer/colorlib-regform-2/vendor/datepicker/daterangepicker.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Main JS-->\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Login/registerCustomer/colorlib-regform-2/js/global.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    </body><!-- This templates was made by Colorlib (https://colorlib.com) -->\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("<!-- end document-->");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("context");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_import_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_import_0 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _jspx_tagPool_c_import_url_nobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_c_import_0.setPageContext(_jspx_page_context);
    _jspx_th_c_import_0.setParent(null);
    _jspx_th_c_import_0.setUrl("setLocale.jsp");
    int[] _jspx_push_body_count_c_import_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_import_0 = _jspx_th_c_import_0.doStartTag();
      if (_jspx_th_c_import_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_import_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_import_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_import_0.doFinally();
      _jspx_tagPool_c_import_url_nobody.reuse(_jspx_th_c_import_0);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_setBundle_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:setBundle
    org.apache.taglibs.standard.tag.rt.fmt.SetBundleTag _jspx_th_fmt_setBundle_0 = (org.apache.taglibs.standard.tag.rt.fmt.SetBundleTag) _jspx_tagPool_fmt_setBundle_basename_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.SetBundleTag.class);
    _jspx_th_fmt_setBundle_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_setBundle_0.setParent(null);
    _jspx_th_fmt_setBundle_0.setBasename("app");
    int _jspx_eval_fmt_setBundle_0 = _jspx_th_fmt_setBundle_0.doStartTag();
    if (_jspx_th_fmt_setBundle_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_setBundle_basename_nobody.reuse(_jspx_th_fmt_setBundle_0);
      return true;
    }
    _jspx_tagPool_fmt_setBundle_basename_nobody.reuse(_jspx_th_fmt_setBundle_0);
    return false;
  }

  private boolean _jspx_meth_fmt_message_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_0 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_0.setParent(null);
    _jspx_th_fmt_message_0.setKey("login.form.titleRe");
    int _jspx_eval_fmt_message_0 = _jspx_th_fmt_message_0.doStartTag();
    if (_jspx_th_fmt_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
    return false;
  }

  private boolean _jspx_meth_fmt_message_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_1 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_1.setParent(null);
    _jspx_th_fmt_message_1.setKey("login.textfield.name");
    int _jspx_eval_fmt_message_1 = _jspx_th_fmt_message_1.doStartTag();
    if (_jspx_th_fmt_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_1);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_1);
    return false;
  }

  private boolean _jspx_meth_fmt_message_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_2 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_2.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_2.setParent(null);
    _jspx_th_fmt_message_2.setKey("login.textfield.password");
    int _jspx_eval_fmt_message_2 = _jspx_th_fmt_message_2.doStartTag();
    if (_jspx_th_fmt_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_2);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_2);
    return false;
  }

  private boolean _jspx_meth_fmt_message_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_3 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_3.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_3.setParent(null);
    _jspx_th_fmt_message_3.setKey("login.textfield.rePassword");
    int _jspx_eval_fmt_message_3 = _jspx_th_fmt_message_3.doStartTag();
    if (_jspx_th_fmt_message_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_3);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_3);
    return false;
  }

  private boolean _jspx_meth_fmt_message_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_4 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_4.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_4.setParent(null);
    _jspx_th_fmt_message_4.setKey("login.textfield.mail");
    int _jspx_eval_fmt_message_4 = _jspx_th_fmt_message_4.doStartTag();
    if (_jspx_th_fmt_message_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_4);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_4);
    return false;
  }

  private boolean _jspx_meth_fmt_message_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_5 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_5.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_5.setParent(null);
    _jspx_th_fmt_message_5.setKey("login.textfield.address");
    int _jspx_eval_fmt_message_5 = _jspx_th_fmt_message_5.doStartTag();
    if (_jspx_th_fmt_message_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_5);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_5);
    return false;
  }

  private boolean _jspx_meth_fmt_message_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_6 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_6.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_6.setParent(null);
    _jspx_th_fmt_message_6.setKey("login.textfield.phone");
    int _jspx_eval_fmt_message_6 = _jspx_th_fmt_message_6.doStartTag();
    if (_jspx_th_fmt_message_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_6);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_6);
    return false;
  }

  private boolean _jspx_meth_fmt_message_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_7 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_7.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_7.setParent(null);
    _jspx_th_fmt_message_7.setKey("login.textfield.Register");
    int _jspx_eval_fmt_message_7 = _jspx_th_fmt_message_7.doStartTag();
    if (_jspx_th_fmt_message_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_7);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_7);
    return false;
  }

  private boolean _jspx_meth_fmt_message_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_8 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_8.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_8.setParent(null);
    _jspx_th_fmt_message_8.setKey("login.button.submitGoogle");
    int _jspx_eval_fmt_message_8 = _jspx_th_fmt_message_8.doStartTag();
    if (_jspx_th_fmt_message_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_8);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_8);
    return false;
  }

  private boolean _jspx_meth_fmt_message_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_9 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_9.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_9.setParent(null);
    _jspx_th_fmt_message_9.setKey("login.button.alhaveaccount");
    int _jspx_eval_fmt_message_9 = _jspx_th_fmt_message_9.doStartTag();
    if (_jspx_th_fmt_message_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_9);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_9);
    return false;
  }
}
