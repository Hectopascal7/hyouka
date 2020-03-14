package cn.net.iscream.hyouka.service.impl;

import cn.net.iscream.hyouka.pojo.HyoukaLink;
import cn.net.iscream.hyouka.repository.HyoukaLinkRepository;
import cn.net.iscream.hyouka.service.IHyoukaLinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName : HyoukaLinkServiceImpl
 * Description : 友情链接实体服务实现
 * Author : Jeanne d'Arc
 * Date : 2020-03-14 22:14
 */
@Service
public class HyoukaLinkServiceImpl implements IHyoukaLinkService {

    @Autowired
    private HyoukaLinkRepository hyoukaLinkRepository;

    @Override
    public List<HyoukaLink> list() {
        return hyoukaLinkRepository.findAll();
    }
}
