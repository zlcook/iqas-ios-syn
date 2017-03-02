package com.zlcook.iqas.ios.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserTestExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserTestExample() {
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

        public Criteria andUsertestIdIsNull() {
            addCriterion("usertest_id is null");
            return (Criteria) this;
        }

        public Criteria andUsertestIdIsNotNull() {
            addCriterion("usertest_id is not null");
            return (Criteria) this;
        }

        public Criteria andUsertestIdEqualTo(Integer value) {
            addCriterion("usertest_id =", value, "usertestId");
            return (Criteria) this;
        }

        public Criteria andUsertestIdNotEqualTo(Integer value) {
            addCriterion("usertest_id <>", value, "usertestId");
            return (Criteria) this;
        }

        public Criteria andUsertestIdGreaterThan(Integer value) {
            addCriterion("usertest_id >", value, "usertestId");
            return (Criteria) this;
        }

        public Criteria andUsertestIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("usertest_id >=", value, "usertestId");
            return (Criteria) this;
        }

        public Criteria andUsertestIdLessThan(Integer value) {
            addCriterion("usertest_id <", value, "usertestId");
            return (Criteria) this;
        }

        public Criteria andUsertestIdLessThanOrEqualTo(Integer value) {
            addCriterion("usertest_id <=", value, "usertestId");
            return (Criteria) this;
        }

        public Criteria andUsertestIdIn(List<Integer> values) {
            addCriterion("usertest_id in", values, "usertestId");
            return (Criteria) this;
        }

        public Criteria andUsertestIdNotIn(List<Integer> values) {
            addCriterion("usertest_id not in", values, "usertestId");
            return (Criteria) this;
        }

        public Criteria andUsertestIdBetween(Integer value1, Integer value2) {
            addCriterion("usertest_id between", value1, value2, "usertestId");
            return (Criteria) this;
        }

        public Criteria andUsertestIdNotBetween(Integer value1, Integer value2) {
            addCriterion("usertest_id not between", value1, value2, "usertestId");
            return (Criteria) this;
        }

        public Criteria andAnswertimesIsNull() {
            addCriterion("answertimes is null");
            return (Criteria) this;
        }

        public Criteria andAnswertimesIsNotNull() {
            addCriterion("answertimes is not null");
            return (Criteria) this;
        }

        public Criteria andAnswertimesEqualTo(Integer value) {
            addCriterion("answertimes =", value, "answertimes");
            return (Criteria) this;
        }

        public Criteria andAnswertimesNotEqualTo(Integer value) {
            addCriterion("answertimes <>", value, "answertimes");
            return (Criteria) this;
        }

        public Criteria andAnswertimesGreaterThan(Integer value) {
            addCriterion("answertimes >", value, "answertimes");
            return (Criteria) this;
        }

        public Criteria andAnswertimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("answertimes >=", value, "answertimes");
            return (Criteria) this;
        }

        public Criteria andAnswertimesLessThan(Integer value) {
            addCriterion("answertimes <", value, "answertimes");
            return (Criteria) this;
        }

        public Criteria andAnswertimesLessThanOrEqualTo(Integer value) {
            addCriterion("answertimes <=", value, "answertimes");
            return (Criteria) this;
        }

        public Criteria andAnswertimesIn(List<Integer> values) {
            addCriterion("answertimes in", values, "answertimes");
            return (Criteria) this;
        }

        public Criteria andAnswertimesNotIn(List<Integer> values) {
            addCriterion("answertimes not in", values, "answertimes");
            return (Criteria) this;
        }

        public Criteria andAnswertimesBetween(Integer value1, Integer value2) {
            addCriterion("answertimes between", value1, value2, "answertimes");
            return (Criteria) this;
        }

        public Criteria andAnswertimesNotBetween(Integer value1, Integer value2) {
            addCriterion("answertimes not between", value1, value2, "answertimes");
            return (Criteria) this;
        }

        public Criteria andRighttimesIsNull() {
            addCriterion("righttimes is null");
            return (Criteria) this;
        }

        public Criteria andRighttimesIsNotNull() {
            addCriterion("righttimes is not null");
            return (Criteria) this;
        }

        public Criteria andRighttimesEqualTo(Integer value) {
            addCriterion("righttimes =", value, "righttimes");
            return (Criteria) this;
        }

        public Criteria andRighttimesNotEqualTo(Integer value) {
            addCriterion("righttimes <>", value, "righttimes");
            return (Criteria) this;
        }

        public Criteria andRighttimesGreaterThan(Integer value) {
            addCriterion("righttimes >", value, "righttimes");
            return (Criteria) this;
        }

        public Criteria andRighttimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("righttimes >=", value, "righttimes");
            return (Criteria) this;
        }

        public Criteria andRighttimesLessThan(Integer value) {
            addCriterion("righttimes <", value, "righttimes");
            return (Criteria) this;
        }

        public Criteria andRighttimesLessThanOrEqualTo(Integer value) {
            addCriterion("righttimes <=", value, "righttimes");
            return (Criteria) this;
        }

        public Criteria andRighttimesIn(List<Integer> values) {
            addCriterion("righttimes in", values, "righttimes");
            return (Criteria) this;
        }

        public Criteria andRighttimesNotIn(List<Integer> values) {
            addCriterion("righttimes not in", values, "righttimes");
            return (Criteria) this;
        }

        public Criteria andRighttimesBetween(Integer value1, Integer value2) {
            addCriterion("righttimes between", value1, value2, "righttimes");
            return (Criteria) this;
        }

        public Criteria andRighttimesNotBetween(Integer value1, Integer value2) {
            addCriterion("righttimes not between", value1, value2, "righttimes");
            return (Criteria) this;
        }

        public Criteria andTestinTimeIsNull() {
            addCriterion("testin_time is null");
            return (Criteria) this;
        }

        public Criteria andTestinTimeIsNotNull() {
            addCriterion("testin_time is not null");
            return (Criteria) this;
        }

        public Criteria andTestinTimeEqualTo(Date value) {
            addCriterion("testin_time =", value, "testinTime");
            return (Criteria) this;
        }

        public Criteria andTestinTimeNotEqualTo(Date value) {
            addCriterion("testin_time <>", value, "testinTime");
            return (Criteria) this;
        }

        public Criteria andTestinTimeGreaterThan(Date value) {
            addCriterion("testin_time >", value, "testinTime");
            return (Criteria) this;
        }

        public Criteria andTestinTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("testin_time >=", value, "testinTime");
            return (Criteria) this;
        }

        public Criteria andTestinTimeLessThan(Date value) {
            addCriterion("testin_time <", value, "testinTime");
            return (Criteria) this;
        }

        public Criteria andTestinTimeLessThanOrEqualTo(Date value) {
            addCriterion("testin_time <=", value, "testinTime");
            return (Criteria) this;
        }

        public Criteria andTestinTimeIn(List<Date> values) {
            addCriterion("testin_time in", values, "testinTime");
            return (Criteria) this;
        }

        public Criteria andTestinTimeNotIn(List<Date> values) {
            addCriterion("testin_time not in", values, "testinTime");
            return (Criteria) this;
        }

        public Criteria andTestinTimeBetween(Date value1, Date value2) {
            addCriterion("testin_time between", value1, value2, "testinTime");
            return (Criteria) this;
        }

        public Criteria andTestinTimeNotBetween(Date value1, Date value2) {
            addCriterion("testin_time not between", value1, value2, "testinTime");
            return (Criteria) this;
        }

        public Criteria andTestoutTimeIsNull() {
            addCriterion("testout_time is null");
            return (Criteria) this;
        }

        public Criteria andTestoutTimeIsNotNull() {
            addCriterion("testout_time is not null");
            return (Criteria) this;
        }

        public Criteria andTestoutTimeEqualTo(Date value) {
            addCriterion("testout_time =", value, "testoutTime");
            return (Criteria) this;
        }

        public Criteria andTestoutTimeNotEqualTo(Date value) {
            addCriterion("testout_time <>", value, "testoutTime");
            return (Criteria) this;
        }

        public Criteria andTestoutTimeGreaterThan(Date value) {
            addCriterion("testout_time >", value, "testoutTime");
            return (Criteria) this;
        }

        public Criteria andTestoutTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("testout_time >=", value, "testoutTime");
            return (Criteria) this;
        }

        public Criteria andTestoutTimeLessThan(Date value) {
            addCriterion("testout_time <", value, "testoutTime");
            return (Criteria) this;
        }

        public Criteria andTestoutTimeLessThanOrEqualTo(Date value) {
            addCriterion("testout_time <=", value, "testoutTime");
            return (Criteria) this;
        }

        public Criteria andTestoutTimeIn(List<Date> values) {
            addCriterion("testout_time in", values, "testoutTime");
            return (Criteria) this;
        }

        public Criteria andTestoutTimeNotIn(List<Date> values) {
            addCriterion("testout_time not in", values, "testoutTime");
            return (Criteria) this;
        }

        public Criteria andTestoutTimeBetween(Date value1, Date value2) {
            addCriterion("testout_time between", value1, value2, "testoutTime");
            return (Criteria) this;
        }

        public Criteria andTestoutTimeNotBetween(Date value1, Date value2) {
            addCriterion("testout_time not between", value1, value2, "testoutTime");
            return (Criteria) this;
        }

        public Criteria andTesttypeIsNull() {
            addCriterion("testtype is null");
            return (Criteria) this;
        }

        public Criteria andTesttypeIsNotNull() {
            addCriterion("testtype is not null");
            return (Criteria) this;
        }

        public Criteria andTesttypeEqualTo(Integer value) {
            addCriterion("testtype =", value, "testtype");
            return (Criteria) this;
        }

        public Criteria andTesttypeNotEqualTo(Integer value) {
            addCriterion("testtype <>", value, "testtype");
            return (Criteria) this;
        }

        public Criteria andTesttypeGreaterThan(Integer value) {
            addCriterion("testtype >", value, "testtype");
            return (Criteria) this;
        }

        public Criteria andTesttypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("testtype >=", value, "testtype");
            return (Criteria) this;
        }

        public Criteria andTesttypeLessThan(Integer value) {
            addCriterion("testtype <", value, "testtype");
            return (Criteria) this;
        }

        public Criteria andTesttypeLessThanOrEqualTo(Integer value) {
            addCriterion("testtype <=", value, "testtype");
            return (Criteria) this;
        }

        public Criteria andTesttypeIn(List<Integer> values) {
            addCriterion("testtype in", values, "testtype");
            return (Criteria) this;
        }

        public Criteria andTesttypeNotIn(List<Integer> values) {
            addCriterion("testtype not in", values, "testtype");
            return (Criteria) this;
        }

        public Criteria andTesttypeBetween(Integer value1, Integer value2) {
            addCriterion("testtype between", value1, value2, "testtype");
            return (Criteria) this;
        }

        public Criteria andTesttypeNotBetween(Integer value1, Integer value2) {
            addCriterion("testtype not between", value1, value2, "testtype");
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

        public Criteria andWordIsNull() {
            addCriterion("word is null");
            return (Criteria) this;
        }

        public Criteria andWordIsNotNull() {
            addCriterion("word is not null");
            return (Criteria) this;
        }

        public Criteria andWordEqualTo(String value) {
            addCriterion("word =", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordNotEqualTo(String value) {
            addCriterion("word <>", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordGreaterThan(String value) {
            addCriterion("word >", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordGreaterThanOrEqualTo(String value) {
            addCriterion("word >=", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordLessThan(String value) {
            addCriterion("word <", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordLessThanOrEqualTo(String value) {
            addCriterion("word <=", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordLike(String value) {
            addCriterion("word like", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordNotLike(String value) {
            addCriterion("word not like", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordIn(List<String> values) {
            addCriterion("word in", values, "word");
            return (Criteria) this;
        }

        public Criteria andWordNotIn(List<String> values) {
            addCriterion("word not in", values, "word");
            return (Criteria) this;
        }

        public Criteria andWordBetween(String value1, String value2) {
            addCriterion("word between", value1, value2, "word");
            return (Criteria) this;
        }

        public Criteria andWordNotBetween(String value1, String value2) {
            addCriterion("word not between", value1, value2, "word");
            return (Criteria) this;
        }

        public Criteria andWrongtimesIsNull() {
            addCriterion("wrongtimes is null");
            return (Criteria) this;
        }

        public Criteria andWrongtimesIsNotNull() {
            addCriterion("wrongtimes is not null");
            return (Criteria) this;
        }

        public Criteria andWrongtimesEqualTo(Integer value) {
            addCriterion("wrongtimes =", value, "wrongtimes");
            return (Criteria) this;
        }

        public Criteria andWrongtimesNotEqualTo(Integer value) {
            addCriterion("wrongtimes <>", value, "wrongtimes");
            return (Criteria) this;
        }

        public Criteria andWrongtimesGreaterThan(Integer value) {
            addCriterion("wrongtimes >", value, "wrongtimes");
            return (Criteria) this;
        }

        public Criteria andWrongtimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("wrongtimes >=", value, "wrongtimes");
            return (Criteria) this;
        }

        public Criteria andWrongtimesLessThan(Integer value) {
            addCriterion("wrongtimes <", value, "wrongtimes");
            return (Criteria) this;
        }

        public Criteria andWrongtimesLessThanOrEqualTo(Integer value) {
            addCriterion("wrongtimes <=", value, "wrongtimes");
            return (Criteria) this;
        }

        public Criteria andWrongtimesIn(List<Integer> values) {
            addCriterion("wrongtimes in", values, "wrongtimes");
            return (Criteria) this;
        }

        public Criteria andWrongtimesNotIn(List<Integer> values) {
            addCriterion("wrongtimes not in", values, "wrongtimes");
            return (Criteria) this;
        }

        public Criteria andWrongtimesBetween(Integer value1, Integer value2) {
            addCriterion("wrongtimes between", value1, value2, "wrongtimes");
            return (Criteria) this;
        }

        public Criteria andWrongtimesNotBetween(Integer value1, Integer value2) {
            addCriterion("wrongtimes not between", value1, value2, "wrongtimes");
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