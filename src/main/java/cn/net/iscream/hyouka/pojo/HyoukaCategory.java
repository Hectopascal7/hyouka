package cn.net.iscream.hyouka.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ClassName : HyoukaCategory
 * Description : 文章类别实体
 * Author : Jeanne d'Arc
 * Date : 2020-03-07 19:52
 */
@Entity
@Table(name = "hyouka_category")
@JsonIgnoreProperties({"handler", "hibernateLazyInitializer"})
public class HyoukaCategory {

    @Id
    @Column(name = "categoryid")
    String categoryid;

    String name;

    public String getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(String categoryid) {
        this.categoryid = categoryid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
