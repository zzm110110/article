package com.runrunfast.Article.controller;

import com.runrunfast.Article.pojo.Doctor;
import com.runrunfast.Article.service.DoctorServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>@Author: james</p>
 * <p>@Description: 添加说明</P>
 * <p>@Date: 创建日期 2018/12/6 14:34</P>
 * <p>@version V1.0</p>
 **/
@RestController
@RequestMapping("/doctor")
@Api(tags="医生管理",description="<font color='red'>【功能】分页查询、单个查询、按条件查询、查询所有、查询总记录数、单个新增、单个修改、单个删除、批量删除、按条件删除</font>")
public class DoctorController {

    @Autowired
    private DoctorServiceImpl doctorService;

    /*** \_____________________________/
     * <p>@author       |   James</p>
     * <p>@param        |     </p>
     * <p>@return       |   java.util.List<com.runrunfast.Article.pojo.Doctor></P>
     * <p>@date         |   2018/12/6 14:35</P>
     * <p>@description  |   获取所有医生的信息</p>
     ***/
    @PostMapping("/findAll")
    @ApiOperation(value = "分页",notes = "医生分页查询，默认是1页10条记录")
    public List<Doctor> findAll(){
        return doctorService.findAll();
    }



    @PostMapping("/addDoctor")
    @ApiOperation(value = "新增",notes = "医生新增")
    public Doctor addDoctor(Doctor doctor){
        doctorService.inserOne(doctor);
        return doctor;
    }
}
