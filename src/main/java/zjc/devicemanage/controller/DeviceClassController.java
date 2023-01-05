package zjc.devicemanage.controller;

import com.google.gson.Gson;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zjc.devicemanage.org.model.Deviceclass;
import zjc.devicemanage.service.DeviceclaccService;
import zjc.devicemanage.util.Tool;

import java.util.List;

@Api(value = "设备分类服务",description = "简单的评价服务，提供添加、查询")
@RestController
@RequestMapping(produces = "application/json; charset=utf-8")
public class DeviceClassController {

    @Autowired
    DeviceclaccService deviceClassService;

    @ApiOperation("添加新的设备分类")
    @GetMapping(value = "addDeviceClass")
    public String addDeviceClass(Deviceclass deviceclass){
        deviceClassService.addDeviceclass(deviceclass);
        Gson gson = new Gson();
        System.out.println("deviceclass"+gson.toJson(deviceclass));
        System.out.println(gson.toJson("添加设备分类成功"));
        return gson.toJson("success");
    }

    @ApiOperation("修改设备分类")
    @GetMapping(value = "updateDeviceClass")
    public String updateDeviceClass(Deviceclass deviceclass){
        deviceClassService.updateDeviceclass(deviceclass);
        Gson gson = new Gson();
        System.out.println("deviceclass"+gson.toJson(deviceclass));
        System.out.println(gson.toJson("修改设备分类成功"));
        return gson.toJson("success");
    }

    @ApiOperation("删除设备分类设备分类")
    @GetMapping(value = "deletDeviceClass/deviceclassId={deviceclassId}")
    public String deletDeviceClass(@PathVariable("deviceclassId") Integer deviceclassId){
        deviceClassService.deleteDeviceclass(deviceclassId);
        Gson gson = new Gson();
        System.out.println("deviceclass"+deviceclassId);
        System.out.println(gson.toJson("删除设备分类成功"));
        return gson.toJson("success");
    }

    @ApiOperation("查找设备分类")
    @GetMapping(value = "getDeviceClass/deviceclassId={deviceclassId}")
    public Deviceclass getDeviceClass(@PathVariable("deviceclassId") Integer deviceclassId){
        Deviceclass deviceclass = deviceClassService.findOneDeviceclassByDeviceId(deviceclassId);
        System.out.println(deviceclass);
        return deviceclass;
    }

    @ApiOperation("查找所有设备分类")
    @GetMapping("getAllDeviceClass")
    public String getAllDeviceClass(Deviceclass deviceclass){
        List<Deviceclass> allDeviceclass = deviceClassService.findAllDeviceclass();
        return new Tool().GsonTool1(allDeviceclass);
    }
}
