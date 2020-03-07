package cn.net.iscream.hyouka.service.impl;

import cn.net.iscream.hyouka.pojo.HyoukaArticle;
import cn.net.iscream.hyouka.pojo.HyoukaIntroduction;
import cn.net.iscream.hyouka.repository.HyoukaArticleRepository;
import cn.net.iscream.hyouka.service.IHyoukaArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName : HyoukaArticleServiceImpl
 * Description : 文章实体服务实现
 * Author : Jeanne d'Arc
 * Date : 2020-03-07 19:45
 */
@Service
public class HyoukaArticleServiceImpl implements IHyoukaArticleService {

    @Autowired
    private HyoukaArticleRepository hyoukaArticleRepository;


    @Override
    public HyoukaArticle findByCategoryAndArticleid(String categoryName, String articleId) {
        return hyoukaArticleRepository.findByCategoryAndArticleid(categoryName, articleId);
    }
}
