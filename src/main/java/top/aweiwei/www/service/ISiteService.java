package top.aweiwei.www.service;


import top.aweiwei.www.dto.MetaDto;
import top.aweiwei.www.entity.Bo.ArchiveBo;
import top.aweiwei.www.entity.Bo.BackResponseBo;
import top.aweiwei.www.entity.Bo.StatisticsBo;
import top.aweiwei.www.entity.Vo.CommentVo;
import top.aweiwei.www.entity.Vo.ContentVo;

import java.util.List;

/**
 * 站点服务
 *
 * Created by aweiwei on 2019/7/20
 */
public interface ISiteService {


    /**
     * 最新收到的评论
     *
     * @param limit
     * @return
     */
    List<CommentVo> recentComments(int limit);

    /**
     * 最新发表的文章
     *
     * @param limit
     * @return
     */
    List<ContentVo> recentContents(int limit);

    /**
     * 查询一条评论
     * @param coid
     * @return
     */
    CommentVo getComment(Integer coid);

    /**
     * 系统备份
     * @param bk_type
     * @param bk_path
     * @param fmt
     * @return
     */
    BackResponseBo backup(String bk_type, String bk_path, String fmt) throws Exception;


    /**
     * 获取后台统计数据
     *
     * @return
     */
    StatisticsBo getStatistics();

    /**
     * 查询文章归档
     *
     * @return
     */
    List<ArchiveBo> getArchives();

    /**
     * 获取分类/标签列表
     * @return
     */
    List<MetaDto> metas(String type, String orderBy, int limit);

}
