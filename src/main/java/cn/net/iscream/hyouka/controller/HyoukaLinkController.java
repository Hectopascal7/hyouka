package cn.net.iscream.hyouka.controller;

import cn.net.iscream.hyouka.common.HyoukaServerResponse;
import cn.net.iscream.hyouka.pojo.HyoukaLink;
import cn.net.iscream.hyouka.pojo.HyoukaMenu;
import cn.net.iscream.hyouka.service.IHyoukaLinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ClassName : HyoukaLinkController
 * Description : 友情链接控制器
 * Author : Jeanne d'Arc
 * Date : 2020-03-14 22:12
 */
@RestController
public class HyoukaLinkController {

    @Autowired
    private IHyoukaLinkService iHyoukaLinkService;

    @CrossOrigin
    @GetMapping("/api/hyoukalinks")
    public HyoukaServerResponse<List<HyoukaLink>> list() {
        return iHyoukaLinkService.list();
    }

}
