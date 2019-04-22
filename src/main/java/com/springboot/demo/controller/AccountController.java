package com.springboot.demo.controller;


import com.springboot.demo.model.Account;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AccountController {

    @GetMapping("/accountIndex")
    public String Index(Model m){
        List<Account> list = new ArrayList<>();
        list.add(new Account(1,"KangKang", "康康", "e10adc3949ba59abbe56e", "超级管理员", "17777777777"));
        list.add(new Account(2,"Mike", "麦克", "e10adc3949ba59abbe56e", "管理员", "13444444444"));
        list.add(new Account(3,"Jane","简","e10adc3949ba59abbe56e","运维人员","18666666666"));
        list.add(new Account(4,"Maria", "玛利亚", "e10adc3949ba59abbe56e", "清算人员", "19999999999"));
        m.addAttribute("accountList",list);
        return "account";
    }
}
