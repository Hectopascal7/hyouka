package cn.net.iscream.hyouka.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ClassName : HyoukaLink
 * Description : 友情链接实体类
 * Author : Jeanne d'Arc
 * Date : 2020-03-14 22:10
 */
@Entity
@Table(name = "hyouka_link")
@JsonIgnoreProperties({"handler", "hibernateLazyInitializer"})
public class HyoukaLink {

    @Id
    @Column(name = "linkid")
    String linkid;

    String linkname;
    String linkurl;

    public HyoukaLink() {
    }

    public String getLinkid() {
        return linkid;
    }

    public void setLinkid(String linkid) {
        this.linkid = linkid;
    }

    public String getLinkname() {
        return linkname;
    }

    public void setLinkname(String linkname) {
        this.linkname = linkname;
    }

    public String getLinkurl() {
        return linkurl;
    }

    public void setLinkurl(String linkurl) {
        this.linkurl = linkurl;
    }
}
