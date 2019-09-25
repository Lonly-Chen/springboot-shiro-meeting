package com.qf.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "news")
public class News {
    /**
     * 会议新闻
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
     * 会议新闻详情地址
     */
    private String newsurl;

    /**
     * 会议新闻类别
     */
    private String type;

    /**
     * 会议新闻缩略图
     */
    private String newsimg;


}
