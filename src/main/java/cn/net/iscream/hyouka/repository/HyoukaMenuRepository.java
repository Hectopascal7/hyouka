package cn.net.iscream.hyouka.repository;

import cn.net.iscream.hyouka.pojo.HyoukaMenu;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * ClassName : HyoukaMenuRepository
 * Description : 菜单实体数据层
 * Author : Jeanne d'Arc
 * Date : 2020-03-05 22:01
 */
public interface HyoukaMenuRepository extends JpaRepository<HyoukaMenu, String> {

}
