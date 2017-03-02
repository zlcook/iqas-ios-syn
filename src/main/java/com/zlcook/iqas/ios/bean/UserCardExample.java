package com.zlcook.iqas.ios.bean;

import java.util.ArrayList;
import java.util.List;

public class UserCardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserCardExample() {
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

        public Criteria andUsercardIdIsNull() {
            addCriterion("usercard_id is null");
            return (Criteria) this;
        }

        public Criteria andUsercardIdIsNotNull() {
            addCriterion("usercard_id is not null");
            return (Criteria) this;
        }

        public Criteria andUsercardIdEqualTo(Integer value) {
            addCriterion("usercard_id =", value, "usercardId");
            return (Criteria) this;
        }

        public Criteria andUsercardIdNotEqualTo(Integer value) {
            addCriterion("usercard_id <>", value, "usercardId");
            return (Criteria) this;
        }

        public Criteria andUsercardIdGreaterThan(Integer value) {
            addCriterion("usercard_id >", value, "usercardId");
            return (Criteria) this;
        }

        public Criteria andUsercardIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("usercard_id >=", value, "usercardId");
            return (Criteria) this;
        }

        public Criteria andUsercardIdLessThan(Integer value) {
            addCriterion("usercard_id <", value, "usercardId");
            return (Criteria) this;
        }

        public Criteria andUsercardIdLessThanOrEqualTo(Integer value) {
            addCriterion("usercard_id <=", value, "usercardId");
            return (Criteria) this;
        }

        public Criteria andUsercardIdIn(List<Integer> values) {
            addCriterion("usercard_id in", values, "usercardId");
            return (Criteria) this;
        }

        public Criteria andUsercardIdNotIn(List<Integer> values) {
            addCriterion("usercard_id not in", values, "usercardId");
            return (Criteria) this;
        }

        public Criteria andUsercardIdBetween(Integer value1, Integer value2) {
            addCriterion("usercard_id between", value1, value2, "usercardId");
            return (Criteria) this;
        }

        public Criteria andUsercardIdNotBetween(Integer value1, Integer value2) {
            addCriterion("usercard_id not between", value1, value2, "usercardId");
            return (Criteria) this;
        }

        public Criteria andCardclick1IsNull() {
            addCriterion("cardclick1 is null");
            return (Criteria) this;
        }

        public Criteria andCardclick1IsNotNull() {
            addCriterion("cardclick1 is not null");
            return (Criteria) this;
        }

        public Criteria andCardclick1EqualTo(Integer value) {
            addCriterion("cardclick1 =", value, "cardclick1");
            return (Criteria) this;
        }

        public Criteria andCardclick1NotEqualTo(Integer value) {
            addCriterion("cardclick1 <>", value, "cardclick1");
            return (Criteria) this;
        }

        public Criteria andCardclick1GreaterThan(Integer value) {
            addCriterion("cardclick1 >", value, "cardclick1");
            return (Criteria) this;
        }

        public Criteria andCardclick1GreaterThanOrEqualTo(Integer value) {
            addCriterion("cardclick1 >=", value, "cardclick1");
            return (Criteria) this;
        }

        public Criteria andCardclick1LessThan(Integer value) {
            addCriterion("cardclick1 <", value, "cardclick1");
            return (Criteria) this;
        }

        public Criteria andCardclick1LessThanOrEqualTo(Integer value) {
            addCriterion("cardclick1 <=", value, "cardclick1");
            return (Criteria) this;
        }

        public Criteria andCardclick1In(List<Integer> values) {
            addCriterion("cardclick1 in", values, "cardclick1");
            return (Criteria) this;
        }

        public Criteria andCardclick1NotIn(List<Integer> values) {
            addCriterion("cardclick1 not in", values, "cardclick1");
            return (Criteria) this;
        }

        public Criteria andCardclick1Between(Integer value1, Integer value2) {
            addCriterion("cardclick1 between", value1, value2, "cardclick1");
            return (Criteria) this;
        }

        public Criteria andCardclick1NotBetween(Integer value1, Integer value2) {
            addCriterion("cardclick1 not between", value1, value2, "cardclick1");
            return (Criteria) this;
        }

        public Criteria andCardclick2IsNull() {
            addCriterion("cardclick2 is null");
            return (Criteria) this;
        }

        public Criteria andCardclick2IsNotNull() {
            addCriterion("cardclick2 is not null");
            return (Criteria) this;
        }

        public Criteria andCardclick2EqualTo(Integer value) {
            addCriterion("cardclick2 =", value, "cardclick2");
            return (Criteria) this;
        }

        public Criteria andCardclick2NotEqualTo(Integer value) {
            addCriterion("cardclick2 <>", value, "cardclick2");
            return (Criteria) this;
        }

        public Criteria andCardclick2GreaterThan(Integer value) {
            addCriterion("cardclick2 >", value, "cardclick2");
            return (Criteria) this;
        }

        public Criteria andCardclick2GreaterThanOrEqualTo(Integer value) {
            addCriterion("cardclick2 >=", value, "cardclick2");
            return (Criteria) this;
        }

        public Criteria andCardclick2LessThan(Integer value) {
            addCriterion("cardclick2 <", value, "cardclick2");
            return (Criteria) this;
        }

        public Criteria andCardclick2LessThanOrEqualTo(Integer value) {
            addCriterion("cardclick2 <=", value, "cardclick2");
            return (Criteria) this;
        }

        public Criteria andCardclick2In(List<Integer> values) {
            addCriterion("cardclick2 in", values, "cardclick2");
            return (Criteria) this;
        }

        public Criteria andCardclick2NotIn(List<Integer> values) {
            addCriterion("cardclick2 not in", values, "cardclick2");
            return (Criteria) this;
        }

        public Criteria andCardclick2Between(Integer value1, Integer value2) {
            addCriterion("cardclick2 between", value1, value2, "cardclick2");
            return (Criteria) this;
        }

        public Criteria andCardclick2NotBetween(Integer value1, Integer value2) {
            addCriterion("cardclick2 not between", value1, value2, "cardclick2");
            return (Criteria) this;
        }

        public Criteria andCardclick3IsNull() {
            addCriterion("cardclick3 is null");
            return (Criteria) this;
        }

        public Criteria andCardclick3IsNotNull() {
            addCriterion("cardclick3 is not null");
            return (Criteria) this;
        }

        public Criteria andCardclick3EqualTo(Integer value) {
            addCriterion("cardclick3 =", value, "cardclick3");
            return (Criteria) this;
        }

        public Criteria andCardclick3NotEqualTo(Integer value) {
            addCriterion("cardclick3 <>", value, "cardclick3");
            return (Criteria) this;
        }

        public Criteria andCardclick3GreaterThan(Integer value) {
            addCriterion("cardclick3 >", value, "cardclick3");
            return (Criteria) this;
        }

        public Criteria andCardclick3GreaterThanOrEqualTo(Integer value) {
            addCriterion("cardclick3 >=", value, "cardclick3");
            return (Criteria) this;
        }

        public Criteria andCardclick3LessThan(Integer value) {
            addCriterion("cardclick3 <", value, "cardclick3");
            return (Criteria) this;
        }

        public Criteria andCardclick3LessThanOrEqualTo(Integer value) {
            addCriterion("cardclick3 <=", value, "cardclick3");
            return (Criteria) this;
        }

        public Criteria andCardclick3In(List<Integer> values) {
            addCriterion("cardclick3 in", values, "cardclick3");
            return (Criteria) this;
        }

        public Criteria andCardclick3NotIn(List<Integer> values) {
            addCriterion("cardclick3 not in", values, "cardclick3");
            return (Criteria) this;
        }

        public Criteria andCardclick3Between(Integer value1, Integer value2) {
            addCriterion("cardclick3 between", value1, value2, "cardclick3");
            return (Criteria) this;
        }

        public Criteria andCardclick3NotBetween(Integer value1, Integer value2) {
            addCriterion("cardclick3 not between", value1, value2, "cardclick3");
            return (Criteria) this;
        }

        public Criteria andCardclick4IsNull() {
            addCriterion("cardclick4 is null");
            return (Criteria) this;
        }

        public Criteria andCardclick4IsNotNull() {
            addCriterion("cardclick4 is not null");
            return (Criteria) this;
        }

        public Criteria andCardclick4EqualTo(Integer value) {
            addCriterion("cardclick4 =", value, "cardclick4");
            return (Criteria) this;
        }

        public Criteria andCardclick4NotEqualTo(Integer value) {
            addCriterion("cardclick4 <>", value, "cardclick4");
            return (Criteria) this;
        }

        public Criteria andCardclick4GreaterThan(Integer value) {
            addCriterion("cardclick4 >", value, "cardclick4");
            return (Criteria) this;
        }

        public Criteria andCardclick4GreaterThanOrEqualTo(Integer value) {
            addCriterion("cardclick4 >=", value, "cardclick4");
            return (Criteria) this;
        }

        public Criteria andCardclick4LessThan(Integer value) {
            addCriterion("cardclick4 <", value, "cardclick4");
            return (Criteria) this;
        }

        public Criteria andCardclick4LessThanOrEqualTo(Integer value) {
            addCriterion("cardclick4 <=", value, "cardclick4");
            return (Criteria) this;
        }

        public Criteria andCardclick4In(List<Integer> values) {
            addCriterion("cardclick4 in", values, "cardclick4");
            return (Criteria) this;
        }

        public Criteria andCardclick4NotIn(List<Integer> values) {
            addCriterion("cardclick4 not in", values, "cardclick4");
            return (Criteria) this;
        }

        public Criteria andCardclick4Between(Integer value1, Integer value2) {
            addCriterion("cardclick4 between", value1, value2, "cardclick4");
            return (Criteria) this;
        }

        public Criteria andCardclick4NotBetween(Integer value1, Integer value2) {
            addCriterion("cardclick4 not between", value1, value2, "cardclick4");
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