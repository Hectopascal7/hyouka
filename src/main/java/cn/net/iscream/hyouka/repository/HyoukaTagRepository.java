package cn.net.iscream.hyouka.repository;

import cn.net.iscream.hyouka.pojo.HyoukaTag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * ClassName : HyoukaTagRepository
 * Description : 标签实体数据层
 * Author : Jeanne d'Arc
 * Date : 2020-03-05 23:32
 */
@Repository
public interface HyoukaTagRepository extends JpaRepository<HyoukaTag, String> {
}
