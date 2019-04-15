package com.esri.controller;

import com.esri.pojo.China;
import com.esri.service.CityService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@Api("中国地理信息系统相关api")
@RequestMapping("china")
public class CityController {
    @Autowired
    private CityService cityService;
    @ApiOperation(value = "保存中国地理信息",notes = "保存中国地理信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name",value = "名称",paramType="query",required = true,dataType = "String"),
            @ApiImplicitParam(name = "geom",value = "地理信息",paramType="query",required = true,dataType = "String")
    })
    @RequestMapping(value = "add",method = RequestMethod.POST)
    public void add (@RequestParam("name") String name,
                     @RequestParam("geom") String geom){
        China china = new China();
        china.setId(UUID.randomUUID().toString());
        china.setName(name);
        china.setGeom(geom);
        cityService.add(china);
    }
}
