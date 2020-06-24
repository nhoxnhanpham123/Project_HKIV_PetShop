package org.apache.jsp.Admin.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_redirect_url_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_redirect_url_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_redirect_url_nobody.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("        <meta name=\"description\" content=\"\">\r\n");
      out.write("        <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("        <title>Admin List</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.7.0/css/all.css\" integrity=\"sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ\" crossorigin=\"anonymous\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\r\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <!-- Custom fonts for this template-->\r\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Admin/vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Custom styles for this template-->\r\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Admin/css/sb-admin-2.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"https://cdn.datatables.net/1.10.21/css/jquery.dataTables.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body id=\"page-top\">\r\n");
      out.write("        <div id=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("            <!-- Sidebar -->\r\n");
      out.write("            <ul class=\"navbar-nav bg-gradient-primary sidebar sidebar-dark accordion\" id=\"accordionSidebar\">\r\n");
      out.write("\r\n");
      out.write("                <!-- Sidebar - Brand -->\r\n");
      out.write("                <a class=\"sidebar-brand d-flex align-items-center justify-content-center\" href=\"index.html\">\r\n");
      out.write("                    <div class=\"sidebar-brand-icon rotate-n-15\">\r\n");
      out.write("                        <i class=\"fas fa-laugh-wink\"></i>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"sidebar-brand-text mx-3\">PetShop <sup>Admin</sup></div>\r\n");
      out.write("                </a>\r\n");
      out.write("\r\n");
      out.write("                <!-- Divider -->\r\n");
      out.write("                <hr class=\"sidebar-divider my-0\">\r\n");
      out.write("\r\n");
      out.write("                <!-- Nav Item - Dashboard -->\r\n");
      out.write("                <li class=\"nav-item active\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"index.html\">\r\n");
      out.write("                        <i class=\"fas fa-fw fa-tachometer-alt\"></i>\r\n");
      out.write("                        <span>Dashboard</span></a>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("                <!-- Divider -->\r\n");
      out.write("                <hr class=\"sidebar-divider\">\r\n");
      out.write("\r\n");
      out.write("                <!-- Heading -->\r\n");
      out.write("                <div class=\"sidebar-heading\">\r\n");
      out.write("                    Maneger\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#foods\" aria-expanded=\"true\" aria-controls=\"collapseTwo\">\r\n");
      out.write("                        <i class=\"fas fa-fw fa-cog\"></i>\r\n");
      out.write("                        <span>Product component</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <div id=\"foods\" class=\"collapse\" aria-labelledby=\"headingTwo\" data-parent=\"#accordionSidebar\">\r\n");
      out.write("                        <div class=\"bg-white py-2 collapse-inner rounded\">\r\n");
      out.write("                            <h6 class=\"collapse-header\">Products</h6>\r\n");
      out.write("                            <a class=\"collapse-item\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Pet/List\">Pets Manager</a>\r\n");
      out.write("                            <a class=\"collapse-item\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Foods/List\">Foods Manager</a>\r\n");
      out.write("                            <a class=\"collapse-item\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Accessories/List\">Accessories Manager</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#cate\" aria-expanded=\"true\" aria-controls=\"collapseTwo\">\r\n");
      out.write("                        <i class=\"fas fa-fw fa-cog\"></i>\r\n");
      out.write("                        <span style=\"font-size: 12px\">Categories Components</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <div id=\"cate\" class=\"collapse\" aria-labelledby=\"headingTwo\" data-parent=\"#accordionSidebar\">\r\n");
      out.write("                        <div class=\"bg-white py-2 collapse-inner rounded\">\r\n");
      out.write("                            <h6 class=\"collapse-header\">breed Components:</h6>\r\n");
      out.write("                            <a class=\"collapse-item\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Animals/List\">Animals Manager</a>\r\n");
      out.write("                            <a class=\"collapse-item\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Breeds/List\">Breeds Manager</a>\r\n");
      out.write("                            <a class=\"collapse-item\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Cate/List\">CateES Manager</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Member/List\" aria-expanded=\"true\" aria-controls=\"collapseTwo\">\r\n");
      out.write("                        <i class=\"fas fa-fw fa-cog\"></i>\r\n");
      out.write("                        <span style=\"font-size: 12px\">Member Manager</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Hotel/List\" aria-expanded=\"true\" aria-controls=\"collapseTwo\">\r\n");
      out.write("                        <i class=\"fas fa-fw fa-cog\"></i>\r\n");
      out.write("                        <span style=\"font-size: 12px\">Pet Hotel Manager</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Oder/List\" aria-expanded=\"true\" aria-controls=\"collapseTwo\">\r\n");
      out.write("                        <i class=\"fas fa-fw fa-cog\"></i>\r\n");
      out.write("                        <span style=\"font-size: 12px\">Order Manager</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/FeedBack/List\" aria-expanded=\"true\" aria-controls=\"collapseTwo\">\r\n");
      out.write("                        <i class=\"fas fa-fw fa-cog\"></i>\r\n");
      out.write("                        <span style=\"font-size: 12px\">FeedBack Manager</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <!-- Nav Item - Utilities Collapse Menu -->\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapseUtilities\" aria-expanded=\"true\" aria-controls=\"collapseUtilities\">\r\n");
      out.write("                        <i class=\"fas fa-fw fa-wrench\"></i>\r\n");
      out.write("                        <span>Account</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <div id=\"collapseUtilities\" class=\"collapse\" aria-labelledby=\"headingUtilities\" data-parent=\"#accordionSidebar\">\r\n");
      out.write("                        <div class=\"bg-white py-2 collapse-inner rounded\">\r\n");
      out.write("                            <h6 class=\"collapse-header\">Account</h6>\r\n");
      out.write("                            <a class=\"collapse-item\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Admins/Create\">Register</a>\r\n");
      out.write("                            <a class=\"collapse-item\" href=\"utilities-border.html\">Logout</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("                <!-- Divider -->\r\n");
      out.write("                <hr class=\"sidebar-divider\">\r\n");
      out.write("\r\n");
      out.write("                <!-- Sidebar Toggler (Sidebar) -->\r\n");
      out.write("                <div class=\"text-center d-none d-md-inline\">\r\n");
      out.write("                    <button class=\"rounded-circle border-0\" id=\"sidebarToggle\"></button>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </ul>\r\n");
      out.write("\r\n");
      out.write("            <div id=\"content-wrapper\" class=\"d-flex flex-column\">\r\n");
      out.write("                <div id=\"content\">\r\n");
      out.write("\r\n");
      out.write("                    <!-- Topbar -->\r\n");
      out.write("                    <nav class=\"navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow\">\r\n");
      out.write("\r\n");
      out.write("                        <!-- Sidebar Toggle (Topbar) -->\r\n");
      out.write("                        <button id=\"sidebarToggleTop\" class=\"btn btn-link d-md-none rounded-circle mr-3\">\r\n");
      out.write("                            <i class=\"fa fa-bars\"></i>\r\n");
      out.write("                        </button>\r\n");
      out.write("\r\n");
      out.write("                        <!-- Topbar Search -->\r\n");
      out.write("                        <form class=\"d-none d-sm-inline-block form-inline mr-auto ml-md-3 my-2 my-md-0 mw-100 navbar-search\">\r\n");
      out.write("                            <div class=\"input-group\">\r\n");
      out.write("                                <input type=\"text\" class=\"form-control bg-light border-0 small\" placeholder=\"Search for...\" aria-label=\"Search\" aria-describedby=\"basic-addon2\">\r\n");
      out.write("                                <div class=\"input-group-append\">\r\n");
      out.write("                                    <button class=\"btn btn-primary\" type=\"button\">\r\n");
      out.write("                                        <i class=\"fas fa-search fa-sm\"></i>\r\n");
      out.write("                                    </button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </form>\r\n");
      out.write("\r\n");
      out.write("                        <!-- Topbar Navbar -->\r\n");
      out.write("                        <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("\r\n");
      out.write("                            <!-- Nav Item - Search Dropdown (Visible Only XS) -->\r\n");
      out.write("                            <li class=\"nav-item dropdown no-arrow d-sm-none\">\r\n");
      out.write("                                <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"searchDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                                    <i class=\"fas fa-search fa-fw\"></i>\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <!-- Dropdown - Messages -->\r\n");
      out.write("                                <div class=\"dropdown-menu dropdown-menu-right p-3 shadow animated--grow-in\" aria-labelledby=\"searchDropdown\">\r\n");
      out.write("                                    <form class=\"form-inline mr-auto w-100 navbar-search\">\r\n");
      out.write("                                        <div class=\"input-group\">\r\n");
      out.write("                                            <input type=\"text\" class=\"form-control bg-light border-0 small\" placeholder=\"Search for...\" aria-label=\"Search\" aria-describedby=\"basic-addon2\">\r\n");
      out.write("                                            <div class=\"input-group-append\">\r\n");
      out.write("                                                <button class=\"btn btn-primary\" type=\"button\">\r\n");
      out.write("                                                    <i class=\"fas fa-search fa-sm\"></i>\r\n");
      out.write("                                                </button>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </form>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </li>\r\n");
      out.write("\r\n");
      out.write("                            <!-- Nav Item - Alerts -->\r\n");
      out.write("                            <li class=\"nav-item dropdown no-arrow mx-1\">\r\n");
      out.write("                                <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"alertsDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                                    <i class=\"fas fa-bell fa-fw\"></i>\r\n");
      out.write("                                    <!-- Counter - Alerts -->\r\n");
      out.write("                                    <span class=\"badge badge-danger badge-counter\">3+</span>\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <!-- Dropdown - Alerts -->\r\n");
      out.write("                                <div class=\"dropdown-list dropdown-menu dropdown-menu-right shadow animated--grow-in\" aria-labelledby=\"alertsDropdown\">\r\n");
      out.write("                                    <h6 class=\"dropdown-header\">\r\n");
      out.write("                                        Alerts Center\r\n");
      out.write("                                    </h6>\r\n");
      out.write("                                    <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\r\n");
      out.write("                                        <div class=\"mr-3\">\r\n");
      out.write("                                            <div class=\"icon-circle bg-primary\">\r\n");
      out.write("                                                <i class=\"fas fa-file-alt text-white\"></i>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div>\r\n");
      out.write("                                            <div class=\"small text-gray-500\">December 12, 2019</div>\r\n");
      out.write("                                            <span class=\"font-weight-bold\">A new monthly report is ready to download!</span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                    <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\r\n");
      out.write("                                        <div class=\"mr-3\">\r\n");
      out.write("                                            <div class=\"icon-circle bg-success\">\r\n");
      out.write("                                                <i class=\"fas fa-donate text-white\"></i>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div>\r\n");
      out.write("                                            <div class=\"small text-gray-500\">December 7, 2019</div>\r\n");
      out.write("                                            $290.29 has been deposited into your account!\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                    <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\r\n");
      out.write("                                        <div class=\"mr-3\">\r\n");
      out.write("                                            <div class=\"icon-circle bg-warning\">\r\n");
      out.write("                                                <i class=\"fas fa-exclamation-triangle text-white\"></i>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div>\r\n");
      out.write("                                            <div class=\"small text-gray-500\">December 2, 2019</div>\r\n");
      out.write("                                            Spending Alert: We've noticed unusually high spending for your account.\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                    <a class=\"dropdown-item text-center small text-gray-500\" href=\"#\">Show All Alerts</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </li>\r\n");
      out.write("\r\n");
      out.write("                            <!-- Nav Item - Messages -->\r\n");
      out.write("                            <li class=\"nav-item dropdown no-arrow mx-1\">\r\n");
      out.write("                                <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"messagesDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                                    <i class=\"fas fa-envelope fa-fw\"></i>\r\n");
      out.write("                                    <!-- Counter - Messages -->\r\n");
      out.write("                                    <span class=\"badge badge-danger badge-counter\">7</span>\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <!-- Dropdown - Messages -->\r\n");
      out.write("                                <div class=\"dropdown-list dropdown-menu dropdown-menu-right shadow animated--grow-in\" aria-labelledby=\"messagesDropdown\">\r\n");
      out.write("                                    <h6 class=\"dropdown-header\">\r\n");
      out.write("                                        Message Center\r\n");
      out.write("                                    </h6>\r\n");
      out.write("                                    <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\r\n");
      out.write("                                        <div class=\"dropdown-list-image mr-3\">\r\n");
      out.write("                                            <img class=\"rounded-circle\" src=\"https://source.unsplash.com/fn_BT9fwg_E/60x60\" alt=\"\">\r\n");
      out.write("                                            <div class=\"status-indicator bg-success\"></div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"font-weight-bold\">\r\n");
      out.write("                                            <div class=\"text-truncate\">Hi there! I am wondering if you can help me with a problem I've been having.</div>\r\n");
      out.write("                                            <div class=\"small text-gray-500\">Emily Fowler Â· 58m</div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                    <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\r\n");
      out.write("                                        <div class=\"dropdown-list-image mr-3\">\r\n");
      out.write("                                            <img class=\"rounded-circle\" src=\"https://source.unsplash.com/AU4VPcFN4LE/60x60\" alt=\"\">\r\n");
      out.write("                                            <div class=\"status-indicator\"></div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div>\r\n");
      out.write("                                            <div class=\"text-truncate\">I have the photos that you ordered last month, how would you like them sent to you?</div>\r\n");
      out.write("                                            <div class=\"small text-gray-500\">Jae Chun Â· 1d</div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                    <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\r\n");
      out.write("                                        <div class=\"dropdown-list-image mr-3\">\r\n");
      out.write("                                            <img class=\"rounded-circle\" src=\"https://source.unsplash.com/CS2uCrpNzJY/60x60\" alt=\"\">\r\n");
      out.write("                                            <div class=\"status-indicator bg-warning\"></div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div>\r\n");
      out.write("                                            <div class=\"text-truncate\">Last month's report looks great, I am very happy with the progress so far, keep up the good work!</div>\r\n");
      out.write("                                            <div class=\"small text-gray-500\">Morgan Alvarez Â· 2d</div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                    <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\r\n");
      out.write("                                        <div class=\"dropdown-list-image mr-3\">\r\n");
      out.write("                                            <img class=\"rounded-circle\" src=\"https://source.unsplash.com/Mv9hjnEUHR4/60x60\" alt=\"\">\r\n");
      out.write("                                            <div class=\"status-indicator bg-success\"></div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div>\r\n");
      out.write("                                            <div class=\"text-truncate\">Am I a good boy? The reason I ask is because someone told me that people say this to all dogs, even if they aren't good...</div>\r\n");
      out.write("                                            <div class=\"small text-gray-500\">Chicken the Dog Â· 2w</div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                    <a class=\"dropdown-item text-center small text-gray-500\" href=\"#\">Read More Messages</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </li>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"topbar-divider d-none d-sm-block\"></div>\r\n");
      out.write("\r\n");
      out.write("                            <!-- Nav Item - User Information -->\r\n");
      out.write("                            <li class=\"nav-item dropdown no-arrow\">\r\n");
      out.write("                                <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"userDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                                    ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                    ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("                 \r\n");
      out.write("                                    <img class=\"img-profile rounded-circle\" src=\"https://source.unsplash.com/QAB-WJcbgJk/60x60\">\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <!-- Dropdown - User Information -->\r\n");
      out.write("                                <div class=\"dropdown-menu dropdown-menu-right shadow animated--grow-in\" aria-labelledby=\"userDropdown\">\r\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"#\">\r\n");
      out.write("                                        <i class=\"fas fa-user fa-sm fa-fw mr-2 text-gray-400\"></i>\r\n");
      out.write("                                        Profile\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"#\">\r\n");
      out.write("                                        <i class=\"fas fa-cogs fa-sm fa-fw mr-2 text-gray-400\"></i>\r\n");
      out.write("                                        Settings\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"#\">\r\n");
      out.write("                                        <i class=\"fas fa-list fa-sm fa-fw mr-2 text-gray-400\"></i>\r\n");
      out.write("                                        Activity Log\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                    <div class=\"dropdown-divider\"></div>\r\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"#\" data-toggle=\"modal\" data-target=\"#logoutModal\">\r\n");
      out.write("                                        <i class=\"fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400\"></i>\r\n");
      out.write("                                        Logout\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </li>\r\n");
      out.write("\r\n");
      out.write("                        </ul>\r\n");
      out.write("\r\n");
      out.write("                    </nav>\r\n");
      out.write("                    <div style=\"padding: 50px\">\r\n");
      out.write("                        <h4 style=\"color: #006dcc\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Admins/Create\">+ Create new</a></h4>\r\n");
      out.write("                        <center>\r\n");
      out.write("                            <h2 style=\"color: #006dcc\">Admin List</h2>\r\n");
      out.write("                            <table id=\"example\" class=\"display\" style=\"width:100%\">\r\n");
      out.write("                                <thead>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <th scope=\"col\" style=\"color: #006dcc\">Id</th>\r\n");
      out.write("                                        <th scope=\"col\" style=\"color: #006dcc\">UserName</th>\r\n");
      out.write("                                        <th scope=\"col\" style=\"color: #006dcc\">Action</th>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                </thead>\r\n");
      out.write("                                <tbody>\r\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                </tbody>\r\n");
      out.write("                            </table>\r\n");
      out.write("                        </center>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Admin/vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("                <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Admin/vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("                <!-- Core plugin JavaScript-->\r\n");
      out.write("                <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Admin/vendor/jquery-easing/jquery.easing.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("                <!-- Custom scripts for all pages-->\r\n");
      out.write("                <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Admin/js/sb-admin-2.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("                <!-- Page level plugins -->\r\n");
      out.write("                <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Admin/vendor/chart.js/Chart.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("                <!-- Page level custom scripts -->\r\n");
      out.write("                <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Admin/js/demo/chart-area-demo.js\"></script>\r\n");
      out.write("                <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Admin/js/demo/chart-pie-demo.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <script src=\"https://code.jquery.com/jquery-3.5.1.js\"></script>\r\n");
      out.write("\r\n");
      out.write("                <script src=\"https://cdn.datatables.net/1.10.21/js/jquery.dataTables.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <script>\r\n");
      out.write("                    $(document).ready(function() {\r\n");
      out.write("                        $('#example').DataTable();\r\n");
      out.write("                    });\r\n");
      out.write("                </script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </body>\r\n");
      out.write("                </html>\r\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.admin.mail == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    ");
        if (_jspx_meth_c_redirect_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_redirect_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:redirect
    org.apache.taglibs.standard.tag.rt.core.RedirectTag _jspx_th_c_redirect_0 = (org.apache.taglibs.standard.tag.rt.core.RedirectTag) _jspx_tagPool_c_redirect_url_nobody.get(org.apache.taglibs.standard.tag.rt.core.RedirectTag.class);
    _jspx_th_c_redirect_0.setPageContext(_jspx_page_context);
    _jspx_th_c_redirect_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_redirect_0.setUrl("/Admins/Login");
    int _jspx_eval_c_redirect_0 = _jspx_th_c_redirect_0.doStartTag();
    if (_jspx_th_c_redirect_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_redirect_url_nobody.reuse(_jspx_th_c_redirect_0);
      return true;
    }
    _jspx_tagPool_c_redirect_url_nobody.reuse(_jspx_th_c_redirect_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.admin.mail != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                        <span class=\"mr-2 d-none d-lg-inline text-gray-600 small\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.admin.mail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span>\r\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.admin.mail == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                        <span class=\"mr-2 d-none d-lg-inline text-gray-600 small\">Login</span>\r\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("i");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                        <tr>\r\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.AId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.mail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                            <td>\r\n");
          out.write("                                                <a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/Admins/Delete?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.AId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><i class=\"fas fa-trash-alt\" aria-hidden=\"true\"></i></a>&nbsp;&nbsp;&nbsp; || &nbsp;&nbsp;&nbsp;\r\n");
          out.write("                                                <a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/Admins/Edit?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.AId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><i class=\"fas fa-pencil-alt\" aria-hidden=\"true\"></i></a>\r\n");
          out.write("                                            </td>\r\n");
          out.write("                                        </tr>\r\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
