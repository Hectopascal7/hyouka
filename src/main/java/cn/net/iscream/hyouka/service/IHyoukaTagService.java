package cn.net.iscream.hyouka.service;

import cn.net.iscream.hyouka.common.HyoukaServerResponse;
import cn.net.iscream.hyouka.pojo.HyoukaTag;

import java.util.List;

/**
 * ClassName : HyoukaTagServiceImpl
 * Description : 标签实体服务接口
 * Author : Jeanne d'Arc
 * Date : 2020-03-05 23:29
 */
public interface IHyoukaTagService {

    HyoukaServerResponse<List<HyoukaTag>> list();

}
