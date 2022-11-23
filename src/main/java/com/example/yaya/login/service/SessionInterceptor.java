//package com.example.yaya.login.service;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import org.springframework.web.servlet.HandlerInterceptor;
//import org.springframework.web.servlet.ModelAndView;
//
//public class SessionInterceptor implements HandlerInterceptor {
//    @Override
//    public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
//            throws Exception {
//    }
//    @Override
//    public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
//            throws Exception {
//    }
//    @Override
//    public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
//        // normal url
//        if ("/yanzheng".equals(arg0.getRequestURI()) || "/login".equals(arg0.getRequestURI())) {
//            return true;}
//        // forbidden url
//        Object object = arg0.getSession().getAttribute("users");
//        if (null == object) {
//            arg1.sendRedirect("/login");
//            return false;}
//        return true;
//    }
//}
