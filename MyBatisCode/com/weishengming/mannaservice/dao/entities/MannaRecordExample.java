package com.weishengming.mannaservice.dao.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

/**
 * manna表
 * T_Manna_Record
 */
public class MannaRecordExample {
    /**
     * 顺序排序
     */
    public static final String ORDERBYDIRECTION_ASC = "asc";

    /**
     * 倒序排序
     */
    public static final String ORDERBYDIRECTION_DESC = "desc";

    /**
     * 配置标识
     */
    public static final String FIELD_RECORDID = "RecordId";

    /**
     * 类型
     */
    public static final String FIELD_TYPE = "Type";

    /**
     * 配置码
     */
    public static final String FIELD_CODE = "Code";

    /**
     * 配置名称
     */
    public static final String FIELD_NAME = "Name";

    /**
     * 配置值
     */
    public static final String FIELD_VALUE = "Value";

    /**
     * 状态
     */
    public static final String FIELD_STATUS = "Status";

    /**
     * 创建时间
     */
    public static final String FIELD_CREATETIME = "CreateTime";

    /**
     * 最后修改时间
     */
    public static final String FIELD_LASTMODIFYTIME = "LastModifyTime";

    /**
     * T_Manna_Record
     */
    protected Integer offset;

    /**
     * T_Manna_Record
     */
    protected Integer size;

    /**
     * T_Manna_Record
     */
    protected String orderByClause;

    /**
     * T_Manna_Record
     */
    protected boolean distinct;

    /**
     * T_Manna_Record
     */
    protected List<Criteria> oredCriteria;

    /**
     * T_Manna_Record
     */
    public MannaRecordExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * T_Manna_Record
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * T_Manna_Record
     */
    public void setOrderByClause(OrderBy orderBy) {
        this.orderByClause = orderBy.toString();
    }

    /**
     * T_Manna_Record
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * T_Manna_Record
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * T_Manna_Record
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * T_Manna_Record
     */
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * T_Manna_Record
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * T_Manna_Record
     */
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * T_Manna_Record
     */
    public Integer getSize() {
        return size;
    }

    /**
     * T_Manna_Record
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * T_Manna_Record
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * T_Manna_Record
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * T_Manna_Record
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * T_Manna_Record
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * T_Manna_Record
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * manna表
     * T_Manna_Record
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property, boolean isBinary) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value, isBinary));
        }

        protected void addCriterion(String condition, Object value, String property) {
            addCriterion(condition, value, property, false);
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property, boolean isBinary) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2, isBinary));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            addCriterion(condition, value1, value2, property, false);
        }

        /**
         * 配置标识
         */
        public Criteria andRecordIdIsNull() {
            addCriterion("RecordId is null");
            return (Criteria) this;
        }

        /**
         * 配置标识
         */
        public Criteria andRecordIdIsNotNull() {
            addCriterion("RecordId is not null");
            return (Criteria) this;
        }

        /**
         * 配置标识
         */
        public Criteria andRecordIdEqualTo(Long value) {
            addCriterion("RecordId =", value, "recordId", false);
            return (Criteria) this;
        }

        /**
         * 配置标识
         */
        public Criteria andRecordIdNotEqualTo(Long value) {
            addCriterion("RecordId <>", value, "recordId", false);
            return (Criteria) this;
        }

        /**
         * 配置标识
         */
        public Criteria andRecordIdGreaterThan(Long value) {
            addCriterion("RecordId >", value, "recordId", false);
            return (Criteria) this;
        }

        /**
         * 配置标识
         */
        public Criteria andRecordIdGreaterThanOrEqualTo(Long value) {
            addCriterion("RecordId >=", value, "recordId", false);
            return (Criteria) this;
        }

        /**
         * 配置标识
         */
        public Criteria andRecordIdLessThan(Long value) {
            addCriterion("RecordId <", value, "recordId", false);
            return (Criteria) this;
        }

        /**
         * 配置标识
         */
        public Criteria andRecordIdLessThanOrEqualTo(Long value) {
            addCriterion("RecordId <=", value, "recordId", false);
            return (Criteria) this;
        }

        /**
         * 配置标识
         */
        public Criteria andRecordIdIn(List<Long> values) {
            addCriterion("RecordId in", values, "recordId", false);
            return (Criteria) this;
        }

