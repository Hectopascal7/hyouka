package cn.net.iscream.hyouka.controller;

import cn.net.iscream.hyouka.common.HyoukaServerResponse;
import cn.net.iscream.hyouka.pojo.HyoukaSpecialColumn;
import cn.net.iscream.hyouka.pojo.HyoukaTag;
import cn.net.iscream.hyouka.service.IHyoukaSpecialColumnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ClassName : HyoukaSpecialColumnController
 * Description : 特别专栏控制器
 * Author : Jeanne d'Arc
 * Date : 2020-03-14 16:51
 */
@RestController
public class HyoukaSpecialColumnController {

    @Autowired
    private IHyoukaSpecialColumnService iHyoukaSpecialColumnService;

    @CrossOrigin
    @GetMapping("/api/hyoukaspecialcolumns")
    public HyoukaServerResponse<List<HyoukaSpecialColumn>> list() {
        return iHyoukaSpecialColumnService.list();
    }
}
