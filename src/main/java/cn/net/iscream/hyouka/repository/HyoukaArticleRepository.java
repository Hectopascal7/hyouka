package cn.net.iscream.hyouka.repository;

import cn.net.iscream.hyouka.pojo.HyoukaArticle;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * ClassName : HyoukaArticleRepository
 * Description : 文章实体数据层
 * Author : Jeanne d'Arc
 * Date : 2020-03-07 19:43
 */
public interface HyoukaArticleRepository extends JpaRepository<HyoukaArticle, String> {
    HyoukaArticle findByCategoryAndArticleid(String categoryName, String articleId);
}
