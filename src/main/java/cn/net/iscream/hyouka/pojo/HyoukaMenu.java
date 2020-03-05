package cn.net.iscream.hyouka.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

/**
 * ClassName : HyoukaMenu
 * Description : 菜单实体类
 * Author : Jeanne d'Arc
 * Date : 2020-03-05 21:48
 */
@Entity
@Table(name = "hyouka_menu")
@JsonIgnoreProperties({"handler", "hibernateLazyInitializer"})
public class HyoukaMenu {
    @Id
    @Column(name = "menuid")
    String menuid;

    String menuname;
    String menuurl;
    String menulevel;
    String parentid;
    int menuorder;

    public HyoukaMenu() {
    }

    public String getMenuid() {
        return menuid;
    }

    public void setMenuid(String menuid) {
        this.menuid = menuid;
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname;
    }

    public String getMenuurl() {
        return menuurl;
    }

    public void setMenuurl(String menuurl) {
        this.menuurl = menuurl;
    }

    public String getMenulevel() {
        return menulevel;
    }

    public void setMenulevel(String menulevel) {
        this.menulevel = menulevel;
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid;
    }

    public int getMenuorder() {
        return menuorder;
    }

    public void setMenuorder(int menuorder) {
        this.menuorder = menuorder;
    }
}
