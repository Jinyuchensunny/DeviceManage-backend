package zjc.devicemanage.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zjc.devicemanage.org.dao.DeviceMapper;
import zjc.devicemanage.org.model.Device;
import zjc.devicemanage.org.model.DeviceExample;
import zjc.devicemanage.service.DeviceService;

import java.util.List;

@Service
public class DeviceServiceImp implements DeviceService {
    @Autowired
    private DeviceMapper deviceMapper;

    //    1 根据devicename查找设备
    @Override
    public Device findOneDevice(String devicename) {
        DeviceExample example = new DeviceExample();
        example.createCriteria().andNameEqualTo(devicename);
        List<Device> devices = deviceMapper.selectByExample(example);
//        System.out.println(devices.toString());
        return devices.get(0);
    }

    //    2 查找所有设备
    @Override
    public List<Device> findAllDevice() {
        DeviceExample example = new DeviceExample();
        example.createCriteria().getAllCriteria();
        List<Device> devices = deviceMapper.selectByExample(example);
        System.out.println(devices);
        return devices;
    }

    //    3 根据deviceId查找设备
    @Override
    public Device findOneDeviceByDeviceId(Integer deviceId) {
        Device device = deviceMapper.selectByPrimaryKey(deviceId);
//        System.out.println(device);
        return device;
    }

    //    4 增加设备
    @Override
    public void addDevice(Device device) {
        deviceMapper.insertSelective(device);
    }

    //    5 根据id删除设备
    @Override
    public void deleteDevice(Integer deviceId) {
        deviceMapper.deleteByPrimaryKey(deviceId);
        System.out.println(deviceId+"号设备被删除");
    }

    //    6 修改设备
    @Override
    public void updateDevice(Device device) {
        deviceMapper.updateByPrimaryKeySelective(device);
    }
}
