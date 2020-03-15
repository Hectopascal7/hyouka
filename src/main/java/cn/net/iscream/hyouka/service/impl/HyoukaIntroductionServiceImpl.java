package cn.net.iscream.hyouka.service.impl;

import cn.net.iscream.hyouka.common.HyoukaConst;
import cn.net.iscream.hyouka.common.HyoukaServerResponse;
import cn.net.iscream.hyouka.pojo.HyoukaIntroduction;
import cn.net.iscream.hyouka.repository.HyoukaIntroductionRepository;
import cn.net.iscream.hyouka.service.IHyoukaIntroductionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName : HyoukaIntroductionServiceImpl
 * Description : 个人简介实体服务实现
 * Author : Jeanne d'Arc
 * Date : 2020-03-06 19:48
 */
@Service
public class HyoukaIntroductionServiceImpl implements IHyoukaIntroductionService {

    @Autowired
    private HyoukaIntroductionRepository hyoukaIntroductionRepository;

    @Override
    public HyoukaServerResponse<HyoukaIntroduction> find() {
        HyoukaIntroduction hyoukaIntroduction = hyoukaIntroductionRepository.findByIsenableEquals(HyoukaConst.HYOUKA_INTRODUCTION_STATUS_ENABLE);
        return HyoukaServerResponse.createBySuccess(hyoukaIntroduction);
    }

}
