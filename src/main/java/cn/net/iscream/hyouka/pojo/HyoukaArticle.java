package cn.net.iscream.hyouka.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * ClassName : HyoukaArticle
 * Description : 文章实体类
 * Author : Jeanne d'Arc
 * Date : 2020-03-07 19:34
 */
@Entity
@Table(name = "hyouka_article")
@JsonIgnoreProperties({"handler", "hibernateLazyInitializer"})
public class HyoukaArticle {

    @Id
    @Column(name = "articleid")
    String articleid;

    String title;
    String cover;
    String preface;
    String content;
    String category;
    String tagid;
    Date uploadtime;
    Integer pageview;
    Integer like;
    Integer number;

    public HyoukaArticle() {
    }

    @Override
    public String toString() {
        return "HyoukaArticle{" +
                "articleid='" + articleid + '\'' +
                ", title='" + title + '\'' +
                ", cover='" + cover + '\'' +
                ", preface='" + preface + '\'' +
                ", content='" + content + '\'' +
                ", category='" + category + '\'' +
                ", tagid='" + tagid + '\'' +
                ", uploadtime=" + uploadtime +
                ", pageview=" + pageview +
                ", like=" + like +
                ", number=" + number +
                '}';
    }

    public String getArticleid() {
        return articleid;
    }

    public void setArticleid(String articleid) {
        this.articleid = articleid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getPreface() {
        return preface;
    }

    public void setPreface(String preface) {
        this.preface = preface;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTagid() {
        return tagid;
    }

    public void setTagid(String tagid) {
        this.tagid = tagid;
    }

    public Date getUploadtime() {
        return uploadtime;
    }

    public void setUploadtime(Date uploadtime) {
        this.uploadtime = uploadtime;
    }

    public Integer getPageview() {
        return pageview;
    }

    public void setPageview(Integer pageview) {
        this.pageview = pageview;
    }

    public Integer getLike() {
        return like;
    }

    public void setLike(Integer like) {
        this.like = like;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
