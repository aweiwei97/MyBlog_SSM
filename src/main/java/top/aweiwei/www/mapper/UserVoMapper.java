package top.aweiwei.www.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.aweiwei.www.entity.Vo.UserVo;
import top.aweiwei.www.entity.Vo.UserVoExample;

public interface UserVoMapper {
    int countByExample(UserVoExample example);

    int deleteByExample(UserVoExample example);

    int deleteByPrimaryKey(Integer uid);

    int insert(UserVo record);

    int insertSelective(UserVo record);

    List<UserVo> selectByExample(UserVoExample example);

    UserVo selectByPrimaryKey(Integer uid);

    int updateByExampleSelective(@Param("record") UserVo record, @Param("example") UserVoExample example);

    int updateByExample(@Param("record") UserVo record, @Param("example") UserVoExample example);

    int updateByPrimaryKeySelective(UserVo record);

    int updateByPrimaryKey(UserVo record);
}