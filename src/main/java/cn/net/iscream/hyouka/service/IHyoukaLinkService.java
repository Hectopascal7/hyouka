package cn.net.iscream.hyouka.service;

import cn.net.iscream.hyouka.common.HyoukaServerResponse;
import cn.net.iscream.hyouka.pojo.HyoukaLink;

import java.util.List;

/**
 * ClassName : IHyoukaLinkService
 * Description : 友情链接实体服务接口
 * Author : Jeanne d'Arc
 * Date : 2020-03-14 22:14
 */
public interface IHyoukaLinkService {

    HyoukaServerResponse<List<HyoukaLink>> list();

}
