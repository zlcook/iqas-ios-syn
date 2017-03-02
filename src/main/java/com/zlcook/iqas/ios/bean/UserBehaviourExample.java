package com.zlcook.iqas.ios.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserBehaviourExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserBehaviourExample() {
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

        public Criteria andUserBehaviourIdIsNull() {
            addCriterion("user_behaviour_id is null");
            return (Criteria) this;
        }

        public Criteria andUserBehaviourIdIsNotNull() {
            addCriterion("user_behaviour_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserBehaviourIdEqualTo(Integer value) {
            addCriterion("user_behaviour_id =", value, "userBehaviourId");
            return (Criteria) this;
        }

        public Criteria andUserBehaviourIdNotEqualTo(Integer value) {
            addCriterion("user_behaviour_id <>", value, "userBehaviourId");
            return (Criteria) this;
        }

        public Criteria andUserBehaviourIdGreaterThan(Integer value) {
            addCriterion("user_behaviour_id >", value, "userBehaviourId");
            return (Criteria) this;
        }

        public Criteria andUserBehaviourIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_behaviour_id >=", value, "userBehaviourId");
            return (Criteria) this;
        }

        public Criteria andUserBehaviourIdLessThan(Integer value) {
            addCriterion("user_behaviour_id <", value, "userBehaviourId");
            return (Criteria) this;
        }

        public Criteria andUserBehaviourIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_behaviour_id <=", value, "userBehaviourId");
            return (Criteria) this;
        }

        public Criteria andUserBehaviourIdIn(List<Integer> values) {
            addCriterion("user_behaviour_id in", values, "userBehaviourId");
            return (Criteria) this;
        }

        public Criteria andUserBehaviourIdNotIn(List<Integer> values) {
            addCriterion("user_behaviour_id not in", values, "userBehaviourId");
            return (Criteria) this;
        }

        public Criteria andUserBehaviourIdBetween(Integer value1, Integer value2) {
            addCriterion("user_behaviour_id between", value1, value2, "userBehaviourId");
            return (Criteria) this;
        }

        public Criteria andUserBehaviourIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_behaviour_id not between", value1, value2, "userBehaviourId");
            return (Criteria) this;
        }

        public Criteria andDowhatIsNull() {
            addCriterion("dowhat is null");
            return (Criteria) this;
        }

        public Criteria andDowhatIsNotNull() {
            addCriterion("dowhat is not null");
            return (Criteria) this;
        }

        public Criteria andDowhatEqualTo(String value) {
            addCriterion("dowhat =", value, "dowhat");
            return (Criteria) this;
        }

        public Criteria andDowhatNotEqualTo(String value) {
            addCriterion("dowhat <>", value, "dowhat");
            return (Criteria) this;
        }

        public Criteria andDowhatGreaterThan(String value) {
            addCriterion("dowhat >", value, "dowhat");
            return (Criteria) this;
        }

        public Criteria andDowhatGreaterThanOrEqualTo(String value) {
            addCriterion("dowhat >=", value, "dowhat");
            return (Criteria) this;
        }

        public Criteria andDowhatLessThan(String value) {
            addCriterion("dowhat <", value, "dowhat");
            return (Criteria) this;
        }

        public Criteria andDowhatLessThanOrEqualTo(String value) {
            addCriterion("dowhat <=", value, "dowhat");
            return (Criteria) this;
        }

        public Criteria andDowhatLike(String value) {
            addCriterion("dowhat like", value, "dowhat");
            return (Criteria) this;
        }

        public Criteria andDowhatNotLike(String value) {
            addCriterion("dowhat not like", value, "dowhat");
            return (Criteria) this;
        }

        public Criteria andDowhatIn(List<String> values) {
            addCriterion("dowhat in", values, "dowhat");
            return (Criteria) this;
        }

        public Criteria andDowhatNotIn(List<String> values) {
            addCriterion("dowhat not in", values, "dowhat");
            return (Criteria) this;
        }

        public Criteria andDowhatBetween(String value1, String value2) {
            addCriterion("dowhat between", value1, value2, "dowhat");
            return (Criteria) this;
        }

        public Criteria andDowhatNotBetween(String value1, String value2) {
            addCriterion("dowhat not between", value1, value2, "dowhat");
            return (Criteria) this;
        }

        public Criteria andDowhenIsNull() {
            addCriterion("dowhen is null");
            return (Criteria) this;
        }

        public Criteria andDowhenIsNotNull() {
            addCriterion("dowhen is not null");
            return (Criteria) this;
        }

        public Criteria andDowhenEqualTo(Date value) {
            addCriterion("dowhen =", value, "dowhen");
            return (Criteria) this;
        }

        public Criteria andDowhenNotEqualTo(Date value) {
            addCriterion("dowhen <>", value, "dowhen");
            return (Criteria) this;
        }

        public Criteria andDowhenGreaterThan(Date value) {
            addCriterion("dowhen >", value, "dowhen");
            return (Criteria) this;
        }

        public Criteria andDowhenGreaterThanOrEqualTo(Date value) {
            addCriterion("dowhen >=", value, "dowhen");
            return (Criteria) this;
        }

        public Criteria andDowhenLessThan(Date value) {
            addCriterion("dowhen <", value, "dowhen");
            return (Criteria) this;
        }

        public Criteria andDowhenLessThanOrEqualTo(Date value) {
            addCriterion("dowhen <=", value, "dowhen");
            return (Criteria) this;
        }

        public Criteria andDowhenIn(List<Date> values) {
            addCriterion("dowhen in", values, "dowhen");
            return (Criteria) this;
        }

        public Criteria andDowhenNotIn(List<Date> values) {
            addCriterion("dowhen not in", values, "dowhen");
            return (Criteria) this;
        }

        public Criteria andDowhenBetween(Date value1, Date value2) {
            addCriterion("dowhen between", value1, value2, "dowhen");
            return (Criteria) this;
        }

        public Criteria andDowhenNotBetween(Date value1, Date value2) {
            addCriterion("dowhen not between", value1, value2, "dowhen");
            return (Criteria) this;
        }

        public Criteria andDowhereIsNull() {
            addCriterion("dowhere is null");
            return (Criteria) this;
        }

        public Criteria andDowhereIsNotNull() {
            addCriterion("dowhere is not null");
            return (Criteria) this;
        }

        public Criteria andDowhereEqualTo(String value) {
            addCriterion("dowhere =", value, "dowhere");
            return (Criteria) this;
        }

        public Criteria andDowhereNotEqualTo(String value) {
            addCriterion("dowhere <>", value, "dowhere");
            return (Criteria) this;
        }

        public Criteria andDowhereGreaterThan(String value) {
            addCriterion("dowhere >", value, "dowhere");
            return (Criteria) this;
        }

        public Criteria andDowhereGreaterThanOrEqualTo(String value) {
            addCriterion("dowhere >=", value, "dowhere");
            return (Criteria) this;
        }

        public Criteria andDowhereLessThan(String value) {
            addCriterion("dowhere <", value, "dowhere");
            return (Criteria) this;
        }

        public Criteria andDowhereLessThanOrEqualTo(String value) {
            addCriterion("dowhere <=", value, "dowhere");
            return (Criteria) this;
        }

        public Criteria andDowhereLike(String value) {
            addCriterion("dowhere like", value, "dowhere");
            return (Criteria) this;
        }

        public Criteria andDowhereNotLike(String value) {
            addCriterion("dowhere not like", value, "dowhere");
            return (Criteria) this;
        }

        public Criteria andDowhereIn(List<String> values) {
            addCriterion("dowhere in", values, "dowhere");
            return (Criteria) this;
        }

        public Criteria andDowhereNotIn(List<String> values) {
            addCriterion("dowhere not in", values, "dowhere");
            return (Criteria) this;
        }

        public Criteria andDowhereBetween(String value1, String value2) {
            addCriterion("dowhere between", value1, value2, "dowhere");
            return (Criteria) this;
        }

        public Criteria andDowhereNotBetween(String value1, String value2) {
            addCriterion("dowhere not between", value1, value2, "dowhere");
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