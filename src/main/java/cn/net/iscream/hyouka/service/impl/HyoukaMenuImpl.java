package cn.net.iscream.hyouka.service.impl;

import cn.net.iscream.hyouka.common.HyoukaServerResponse;
import cn.net.iscream.hyouka.pojo.HyoukaMenu;
import cn.net.iscream.hyouka.repository.HyoukaMenuRepository;
import cn.net.iscream.hyouka.service.IHyoukaMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName : HyoukaMenuImpl
 * Description : 菜单实体服务实现
 * Author : Jeanne d'Arc
 * Date : 2020-03-05 21:55
 */
@Service
public class HyoukaMenuImpl implements IHyoukaMenuService {

    @Autowired
    private HyoukaMenuRepository hyoukaMenuRepository;

    @Override
    public HyoukaServerResponse<List<HyoukaMenu>> list() {
        List<HyoukaMenu> hyoukaMenuList = hyoukaMenuRepository.findAll(Sort.by(Sort.Direction.ASC, "menuorder"));
        return HyoukaServerResponse.createBySuccess(hyoukaMenuList);
    }

}
