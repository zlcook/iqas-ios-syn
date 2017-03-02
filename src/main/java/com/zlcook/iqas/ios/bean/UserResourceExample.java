package com.zlcook.iqas.ios.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserResourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserResourceExample() {
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

        public Criteria andUserResourceIdIsNull() {
            addCriterion("user_resource_id is null");
            return (Criteria) this;
        }

        public Criteria andUserResourceIdIsNotNull() {
            addCriterion("user_resource_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserResourceIdEqualTo(Integer value) {
            addCriterion("user_resource_id =", value, "userResourceId");
            return (Criteria) this;
        }

        public Criteria andUserResourceIdNotEqualTo(Integer value) {
            addCriterion("user_resource_id <>", value, "userResourceId");
            return (Criteria) this;
        }

        public Criteria andUserResourceIdGreaterThan(Integer value) {
            addCriterion("user_resource_id >", value, "userResourceId");
            return (Criteria) this;
        }

        public Criteria andUserResourceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_resource_id >=", value, "userResourceId");
            return (Criteria) this;
        }

        public Criteria andUserResourceIdLessThan(Integer value) {
            addCriterion("user_resource_id <", value, "userResourceId");
            return (Criteria) this;
        }

        public Criteria andUserResourceIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_resource_id <=", value, "userResourceId");
            return (Criteria) this;
        }

        public Criteria andUserResourceIdIn(List<Integer> values) {
            addCriterion("user_resource_id in", values, "userResourceId");
            return (Criteria) this;
        }

        public Criteria andUserResourceIdNotIn(List<Integer> values) {
            addCriterion("user_resource_id not in", values, "userResourceId");
            return (Criteria) this;
        }

        public Criteria andUserResourceIdBetween(Integer value1, Integer value2) {
            addCriterion("user_resource_id between", value1, value2, "userResourceId");
            return (Criteria) this;
        }

        public Criteria andUserResourceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_resource_id not between", value1, value2, "userResourceId");
            return (Criteria) this;
        }

        public Criteria andLearncountIsNull() {
            addCriterion("learncount is null");
            return (Criteria) this;
        }

        public Criteria andLearncountIsNotNull() {
            addCriterion("learncount is not null");
            return (Criteria) this;
        }

        public Criteria andLearncountEqualTo(Integer value) {
            addCriterion("learncount =", value, "learncount");
            return (Criteria) this;
        }

        public Criteria andLearncountNotEqualTo(Integer value) {
            addCriterion("learncount <>", value, "learncount");
            return (Criteria) this;
        }

        public Criteria andLearncountGreaterThan(Integer value) {
            addCriterion("learncount >", value, "learncount");
            return (Criteria) this;
        }

        public Criteria andLearncountGreaterThanOrEqualTo(Integer value) {
            addCriterion("learncount >=", value, "learncount");
            return (Criteria) this;
        }

        public Criteria andLearncountLessThan(Integer value) {
            addCriterion("learncount <", value, "learncount");
            return (Criteria) this;
        }

        public Criteria andLearncountLessThanOrEqualTo(Integer value) {
            addCriterion("learncount <=", value, "learncount");
            return (Criteria) this;
        }

        public Criteria andLearncountIn(List<Integer> values) {
            addCriterion("learncount in", values, "learncount");
            return (Criteria) this;
        }

        public Criteria andLearncountNotIn(List<Integer> values) {
            addCriterion("learncount not in", values, "learncount");
            return (Criteria) this;
        }

        public Criteria andLearncountBetween(Integer value1, Integer value2) {
            addCriterion("learncount between", value1, value2, "learncount");
            return (Criteria) this;
        }

        public Criteria andLearncountNotBetween(Integer value1, Integer value2) {
            addCriterion("learncount not between", value1, value2, "learncount");
            return (Criteria) this;
        }

        public Criteria andLearntimenowIsNull() {
            addCriterion("learntimenow is null");
            return (Criteria) this;
        }

        public Criteria andLearntimenowIsNotNull() {
            addCriterion("learntimenow is not null");
            return (Criteria) this;
        }

        public Criteria andLearntimenowEqualTo(Integer value) {
            addCriterion("learntimenow =", value, "learntimenow");
            return (Criteria) this;
        }

        public Criteria andLearntimenowNotEqualTo(Integer value) {
            addCriterion("learntimenow <>", value, "learntimenow");
            return (Criteria) this;
        }

        public Criteria andLearntimenowGreaterThan(Integer value) {
            addCriterion("learntimenow >", value, "learntimenow");
            return (Criteria) this;
        }

        public Criteria andLearntimenowGreaterThanOrEqualTo(Integer value) {
            addCriterion("learntimenow >=", value, "learntimenow");
            return (Criteria) this;
        }

        public Criteria andLearntimenowLessThan(Integer value) {
            addCriterion("learntimenow <", value, "learntimenow");
            return (Criteria) this;
        }

        public Criteria andLearntimenowLessThanOrEqualTo(Integer value) {
            addCriterion("learntimenow <=", value, "learntimenow");
            return (Criteria) this;
        }

        public Criteria andLearntimenowIn(List<Integer> values) {
            addCriterion("learntimenow in", values, "learntimenow");
            return (Criteria) this;
        }

        public Criteria andLearntimenowNotIn(List<Integer> values) {
            addCriterion("learntimenow not in", values, "learntimenow");
            return (Criteria) this;
        }

        public Criteria andLearntimenowBetween(Integer value1, Integer value2) {
            addCriterion("learntimenow between", value1, value2, "learntimenow");
            return (Criteria) this;
        }

        public Criteria andLearntimenowNotBetween(Integer value1, Integer value2) {
            addCriterion("learntimenow not between", value1, value2, "learntimenow");
            return (Criteria) this;
        }

        public Criteria andLearntimesIsNull() {
            addCriterion("learntimes is null");
            return (Criteria) this;
        }

        public Criteria andLearntimesIsNotNull() {
            addCriterion("learntimes is not null");
            return (Criteria) this;
        }

        public Criteria andLearntimesEqualTo(Integer value) {
            addCriterion("learntimes =", value, "learntimes");
            return (Criteria) this;
        }

        public Criteria andLearntimesNotEqualTo(Integer value) {
            addCriterion("learntimes <>", value, "learntimes");
            return (Criteria) this;
        }

        public Criteria andLearntimesGreaterThan(Integer value) {
            addCriterion("learntimes >", value, "learntimes");
            return (Criteria) this;
        }

        public Criteria andLearntimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("learntimes >=", value, "learntimes");
            return (Criteria) this;
        }

        public Criteria andLearntimesLessThan(Integer value) {
            addCriterion("learntimes <", value, "learntimes");
            return (Criteria) this;
        }

        public Criteria andLearntimesLessThanOrEqualTo(Integer value) {
            addCriterion("learntimes <=", value, "learntimes");
            return (Criteria) this;
        }

        public Criteria andLearntimesIn(List<Integer> values) {
            addCriterion("learntimes in", values, "learntimes");
            return (Criteria) this;
        }

        public Criteria andLearntimesNotIn(List<Integer> values) {
            addCriterion("learntimes not in", values, "learntimes");
            return (Criteria) this;
        }

        public Criteria andLearntimesBetween(Integer value1, Integer value2) {
            addCriterion("learntimes between", value1, value2, "learntimes");
            return (Criteria) this;
        }

        public Criteria andLearntimesNotBetween(Integer value1, Integer value2) {
            addCriterion("learntimes not between", value1, value2, "learntimes");
            return (Criteria) this;
        }

        public Criteria andRTypeIsNull() {
            addCriterion("r_type is null");
            return (Criteria) this;
        }

        public Criteria andRTypeIsNotNull() {
            addCriterion("r_type is not null");
            return (Criteria) this;
        }

        public Criteria andRTypeEqualTo(Integer value) {
            addCriterion("r_type =", value, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeNotEqualTo(Integer value) {
            addCriterion("r_type <>", value, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeGreaterThan(Integer value) {
            addCriterion("r_type >", value, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("r_type >=", value, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeLessThan(Integer value) {
            addCriterion("r_type <", value, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeLessThanOrEqualTo(Integer value) {
            addCriterion("r_type <=", value, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeIn(List<Integer> values) {
            addCriterion("r_type in", values, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeNotIn(List<Integer> values) {
            addCriterion("r_type not in", values, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeBetween(Integer value1, Integer value2) {
            addCriterion("r_type between", value1, value2, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("r_type not between", value1, value2, "rType");
            return (Criteria) this;
        }

        public Criteria andResourceIdIsNull() {
            addCriterion("resource_id is null");
            return (Criteria) this;
        }

        public Criteria andResourceIdIsNotNull() {
            addCriterion("resource_id is not null");
            return (Criteria) this;
        }

        public Criteria andResourceIdEqualTo(Integer value) {
            addCriterion("resource_id =", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotEqualTo(Integer value) {
            addCriterion("resource_id <>", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdGreaterThan(Integer value) {
            addCriterion("resource_id >", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("resource_id >=", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdLessThan(Integer value) {
            addCriterion("resource_id <", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdLessThanOrEqualTo(Integer value) {
            addCriterion("resource_id <=", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdIn(List<Integer> values) {
            addCriterion("resource_id in", values, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotIn(List<Integer> values) {
            addCriterion("resource_id not in", values, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdBetween(Integer value1, Integer value2) {
            addCriterion("resource_id between", value1, value2, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("resource_id not between", value1, value2, "resourceId");
            return (Criteria) this;
        }

        public Criteria andRloginTimeIsNull() {
            addCriterion("rlogin_time is null");
            return (Criteria) this;
        }

        public Criteria andRloginTimeIsNotNull() {
            addCriterion("rlogin_time is not null");
            return (Criteria) this;
        }

        public Criteria andRloginTimeEqualTo(Date value) {
            addCriterion("rlogin_time =", value, "rloginTime");
            return (Criteria) this;
        }

        public Criteria andRloginTimeNotEqualTo(Date value) {
            addCriterion("rlogin_time <>", value, "rloginTime");
            return (Criteria) this;
        }

        public Criteria andRloginTimeGreaterThan(Date value) {
            addCriterion("rlogin_time >", value, "rloginTime");
            return (Criteria) this;
        }

        public Criteria andRloginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("rlogin_time >=", value, "rloginTime");
            return (Criteria) this;
        }

        public Criteria andRloginTimeLessThan(Date value) {
            addCriterion("rlogin_time <", value, "rloginTime");
            return (Criteria) this;
        }

        public Criteria andRloginTimeLessThanOrEqualTo(Date value) {
            addCriterion("rlogin_time <=", value, "rloginTime");
            return (Criteria) this;
        }

        public Criteria andRloginTimeIn(List<Date> values) {
            addCriterion("rlogin_time in", values, "rloginTime");
            return (Criteria) this;
        }

        public Criteria andRloginTimeNotIn(List<Date> values) {
            addCriterion("rlogin_time not in", values, "rloginTime");
            return (Criteria) this;
        }

        public Criteria andRloginTimeBetween(Date value1, Date value2) {
            addCriterion("rlogin_time between", value1, value2, "rloginTime");
            return (Criteria) this;
        }

        public Criteria andRloginTimeNotBetween(Date value1, Date value2) {
            addCriterion("rlogin_time not between", value1, value2, "rloginTime");
            return (Criteria) this;
        }

        public Criteria andRlogoutTimeIsNull() {
            addCriterion("rlogout_time is null");
            return (Criteria) this;
        }

        public Criteria andRlogoutTimeIsNotNull() {
            addCriterion("rlogout_time is not null");
            return (Criteria) this;
        }

        public Criteria andRlogoutTimeEqualTo(Date value) {
            addCriterion("rlogout_time =", value, "rlogoutTime");
            return (Criteria) this;
        }

        public Criteria andRlogoutTimeNotEqualTo(Date value) {
            addCriterion("rlogout_time <>", value, "rlogoutTime");
            return (Criteria) this;
        }

        public Criteria andRlogoutTimeGreaterThan(Date value) {
            addCriterion("rlogout_time >", value, "rlogoutTime");
            return (Criteria) this;
        }

        public Criteria andRlogoutTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("rlogout_time >=", value, "rlogoutTime");
            return (Criteria) this;
        }

        public Criteria andRlogoutTimeLessThan(Date value) {
            addCriterion("rlogout_time <", value, "rlogoutTime");
            return (Criteria) this;
        }

        public Criteria andRlogoutTimeLessThanOrEqualTo(Date value) {
            addCriterion("rlogout_time <=", value, "rlogoutTime");
            return (Criteria) this;
        }

        public Criteria andRlogoutTimeIn(List<Date> values) {
            addCriterion("rlogout_time in", values, "rlogoutTime");
            return (Criteria) this;
        }

        public Criteria andRlogoutTimeNotIn(List<Date> values) {
            addCriterion("rlogout_time not in", values, "rlogoutTime");
            return (Criteria) this;
        }

        public Criteria andRlogoutTimeBetween(Date value1, Date value2) {
            addCriterion("rlogout_time between", value1, value2, "rlogoutTime");
            return (Criteria) this;
        }

        public Criteria andRlogoutTimeNotBetween(Date value1, Date value2) {
            addCriterion("rlogout_time not between", value1, value2, "rlogoutTime");
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