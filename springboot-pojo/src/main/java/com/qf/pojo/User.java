package com.qf.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
public class User {
    /**
     * 用户表
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户名称
     */
    private String username;

    /**
     * 用户真实名称
     */
    private String userrealname;

    /**
     * 用户电话
     */
    private String phonenum;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 用户头像
     */
    private String userimg;

    /**
     * 用户和职位多对多
     */
    @ManyToMany
    @JoinTable(name = "userposition", joinColumns = {@JoinColumn(name = "userid")}, inverseJoinColumns = {@JoinColumn(name = "positoinid")})
    private Position position;

    /**
     * 用户和会议通知多对多
     */
    @ManyToMany
    @JoinTable(name = "usernotice", joinColumns = {@JoinColumn(name = "userid")}, inverseJoinColumns = {@JoinColumn(name = "noticeid")})
    private Notice notice;
}
