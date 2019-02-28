package com.jk.web;

import com.jk.entity.TbOrder;
import com.jk.service.PinyougouService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class PinyougouController {
    @Resource
    PinyougouService  pinyougouService;

    @RequestMapping("/")
    public String index(){return "redirect:/list";}

    @RequestMapping("/list")
    public String list(Model model){
        List<TbOrder> tbOrders=pinyougouService.getTbOrderList();
         model.addAttribute(  "tbOrders", tbOrders);
         return "user/list";
    }
    @RequestMapping("/toAdd")
    public String toAdd(){
        return "user/orderAdd";

    }
    @RequestMapping("/add")
    public String add(TbOrder tbOrder){
        pinyougouService.save(tbOrder);
        return "redirect:/list";
    }
    @RequestMapping("/toEdit")
    public String toEdit(Model model,Long id){
        TbOrder tbOrder=pinyougouService.findTbOrderById(id);
        model.addAttribute("tbOrder",tbOrder);
        return "user/userEdit";
    }
    @RequestMapping("/edit")
    public String edit(TbOrder tbOrder){
        pinyougouService.edit(tbOrder);
        return "redirect:/list";
    }
    @RequestMapping("/delete")
    public String delete(Long id){
        pinyougouService.delete(id);
        return "redirect:/list";
    }
}
