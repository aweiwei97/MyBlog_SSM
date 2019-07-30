package top.aweiwei.www.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.aweiwei.www.entity.Bo.ArchiveBo;
import top.aweiwei.www.entity.Vo.ContentVo;
import top.aweiwei.www.entity.Vo.ContentVoExample;
public interface ContentVoMapper {
    int countByExample(ContentVoExample example);

    int deleteByExample(ContentVoExample example);

    int deleteByPrimaryKey(Integer cid);

    int insert(ContentVo record);

    int insertSelective(ContentVo record);

    List<ContentVo> selectByExampleWithBLOBs(ContentVoExample example);

    List<ContentVo> selectByExample(ContentVoExample example);

    ContentVo selectByPrimaryKey(Integer cid);

    int updateByExampleSelective(@Param("record") ContentVo record, @Param("example") ContentVoExample example);

    int updateByExampleWithBLOBs(@Param("record") ContentVo record, @Param("example") ContentVoExample example);

    int updateByExample(@Param("record") ContentVo record, @Param("example") ContentVoExample example);

    int updateByPrimaryKeySelective(ContentVo record);

    int updateByPrimaryKeyWithBLOBs(ContentVo record);

    int updateByPrimaryKey(ContentVo record);

    List<ArchiveBo> findReturnArchiveBo();

    List<ContentVo> findByCatalog(Integer mid);
}