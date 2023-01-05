package zjc.devicemanage.controller;

import com.google.gson.Gson;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zjc.devicemanage.org.model.Device;
import zjc.devicemanage.service.DeviceService;
import zjc.devicemanage.util.Tool;

import java.util.List;

@Api(value = "设备服务",description = "提供增删查改操作")
@RestController
@RequestMapping(produces = "application/json; charset=utf-8")

public class DeviceController {
    @Autowired
    DeviceService deviceService;

    @ApiOperation("根据设备名称查找设备")
    @GetMapping(value = "getOneDevice/deviceName={deviceName}")
    public Device getOneDevice(@PathVariable("deviceName")String deviceName){
        Device device= deviceService.findOneDevice(deviceName);
        System.out.println(deviceName);
        return device;
    }

    @ApiOperation("查找所有设备")
    @GetMapping(value = "getAllDevice")
    public String getAllDevice(Device device){
        List<Device> allDevice = deviceService.findAllDevice();
        return new Tool().GsonTool1(allDevice);
    }

    @ApiOperation("根据设备号查找设备")
    @GetMapping(value = "getOneDeviceByDeviceId/deviceId={deviceId}")
    public Device getOneDeviceByDeviceId(@PathVariable("deviceId")Integer deviceId){
        Device device= deviceService.findOneDeviceByDeviceId(deviceId);
        System.out.println(deviceId);
        return device;
    }

    @ApiOperation("添加设备")
    @GetMapping(value = "addDevice")
    public String addDevice(Device device){
        deviceService.addDevice(device);
        Gson gson = new Gson();
        System.out.println(gson.toJson("添加设备成功"));
        return gson.toJson("success");
    }

    @ApiOperation("修改设备")
    @GetMapping(value = "updateDevice")
    public String updateDevice(Device device){
        deviceService.updateDevice(device);
        Gson gson = new Gson();
        System.out.println("device"+gson.toJson(device));
        System.out.println(gson.toJson("修改设备成功"));
        return gson.toJson("success");
    }

    @ApiOperation("删除设备")
    @GetMapping(value = "deleteDevice/deviceId={deviceId}")
    public String deleteDevice(@PathVariable("deviceId")Integer deviceId){
        deviceService.deleteDevice(deviceId);
        Gson gson = new Gson();
        System.out.println(gson.toJson("删除设备成功"));
        return gson.toJson("success");
    }
}
