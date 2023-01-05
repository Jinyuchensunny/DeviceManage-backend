package zjc.devicemanage.service;

import zjc.devicemanage.org.model.Deviceclass;

import java.util.List;

public interface DeviceclaccService {
//    1 根据deviceclassname查找设备分类
    public Deviceclass findOneDeviceclass(String deviceclassname);

//    2 查找所有设备分类
    public List<Deviceclass> findAllDeviceclass();

//    3 根据deviceId查找设备分类
    public Deviceclass findOneDeviceclassByDeviceId(Integer deviceclassId);

//    4 增加设备分类
    public void addDeviceclass(Deviceclass deviceclass);

//    5 根据id删除设备分类
    public void deleteDeviceclass(Integer deviceclassId);

//    6 修改设备分类
    public void updateDeviceclass(Deviceclass deviceclass);

}
