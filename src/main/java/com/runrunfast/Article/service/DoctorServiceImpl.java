package com.runrunfast.Article.service;

import com.runrunfast.Article.mapper.DoctorRepository;
import com.runrunfast.Article.pojo.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>@Author: james</p>
 * <p>@Description: 添加说明</P>
 * <p>@Date: 创建日期 2018/12/6 14:20</P>
 * <p>@version V1.0</p>
 **/
@Service
public class DoctorServiceImpl {

    @Autowired
    private DoctorRepository doctorRepository;
    
    /*** \_____________________________/
     * <p>@author       |   James</p>
     * <p>@param        |   null  </p>
     * <p>@return       |   </P>
     * <p>@date         |   2018/12/6 14:21</P>
     * <p>@description  |   添加说明</p>
     ***/
    public Doctor findById(String doctorId){
        return doctorRepository.findById(doctorId).get();
    }

    /*** \_____________________________/
     * <p>@author       |   James</p>
     * <p>@param        |     </p>
     * <p>@return       |   java.util.List<com.runrunfast.Article.pojo.Doctor></P>
     * <p>@date         |   2018/12/6 14:33</P>
     * <p>@description  |   获取所有医生的数据</p>
     ***/
    public List<Doctor> findAll(){
        return doctorRepository.findAll();
    }

    /*** \_____________________________/
     * <p>@author       |   James</p>
     * <p>@param        |   id:医生id </p>
     * <p>@return       |   void</P>
     * <p>@date         |   2018/12/6 14:33</P>
     * <p>@description  |   删除单条数据</p>
     ***/
    public void delete(String id){
        doctorRepository.deleteById(id);
    }

    /*** \_____________________________/
     * <p>@author       |   James</p>
     * <p>@param        |   customer  </p>
     * <p>@return       |   void</P>
     * <p>@date         |   2018/12/6 14:33</P>
     * <p>@description  |   新增单条数据</p>
     ***/
    public void inserOne(Doctor doctor){
        doctorRepository.insert(doctor);
    }

    /*** \_____________________________/
     * <p>@author       |   James</p>
     * <p>@param        |   customer  </p>
     * <p>@return       |   void</P>
     * <p>@date         |   2018/12/6 14:33</P>
     * <p>@description  |   批量新增数据</p>
     ***/
    public void inserList(List<Doctor> customer){
        doctorRepository.insert(customer);
    }
}
