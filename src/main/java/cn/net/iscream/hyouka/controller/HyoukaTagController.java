package cn.net.iscream.hyouka.controller;

import cn.net.iscream.hyouka.common.HyoukaServerResponse;
import cn.net.iscream.hyouka.pojo.HyoukaTag;
import cn.net.iscream.hyouka.service.IHyoukaTagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ClassName : HyoukaTagController
 * Description : 标签实体控制器
 * Author : Jeanne d'Arc
 * Date : 2020-03-05 23:30
 */
@RestController
public class HyoukaTagController {

    @Autowired
    private IHyoukaTagService iHyoukaTagService;

    @CrossOrigin
    @GetMapping("/api/hyoukatags")
    public HyoukaServerResponse<List<HyoukaTag>> list() {
        return iHyoukaTagService.list();
    }

}