        /**
         * 配置标识
         */
        public Criteria andRecordIdNotIn(List<Long> values) {
            addCriterion("RecordId not in", values, "recordId", false);
            return (Criteria) this;
        }

        /**
         * 配置标识
         */
        public Criteria andRecordIdBetween(Long value1, Long value2) {
            addCriterion("RecordId between", value1, value2, "recordId");
            return (Criteria) this;
        }

        /**
         * 配置标识
         */
        public Criteria andRecordIdNotBetween(Long value1, Long value2) {
            addCriterion("RecordId not between", value1, value2, "recordId");
            return (Criteria) this;
        }

        /**
         * 类型
         */
        public Criteria andTypeIsNull() {
            addCriterion("Type is null");
            return (Criteria) this;
        }

        /**
         * 类型
         */
        public Criteria andTypeIsNotNull() {
            addCriterion("Type is not null");
            return (Criteria) this;
        }

        /**
         * 类型
         */
        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("Type =", value, "type", false);
            return (Criteria) this;
        }

        /**
         * 类型
         */
        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("Type <>", value, "type", false);
            return (Criteria) this;
        }

        /**
         * 类型
         */
        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("Type >", value, "type", false);
            return (Criteria) this;
        }

        /**
         * 类型
         */
        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("Type >=", value, "type", false);
            return (Criteria) this;
        }

        /**
         * 类型
         */
        public Criteria andTypeLessThan(Integer value) {
            addCriterion("Type <", value, "type", false);
            return (Criteria) this;
        }

        /**
         * 类型
         */
        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("Type <=", value, "type", false);
            return (Criteria) this;
        }

        /**
         * 类型
         */
        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("Type in", values, "type", false);
            return (Criteria) this;
        }

        /**
         * 类型
         */
        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("Type not in", values, "type", false);
            return (Criteria) this;
        }

        /**
         * 类型
         */
        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("Type between", value1, value2, "type");
            return (Criteria) this;
        }

        /**
         * 类型
         */
        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("Type not between", value1, value2, "type");
            return (Criteria) this;
        }

        /**
         * 配置码
         */
        public Criteria andCodeIsNull() {
            addCriterion("Code is null");
            return (Criteria) this;
        }

        /**
         * 配置码
         */
        public Criteria andCodeIsNotNull() {
            addCriterion("Code is not null");
            return (Criteria) this;
        }

        /**
         * 配置码
         */
        public Criteria andCodeEqualTo(String value) {
            addCriterion("Code =", value, "code", false);
            return (Criteria) this;
        }

        /**
         * 配置码
         */
        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("Code <>", value, "code", false);
            return (Criteria) this;
        }

        /**
         * 配置码
         */
        public Criteria andCodeGreaterThan(String value) {
            addCriterion("Code >", value, "code", false);
            return (Criteria) this;
        }

        /**
         * 配置码
         */
        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("Code >=", value, "code", false);
            return (Criteria) this;
        }

        /**
         * 配置码
         */
        public Criteria andCodeLessThan(String value) {
            addCriterion("Code <", value, "code", false);
            return (Criteria) this;
        }

        /**
         * 配置码
         */
        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("Code <=", value, "code", false);
            return (Criteria) this;
        }

        /**
         * 配置码
         */
        public Criteria andCodeLike(String value) {
            addCriterion("Code like", value, "code", false);
            return (Criteria) this;
        }

        /**
         * 配置码
         */
        public Criteria andCodeNotLike(String value) {
            addCriterion("Code not like", value, "code", false);
            return (Criteria) this;
        }

        /**
         * 配置码
         */
        public Criteria andCodeIn(List<String> values) {
            addCriterion("Code in", values, "code", false);
            return (Criteria) this;
        }

        /**
         * 配置码
         */
        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("Code not in", values, "code", false);
            return (Criteria) this;
        }

        /**
         * 配置码
         */
        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("Code between", value1, value2, "code");
            return (Criteria) this;
        }

        /**
         * 配置码
         */
        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("Code not between", value1, value2, "code");
            return (Criteria) this;
        }

        /**
         * 配置名称
         */
        public Criteria andNameIsNull() {
            addCriterion("Name is null");
            return (Criteria) this;
        }

        /**
         * 配置名称
         */
        public Criteria andNameIsNotNull() {
            addCriterion("Name is not null");
            return (Criteria) this;
        }

        /**
         * 配置名称
         */
        public Criteria andNameEqualTo(String value) {
            addCriterion("Name =", value, "name", false);
            return (Criteria) this;
        }

        /**
         * 配置名称
         */
        public Criteria andNameNotEqualTo(String value) {
            addCriterion("Name <>", value, "name", false);
            return (Criteria) this;
        }

        /**
         * 配置名称
         */
        public Criteria andNameGreaterThan(String value) {
            addCriterion("Name >", value, "name", false);
            return (Criteria) this;
        }

        /**
         * 配置名称
         */
        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("Name >=", value, "name", false);
            return (Criteria) this;
        }

        /**
         * 配置名称
         */
        public Criteria andNameLessThan(String value) {
            addCriterion("Name <", value, "name", false);
            return (Criteria) this;
        }

        /**
         * 配置名称
         */
        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("Name <=", value, "name", false);
            return (Criteria) this;
        }

        /**
         * 配置名称
         */
        public Criteria andNameLike(String value) {
            addCriterion("Name like", value, "name", false);
            return (Criteria) this;
        }

        /**
         * 配置名称
         */
        public Criteria andNameNotLike(String value) {
            addCriterion("Name not like", value, "name", false);
            return (Criteria) this;
        }

        /**
         * 配置名称
         */
        public Criteria andNameIn(List<String> values) {
            addCriterion("Name in", values, "name", false);
            return (Criteria) this;
        }

        /**
         * 配置名称
         */
        public Criteria andNameNotIn(List<String> values) {
            addCriterion("Name not in", values, "name", false);
            return (Criteria) this;
        }

        /**
         * 配置名称
         */
        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("Name between", value1, value2, "name");
            return (Criteria) this;
        }

        /**
         * 配置名称
         */
        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("Name not between", value1, value2, "name");
            return (Criteria) this;
        }

        /**
         * 配置值
         */
        public Criteria andValueIsNull() {
            addCriterion("Value is null");
            return (Criteria) this;
        }

        /**
         * 配置值
         */
        public Criteria andValueIsNotNull() {
            addCriterion("Value is not null");
            return (Criteria) this;
        }

        /**
         * 配置值
         */
        public Criteria andValueEqualTo(String value) {
            addCriterion("Value =", value, "value", false);
            return (Criteria) this;
        }

        /**
         * 配置值
         */
        public Criteria andValueNotEqualTo(String value) {
            addCriterion("Value <>", value, "value", false);
            return (Criteria) this;
        }

        /**
         * 配置值
         */
        public Criteria andValueGreaterThan(String value) {
            addCriterion("Value >", value, "value", false);
            return (Criteria) this;
        }

        /**
         * 配置值
         */
        public Criteria andValueGreaterThanOrEqualTo(String value) {
            addCriterion("Value >=", value, "value", false);
            return (Criteria) this;
        }

        /**
         * 配置值
         */
        public Criteria andValueLessThan(String value) {
            addCriterion("Value <", value, "value", false);
            return (Criteria) this;
        }

        /**
         * 配置值
         */
        public Criteria andValueLessThanOrEqualTo(String value) {
            addCriterion("Value <=", value, "value", false);
            return (Criteria) this;
        }

        /**
         * 配置值
         */
        public Criteria andValueLike(String value) {
            addCriterion("Value like", value, "value", false);
            return (Criteria) this;
        }

        /**
         * 配置值
         */
        public Criteria andValueNotLike(String value) {
            addCriterion("Value not like", value, "value", false);
            return (Criteria) this;
        }

        /**
         * 配置值
         */
        public Criteria andValueIn(List<String> values) {
            addCriterion("Value in", values, "value", false);
            return (Criteria) this;
        }

        /**
         * 配置值
         */
        public Criteria andValueNotIn(List<String> values) {
            addCriterion("Value not in", values, "value", false);
            return (Criteria) this;
        }

        /**
         * 配置值
         */
        public Criteria andValueBetween(String value1, String value2) {
            addCriterion("Value between", value1, value2, "value");
            return (Criteria) this;
        }

        /**
         * 配置值
         */
        public Criteria andValueNotBetween(String value1, String value2) {
            addCriterion("Value not between", value1, value2, "value");
            return (Criteria) this;
        }

        /**
         * 状态
         */
        public Criteria andStatusIsNull() {
            addCriterion("Status is null");
            return (Criteria) this;
        }

        /**
         * 状态
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("Status is not null");
            return (Criteria) this;
        }

        /**
         * 状态
         */
        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("Status =", value, "status", false);
            return (Criteria) this;
        }

        /**
         * 状态
         */
        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("Status <>", value, "status", false);
            return (Criteria) this;
        }

        /**
         * 状态
         */
        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("Status >", value, "status", false);
            return (Criteria) this;
        }

        /**
         * 状态
         */
        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("Status >=", value, "status", false);
            return (Criteria) this;
        }

        /**
         * 状态
         */
        public Criteria andStatusLessThan(Integer value) {
            addCriterion("Status <", value, "status", false);
            return (Criteria) this;
        }

        /**
         * 状态
         */
        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("Status <=", value, "status", false);
            return (Criteria) this;
        }

        /**
         * 状态
         */
        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("Status in", values, "status", false);
            return (Criteria) this;
        }

        /**
         * 状态
         */
        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("Status not in", values, "status", false);
            return (Criteria) this;
        }

        /**
         * 状态
         */
        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("Status between", value1, value2, "status");
            return (Criteria) this;
        }

        /**
         * 状态
         */
        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("Status not between", value1, value2, "status");
            return (Criteria) this;
        }

        /**
         * 创建时间
         */
        public Criteria andCreateTimeIsNull() {
            addCriterion("CreateTime is null");
            return (Criteria) this;
        }

        /**
         * 创建时间
         */
        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CreateTime is not null");
            return (Criteria) this;
        }

        /**
         * 创建时间
         */
        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CreateTime =", value, "createTime", false);
            return (Criteria) this;
        }

        /**
         * 创建时间
         */
        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CreateTime <>", value, "createTime", false);
            return (Criteria) this;
        }

        /**
         * 创建时间
         */
        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CreateTime >", value, "createTime", false);
            return (Criteria) this;
        }

        /**
         * 创建时间
         */
        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CreateTime >=", value, "createTime", false);
            return (Criteria) this;
        }

        /**
         * 创建时间
         */
        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CreateTime <", value, "createTime", false);
            return (Criteria) this;
        }

        /**
         * 创建时间
         */
        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CreateTime <=", value, "createTime", false);
            return (Criteria) this;
        }

        /**
         * 创建时间
         */
        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CreateTime in", values, "createTime", false);
            return (Criteria) this;
        }

        /**
         * 创建时间
         */
        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CreateTime not in", values, "createTime", false);
            return (Criteria) this;
        }

        /**
         * 创建时间
         */
        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CreateTime between", value1, value2, "createTime");
            return (Criteria) this;
        }

        /**
         * 创建时间
         */
        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CreateTime not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        /**
         * 最后修改时间
         */
        public Criteria andLastModifyTimeIsNull() {
            addCriterion("LastModifyTime is null");
            return (Criteria) this;
        }

        /**
         * 最后修改时间
         */
        public Criteria andLastModifyTimeIsNotNull() {
            addCriterion("LastModifyTime is not null");
            return (Criteria) this;
        }

        /**
         * 最后修改时间
         */
        public Criteria andLastModifyTimeEqualTo(Date value) {
            addCriterion("LastModifyTime =", value, "lastModifyTime", false);
            return (Criteria) this;
        }

        /**
         * 最后修改时间
         */
        public Criteria andLastModifyTimeNotEqualTo(Date value) {
            addCriterion("LastModifyTime <>", value, "lastModifyTime", false);
            return (Criteria) this;
        }

        /**
         * 最后修改时间
         */
        public Criteria andLastModifyTimeGreaterThan(Date value) {
            addCriterion("LastModifyTime >", value, "lastModifyTime", false);
            return (Criteria) this;
        }

        /**
         * 最后修改时间
         */
        public Criteria andLastModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LastModifyTime >=", value, "lastModifyTime", false);
            return (Criteria) this;
        }

        /**
         * 最后修改时间
         */
        public Criteria andLastModifyTimeLessThan(Date value) {
            addCriterion("LastModifyTime <", value, "lastModifyTime", false);
            return (Criteria) this;
        }

        /**
         * 最后修改时间
         */
        public Criteria andLastModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("LastModifyTime <=", value, "lastModifyTime", false);
            return (Criteria) this;
        }

        /**
         * 最后修改时间
         */
        public Criteria andLastModifyTimeIn(List<Date> values) {
            addCriterion("LastModifyTime in", values, "lastModifyTime", false);
            return (Criteria) this;
        }

        /**
         * 最后修改时间
         */
        public Criteria andLastModifyTimeNotIn(List<Date> values) {
            addCriterion("LastModifyTime not in", values, "lastModifyTime", false);
            return (Criteria) this;
        }

        /**
         * 最后修改时间
         */
        public Criteria andLastModifyTimeBetween(Date value1, Date value2) {
            addCriterion("LastModifyTime between", value1, value2, "lastModifyTime");
            return (Criteria) this;
        }

        /**
         * 最后修改时间
         */
        public Criteria andLastModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("LastModifyTime not between", value1, value2, "lastModifyTime");
            return (Criteria) this;
        }
    }

    /**
     * manna表
     *T_Manna_Record
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * manna表
     * T_Manna_Record
     */
    public static class Criterion {
        private boolean isBinary;

        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public boolean isIsBinary() {
            return isBinary;
        }

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
            this.isBinary = false;
        }

        protected Criterion(String condition, Object value, String typeHandler, boolean isBinary) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
            this.isBinary = isBinary;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            this(condition, value, typeHandler, false);
        }

        protected Criterion(String condition, Object value, boolean isBinary) {
            this(condition, value, null, isBinary);
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null, false);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler, boolean isBinary) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
            this.isBinary = isBinary;
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            this(condition, value, secondValue, typeHandler, false);
        }

        protected Criterion(String condition, Object value, Object secondValue, boolean isBinary) {
            this(condition, value, secondValue, null, isBinary);
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null, false);
        }
    }

    /**
     * manna表
     *T_Manna_Record
     */
    public static class OrderBy {
        private List<OrderByPair> orderByPairs;

        public OrderBy() {
            super();
            this.orderByPairs = new ArrayList<OrderByPair>();
        }

        public boolean isValid() {
            return orderByPairs.size() > 0;
        }

        public OrderBy clear() {
            orderByPairs.clear();
            return this;
        }

        public OrderBy addOrderBy(String fieldName) {
            return this.addOrderBy(fieldName, ORDERBYDIRECTION_ASC);
        }

        public OrderBy addOrderBy(String fieldName, String direction) {
            this.removeByFieldName(fieldName);//不能重复添加排序条件
            OrderByPair orderByPair = new OrderByPair(fieldName, direction);
            this.orderByPairs.add(orderByPair);
            return this;
        }

        private void removeByFieldName(String fieldName) {
            for (OrderByPair item : orderByPairs) {
                    if (StringUtils.equalsIgnoreCase(item.getFieldName(), fieldName)) {
                            orderByPairs.remove(item);
                            break;
                         }
                }
            }

        /**
         * 当没有任何排序条件时，直接返回null
         * 否则返回排序条件，多个条件时以,号分割
         */
        @Override
        public String toString() {
            if (!this.isValid()) {
                    return null;
            }
            StringBuilder sb = new StringBuilder();
            for (OrderByPair item : orderByPairs) {
                    sb.append(item.toString());
                    sb.append(',');
            }
            sb.deleteCharAt(sb.length() - 1);//删除最后一个字符
            return sb.toString();
        }
    }

    /**
     * manna表
     *T_Manna_Record
     */
    static class OrderByPair {
        private String fieldName;

        private String direction;

        public OrderByPair(String fieldName, String direction) {
            super();
            this.fieldName = fieldName;
            this.direction = direction;
        }

        public String getFieldName() {
            return this.fieldName;
        }

        public String getDirection() {
            return this.direction;
        }

        /**
         * 返回单个排序条件字符串
         */
        @Override
        public String toString() {
            return fieldName + " " + direction;
        }
    }
}