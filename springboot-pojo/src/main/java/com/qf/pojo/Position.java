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
@Table(name = "positoin")
public class Position {
    /**
     * 职位表
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 职位名称
     */
    private String positionname;

    /**
     * 职位描述
     */
    private String description;

    /**
     * 代表团Id
     */
    @ManyToOne
    private String delegationid;

}
