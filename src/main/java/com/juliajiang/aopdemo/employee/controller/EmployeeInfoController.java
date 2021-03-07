package com.juliajiang.aopdemo.employee.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.juliajiang.aopdemo.common.BaseAssembler;
import com.juliajiang.aopdemo.common.BaseController;
import com.juliajiang.aopdemo.common.JsonResult;
import com.juliajiang.aopdemo.datapermission.aop.DataPermission;
import com.juliajiang.aopdemo.employee.dto.EmployeeDTO;
import com.juliajiang.aopdemo.employee.dto.EmployeeReq;
import com.juliajiang.aopdemo.employee.repository.EmployeeInfoRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 员工信息表 前端控制器
 * </p>
 *
 * @author jiangfan.julia@gmail.com
 * @since 2021-03-03
 */
@RestController
@RequestMapping("/employee")
public class EmployeeInfoController extends BaseController {

    @Resource
    private EmployeeInfoRepository employeeInfoRepository;

    @PostMapping("/query")
    @DataPermission(tableAlias = "e")
    public JsonResult<IPage<EmployeeDTO>> pageQuery(@RequestBody EmployeeReq req){
        IPage page = employeeInfoRepository.pageQuery(getPage(req), BaseAssembler.toDTO(req, EmployeeDTO.class));
        return JsonResult.build(page);
    }
}
