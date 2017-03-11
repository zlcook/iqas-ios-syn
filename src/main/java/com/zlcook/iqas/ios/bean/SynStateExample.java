package com.zlcook.iqas.ios.bean;

import java.util.ArrayList;
import java.util.List;

public class SynStateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SynStateExample() {
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

        public Criteria andTokenIsNull() {
            addCriterion("token is null");
            return (Criteria) this;
        }

        public Criteria andTokenIsNotNull() {
            addCriterion("token is not null");
            return (Criteria) this;
        }

        public Criteria andTokenEqualTo(String value) {
            addCriterion("token =", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotEqualTo(String value) {
            addCriterion("token <>", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThan(String value) {
            addCriterion("token >", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThanOrEqualTo(String value) {
            addCriterion("token >=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThan(String value) {
            addCriterion("token <", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThanOrEqualTo(String value) {
            addCriterion("token <=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLike(String value) {
            addCriterion("token like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotLike(String value) {
            addCriterion("token not like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenIn(List<String> values) {
            addCriterion("token in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotIn(List<String> values) {
            addCriterion("token not in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenBetween(String value1, String value2) {
            addCriterion("token between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotBetween(String value1, String value2) {
            addCriterion("token not between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andSynTokenIsNull() {
            addCriterion("syn_token is null");
            return (Criteria) this;
        }

        public Criteria andSynTokenIsNotNull() {
            addCriterion("syn_token is not null");
            return (Criteria) this;
        }

        public Criteria andSynTokenEqualTo(String value) {
            addCriterion("syn_token =", value, "synToken");
            return (Criteria) this;
        }

        public Criteria andSynTokenNotEqualTo(String value) {
            addCriterion("syn_token <>", value, "synToken");
            return (Criteria) this;
        }

        public Criteria andSynTokenGreaterThan(String value) {
            addCriterion("syn_token >", value, "synToken");
            return (Criteria) this;
        }

        public Criteria andSynTokenGreaterThanOrEqualTo(String value) {
            addCriterion("syn_token >=", value, "synToken");
            return (Criteria) this;
        }

        public Criteria andSynTokenLessThan(String value) {
            addCriterion("syn_token <", value, "synToken");
            return (Criteria) this;
        }

        public Criteria andSynTokenLessThanOrEqualTo(String value) {
            addCriterion("syn_token <=", value, "synToken");
            return (Criteria) this;
        }

        public Criteria andSynTokenLike(String value) {
            addCriterion("syn_token like", value, "synToken");
            return (Criteria) this;
        }

        public Criteria andSynTokenNotLike(String value) {
            addCriterion("syn_token not like", value, "synToken");
            return (Criteria) this;
        }

        public Criteria andSynTokenIn(List<String> values) {
            addCriterion("syn_token in", values, "synToken");
            return (Criteria) this;
        }

        public Criteria andSynTokenNotIn(List<String> values) {
            addCriterion("syn_token not in", values, "synToken");
            return (Criteria) this;
        }

        public Criteria andSynTokenBetween(String value1, String value2) {
            addCriterion("syn_token between", value1, value2, "synToken");
            return (Criteria) this;
        }

        public Criteria andSynTokenNotBetween(String value1, String value2) {
            addCriterion("syn_token not between", value1, value2, "synToken");
            return (Criteria) this;
        }

        public Criteria andSynDeviceIsNull() {
            addCriterion("syn_device is null");
            return (Criteria) this;
        }

        public Criteria andSynDeviceIsNotNull() {
            addCriterion("syn_device is not null");
            return (Criteria) this;
        }

        public Criteria andSynDeviceEqualTo(String value) {
            addCriterion("syn_device =", value, "synDevice");
            return (Criteria) this;
        }

        public Criteria andSynDeviceNotEqualTo(String value) {
            addCriterion("syn_device <>", value, "synDevice");
            return (Criteria) this;
        }

        public Criteria andSynDeviceGreaterThan(String value) {
            addCriterion("syn_device >", value, "synDevice");
            return (Criteria) this;
        }

        public Criteria andSynDeviceGreaterThanOrEqualTo(String value) {
            addCriterion("syn_device >=", value, "synDevice");
            return (Criteria) this;
        }

        public Criteria andSynDeviceLessThan(String value) {
            addCriterion("syn_device <", value, "synDevice");
            return (Criteria) this;
        }

        public Criteria andSynDeviceLessThanOrEqualTo(String value) {
            addCriterion("syn_device <=", value, "synDevice");
            return (Criteria) this;
        }

        public Criteria andSynDeviceLike(String value) {
            addCriterion("syn_device like", value, "synDevice");
            return (Criteria) this;
        }

        public Criteria andSynDeviceNotLike(String value) {
            addCriterion("syn_device not like", value, "synDevice");
            return (Criteria) this;
        }

        public Criteria andSynDeviceIn(List<String> values) {
            addCriterion("syn_device in", values, "synDevice");
            return (Criteria) this;
        }

        public Criteria andSynDeviceNotIn(List<String> values) {
            addCriterion("syn_device not in", values, "synDevice");
            return (Criteria) this;
        }

        public Criteria andSynDeviceBetween(String value1, String value2) {
            addCriterion("syn_device between", value1, value2, "synDevice");
            return (Criteria) this;
        }

        public Criteria andSynDeviceNotBetween(String value1, String value2) {
            addCriterion("syn_device not between", value1, value2, "synDevice");
            return (Criteria) this;
        }

        public Criteria andSynResultIsNull() {
            addCriterion("syn_result is null");
            return (Criteria) this;
        }

        public Criteria andSynResultIsNotNull() {
            addCriterion("syn_result is not null");
            return (Criteria) this;
        }

        public Criteria andSynResultEqualTo(Boolean value) {
            addCriterion("syn_result =", value, "synResult");
            return (Criteria) this;
        }

        public Criteria andSynResultNotEqualTo(Boolean value) {
            addCriterion("syn_result <>", value, "synResult");
            return (Criteria) this;
        }

        public Criteria andSynResultGreaterThan(Boolean value) {
            addCriterion("syn_result >", value, "synResult");
            return (Criteria) this;
        }

        public Criteria andSynResultGreaterThanOrEqualTo(Boolean value) {
            addCriterion("syn_result >=", value, "synResult");
            return (Criteria) this;
        }

        public Criteria andSynResultLessThan(Boolean value) {
            addCriterion("syn_result <", value, "synResult");
            return (Criteria) this;
        }

        public Criteria andSynResultLessThanOrEqualTo(Boolean value) {
            addCriterion("syn_result <=", value, "synResult");
            return (Criteria) this;
        }

        public Criteria andSynResultIn(List<Boolean> values) {
            addCriterion("syn_result in", values, "synResult");
            return (Criteria) this;
        }

        public Criteria andSynResultNotIn(List<Boolean> values) {
            addCriterion("syn_result not in", values, "synResult");
            return (Criteria) this;
        }

        public Criteria andSynResultBetween(Boolean value1, Boolean value2) {
            addCriterion("syn_result between", value1, value2, "synResult");
            return (Criteria) this;
        }

        public Criteria andSynResultNotBetween(Boolean value1, Boolean value2) {
            addCriterion("syn_result not between", value1, value2, "synResult");
            return (Criteria) this;
        }

        public Criteria andSynCountIsNull() {
            addCriterion("syn_count is null");
            return (Criteria) this;
        }

        public Criteria andSynCountIsNotNull() {
            addCriterion("syn_count is not null");
            return (Criteria) this;
        }

        public Criteria andSynCountEqualTo(Integer value) {
            addCriterion("syn_count =", value, "synCount");
            return (Criteria) this;
        }

        public Criteria andSynCountNotEqualTo(Integer value) {
            addCriterion("syn_count <>", value, "synCount");
            return (Criteria) this;
        }

        public Criteria andSynCountGreaterThan(Integer value) {
            addCriterion("syn_count >", value, "synCount");
            return (Criteria) this;
        }

        public Criteria andSynCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("syn_count >=", value, "synCount");
            return (Criteria) this;
        }

        public Criteria andSynCountLessThan(Integer value) {
            addCriterion("syn_count <", value, "synCount");
            return (Criteria) this;
        }

        public Criteria andSynCountLessThanOrEqualTo(Integer value) {
            addCriterion("syn_count <=", value, "synCount");
            return (Criteria) this;
        }

        public Criteria andSynCountIn(List<Integer> values) {
            addCriterion("syn_count in", values, "synCount");
            return (Criteria) this;
        }

        public Criteria andSynCountNotIn(List<Integer> values) {
            addCriterion("syn_count not in", values, "synCount");
            return (Criteria) this;
        }

        public Criteria andSynCountBetween(Integer value1, Integer value2) {
            addCriterion("syn_count between", value1, value2, "synCount");
            return (Criteria) this;
        }

        public Criteria andSynCountNotBetween(Integer value1, Integer value2) {
            addCriterion("syn_count not between", value1, value2, "synCount");
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