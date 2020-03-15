package cn.net.iscream.hyouka.service;

import cn.net.iscream.hyouka.common.HyoukaServerResponse;
import cn.net.iscream.hyouka.pojo.HyoukaIntroduction;
import cn.net.iscream.hyouka.pojo.HyoukaMenu;

import java.util.List;

public interface IHyoukaMenuService {

    HyoukaServerResponse<List<HyoukaMenu>> list();

}
