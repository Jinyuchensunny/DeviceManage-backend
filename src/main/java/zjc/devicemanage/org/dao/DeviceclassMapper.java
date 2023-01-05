package zjc.devicemanage.org.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import zjc.devicemanage.org.model.Deviceclass;
import zjc.devicemanage.org.model.DeviceclassExample;

@Mapper
public interface DeviceclassMapper {
    long countByExample(DeviceclassExample example);

    int deleteByExample(DeviceclassExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Deviceclass record);

    int insertSelective(Deviceclass record);

    List<Deviceclass> selectByExample(DeviceclassExample example);

    Deviceclass selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Deviceclass record, @Param("example") DeviceclassExample example);

    int updateByExample(@Param("record") Deviceclass record, @Param("example") DeviceclassExample example);

    int updateByPrimaryKeySelective(Deviceclass record);

    int updateByPrimaryKey(Deviceclass record);
}