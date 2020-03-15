package cn.net.iscream.hyouka.service;

import cn.net.iscream.hyouka.common.HyoukaServerResponse;
import cn.net.iscream.hyouka.pojo.HyoukaIntroduction;

/**
 * ClassName : HyoukaIntroductionServiceImpl
 * Description : 个人简介实体接口
 * Author : Jeanne d'Arc
 * Date : 2020-03-06 19:48
 */
public interface IHyoukaIntroductionService {

    HyoukaServerResponse<HyoukaIntroduction> find();

}
