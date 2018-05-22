package cn.lt.core.console.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 后台管理
 */
@Controller
public class CenterController {
//
//    @Autowired
//    private TestTBService testTBService;


    /**
     * ModelAndView  :页面+数据
     * void : 异步请求
     * String : 仅跳转
     * @return
     */
    @RequestMapping(value = "/test/index.do")
    public String testindex(Model model){
        return "index";
    }



}
