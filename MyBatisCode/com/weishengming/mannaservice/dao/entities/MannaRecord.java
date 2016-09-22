package com.weishengming.mannaservice.dao.entities;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.weishengming.utils.jackson.JacksonDateDeserializer;
import com.weishengming.utils.jackson.JacksonDateTimeSerializer;
import java.util.Date;
import org.apache.commons.lang3.StringUtils;

/**
 * manna表
 * T_Manna_Record
 */
public class MannaRecord {
    /**
     * 配置标识
     * T_Manna_Record.RecordId
     */
    private Long recordId;

    /**
     * 类型
     * T_Manna_Record.Type
     */
    private Integer type;

    /**
     * 配置码
     * T_Manna_Record.Code
     */
    private String code;

    /**
     * 配置名称
     * T_Manna_Record.Name
     */
    private String name;

    /**
     * 配置值
     * T_Manna_Record.Value
     */
    private String value;

    /**
     * 状态
     * T_Manna_Record.Status
     */
    private Integer status;

    /**
     * 创建时间
     * T_Manna_Record.CreateTime
     */
    @JsonSerialize(using = JacksonDateTimeSerializer.class)
    @JsonDeserialize(using = JacksonDateDeserializer.class)
    private Date createTime;

    /**
     * 最后修改时间
     * T_Manna_Record.LastModifyTime
     */
    @JsonSerialize(using = JacksonDateTimeSerializer.class)
    @JsonDeserialize(using = JacksonDateDeserializer.class)
    private Date lastModifyTime;

    /**
     * 初始化实体对象 主键列不初始化
     */
    public void initWithDefaultValue() {
        this.type = 0;
        this.code = StringUtils.EMPTY;
        this.name = StringUtils.EMPTY;
        this.value = StringUtils.EMPTY;
        this.status = 0;
        this.createTime = new Date();
        this.lastModifyTime = new Date();
    }

    /**
     * 配置标识
     * T_Manna_Record.RecordId
     *
     * @return the value of T_Manna_Record.RecordId
     */
    public Long getRecordId() {
        return recordId;
    }

    /**
     * 配置标识
     * T_Manna_Record.RecordId
     *
     * @param recordId the value for T_Manna_Record.RecordId
     */
    public void setRecordId(Long recordId) {
        this.recordId = recordId;
    }

    /**
     * 类型
     * T_Manna_Record.Type
     *
     * @return the value of T_Manna_Record.Type
     */
    public Integer getType() {
        return type;
    }

    /**
     * 类型
     * T_Manna_Record.Type
     *
     * @param type the value for T_Manna_Record.Type
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 配置码
     * T_Manna_Record.Code
     *
     * @return the value of T_Manna_Record.Code
     */
    public String getCode() {
        return code;
    }

    /**
     * 配置码
     * T_Manna_Record.Code
     *
     * @param code the value for T_Manna_Record.Code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 配置名称
     * T_Manna_Record.Name
     *
     * @return the value of T_Manna_Record.Name
     */
    public String getName() {
        return name;
    }

    /**
     * 配置名称
     * T_Manna_Record.Name
     *
     * @param name the value for T_Manna_Record.Name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 配置值
     * T_Manna_Record.Value
     *
     * @return the value of T_Manna_Record.Value
     */
    public String getValue() {
        return value;
    }

    /**
     * 配置值
     * T_Manna_Record.Value
     *
     * @param value the value for T_Manna_Record.Value
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * 状态
     * T_Manna_Record.Status
     *
     * @return the value of T_Manna_Record.Status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态
     * T_Manna_Record.Status
     *
     * @param status the value for T_Manna_Record.Status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 创建时间
     * T_Manna_Record.CreateTime
     *
     * @return the value of T_Manna_Record.CreateTime
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * T_Manna_Record.CreateTime
     *
     * @param createTime the value for T_Manna_Record.CreateTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 最后修改时间
     * T_Manna_Record.LastModifyTime
     *
     * @return the value of T_Manna_Record.LastModifyTime
     */
    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    /**
     * 最后修改时间
     * T_Manna_Record.LastModifyTime
     *
     * @param lastModifyTime the value for T_Manna_Record.LastModifyTime
     */
    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }
}