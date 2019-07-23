package top.aweiwei.www.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import top.aweiwei.www.dto.MetaDto;
import top.aweiwei.www.entity.Vo.MetaVo;
import top.aweiwei.www.entity.Vo.MetaVoExample;

public interface MetaVoMapper {
    int countByExample(MetaVoExample example);

    int deleteByExample(MetaVoExample example);

    int deleteByPrimaryKey(Integer mid);

    int insert(MetaVo record);

    int insertSelective(MetaVo record);

    List<MetaVo> selectByExample(MetaVoExample example);

    MetaVo selectByPrimaryKey(Integer mid);

    int updateByExampleSelective(@Param("record") MetaVo record, @Param("example") MetaVoExample example);

    int updateByExample(@Param("record") MetaVo record, @Param("example") MetaVoExample example);

    int updateByPrimaryKeySelective(MetaVo record);

    int updateByPrimaryKey(MetaVo record);

    Integer countWithSql(Integer mid);

    List<MetaDto> selectFromSql(Map<String,Object> paraMap);

    MetaDto selectDtoByNameAndType(@Param("name") String name,@Param("type") String type);
}