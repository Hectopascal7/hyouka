package cn.net.iscream.hyouka.controller;

import cn.net.iscream.hyouka.common.HyoukaServerResponse;
import cn.net.iscream.hyouka.pojo.HyoukaArticle;
import cn.net.iscream.hyouka.pojo.HyoukaIntroduction;
import cn.net.iscream.hyouka.service.IHyoukaArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName : HyoukaArticleController
 * Description : 文章实体控制器
 * Author : Jeanne d'Arc
 * Date : 2020-03-07 19:42
 */
@RestController
public class HyoukaArticleController {

    @Autowired
    private IHyoukaArticleService iHyoukaArticleService;

    @CrossOrigin
    @GetMapping("/api/hyoukaarticle/{category}/{articleid}")
    public HyoukaServerResponse<HyoukaArticle> find(@PathVariable("category") String categoryName, @PathVariable("articleid") String articleId) {
        return iHyoukaArticleService.findByCategoryAndArticleid(categoryName, articleId);
    }


}
