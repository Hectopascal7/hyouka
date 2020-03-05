package cn.net.iscream.hyouka.controller;

import cn.net.iscream.hyouka.pojo.HyoukaMenu;
import cn.net.iscream.hyouka.service.IHyoukaMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ClassName : HyoukaMenuController
 * Description : 菜单控制器
 * Author : Jeanne d'Arc
 * Date : 2020-03-05 21:54
 */
@RestController
public class HyoukaMenuController {

    @Autowired
    private IHyoukaMenuService iHyoukaMenuService;

    @CrossOrigin
    @GetMapping("/api/hyoukamenus")
    public List<HyoukaMenu> list() {
        return iHyoukaMenuService.list();
    }


}
