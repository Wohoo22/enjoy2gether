/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-09-18 06:29:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homePage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<title>Enjoy2gether</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/styles/homePage.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/styles/topnav.css\">\r\n");
      out.write("<link rel=\"icon\"\r\n");
      out.write("\thref=\"https://www.clipartmax.com/png/middle/21-210980_green-letter-e-clip-art-green-letter-e-clipart.png\">\r\n");
      out.write("<link rel=\"icon\"\r\n");
      out.write("\thref=\"https://www.clipartmax.com/png/middle/21-210980_green-letter-e-clip-art-green-letter-e-clipart.png\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "topNav.jsp", out, false);
      out.write("\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"label\">\r\n");
      out.write("\t\t\t<h1>ENJOY2GETHER</h1>\r\n");
      out.write("\t\t\t<a>Nền tảng chia sẻ - mua chung tài khoản Netflix.</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"group\"\r\n");
      out.write("\t\t\t\tstyle=\"box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);\">\r\n");
      out.write("\t\t\t\t<div class=\"name\">ĐIỂM NỔI BẬT</div>\r\n");
      out.write("\t\t\t\t<div class=\"users\">+ Sự bảo mật, tin tưởng cho người dùng.</div>\r\n");
      out.write("\t\t\t\t<div class=\"users\">+ Thanh toán dễ dàng, nhanh chóng.</div>\r\n");
      out.write("\t\t\t\t<div class=\"users\">+ Đặt lợi ích người dùng lên hàng đầu.</div>\r\n");
      out.write("\t\t\t\t<div class=\"users\">+ Admin luôn có mặt để quản lý và hỗ trợ.</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"group\"\r\n");
      out.write("\t\t\t\tstyle=\"box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);\">\r\n");
      out.write("\t\t\t\t<div class=\"name\">\r\n");
      out.write("\t\t\t\t\t<a>MỨC GIÁ</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"users\">\r\n");
      out.write("\t\t\t\t\t<b>NETFLIX: </b>75k/slot/tháng\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"users\">+ Tài khoản Netflix được đăng kí hoàn toàn\r\n");
      out.write("\t\t\t\t\tchính thống, không thay đổi hàng tháng</div>\r\n");
      out.write("\t\t\t\t<div class=\"users\">+ Người dùng chỉ việc nạp tiền vào hệ thống\r\n");
      out.write("\t\t\t\t\tvà dùng. Còn mọi việc cứ để admin lo.</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"group\"\r\n");
      out.write("\t\t\t\tstyle=\"box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24); width: 100%; border-top: 10px solid #76b852; height: auto\">\r\n");
      out.write("\t\t\t\t<div class=\"name\">\r\n");
      out.write("\t\t\t\t\t<a>GIỚI THIỆU</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"users\" style=\"border-bottom: 1px solid #76b852;\">Nhận\r\n");
      out.write("\t\t\t\t\tthấy tình trạng bán tài khoản trial, tài khoản dùng thẻ ăn cắp của\r\n");
      out.write("\t\t\t\t\tNetflix với giá siêu rẻ tràn lan trên Facebook kéo theo rất nhiều\r\n");
      out.write("\t\t\t\t\trủi ro cho người mua nên mình tạo ra hệ thống với sự ưu tiên hàng\r\n");
      out.write("\t\t\t\t\tđầu là bảo đảm cho người dùng, nhằm kết nối những người có nhu cầu\r\n");
      out.write("\t\t\t\t\txem Netflix đơn lẻ nhưng không có bạn mua chung.</div>\r\n");
      out.write("\t\t\t\t<div class=\"users\">\r\n");
      out.write("\t\t\t\t\t<b>Cơ chế hoạt động của website: </b>Người dùng có thể tạo\r\n");
      out.write("\t\t\t\t\tnhóm/tham gia nhóm có sẵn. Khi nhóm đã đủ số lượng người (nhóm\r\n");
      out.write("\t\t\t\t\tNetflix thì 5 người/nhóm = 5 slot/tài khoản) và các thành viên của\r\n");
      out.write("\t\t\t\t\tnhóm đã nạp tiền vào hệ thống, admin sẽ tạo tài khoản Netflix và\r\n");
      out.write("\t\t\t\t\tupdate lên hệ thống cho nhóm ấy.\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"users\" style=\"border-bottom: 1px solid #76b852;\">\r\n");
      out.write("\t\t\t\t\t<b>Lưu ý: </b>Mình chỉ nhận nạp tiền đúng 1 tháng cho các bạn, mình\r\n");
      out.write("\t\t\t\t\tk nạp nhiều hơn trong 1 lượt, hết hạn các bạn muốn xem tiếp thì nạp\r\n");
      out.write("\t\t\t\t\ttiếp, điều này nhằm bảo đảm tối đa quyền lợi cho người dùng.\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"users\" style=\"border-bottom: 1px solid #76b852;\">Trong\r\n");
      out.write("\t\t\t\t\tquá trình sử dụng, nếu có bất cứ vấn đề gì mình sẽ xử lý, nếu không\r\n");
      out.write("\t\t\t\t\txử lý được mình sẽ hoàn tiền, nhưng xác suất xảy ra lỗi rất thấp.</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div\r\n");
      out.write("\t\t\t\tstyle=\"box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24); width: 100%; border-top: 10px solid #76b852; height: auto\">\r\n");
      out.write("\t\t\t\t<div class=\"contact\">\r\n");
      out.write("\t\t\t\t\t<a style=\"float: left; color: white;\"\r\n");
      out.write("\t\t\t\t\t\thref=\"https://www.facebook.com/profile.php?id=100014609199798\"\r\n");
      out.write("\t\t\t\t\t\ttarget=\"_blank\">FACEBOOK ADMIN</a><a\r\n");
      out.write("\t\t\t\t\t\tstyle=\"float: right; color: white;\"\r\n");
      out.write("\t\t\t\t\t\thref=\"https://www.facebook.com/enj0y2gether/\" target=\"_blank\">FACEBOOK\r\n");
      out.write("\t\t\t\t\t\tFANPAGE </a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"credit\">2020 © Designed by enjoy2gether</div>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tdocument.getElementsByName(\"homePage\")[0].style.backgroundColor = \"#4caf50\";\r\n");
      out.write("\t\tdocument.getElementsByName(\"homePage\")[0].style.color = \"white\";\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
