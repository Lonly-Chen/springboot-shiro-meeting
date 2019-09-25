package com.qf.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "seat")
public class Seat {
    /**
     * 座次安排表
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 会议名称
     */
    private String meetingname;

    /**
     * 会议时间
     */
    private Date meetingtime;

    /**
     * 会议地点
     */
    private String meetingarea;

    /**
     * 座次安排
     */
    private String seatarea;

    /**
     * 会议通知ID
     */
    @OneToOne
    private String noticeid;

}
