package cn.net.iscream.hyouka.service.impl;

import cn.net.iscream.hyouka.common.HyoukaServerResponse;
import cn.net.iscream.hyouka.pojo.HyoukaTag;
import cn.net.iscream.hyouka.repository.HyoukaMenuRepository;
import cn.net.iscream.hyouka.repository.HyoukaTagRepository;
import cn.net.iscream.hyouka.service.IHyoukaTagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName : HyoukaTagServiceImpl
 * Description : 标签实体服务实现
 * Author : Jeanne d'Arc
 * Date : 2020-03-05 23:29
 */
@Service
public class HyoukaTagServiceImpl implements IHyoukaTagService {

    @Autowired
    private HyoukaTagRepository hyoukaTagRepository;

    @Override
    public HyoukaServerResponse<List<HyoukaTag>> list() {
        List<HyoukaTag> hyoukaTagList = hyoukaTagRepository.findAll();
        return HyoukaServerResponse.createBySuccess(hyoukaTagList);
    }

}
