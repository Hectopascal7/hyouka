package cn.net.iscream.hyouka.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ClassName : HyoukaTag
 * Description : 标签实体类
 * Author : Jeanne d'Arc
 * Date : 2020-03-05 23:23
 */
@Entity
@Table(name = "hyouka_tag")
@JsonIgnoreProperties({"handler", "hibernateLazyInitializer"})
public class HyoukaTag {
    @Id
    @Column(name = "tagid")
    String tagid;

    String tagname;
    String tagcolor;
    String tagkey;

    public HyoukaTag() {
    }

    public String getTagid() {
        return tagid;
    }

    public void setTagid(String tagid) {
        this.tagid = tagid;
    }

    public String getTagname() {
        return tagname;
    }

    public void setTagname(String tagname) {
        this.tagname = tagname;
    }

    public String getTagcolor() {
        return tagcolor;
    }

    public void setTagcolor(String tagcolor) {
        this.tagcolor = tagcolor;
    }

    public String getTagkey() {
        return tagkey;
    }

    public void setTagkey(String tagkey) {
        this.tagkey = tagkey;
    }
}
