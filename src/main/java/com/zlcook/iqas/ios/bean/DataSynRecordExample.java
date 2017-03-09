package com.zlcook.iqas.ios.bean;

import java.util.ArrayList;
import java.util.List;

public class DataSynRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DataSynRecordExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andSynIdIsNull() {
            addCriterion("syn_id is null");
            return (Criteria) this;
        }

        public Criteria andSynIdIsNotNull() {
            addCriterion("syn_id is not null");
            return (Criteria) this;
        }

        public Criteria andSynIdEqualTo(Integer value) {
            addCriterion("syn_id =", value, "synId");
            return (Criteria) this;
        }

        public Criteria andSynIdNotEqualTo(Integer value) {
            addCriterion("syn_id <>", value, "synId");
            return (Criteria) this;
        }

        public Criteria andSynIdGreaterThan(Integer value) {
            addCriterion("syn_id >", value, "synId");
            return (Criteria) this;
        }

        public Criteria andSynIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("syn_id >=", value, "synId");
            return (Criteria) this;
        }

        public Criteria andSynIdLessThan(Integer value) {
            addCriterion("syn_id <", value, "synId");
            return (Criteria) this;
        }

        public Criteria andSynIdLessThanOrEqualTo(Integer value) {
            addCriterion("syn_id <=", value, "synId");
            return (Criteria) this;
        }

        public Criteria andSynIdIn(List<Integer> values) {
            addCriterion("syn_id in", values, "synId");
            return (Criteria) this;
        }

        public Criteria andSynIdNotIn(List<Integer> values) {
            addCriterion("syn_id not in", values, "synId");
            return (Criteria) this;
        }

        public Criteria andSynIdBetween(Integer value1, Integer value2) {
            addCriterion("syn_id between", value1, value2, "synId");
            return (Criteria) this;
        }

        public Criteria andSynIdNotBetween(Integer value1, Integer value2) {
            addCriterion("syn_id not between", value1, value2, "synId");
            return (Criteria) this;
        }

        public Criteria andSynTableIsNull() {
            addCriterion("syn_table is null");
            return (Criteria) this;
        }

        public Criteria andSynTableIsNotNull() {
            addCriterion("syn_table is not null");
            return (Criteria) this;
        }

        public Criteria andSynTableEqualTo(String value) {
            addCriterion("syn_table =", value, "synTable");
            return (Criteria) this;
        }

        public Criteria andSynTableNotEqualTo(String value) {
            addCriterion("syn_table <>", value, "synTable");
            return (Criteria) this;
        }

        public Criteria andSynTableGreaterThan(String value) {
            addCriterion("syn_table >", value, "synTable");
            return (Criteria) this;
        }

        public Criteria andSynTableGreaterThanOrEqualTo(String value) {
            addCriterion("syn_table >=", value, "synTable");
            return (Criteria) this;
        }

        public Criteria andSynTableLessThan(String value) {
            addCriterion("syn_table <", value, "synTable");
            return (Criteria) this;
        }

        public Criteria andSynTableLessThanOrEqualTo(String value) {
            addCriterion("syn_table <=", value, "synTable");
            return (Criteria) this;
        }

        public Criteria andSynTableLike(String value) {
            addCriterion("syn_table like", value, "synTable");
            return (Criteria) this;
        }

        public Criteria andSynTableNotLike(String value) {
            addCriterion("syn_table not like", value, "synTable");
            return (Criteria) this;
        }

        public Criteria andSynTableIn(List<String> values) {
            addCriterion("syn_table in", values, "synTable");
            return (Criteria) this;
        }

        public Criteria andSynTableNotIn(List<String> values) {
            addCriterion("syn_table not in", values, "synTable");
            return (Criteria) this;
        }

        public Criteria andSynTableBetween(String value1, String value2) {
            addCriterion("syn_table between", value1, value2, "synTable");
            return (Criteria) this;
        }

        public Criteria andSynTableNotBetween(String value1, String value2) {
            addCriterion("syn_table not between", value1, value2, "synTable");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andLastModTimeIsNull() {
            addCriterion("last_mod_time is null");
            return (Criteria) this;
        }

        public Criteria andLastModTimeIsNotNull() {
            addCriterion("last_mod_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastModTimeEqualTo(Long value) {
            addCriterion("last_mod_time =", value, "lastModTime");
            return (Criteria) this;
        }

        public Criteria andLastModTimeNotEqualTo(Long value) {
            addCriterion("last_mod_time <>", value, "lastModTime");
            return (Criteria) this;
        }

        public Criteria andLastModTimeGreaterThan(Long value) {
            addCriterion("last_mod_time >", value, "lastModTime");
            return (Criteria) this;
        }

        public Criteria andLastModTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("last_mod_time >=", value, "lastModTime");
            return (Criteria) this;
        }

        public Criteria andLastModTimeLessThan(Long value) {
            addCriterion("last_mod_time <", value, "lastModTime");
            return (Criteria) this;
        }

        public Criteria andLastModTimeLessThanOrEqualTo(Long value) {
            addCriterion("last_mod_time <=", value, "lastModTime");
            return (Criteria) this;
        }

        public Criteria andLastModTimeIn(List<Long> values) {
            addCriterion("last_mod_time in", values, "lastModTime");
            return (Criteria) this;
        }

        public Criteria andLastModTimeNotIn(List<Long> values) {
            addCriterion("last_mod_time not in", values, "lastModTime");
            return (Criteria) this;
        }

        public Criteria andLastModTimeBetween(Long value1, Long value2) {
            addCriterion("last_mod_time between", value1, value2, "lastModTime");
            return (Criteria) this;
        }

        public Criteria andLastModTimeNotBetween(Long value1, Long value2) {
            addCriterion("last_mod_time not between", value1, value2, "lastModTime");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Integer value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Integer value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Integer value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Integer value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Integer value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Integer> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Integer> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Integer value1, Integer value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

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
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}