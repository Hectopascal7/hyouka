package cn.net.iscream.hyouka.service;

import cn.net.iscream.hyouka.pojo.HyoukaArticle;
import cn.net.iscream.hyouka.pojo.HyoukaIntroduction;

/**
 * ClassName : IHyoukaArticleService
 * Description : 文章实体服务接口
 * Author : Jeanne d'Arc
 * Date : 2020-03-07 19:45
 */
public interface IHyoukaArticleService {
    HyoukaArticle findByCategoryAndArticleid(String categoryName, String articleId);
}
