package cn.net.iscream.hyouka.repository;

import cn.net.iscream.hyouka.pojo.HyoukaLink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HyoukaLinkRepository extends JpaRepository<HyoukaLink, String> {
}
