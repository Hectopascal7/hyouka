package cn.net.iscream.hyouka.service.impl;

import cn.net.iscream.hyouka.common.HyoukaServerResponse;
import cn.net.iscream.hyouka.pojo.HyoukaSpecialColumn;
import cn.net.iscream.hyouka.repository.HyoukaSpecialColumnRepository;
import cn.net.iscream.hyouka.service.IHyoukaSpecialColumnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName : HyoukaSpecialColumnServiceImpl
 * Description : 特别专栏实体服务实现
 * Author : Jeanne d'Arc
 * Date : 2020-03-14 16:54
 */
@Service
public class HyoukaSpecialColumnServiceImpl implements IHyoukaSpecialColumnService {

    @Autowired
    private HyoukaSpecialColumnRepository hyoukaSpecialColumnRepository;

    @Override
    public HyoukaServerResponse<List<HyoukaSpecialColumn>> list() {
        List<HyoukaSpecialColumn> hyoukaSpecialColumnList = hyoukaSpecialColumnRepository.findAll(Sort.by(Sort.Direction.ASC, "order"));
        return HyoukaServerResponse.createBySuccess(hyoukaSpecialColumnList);
    }

}
