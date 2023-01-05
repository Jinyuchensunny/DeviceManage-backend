package zjc.devicemanage.service;

import zjc.devicemanage.org.model.Device;

import java.util.List;

public interface DeviceService {
    //    1 根据devicename查找设备
    public Device findOneDevice(String devicename);

    //    2 查找所有设备
    public List<Device> findAllDevice();

    //    3 根据deviceId查找设备
    public Device findOneDeviceByDeviceId(Integer deviceId);

    //    4 增加设备
    public void addDevice(Device device);

    //    5 根据id删除设备
    public void deleteDevice(Integer deviceId);

    //    6 修改设备
    public void updateDevice(Device device);
}
