package com.qf.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "material")
public class Material {
    /**
     * 会议资料
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 会议名称
     */
    private String meetingname;

    /**
     * 会议描述
     */
    private String meetingdescription;

    /**
     * 会议资料的详情地址
     */
    private String materialurl;

    /**
     * 会议通知ID
     */
    @OneToOne
    private String noticeid;
}
