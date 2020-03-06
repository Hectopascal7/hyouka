package cn.net.iscream.hyouka.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ClassName : HyoukaIntroduction
 * Description : 个人简介实体类
 * Author : Jeanne d'Arc
 * Date : 2020-03-06 19:44
 */
@Entity
@Table(name = "hyouka_introduction")
@JsonIgnoreProperties({"handler", "hibernateLazyInitializer"})
public class HyoukaIntroduction {

    @Id
    @Column(name = "introductionid")
    String introductionid;

    String avatar;
    String nickname;
    String role;
    String content;
    Integer isenable;

    public HyoukaIntroduction() {
    }

    public String getIntroductionid() {
        return introductionid;
    }

    public void setIntroductionid(String introductionid) {
        this.introductionid = introductionid;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getIsenable() {
        return isenable;
    }

    public void setIsenable(Integer isenable) {
        this.isenable = isenable;
    }
}
