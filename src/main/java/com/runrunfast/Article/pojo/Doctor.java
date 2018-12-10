package com.runrunfast.Article.pojo;

import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * <p>@Author: james</p>
 * <p>@Description: 添加说明</P>
 * <p>@Date: 创建日期 2018/12/6 14:11</P>
 * <p>@version V1.0</p>
 **/
@Data
public class Doctor {
    /**
     * 医生编号 @Id：mongodb会自动生成id，这里代码无须生成
     */
    @Id
    public String doctorId;
    /**
     * 医生姓名
     */
    public String doctorName;
    /**
     * 医生性别
     */
    public String docktorSex;
}
