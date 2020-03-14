package cn.net.iscream.hyouka.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ClassName : SpecialColumn
 * Description : 特别专栏实体类
 * Author : Jeanne d'Arc
 * Date : 2020-03-14 16:44
 */
@Entity
@Table(name = "hyouka_specialcolumn")
@JsonIgnoreProperties({"handler", "hibernateLazyInitializer"})
public class HyoukaSpecialColumn {
    @Id
    @Column(name = "columnid")
    String columnid;

    String name;
    String operate;
    String link;
    String cover;
    String order;

    public HyoukaSpecialColumn() {
    }

    public String getColumnid() {
        return columnid;
    }

    public void setColumnid(String columnid) {
        this.columnid = columnid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOperate() {
        return operate;
    }

    public void setOperate(String operate) {
        this.operate = operate;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }
}
