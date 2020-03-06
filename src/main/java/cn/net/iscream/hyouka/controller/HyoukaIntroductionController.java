package cn.net.iscream.hyouka.controller;

import cn.net.iscream.hyouka.pojo.HyoukaIntroduction;
import cn.net.iscream.hyouka.pojo.HyoukaMenu;
import cn.net.iscream.hyouka.service.IHyoukaIntroductionService;
import cn.net.iscream.hyouka.service.IHyoukaMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ClassName : HyoukaIntroductionController
 * Description : 个人简介控制器
 * Author : Jeanne d'Arc
 * Date : 2020-03-06 19:47
 */
@RestController
public class HyoukaIntroductionController {

    @Autowired
    private IHyoukaIntroductionService iHyoukaIntroductionService;

    @CrossOrigin
    @GetMapping("/api/hyoukaintroduction")
    public HyoukaIntroduction find() {
        return iHyoukaIntroductionService.find();
    }

}
