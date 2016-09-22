package com.weishengming.mannaservice.dao.mapper;

import com.weishengming.mannaservice.dao.entities.MannaRecord;
import com.weishengming.mannaservice.dao.entities.MannaRecordExample;
import com.weishengming.mannaservice.datasources.annotations.MasterDataSource;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * manna表
 * T_Manna_Record
 */
public interface MannaRecordMapper {
    /**
     * 获取符合条件的记录数
     * T_Manna_Record
     */
    int countByExample(@Param("example") MannaRecordExample example);

    /**
     * 删除符合条件的记录
     * T_Manna_Record
     */
    @MasterDataSource
    int deleteByExample(@Param("example") MannaRecordExample example);

    /**
     * 删除指定主键的记录
     * T_Manna_Record
     */
    @MasterDataSource
    int deleteByPrimaryKey(@Param("recordId") Long recordId);

    /**
     * 新增记录
     * T_Manna_Record
     */
    @MasterDataSource
    int insert(@Param("record") MannaRecord record);

    /**
     * 选择性字段新增记录
     * T_Manna_Record
     */
    @MasterDataSource
    int insertSelective(@Param("record") MannaRecord record);

    /**
     * 获取指定条件的记录
     * T_Manna_Record
     */
    List<MannaRecord> selectByExample(@Param("example") MannaRecordExample example);

    /**
     * 获取指定主键的记录
     * T_Manna_Record
     */
    MannaRecord selectByPrimaryKey(@Param("recordId") Long recordId);

    /**
     * 选择性字段更新指定条件的记录
     * T_Manna_Record
     */
    @MasterDataSource
    int updateByExampleSelective(@Param("record") MannaRecord record, @Param("example") MannaRecordExample example);

    /**
     * 更新指定条件的记录
     * T_Manna_Record
     */
    @MasterDataSource
    int updateByExample(@Param("record") MannaRecord record, @Param("example") MannaRecordExample example);

    /**
     * 选择性字段更新指定主键的记录
     * T_Manna_Record
     */
    @MasterDataSource
    int updateByPrimaryKeySelective(@Param("record") MannaRecord record);

    /**
     * 更新指定主键的记录
     * T_Manna_Record
     */
    @MasterDataSource
    int updateByPrimaryKey(@Param("record") MannaRecord record);
}