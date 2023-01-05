package zjc.devicemanage.service.imp;

import org.springframework.stereotype.Service;
import zjc.devicemanage.org.dao.DeviceclassMapper;
import zjc.devicemanage.org.model.Deviceclass;
import zjc.devicemanage.org.model.DeviceclassExample;
import org.springframework.beans.factory.annotation.Autowired;
import zjc.devicemanage.service.DeviceclaccService;

import java.util.List;

@Service
public class DeviceclassServiceImp implements DeviceclaccService {
    @Autowired
    private DeviceclassMapper deviceclassMapper;

    //    1 根据deviceclassname查找设备分类
    @Override
    public Deviceclass findOneDeviceclass(String deviceclassname) {
        DeviceclassExample example = new DeviceclassExample();
        example.createCriteria().andNameEqualTo(deviceclassname);
        List<Deviceclass> deviceclasses = deviceclassMapper.selectByExample(example);
        System.out.println(deviceclassname.toString());
        return deviceclasses.get(0);
    }

    //    2 查找所有设备分类
    @Override
    public List<Deviceclass> findAllDeviceclass() {
        DeviceclassExample example = new DeviceclassExample();
        example.createCriteria().getAllCriteria();
        List<Deviceclass> deviceclasses = deviceclassMapper.selectByExample(example);
        for (Deviceclass deviceclass : deviceclasses){
            System.out.println(deviceclass);
        }
        return deviceclasses;
    }

    //    3 根据id查找设备分类
    @Override
    public Deviceclass findOneDeviceclassByDeviceId(Integer deviceclassId) {
        Deviceclass deviceclass = deviceclassMapper.selectByPrimaryKey(deviceclassId);
        System.out.println(deviceclass);
        return deviceclass;
    }

    //    4 增加设备分类
    @Override
    public void addDeviceclass(Deviceclass deviceclass) {
        deviceclassMapper.insertSelective(deviceclass);
    }

    //    5 根据id删除设备分类
    @Override
    public void deleteDeviceclass(Integer deviceclassId) {
        deviceclassMapper.deleteByPrimaryKey(deviceclassId);
        System.out.println(deviceclassId+"号设备分类被删除");
    }

    //    6 修改设备分类
    @Override
    public void updateDeviceclass(Deviceclass deviceclass) {
        deviceclassMapper.updateByPrimaryKeySelective(deviceclass);
    }
}
