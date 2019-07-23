package top.aweiwei.www.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.aweiwei.www.entity.Vo.LogVo;
import top.aweiwei.www.entity.Vo.LogVoExample;

public interface LogVoMapper {
    int countByExample(LogVoExample example);

    int deleteByExample(LogVoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LogVo record);

    int insertSelective(LogVo record);

    List<LogVo> selectByExample(LogVoExample example);

    LogVo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LogVo record, @Param("example") LogVoExample example);

    int updateByExample(@Param("record") LogVo record, @Param("example") LogVoExample example);

    int updateByPrimaryKeySelective(LogVo record);

    int updateByPrimaryKey(LogVo record);
}