package com.wanshan.tuanyuan.entity;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "t_account")
public class Account  implements Serializable {

    @GenericGenerator(name = "idGenerator", strategy = "uuid")
    @GeneratedValue(generator = "idGenerator")
    @Id
    @Column(name = "c_id")
    private String id;

    @Column(name="c_username")
    private String username;

    @Column(name = "c_password")
    private String password;

    @Column(name = "c_sex")
    private String sex;

    @Column(name = "c_age")
    private String age;

    @Column(name="c_mobile")
    private String mobile;

    @Column(name = "c_del")
    private String del;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getDel() {
        return del;
    }

    public void setDel(String del) {
        this.del = del;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
