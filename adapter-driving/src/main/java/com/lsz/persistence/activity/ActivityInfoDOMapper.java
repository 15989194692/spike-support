package com.lsz.persistence.activity;

import com.lsz.persistence.activity.ActivityInfoDO;
import com.lsz.persistence.activity.ActivityInfoDOdExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface ActivityInfoDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spike_activity
     *
     * @mbg.generated
     */
    long countByExample(ActivityInfoDOdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spike_activity
     *
     * @mbg.generated
     */
    int deleteByExample(ActivityInfoDOdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spike_activity
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spike_activity
     *
     * @mbg.generated
     */
    int insert(ActivityInfoDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spike_activity
     *
     * @mbg.generated
     */
    int insertSelective(ActivityInfoDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spike_activity
     *
     * @mbg.generated
     */
    List<ActivityInfoDO> selectByExampleWithRowbounds(ActivityInfoDOdExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spike_activity
     *
     * @mbg.generated
     */
    List<ActivityInfoDO> selectByExample(ActivityInfoDOdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spike_activity
     *
     * @mbg.generated
     */
    ActivityInfoDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spike_activity
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ActivityInfoDO record, @Param("example") ActivityInfoDOdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spike_activity
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ActivityInfoDO record, @Param("example") ActivityInfoDOdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spike_activity
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ActivityInfoDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spike_activity
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ActivityInfoDO record);
}