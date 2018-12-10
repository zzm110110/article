package com.runrunfast.Article.mapper;

import com.runrunfast.Article.pojo.Doctor;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * <p>@Author: james</p>
 * <p>@Description: mongodb持久层</P>
 * <p>@Date: 创建日期 2018/12/6 14:13</P>
 * <p>@version V1.0</p>
 **/
public interface DoctorRepository extends MongoRepository<Doctor,String> {

}
