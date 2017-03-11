package com.zlcook.iqas.ios.bean;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andAdaptiveIsNull() {
            addCriterion("adaptive is null");
            return (Criteria) this;
        }

        public Criteria andAdaptiveIsNotNull() {
            addCriterion("adaptive is not null");
            return (Criteria) this;
        }

        public Criteria andAdaptiveEqualTo(Integer value) {
            addCriterion("adaptive =", value, "adaptive");
            return (Criteria) this;
        }

        public Criteria andAdaptiveNotEqualTo(Integer value) {
            addCriterion("adaptive <>", value, "adaptive");
            return (Criteria) this;
        }

        public Criteria andAdaptiveGreaterThan(Integer value) {
            addCriterion("adaptive >", value, "adaptive");
            return (Criteria) this;
        }

        public Criteria andAdaptiveGreaterThanOrEqualTo(Integer value) {
            addCriterion("adaptive >=", value, "adaptive");
            return (Criteria) this;
        }

        public Criteria andAdaptiveLessThan(Integer value) {
            addCriterion("adaptive <", value, "adaptive");
            return (Criteria) this;
        }

        public Criteria andAdaptiveLessThanOrEqualTo(Integer value) {
            addCriterion("adaptive <=", value, "adaptive");
            return (Criteria) this;
        }

        public Criteria andAdaptiveIn(List<Integer> values) {
            addCriterion("adaptive in", values, "adaptive");
            return (Criteria) this;
        }

        public Criteria andAdaptiveNotIn(List<Integer> values) {
            addCriterion("adaptive not in", values, "adaptive");
            return (Criteria) this;
        }

        public Criteria andAdaptiveBetween(Integer value1, Integer value2) {
            addCriterion("adaptive between", value1, value2, "adaptive");
            return (Criteria) this;
        }

        public Criteria andAdaptiveNotBetween(Integer value1, Integer value2) {
            addCriterion("adaptive not between", value1, value2, "adaptive");
            return (Criteria) this;
        }

        public Criteria andClassNumIsNull() {
            addCriterion("class_num is null");
            return (Criteria) this;
        }

        public Criteria andClassNumIsNotNull() {
            addCriterion("class_num is not null");
            return (Criteria) this;
        }

        public Criteria andClassNumEqualTo(Integer value) {
            addCriterion("class_num =", value, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumNotEqualTo(Integer value) {
            addCriterion("class_num <>", value, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumGreaterThan(Integer value) {
            addCriterion("class_num >", value, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("class_num >=", value, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumLessThan(Integer value) {
            addCriterion("class_num <", value, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumLessThanOrEqualTo(Integer value) {
            addCriterion("class_num <=", value, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumIn(List<Integer> values) {
            addCriterion("class_num in", values, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumNotIn(List<Integer> values) {
            addCriterion("class_num not in", values, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumBetween(Integer value1, Integer value2) {
            addCriterion("class_num between", value1, value2, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumNotBetween(Integer value1, Integer value2) {
            addCriterion("class_num not between", value1, value2, "classNum");
            return (Criteria) this;
        }

        public Criteria andGradeIsNull() {
            addCriterion("grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(String value) {
            addCriterion("grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(String value) {
            addCriterion("grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(String value) {
            addCriterion("grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(String value) {
            addCriterion("grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(String value) {
            addCriterion("grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(String value) {
            addCriterion("grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLike(String value) {
            addCriterion("grade like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotLike(String value) {
            addCriterion("grade not like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<String> values) {
            addCriterion("grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<String> values) {
            addCriterion("grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(String value1, String value2) {
            addCriterion("grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(String value1, String value2) {
            addCriterion("grade not between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andLearningstyle1IsNull() {
            addCriterion("learningstyle1 is null");
            return (Criteria) this;
        }

        public Criteria andLearningstyle1IsNotNull() {
            addCriterion("learningstyle1 is not null");
            return (Criteria) this;
        }

        public Criteria andLearningstyle1EqualTo(Integer value) {
            addCriterion("learningstyle1 =", value, "learningstyle1");
            return (Criteria) this;
        }

        public Criteria andLearningstyle1NotEqualTo(Integer value) {
            addCriterion("learningstyle1 <>", value, "learningstyle1");
            return (Criteria) this;
        }

        public Criteria andLearningstyle1GreaterThan(Integer value) {
            addCriterion("learningstyle1 >", value, "learningstyle1");
            return (Criteria) this;
        }

        public Criteria andLearningstyle1GreaterThanOrEqualTo(Integer value) {
            addCriterion("learningstyle1 >=", value, "learningstyle1");
            return (Criteria) this;
        }

        public Criteria andLearningstyle1LessThan(Integer value) {
            addCriterion("learningstyle1 <", value, "learningstyle1");
            return (Criteria) this;
        }

        public Criteria andLearningstyle1LessThanOrEqualTo(Integer value) {
            addCriterion("learningstyle1 <=", value, "learningstyle1");
            return (Criteria) this;
        }

        public Criteria andLearningstyle1In(List<Integer> values) {
            addCriterion("learningstyle1 in", values, "learningstyle1");
            return (Criteria) this;
        }

        public Criteria andLearningstyle1NotIn(List<Integer> values) {
            addCriterion("learningstyle1 not in", values, "learningstyle1");
            return (Criteria) this;
        }

        public Criteria andLearningstyle1Between(Integer value1, Integer value2) {
            addCriterion("learningstyle1 between", value1, value2, "learningstyle1");
            return (Criteria) this;
        }

        public Criteria andLearningstyle1NotBetween(Integer value1, Integer value2) {
            addCriterion("learningstyle1 not between", value1, value2, "learningstyle1");
            return (Criteria) this;
        }

        public Criteria andLearningstyle2IsNull() {
            addCriterion("learningstyle2 is null");
            return (Criteria) this;
        }

        public Criteria andLearningstyle2IsNotNull() {
            addCriterion("learningstyle2 is not null");
            return (Criteria) this;
        }

        public Criteria andLearningstyle2EqualTo(Integer value) {
            addCriterion("learningstyle2 =", value, "learningstyle2");
            return (Criteria) this;
        }

        public Criteria andLearningstyle2NotEqualTo(Integer value) {
            addCriterion("learningstyle2 <>", value, "learningstyle2");
            return (Criteria) this;
        }

        public Criteria andLearningstyle2GreaterThan(Integer value) {
            addCriterion("learningstyle2 >", value, "learningstyle2");
            return (Criteria) this;
        }

        public Criteria andLearningstyle2GreaterThanOrEqualTo(Integer value) {
            addCriterion("learningstyle2 >=", value, "learningstyle2");
            return (Criteria) this;
        }

        public Criteria andLearningstyle2LessThan(Integer value) {
            addCriterion("learningstyle2 <", value, "learningstyle2");
            return (Criteria) this;
        }

        public Criteria andLearningstyle2LessThanOrEqualTo(Integer value) {
            addCriterion("learningstyle2 <=", value, "learningstyle2");
            return (Criteria) this;
        }

        public Criteria andLearningstyle2In(List<Integer> values) {
            addCriterion("learningstyle2 in", values, "learningstyle2");
            return (Criteria) this;
        }

        public Criteria andLearningstyle2NotIn(List<Integer> values) {
            addCriterion("learningstyle2 not in", values, "learningstyle2");
            return (Criteria) this;
        }

        public Criteria andLearningstyle2Between(Integer value1, Integer value2) {
            addCriterion("learningstyle2 between", value1, value2, "learningstyle2");
            return (Criteria) this;
        }

        public Criteria andLearningstyle2NotBetween(Integer value1, Integer value2) {
            addCriterion("learningstyle2 not between", value1, value2, "learningstyle2");
            return (Criteria) this;
        }

        public Criteria andLearningstyle3IsNull() {
            addCriterion("learningstyle3 is null");
            return (Criteria) this;
        }

        public Criteria andLearningstyle3IsNotNull() {
            addCriterion("learningstyle3 is not null");
            return (Criteria) this;
        }

        public Criteria andLearningstyle3EqualTo(Integer value) {
            addCriterion("learningstyle3 =", value, "learningstyle3");
            return (Criteria) this;
        }

        public Criteria andLearningstyle3NotEqualTo(Integer value) {
            addCriterion("learningstyle3 <>", value, "learningstyle3");
            return (Criteria) this;
        }

        public Criteria andLearningstyle3GreaterThan(Integer value) {
            addCriterion("learningstyle3 >", value, "learningstyle3");
            return (Criteria) this;
        }

        public Criteria andLearningstyle3GreaterThanOrEqualTo(Integer value) {
            addCriterion("learningstyle3 >=", value, "learningstyle3");
            return (Criteria) this;
        }

        public Criteria andLearningstyle3LessThan(Integer value) {
            addCriterion("learningstyle3 <", value, "learningstyle3");
            return (Criteria) this;
        }

        public Criteria andLearningstyle3LessThanOrEqualTo(Integer value) {
            addCriterion("learningstyle3 <=", value, "learningstyle3");
            return (Criteria) this;
        }

        public Criteria andLearningstyle3In(List<Integer> values) {
            addCriterion("learningstyle3 in", values, "learningstyle3");
            return (Criteria) this;
        }

        public Criteria andLearningstyle3NotIn(List<Integer> values) {
            addCriterion("learningstyle3 not in", values, "learningstyle3");
            return (Criteria) this;
        }

        public Criteria andLearningstyle3Between(Integer value1, Integer value2) {
            addCriterion("learningstyle3 between", value1, value2, "learningstyle3");
            return (Criteria) this;
        }

        public Criteria andLearningstyle3NotBetween(Integer value1, Integer value2) {
            addCriterion("learningstyle3 not between", value1, value2, "learningstyle3");
            return (Criteria) this;
        }

        public Criteria andLearningtyle4IsNull() {
            addCriterion("learningtyle4 is null");
            return (Criteria) this;
        }

        public Criteria andLearningtyle4IsNotNull() {
            addCriterion("learningtyle4 is not null");
            return (Criteria) this;
        }

        public Criteria andLearningtyle4EqualTo(Integer value) {
            addCriterion("learningtyle4 =", value, "learningtyle4");
            return (Criteria) this;
        }

        public Criteria andLearningtyle4NotEqualTo(Integer value) {
            addCriterion("learningtyle4 <>", value, "learningtyle4");
            return (Criteria) this;
        }

        public Criteria andLearningtyle4GreaterThan(Integer value) {
            addCriterion("learningtyle4 >", value, "learningtyle4");
            return (Criteria) this;
        }

        public Criteria andLearningtyle4GreaterThanOrEqualTo(Integer value) {
            addCriterion("learningtyle4 >=", value, "learningtyle4");
            return (Criteria) this;
        }

        public Criteria andLearningtyle4LessThan(Integer value) {
            addCriterion("learningtyle4 <", value, "learningtyle4");
            return (Criteria) this;
        }

        public Criteria andLearningtyle4LessThanOrEqualTo(Integer value) {
            addCriterion("learningtyle4 <=", value, "learningtyle4");
            return (Criteria) this;
        }

        public Criteria andLearningtyle4In(List<Integer> values) {
            addCriterion("learningtyle4 in", values, "learningtyle4");
            return (Criteria) this;
        }

        public Criteria andLearningtyle4NotIn(List<Integer> values) {
            addCriterion("learningtyle4 not in", values, "learningtyle4");
            return (Criteria) this;
        }

        public Criteria andLearningtyle4Between(Integer value1, Integer value2) {
            addCriterion("learningtyle4 between", value1, value2, "learningtyle4");
            return (Criteria) this;
        }

        public Criteria andLearningtyle4NotBetween(Integer value1, Integer value2) {
            addCriterion("learningtyle4 not between", value1, value2, "learningtyle4");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Integer value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNull() {
            addCriterion("login_name is null");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNotNull() {
            addCriterion("login_name is not null");
            return (Criteria) this;
        }

        public Criteria andLoginNameEqualTo(String value) {
            addCriterion("login_name =", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotEqualTo(String value) {
            addCriterion("login_name <>", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThan(String value) {
            addCriterion("login_name >", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThanOrEqualTo(String value) {
            addCriterion("login_name >=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThan(String value) {
            addCriterion("login_name <", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThanOrEqualTo(String value) {
            addCriterion("login_name <=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLike(String value) {
            addCriterion("login_name like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotLike(String value) {
            addCriterion("login_name not like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameIn(List<String> values) {
            addCriterion("login_name in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotIn(List<String> values) {
            addCriterion("login_name not in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameBetween(String value1, String value2) {
            addCriterion("login_name between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotBetween(String value1, String value2) {
            addCriterion("login_name not between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginTimesIsNull() {
            addCriterion("login_times is null");
            return (Criteria) this;
        }

        public Criteria andLoginTimesIsNotNull() {
            addCriterion("login_times is not null");
            return (Criteria) this;
        }

        public Criteria andLoginTimesEqualTo(Integer value) {
            addCriterion("login_times =", value, "loginTimes");
            return (Criteria) this;
        }

        public Criteria andLoginTimesNotEqualTo(Integer value) {
            addCriterion("login_times <>", value, "loginTimes");
            return (Criteria) this;
        }

        public Criteria andLoginTimesGreaterThan(Integer value) {
            addCriterion("login_times >", value, "loginTimes");
            return (Criteria) this;
        }

        public Criteria andLoginTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("login_times >=", value, "loginTimes");
            return (Criteria) this;
        }

        public Criteria andLoginTimesLessThan(Integer value) {
            addCriterion("login_times <", value, "loginTimes");
            return (Criteria) this;
        }

        public Criteria andLoginTimesLessThanOrEqualTo(Integer value) {
            addCriterion("login_times <=", value, "loginTimes");
            return (Criteria) this;
        }

        public Criteria andLoginTimesIn(List<Integer> values) {
            addCriterion("login_times in", values, "loginTimes");
            return (Criteria) this;
        }

        public Criteria andLoginTimesNotIn(List<Integer> values) {
            addCriterion("login_times not in", values, "loginTimes");
            return (Criteria) this;
        }

        public Criteria andLoginTimesBetween(Integer value1, Integer value2) {
            addCriterion("login_times between", value1, value2, "loginTimes");
            return (Criteria) this;
        }

        public Criteria andLoginTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("login_times not between", value1, value2, "loginTimes");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPresentgradeIsNull() {
            addCriterion("presentgrade is null");
            return (Criteria) this;
        }

        public Criteria andPresentgradeIsNotNull() {
            addCriterion("presentgrade is not null");
            return (Criteria) this;
        }

        public Criteria andPresentgradeEqualTo(Integer value) {
            addCriterion("presentgrade =", value, "presentgrade");
            return (Criteria) this;
        }

        public Criteria andPresentgradeNotEqualTo(Integer value) {
            addCriterion("presentgrade <>", value, "presentgrade");
            return (Criteria) this;
        }

        public Criteria andPresentgradeGreaterThan(Integer value) {
            addCriterion("presentgrade >", value, "presentgrade");
            return (Criteria) this;
        }

        public Criteria andPresentgradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("presentgrade >=", value, "presentgrade");
            return (Criteria) this;
        }

        public Criteria andPresentgradeLessThan(Integer value) {
            addCriterion("presentgrade <", value, "presentgrade");
            return (Criteria) this;
        }

        public Criteria andPresentgradeLessThanOrEqualTo(Integer value) {
            addCriterion("presentgrade <=", value, "presentgrade");
            return (Criteria) this;
        }

        public Criteria andPresentgradeIn(List<Integer> values) {
            addCriterion("presentgrade in", values, "presentgrade");
            return (Criteria) this;
        }

        public Criteria andPresentgradeNotIn(List<Integer> values) {
            addCriterion("presentgrade not in", values, "presentgrade");
            return (Criteria) this;
        }

        public Criteria andPresentgradeBetween(Integer value1, Integer value2) {
            addCriterion("presentgrade between", value1, value2, "presentgrade");
            return (Criteria) this;
        }

        public Criteria andPresentgradeNotBetween(Integer value1, Integer value2) {
            addCriterion("presentgrade not between", value1, value2, "presentgrade");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNull() {
            addCriterion("real_name is null");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNotNull() {
            addCriterion("real_name is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameEqualTo(String value) {
            addCriterion("real_name =", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotEqualTo(String value) {
            addCriterion("real_name <>", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThan(String value) {
            addCriterion("real_name >", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("real_name >=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThan(String value) {
            addCriterion("real_name <", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThanOrEqualTo(String value) {
            addCriterion("real_name <=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLike(String value) {
            addCriterion("real_name like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotLike(String value) {
            addCriterion("real_name not like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameIn(List<String> values) {
            addCriterion("real_name in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotIn(List<String> values) {
            addCriterion("real_name not in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameBetween(String value1, String value2) {
            addCriterion("real_name between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotBetween(String value1, String value2) {
            addCriterion("real_name not between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andResourcecount1IsNull() {
            addCriterion("resourcecount1 is null");
            return (Criteria) this;
        }

        public Criteria andResourcecount1IsNotNull() {
            addCriterion("resourcecount1 is not null");
            return (Criteria) this;
        }

        public Criteria andResourcecount1EqualTo(Integer value) {
            addCriterion("resourcecount1 =", value, "resourcecount1");
            return (Criteria) this;
        }

        public Criteria andResourcecount1NotEqualTo(Integer value) {
            addCriterion("resourcecount1 <>", value, "resourcecount1");
            return (Criteria) this;
        }

        public Criteria andResourcecount1GreaterThan(Integer value) {
            addCriterion("resourcecount1 >", value, "resourcecount1");
            return (Criteria) this;
        }

        public Criteria andResourcecount1GreaterThanOrEqualTo(Integer value) {
            addCriterion("resourcecount1 >=", value, "resourcecount1");
            return (Criteria) this;
        }

        public Criteria andResourcecount1LessThan(Integer value) {
            addCriterion("resourcecount1 <", value, "resourcecount1");
            return (Criteria) this;
        }

        public Criteria andResourcecount1LessThanOrEqualTo(Integer value) {
            addCriterion("resourcecount1 <=", value, "resourcecount1");
            return (Criteria) this;
        }

        public Criteria andResourcecount1In(List<Integer> values) {
            addCriterion("resourcecount1 in", values, "resourcecount1");
            return (Criteria) this;
        }

        public Criteria andResourcecount1NotIn(List<Integer> values) {
            addCriterion("resourcecount1 not in", values, "resourcecount1");
            return (Criteria) this;
        }

        public Criteria andResourcecount1Between(Integer value1, Integer value2) {
            addCriterion("resourcecount1 between", value1, value2, "resourcecount1");
            return (Criteria) this;
        }

        public Criteria andResourcecount1NotBetween(Integer value1, Integer value2) {
            addCriterion("resourcecount1 not between", value1, value2, "resourcecount1");
            return (Criteria) this;
        }

        public Criteria andResourcecount2IsNull() {
            addCriterion("resourcecount2 is null");
            return (Criteria) this;
        }

        public Criteria andResourcecount2IsNotNull() {
            addCriterion("resourcecount2 is not null");
            return (Criteria) this;
        }

        public Criteria andResourcecount2EqualTo(Integer value) {
            addCriterion("resourcecount2 =", value, "resourcecount2");
            return (Criteria) this;
        }

        public Criteria andResourcecount2NotEqualTo(Integer value) {
            addCriterion("resourcecount2 <>", value, "resourcecount2");
            return (Criteria) this;
        }

        public Criteria andResourcecount2GreaterThan(Integer value) {
            addCriterion("resourcecount2 >", value, "resourcecount2");
            return (Criteria) this;
        }

        public Criteria andResourcecount2GreaterThanOrEqualTo(Integer value) {
            addCriterion("resourcecount2 >=", value, "resourcecount2");
            return (Criteria) this;
        }

        public Criteria andResourcecount2LessThan(Integer value) {
            addCriterion("resourcecount2 <", value, "resourcecount2");
            return (Criteria) this;
        }

        public Criteria andResourcecount2LessThanOrEqualTo(Integer value) {
            addCriterion("resourcecount2 <=", value, "resourcecount2");
            return (Criteria) this;
        }

        public Criteria andResourcecount2In(List<Integer> values) {
            addCriterion("resourcecount2 in", values, "resourcecount2");
            return (Criteria) this;
        }

        public Criteria andResourcecount2NotIn(List<Integer> values) {
            addCriterion("resourcecount2 not in", values, "resourcecount2");
            return (Criteria) this;
        }

        public Criteria andResourcecount2Between(Integer value1, Integer value2) {
            addCriterion("resourcecount2 between", value1, value2, "resourcecount2");
            return (Criteria) this;
        }

        public Criteria andResourcecount2NotBetween(Integer value1, Integer value2) {
            addCriterion("resourcecount2 not between", value1, value2, "resourcecount2");
            return (Criteria) this;
        }

        public Criteria andResourcecount3IsNull() {
            addCriterion("resourcecount3 is null");
            return (Criteria) this;
        }

        public Criteria andResourcecount3IsNotNull() {
            addCriterion("resourcecount3 is not null");
            return (Criteria) this;
        }

        public Criteria andResourcecount3EqualTo(Integer value) {
            addCriterion("resourcecount3 =", value, "resourcecount3");
            return (Criteria) this;
        }

        public Criteria andResourcecount3NotEqualTo(Integer value) {
            addCriterion("resourcecount3 <>", value, "resourcecount3");
            return (Criteria) this;
        }

        public Criteria andResourcecount3GreaterThan(Integer value) {
            addCriterion("resourcecount3 >", value, "resourcecount3");
            return (Criteria) this;
        }

        public Criteria andResourcecount3GreaterThanOrEqualTo(Integer value) {
            addCriterion("resourcecount3 >=", value, "resourcecount3");
            return (Criteria) this;
        }

        public Criteria andResourcecount3LessThan(Integer value) {
            addCriterion("resourcecount3 <", value, "resourcecount3");
            return (Criteria) this;
        }

        public Criteria andResourcecount3LessThanOrEqualTo(Integer value) {
            addCriterion("resourcecount3 <=", value, "resourcecount3");
            return (Criteria) this;
        }

        public Criteria andResourcecount3In(List<Integer> values) {
            addCriterion("resourcecount3 in", values, "resourcecount3");
            return (Criteria) this;
        }

        public Criteria andResourcecount3NotIn(List<Integer> values) {
            addCriterion("resourcecount3 not in", values, "resourcecount3");
            return (Criteria) this;
        }

        public Criteria andResourcecount3Between(Integer value1, Integer value2) {
            addCriterion("resourcecount3 between", value1, value2, "resourcecount3");
            return (Criteria) this;
        }

        public Criteria andResourcecount3NotBetween(Integer value1, Integer value2) {
            addCriterion("resourcecount3 not between", value1, value2, "resourcecount3");
            return (Criteria) this;
        }

        public Criteria andResourcecount4IsNull() {
            addCriterion("resourcecount4 is null");
            return (Criteria) this;
        }

        public Criteria andResourcecount4IsNotNull() {
            addCriterion("resourcecount4 is not null");
            return (Criteria) this;
        }

        public Criteria andResourcecount4EqualTo(Integer value) {
            addCriterion("resourcecount4 =", value, "resourcecount4");
            return (Criteria) this;
        }

        public Criteria andResourcecount4NotEqualTo(Integer value) {
            addCriterion("resourcecount4 <>", value, "resourcecount4");
            return (Criteria) this;
        }

        public Criteria andResourcecount4GreaterThan(Integer value) {
            addCriterion("resourcecount4 >", value, "resourcecount4");
            return (Criteria) this;
        }

        public Criteria andResourcecount4GreaterThanOrEqualTo(Integer value) {
            addCriterion("resourcecount4 >=", value, "resourcecount4");
            return (Criteria) this;
        }

        public Criteria andResourcecount4LessThan(Integer value) {
            addCriterion("resourcecount4 <", value, "resourcecount4");
            return (Criteria) this;
        }

        public Criteria andResourcecount4LessThanOrEqualTo(Integer value) {
            addCriterion("resourcecount4 <=", value, "resourcecount4");
            return (Criteria) this;
        }

        public Criteria andResourcecount4In(List<Integer> values) {
            addCriterion("resourcecount4 in", values, "resourcecount4");
            return (Criteria) this;
        }

        public Criteria andResourcecount4NotIn(List<Integer> values) {
            addCriterion("resourcecount4 not in", values, "resourcecount4");
            return (Criteria) this;
        }

        public Criteria andResourcecount4Between(Integer value1, Integer value2) {
            addCriterion("resourcecount4 between", value1, value2, "resourcecount4");
            return (Criteria) this;
        }

        public Criteria andResourcecount4NotBetween(Integer value1, Integer value2) {
            addCriterion("resourcecount4 not between", value1, value2, "resourcecount4");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNull() {
            addCriterion("school is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNotNull() {
            addCriterion("school is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolEqualTo(String value) {
            addCriterion("school =", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotEqualTo(String value) {
            addCriterion("school <>", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThan(String value) {
            addCriterion("school >", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("school >=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThan(String value) {
            addCriterion("school <", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThanOrEqualTo(String value) {
            addCriterion("school <=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLike(String value) {
            addCriterion("school like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotLike(String value) {
            addCriterion("school not like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolIn(List<String> values) {
            addCriterion("school in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotIn(List<String> values) {
            addCriterion("school not in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolBetween(String value1, String value2) {
            addCriterion("school between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotBetween(String value1, String value2) {
            addCriterion("school not between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Integer value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Integer value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Integer value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Integer value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Integer value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Integer> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Integer> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Integer value1, Integer value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Integer value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Integer value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Integer value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Integer value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Integer value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Integer> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Integer> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Integer value1, Integer value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Integer value1, Integer value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andTopiccount1IsNull() {
            addCriterion("topiccount1 is null");
            return (Criteria) this;
        }

        public Criteria andTopiccount1IsNotNull() {
            addCriterion("topiccount1 is not null");
            return (Criteria) this;
        }

        public Criteria andTopiccount1EqualTo(Integer value) {
            addCriterion("topiccount1 =", value, "topiccount1");
            return (Criteria) this;
        }

        public Criteria andTopiccount1NotEqualTo(Integer value) {
            addCriterion("topiccount1 <>", value, "topiccount1");
            return (Criteria) this;
        }

        public Criteria andTopiccount1GreaterThan(Integer value) {
            addCriterion("topiccount1 >", value, "topiccount1");
            return (Criteria) this;
        }

        public Criteria andTopiccount1GreaterThanOrEqualTo(Integer value) {
            addCriterion("topiccount1 >=", value, "topiccount1");
            return (Criteria) this;
        }

        public Criteria andTopiccount1LessThan(Integer value) {
            addCriterion("topiccount1 <", value, "topiccount1");
            return (Criteria) this;
        }

        public Criteria andTopiccount1LessThanOrEqualTo(Integer value) {
            addCriterion("topiccount1 <=", value, "topiccount1");
            return (Criteria) this;
        }

        public Criteria andTopiccount1In(List<Integer> values) {
            addCriterion("topiccount1 in", values, "topiccount1");
            return (Criteria) this;
        }

        public Criteria andTopiccount1NotIn(List<Integer> values) {
            addCriterion("topiccount1 not in", values, "topiccount1");
            return (Criteria) this;
        }

        public Criteria andTopiccount1Between(Integer value1, Integer value2) {
            addCriterion("topiccount1 between", value1, value2, "topiccount1");
            return (Criteria) this;
        }

        public Criteria andTopiccount1NotBetween(Integer value1, Integer value2) {
            addCriterion("topiccount1 not between", value1, value2, "topiccount1");
            return (Criteria) this;
        }

        public Criteria andTopiccount2IsNull() {
            addCriterion("topiccount2 is null");
            return (Criteria) this;
        }

        public Criteria andTopiccount2IsNotNull() {
            addCriterion("topiccount2 is not null");
            return (Criteria) this;
        }

        public Criteria andTopiccount2EqualTo(Integer value) {
            addCriterion("topiccount2 =", value, "topiccount2");
            return (Criteria) this;
        }

        public Criteria andTopiccount2NotEqualTo(Integer value) {
            addCriterion("topiccount2 <>", value, "topiccount2");
            return (Criteria) this;
        }

        public Criteria andTopiccount2GreaterThan(Integer value) {
            addCriterion("topiccount2 >", value, "topiccount2");
            return (Criteria) this;
        }

        public Criteria andTopiccount2GreaterThanOrEqualTo(Integer value) {
            addCriterion("topiccount2 >=", value, "topiccount2");
            return (Criteria) this;
        }

        public Criteria andTopiccount2LessThan(Integer value) {
            addCriterion("topiccount2 <", value, "topiccount2");
            return (Criteria) this;
        }

        public Criteria andTopiccount2LessThanOrEqualTo(Integer value) {
            addCriterion("topiccount2 <=", value, "topiccount2");
            return (Criteria) this;
        }

        public Criteria andTopiccount2In(List<Integer> values) {
            addCriterion("topiccount2 in", values, "topiccount2");
            return (Criteria) this;
        }

        public Criteria andTopiccount2NotIn(List<Integer> values) {
            addCriterion("topiccount2 not in", values, "topiccount2");
            return (Criteria) this;
        }

        public Criteria andTopiccount2Between(Integer value1, Integer value2) {
            addCriterion("topiccount2 between", value1, value2, "topiccount2");
            return (Criteria) this;
        }

        public Criteria andTopiccount2NotBetween(Integer value1, Integer value2) {
            addCriterion("topiccount2 not between", value1, value2, "topiccount2");
            return (Criteria) this;
        }

        public Criteria andWordcountIsNull() {
            addCriterion("wordcount is null");
            return (Criteria) this;
        }

        public Criteria andWordcountIsNotNull() {
            addCriterion("wordcount is not null");
            return (Criteria) this;
        }

        public Criteria andWordcountEqualTo(Integer value) {
            addCriterion("wordcount =", value, "wordcount");
            return (Criteria) this;
        }

        public Criteria andWordcountNotEqualTo(Integer value) {
            addCriterion("wordcount <>", value, "wordcount");
            return (Criteria) this;
        }

        public Criteria andWordcountGreaterThan(Integer value) {
            addCriterion("wordcount >", value, "wordcount");
            return (Criteria) this;
        }

        public Criteria andWordcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("wordcount >=", value, "wordcount");
            return (Criteria) this;
        }

        public Criteria andWordcountLessThan(Integer value) {
            addCriterion("wordcount <", value, "wordcount");
            return (Criteria) this;
        }

        public Criteria andWordcountLessThanOrEqualTo(Integer value) {
            addCriterion("wordcount <=", value, "wordcount");
            return (Criteria) this;
        }

        public Criteria andWordcountIn(List<Integer> values) {
            addCriterion("wordcount in", values, "wordcount");
            return (Criteria) this;
        }

        public Criteria andWordcountNotIn(List<Integer> values) {
            addCriterion("wordcount not in", values, "wordcount");
            return (Criteria) this;
        }

        public Criteria andWordcountBetween(Integer value1, Integer value2) {
            addCriterion("wordcount between", value1, value2, "wordcount");
            return (Criteria) this;
        }

        public Criteria andWordcountNotBetween(Integer value1, Integer value2) {
            addCriterion("wordcount not between", value1, value2, "wordcount");
            return (Criteria) this;
        }

        public Criteria andWordcount1IsNull() {
            addCriterion("wordcount1 is null");
            return (Criteria) this;
        }

        public Criteria andWordcount1IsNotNull() {
            addCriterion("wordcount1 is not null");
            return (Criteria) this;
        }

        public Criteria andWordcount1EqualTo(Integer value) {
            addCriterion("wordcount1 =", value, "wordcount1");
            return (Criteria) this;
        }

        public Criteria andWordcount1NotEqualTo(Integer value) {
            addCriterion("wordcount1 <>", value, "wordcount1");
            return (Criteria) this;
        }

        public Criteria andWordcount1GreaterThan(Integer value) {
            addCriterion("wordcount1 >", value, "wordcount1");
            return (Criteria) this;
        }

        public Criteria andWordcount1GreaterThanOrEqualTo(Integer value) {
            addCriterion("wordcount1 >=", value, "wordcount1");
            return (Criteria) this;
        }

        public Criteria andWordcount1LessThan(Integer value) {
            addCriterion("wordcount1 <", value, "wordcount1");
            return (Criteria) this;
        }

        public Criteria andWordcount1LessThanOrEqualTo(Integer value) {
            addCriterion("wordcount1 <=", value, "wordcount1");
            return (Criteria) this;
        }

        public Criteria andWordcount1In(List<Integer> values) {
            addCriterion("wordcount1 in", values, "wordcount1");
            return (Criteria) this;
        }

        public Criteria andWordcount1NotIn(List<Integer> values) {
            addCriterion("wordcount1 not in", values, "wordcount1");
            return (Criteria) this;
        }

        public Criteria andWordcount1Between(Integer value1, Integer value2) {
            addCriterion("wordcount1 between", value1, value2, "wordcount1");
            return (Criteria) this;
        }

        public Criteria andWordcount1NotBetween(Integer value1, Integer value2) {
            addCriterion("wordcount1 not between", value1, value2, "wordcount1");
            return (Criteria) this;
        }

        public Criteria andWorkcountIsNull() {
            addCriterion("workcount is null");
            return (Criteria) this;
        }

        public Criteria andWorkcountIsNotNull() {
            addCriterion("workcount is not null");
            return (Criteria) this;
        }

        public Criteria andWorkcountEqualTo(Integer value) {
            addCriterion("workcount =", value, "workcount");
            return (Criteria) this;
        }

        public Criteria andWorkcountNotEqualTo(Integer value) {
            addCriterion("workcount <>", value, "workcount");
            return (Criteria) this;
        }

        public Criteria andWorkcountGreaterThan(Integer value) {
            addCriterion("workcount >", value, "workcount");
            return (Criteria) this;
        }

        public Criteria andWorkcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("workcount >=", value, "workcount");
            return (Criteria) this;
        }

        public Criteria andWorkcountLessThan(Integer value) {
            addCriterion("workcount <", value, "workcount");
            return (Criteria) this;
        }

        public Criteria andWorkcountLessThanOrEqualTo(Integer value) {
            addCriterion("workcount <=", value, "workcount");
            return (Criteria) this;
        }

        public Criteria andWorkcountIn(List<Integer> values) {
            addCriterion("workcount in", values, "workcount");
            return (Criteria) this;
        }

        public Criteria andWorkcountNotIn(List<Integer> values) {
            addCriterion("workcount not in", values, "workcount");
            return (Criteria) this;
        }

        public Criteria andWorkcountBetween(Integer value1, Integer value2) {
            addCriterion("workcount between", value1, value2, "workcount");
            return (Criteria) this;
        }

        public Criteria andWorkcountNotBetween(Integer value1, Integer value2) {
            addCriterion("workcount not between", value1, value2, "workcount");
            return (Criteria) this;
        }

        public Criteria andWorkcount1IsNull() {
            addCriterion("workcount1 is null");
            return (Criteria) this;
        }

        public Criteria andWorkcount1IsNotNull() {
            addCriterion("workcount1 is not null");
            return (Criteria) this;
        }

        public Criteria andWorkcount1EqualTo(Integer value) {
            addCriterion("workcount1 =", value, "workcount1");
            return (Criteria) this;
        }

        public Criteria andWorkcount1NotEqualTo(Integer value) {
            addCriterion("workcount1 <>", value, "workcount1");
            return (Criteria) this;
        }

        public Criteria andWorkcount1GreaterThan(Integer value) {
            addCriterion("workcount1 >", value, "workcount1");
            return (Criteria) this;
        }

        public Criteria andWorkcount1GreaterThanOrEqualTo(Integer value) {
            addCriterion("workcount1 >=", value, "workcount1");
            return (Criteria) this;
        }

        public Criteria andWorkcount1LessThan(Integer value) {
            addCriterion("workcount1 <", value, "workcount1");
            return (Criteria) this;
        }

        public Criteria andWorkcount1LessThanOrEqualTo(Integer value) {
            addCriterion("workcount1 <=", value, "workcount1");
            return (Criteria) this;
        }

        public Criteria andWorkcount1In(List<Integer> values) {
            addCriterion("workcount1 in", values, "workcount1");
            return (Criteria) this;
        }

        public Criteria andWorkcount1NotIn(List<Integer> values) {
            addCriterion("workcount1 not in", values, "workcount1");
            return (Criteria) this;
        }

        public Criteria andWorkcount1Between(Integer value1, Integer value2) {
            addCriterion("workcount1 between", value1, value2, "workcount1");
            return (Criteria) this;
        }

        public Criteria andWorkcount1NotBetween(Integer value1, Integer value2) {
            addCriterion("workcount1 not between", value1, value2, "workcount1");
            return (Criteria) this;
        }

        public Criteria andWorkcount2IsNull() {
            addCriterion("workcount2 is null");
            return (Criteria) this;
        }

        public Criteria andWorkcount2IsNotNull() {
            addCriterion("workcount2 is not null");
            return (Criteria) this;
        }

        public Criteria andWorkcount2EqualTo(Integer value) {
            addCriterion("workcount2 =", value, "workcount2");
            return (Criteria) this;
        }

        public Criteria andWorkcount2NotEqualTo(Integer value) {
            addCriterion("workcount2 <>", value, "workcount2");
            return (Criteria) this;
        }

        public Criteria andWorkcount2GreaterThan(Integer value) {
            addCriterion("workcount2 >", value, "workcount2");
            return (Criteria) this;
        }

        public Criteria andWorkcount2GreaterThanOrEqualTo(Integer value) {
            addCriterion("workcount2 >=", value, "workcount2");
            return (Criteria) this;
        }

        public Criteria andWorkcount2LessThan(Integer value) {
            addCriterion("workcount2 <", value, "workcount2");
            return (Criteria) this;
        }

        public Criteria andWorkcount2LessThanOrEqualTo(Integer value) {
            addCriterion("workcount2 <=", value, "workcount2");
            return (Criteria) this;
        }

        public Criteria andWorkcount2In(List<Integer> values) {
            addCriterion("workcount2 in", values, "workcount2");
            return (Criteria) this;
        }

        public Criteria andWorkcount2NotIn(List<Integer> values) {
            addCriterion("workcount2 not in", values, "workcount2");
            return (Criteria) this;
        }

        public Criteria andWorkcount2Between(Integer value1, Integer value2) {
            addCriterion("workcount2 between", value1, value2, "workcount2");
            return (Criteria) this;
        }

        public Criteria andWorkcount2NotBetween(Integer value1, Integer value2) {
            addCriterion("workcount2 not between", value1, value2, "workcount2");
            return (Criteria) this;
        }

        public Criteria andWorkcount3IsNull() {
            addCriterion("workcount3 is null");
            return (Criteria) this;
        }

        public Criteria andWorkcount3IsNotNull() {
            addCriterion("workcount3 is not null");
            return (Criteria) this;
        }

        public Criteria andWorkcount3EqualTo(Integer value) {
            addCriterion("workcount3 =", value, "workcount3");
            return (Criteria) this;
        }

        public Criteria andWorkcount3NotEqualTo(Integer value) {
            addCriterion("workcount3 <>", value, "workcount3");
            return (Criteria) this;
        }

        public Criteria andWorkcount3GreaterThan(Integer value) {
            addCriterion("workcount3 >", value, "workcount3");
            return (Criteria) this;
        }

        public Criteria andWorkcount3GreaterThanOrEqualTo(Integer value) {
            addCriterion("workcount3 >=", value, "workcount3");
            return (Criteria) this;
        }

        public Criteria andWorkcount3LessThan(Integer value) {
            addCriterion("workcount3 <", value, "workcount3");
            return (Criteria) this;
        }

        public Criteria andWorkcount3LessThanOrEqualTo(Integer value) {
            addCriterion("workcount3 <=", value, "workcount3");
            return (Criteria) this;
        }

        public Criteria andWorkcount3In(List<Integer> values) {
            addCriterion("workcount3 in", values, "workcount3");
            return (Criteria) this;
        }

        public Criteria andWorkcount3NotIn(List<Integer> values) {
            addCriterion("workcount3 not in", values, "workcount3");
            return (Criteria) this;
        }

        public Criteria andWorkcount3Between(Integer value1, Integer value2) {
            addCriterion("workcount3 between", value1, value2, "workcount3");
            return (Criteria) this;
        }

        public Criteria andWorkcount3NotBetween(Integer value1, Integer value2) {
            addCriterion("workcount3 not between", value1, value2, "workcount3");
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