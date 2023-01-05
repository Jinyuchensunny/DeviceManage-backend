package zjc.devicemanage;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import zjc.devicemanage.org.model.Device;
import zjc.devicemanage.org.model.Deviceclass;
import zjc.devicemanage.service.DeviceService;
import zjc.devicemanage.service.DeviceclaccService;

@SpringBootTest
class DevicemanageApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    DeviceclaccService deviceclaccService;

    @Test
    void testDeviceClass() {

//        deviceclaccService.addDeviceclass(new Deviceclass(3,"娱乐设备"));
//        deviceclaccService.findAllDeviceclass();
//        System.out.println(deviceclaccService.findOneDeviceclass("娱乐设备"));
//        deviceclaccService.updateDeviceclass(new Deviceclass(3,"公共设备"));
//        deviceclaccService.findAllDeviceclass();
//        deviceclaccService.deleteDeviceclass(3);
//        deviceclaccService.findOneDeviceclassByDeviceId(2);
    }

    @Autowired
    DeviceService deviceService;

    @Test
    void testDevice(){
//        deviceService.addDevice(new Device(7,1,"冰箱"));

//        Device device = new Device();
//        device.setDcId(1);
//        device.setName("冰箱");
//        deviceService.addDevice(device);

//        deviceService.findAllDevice();
//        System.out.println(deviceService.findOneDeviceByDeviceId(1));
//        System.out.println(deviceService.findOneDevice("冰箱"));
//        deviceService.updateDevice(new Device(7,2,"胶带"));
//        deviceService.findAllDevice();
        deviceService.deleteDevice(7);
    }
}
