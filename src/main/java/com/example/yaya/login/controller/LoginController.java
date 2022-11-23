//package com.example.yaya.login.controller;
//
//import com.example.yaya.login.model.User;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.servlet.http.HttpServletRequest;
//
//@RestController
//public class LoginController {
//    @RequestMapping("/index")
//    public String showindex(){
//        return "index";
//    }
//    @RequestMapping("/login")
//    public String showlogin(){
//        return "login";
//    }
//    @RequestMapping("/yanzheng")
//    //也可以添加标注@ResponseBody 返回数据给页面（js跳转）
//    public String yanzheng(User user , HttpServletRequest request){
//        if("1234".equals(user.getUserPasswd())){
//            request.getSession().setAttribute("users", user.getUserName());
//            //先添加到session,在跳转
//            return "index";
//        }else {
//            return "login";
//        }
//    }
//}
