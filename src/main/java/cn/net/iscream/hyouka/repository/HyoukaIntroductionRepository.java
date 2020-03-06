package cn.net.iscream.hyouka.repository;

import cn.net.iscream.hyouka.pojo.HyoukaIntroduction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface HyoukaIntroductionRepository extends JpaRepository<HyoukaIntroduction, String> {
    HyoukaIntroduction findByIsenableEquals(int i);
}
