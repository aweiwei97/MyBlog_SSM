package top.aweiwei.www.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.aweiwei.www.entity.Vo.AttachVo;
import top.aweiwei.www.entity.Vo.AttachVoExample;

public interface AttachVoMapper {
    int countByExample(AttachVoExample example);

    int deleteByExample(AttachVoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AttachVo record);

    int insertSelective(AttachVo record);

    List<AttachVo> selectByExample(AttachVoExample example);

    AttachVo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AttachVo record, @Param("example") AttachVoExample example);

    int updateByExample(@Param("record") AttachVo record, @Param("example") AttachVoExample example);

    int updateByPrimaryKeySelective(AttachVo record);

    int updateByPrimaryKey(AttachVo record);
}