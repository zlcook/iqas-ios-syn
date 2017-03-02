package com.zlcook.iqas.ios.bean;

import java.util.ArrayList;
import java.util.List;

public class UserTestCountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserTestCountExample() {
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

        public Criteria andUsertestcountIdIsNull() {
            addCriterion("usertestcount_id is null");
            return (Criteria) this;
        }

        public Criteria andUsertestcountIdIsNotNull() {
            addCriterion("usertestcount_id is not null");
            return (Criteria) this;
        }

        public Criteria andUsertestcountIdEqualTo(Integer value) {
            addCriterion("usertestcount_id =", value, "usertestcountId");
            return (Criteria) this;
        }

        public Criteria andUsertestcountIdNotEqualTo(Integer value) {
            addCriterion("usertestcount_id <>", value, "usertestcountId");
            return (Criteria) this;
        }

        public Criteria andUsertestcountIdGreaterThan(Integer value) {
            addCriterion("usertestcount_id >", value, "usertestcountId");
            return (Criteria) this;
        }

        public Criteria andUsertestcountIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("usertestcount_id >=", value, "usertestcountId");
            return (Criteria) this;
        }

        public Criteria andUsertestcountIdLessThan(Integer value) {
            addCriterion("usertestcount_id <", value, "usertestcountId");
            return (Criteria) this;
        }

        public Criteria andUsertestcountIdLessThanOrEqualTo(Integer value) {
            addCriterion("usertestcount_id <=", value, "usertestcountId");
            return (Criteria) this;
        }

        public Criteria andUsertestcountIdIn(List<Integer> values) {
            addCriterion("usertestcount_id in", values, "usertestcountId");
            return (Criteria) this;
        }

        public Criteria andUsertestcountIdNotIn(List<Integer> values) {
            addCriterion("usertestcount_id not in", values, "usertestcountId");
            return (Criteria) this;
        }

        public Criteria andUsertestcountIdBetween(Integer value1, Integer value2) {
            addCriterion("usertestcount_id between", value1, value2, "usertestcountId");
            return (Criteria) this;
        }

        public Criteria andUsertestcountIdNotBetween(Integer value1, Integer value2) {
            addCriterion("usertestcount_id not between", value1, value2, "usertestcountId");
            return (Criteria) this;
        }

        public Criteria andTest1countIsNull() {
            addCriterion("test1count is null");
            return (Criteria) this;
        }

        public Criteria andTest1countIsNotNull() {
            addCriterion("test1count is not null");
            return (Criteria) this;
        }

        public Criteria andTest1countEqualTo(Integer value) {
            addCriterion("test1count =", value, "test1count");
            return (Criteria) this;
        }

        public Criteria andTest1countNotEqualTo(Integer value) {
            addCriterion("test1count <>", value, "test1count");
            return (Criteria) this;
        }

        public Criteria andTest1countGreaterThan(Integer value) {
            addCriterion("test1count >", value, "test1count");
            return (Criteria) this;
        }

        public Criteria andTest1countGreaterThanOrEqualTo(Integer value) {
            addCriterion("test1count >=", value, "test1count");
            return (Criteria) this;
        }

        public Criteria andTest1countLessThan(Integer value) {
            addCriterion("test1count <", value, "test1count");
            return (Criteria) this;
        }

        public Criteria andTest1countLessThanOrEqualTo(Integer value) {
            addCriterion("test1count <=", value, "test1count");
            return (Criteria) this;
        }

        public Criteria andTest1countIn(List<Integer> values) {
            addCriterion("test1count in", values, "test1count");
            return (Criteria) this;
        }

        public Criteria andTest1countNotIn(List<Integer> values) {
            addCriterion("test1count not in", values, "test1count");
            return (Criteria) this;
        }

        public Criteria andTest1countBetween(Integer value1, Integer value2) {
            addCriterion("test1count between", value1, value2, "test1count");
            return (Criteria) this;
        }

        public Criteria andTest1countNotBetween(Integer value1, Integer value2) {
            addCriterion("test1count not between", value1, value2, "test1count");
            return (Criteria) this;
        }

        public Criteria andTest1rightcountIsNull() {
            addCriterion("test1rightcount is null");
            return (Criteria) this;
        }

        public Criteria andTest1rightcountIsNotNull() {
            addCriterion("test1rightcount is not null");
            return (Criteria) this;
        }

        public Criteria andTest1rightcountEqualTo(Integer value) {
            addCriterion("test1rightcount =", value, "test1rightcount");
            return (Criteria) this;
        }

        public Criteria andTest1rightcountNotEqualTo(Integer value) {
            addCriterion("test1rightcount <>", value, "test1rightcount");
            return (Criteria) this;
        }

        public Criteria andTest1rightcountGreaterThan(Integer value) {
            addCriterion("test1rightcount >", value, "test1rightcount");
            return (Criteria) this;
        }

        public Criteria andTest1rightcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("test1rightcount >=", value, "test1rightcount");
            return (Criteria) this;
        }

        public Criteria andTest1rightcountLessThan(Integer value) {
            addCriterion("test1rightcount <", value, "test1rightcount");
            return (Criteria) this;
        }

        public Criteria andTest1rightcountLessThanOrEqualTo(Integer value) {
            addCriterion("test1rightcount <=", value, "test1rightcount");
            return (Criteria) this;
        }

        public Criteria andTest1rightcountIn(List<Integer> values) {
            addCriterion("test1rightcount in", values, "test1rightcount");
            return (Criteria) this;
        }

        public Criteria andTest1rightcountNotIn(List<Integer> values) {
            addCriterion("test1rightcount not in", values, "test1rightcount");
            return (Criteria) this;
        }

        public Criteria andTest1rightcountBetween(Integer value1, Integer value2) {
            addCriterion("test1rightcount between", value1, value2, "test1rightcount");
            return (Criteria) this;
        }

        public Criteria andTest1rightcountNotBetween(Integer value1, Integer value2) {
            addCriterion("test1rightcount not between", value1, value2, "test1rightcount");
            return (Criteria) this;
        }

        public Criteria andTest2countIsNull() {
            addCriterion("test2count is null");
            return (Criteria) this;
        }

        public Criteria andTest2countIsNotNull() {
            addCriterion("test2count is not null");
            return (Criteria) this;
        }

        public Criteria andTest2countEqualTo(Integer value) {
            addCriterion("test2count =", value, "test2count");
            return (Criteria) this;
        }

        public Criteria andTest2countNotEqualTo(Integer value) {
            addCriterion("test2count <>", value, "test2count");
            return (Criteria) this;
        }

        public Criteria andTest2countGreaterThan(Integer value) {
            addCriterion("test2count >", value, "test2count");
            return (Criteria) this;
        }

        public Criteria andTest2countGreaterThanOrEqualTo(Integer value) {
            addCriterion("test2count >=", value, "test2count");
            return (Criteria) this;
        }

        public Criteria andTest2countLessThan(Integer value) {
            addCriterion("test2count <", value, "test2count");
            return (Criteria) this;
        }

        public Criteria andTest2countLessThanOrEqualTo(Integer value) {
            addCriterion("test2count <=", value, "test2count");
            return (Criteria) this;
        }

        public Criteria andTest2countIn(List<Integer> values) {
            addCriterion("test2count in", values, "test2count");
            return (Criteria) this;
        }

        public Criteria andTest2countNotIn(List<Integer> values) {
            addCriterion("test2count not in", values, "test2count");
            return (Criteria) this;
        }

        public Criteria andTest2countBetween(Integer value1, Integer value2) {
            addCriterion("test2count between", value1, value2, "test2count");
            return (Criteria) this;
        }

        public Criteria andTest2countNotBetween(Integer value1, Integer value2) {
            addCriterion("test2count not between", value1, value2, "test2count");
            return (Criteria) this;
        }

        public Criteria andTest2rightcountIsNull() {
            addCriterion("test2rightcount is null");
            return (Criteria) this;
        }

        public Criteria andTest2rightcountIsNotNull() {
            addCriterion("test2rightcount is not null");
            return (Criteria) this;
        }

        public Criteria andTest2rightcountEqualTo(Integer value) {
            addCriterion("test2rightcount =", value, "test2rightcount");
            return (Criteria) this;
        }

        public Criteria andTest2rightcountNotEqualTo(Integer value) {
            addCriterion("test2rightcount <>", value, "test2rightcount");
            return (Criteria) this;
        }

        public Criteria andTest2rightcountGreaterThan(Integer value) {
            addCriterion("test2rightcount >", value, "test2rightcount");
            return (Criteria) this;
        }

        public Criteria andTest2rightcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("test2rightcount >=", value, "test2rightcount");
            return (Criteria) this;
        }

        public Criteria andTest2rightcountLessThan(Integer value) {
            addCriterion("test2rightcount <", value, "test2rightcount");
            return (Criteria) this;
        }

        public Criteria andTest2rightcountLessThanOrEqualTo(Integer value) {
            addCriterion("test2rightcount <=", value, "test2rightcount");
            return (Criteria) this;
        }

        public Criteria andTest2rightcountIn(List<Integer> values) {
            addCriterion("test2rightcount in", values, "test2rightcount");
            return (Criteria) this;
        }

        public Criteria andTest2rightcountNotIn(List<Integer> values) {
            addCriterion("test2rightcount not in", values, "test2rightcount");
            return (Criteria) this;
        }

        public Criteria andTest2rightcountBetween(Integer value1, Integer value2) {
            addCriterion("test2rightcount between", value1, value2, "test2rightcount");
            return (Criteria) this;
        }

        public Criteria andTest2rightcountNotBetween(Integer value1, Integer value2) {
            addCriterion("test2rightcount not between", value1, value2, "test2rightcount");
            return (Criteria) this;
        }

        public Criteria andTest3countIsNull() {
            addCriterion("test3count is null");
            return (Criteria) this;
        }

        public Criteria andTest3countIsNotNull() {
            addCriterion("test3count is not null");
            return (Criteria) this;
        }

        public Criteria andTest3countEqualTo(Integer value) {
            addCriterion("test3count =", value, "test3count");
            return (Criteria) this;
        }

        public Criteria andTest3countNotEqualTo(Integer value) {
            addCriterion("test3count <>", value, "test3count");
            return (Criteria) this;
        }

        public Criteria andTest3countGreaterThan(Integer value) {
            addCriterion("test3count >", value, "test3count");
            return (Criteria) this;
        }

        public Criteria andTest3countGreaterThanOrEqualTo(Integer value) {
            addCriterion("test3count >=", value, "test3count");
            return (Criteria) this;
        }

        public Criteria andTest3countLessThan(Integer value) {
            addCriterion("test3count <", value, "test3count");
            return (Criteria) this;
        }

        public Criteria andTest3countLessThanOrEqualTo(Integer value) {
            addCriterion("test3count <=", value, "test3count");
            return (Criteria) this;
        }

        public Criteria andTest3countIn(List<Integer> values) {
            addCriterion("test3count in", values, "test3count");
            return (Criteria) this;
        }

        public Criteria andTest3countNotIn(List<Integer> values) {
            addCriterion("test3count not in", values, "test3count");
            return (Criteria) this;
        }

        public Criteria andTest3countBetween(Integer value1, Integer value2) {
            addCriterion("test3count between", value1, value2, "test3count");
            return (Criteria) this;
        }

        public Criteria andTest3countNotBetween(Integer value1, Integer value2) {
            addCriterion("test3count not between", value1, value2, "test3count");
            return (Criteria) this;
        }

        public Criteria andTest3rightcountIsNull() {
            addCriterion("test3rightcount is null");
            return (Criteria) this;
        }

        public Criteria andTest3rightcountIsNotNull() {
            addCriterion("test3rightcount is not null");
            return (Criteria) this;
        }

        public Criteria andTest3rightcountEqualTo(Integer value) {
            addCriterion("test3rightcount =", value, "test3rightcount");
            return (Criteria) this;
        }

        public Criteria andTest3rightcountNotEqualTo(Integer value) {
            addCriterion("test3rightcount <>", value, "test3rightcount");
            return (Criteria) this;
        }

        public Criteria andTest3rightcountGreaterThan(Integer value) {
            addCriterion("test3rightcount >", value, "test3rightcount");
            return (Criteria) this;
        }

        public Criteria andTest3rightcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("test3rightcount >=", value, "test3rightcount");
            return (Criteria) this;
        }

        public Criteria andTest3rightcountLessThan(Integer value) {
            addCriterion("test3rightcount <", value, "test3rightcount");
            return (Criteria) this;
        }

        public Criteria andTest3rightcountLessThanOrEqualTo(Integer value) {
            addCriterion("test3rightcount <=", value, "test3rightcount");
            return (Criteria) this;
        }

        public Criteria andTest3rightcountIn(List<Integer> values) {
            addCriterion("test3rightcount in", values, "test3rightcount");
            return (Criteria) this;
        }

        public Criteria andTest3rightcountNotIn(List<Integer> values) {
            addCriterion("test3rightcount not in", values, "test3rightcount");
            return (Criteria) this;
        }

        public Criteria andTest3rightcountBetween(Integer value1, Integer value2) {
            addCriterion("test3rightcount between", value1, value2, "test3rightcount");
            return (Criteria) this;
        }

        public Criteria andTest3rightcountNotBetween(Integer value1, Integer value2) {
            addCriterion("test3rightcount not between", value1, value2, "test3rightcount");
            return (Criteria) this;
        }

        public Criteria andTest4countIsNull() {
            addCriterion("test4count is null");
            return (Criteria) this;
        }

        public Criteria andTest4countIsNotNull() {
            addCriterion("test4count is not null");
            return (Criteria) this;
        }

        public Criteria andTest4countEqualTo(Integer value) {
            addCriterion("test4count =", value, "test4count");
            return (Criteria) this;
        }

        public Criteria andTest4countNotEqualTo(Integer value) {
            addCriterion("test4count <>", value, "test4count");
            return (Criteria) this;
        }

        public Criteria andTest4countGreaterThan(Integer value) {
            addCriterion("test4count >", value, "test4count");
            return (Criteria) this;
        }

        public Criteria andTest4countGreaterThanOrEqualTo(Integer value) {
            addCriterion("test4count >=", value, "test4count");
            return (Criteria) this;
        }

        public Criteria andTest4countLessThan(Integer value) {
            addCriterion("test4count <", value, "test4count");
            return (Criteria) this;
        }

        public Criteria andTest4countLessThanOrEqualTo(Integer value) {
            addCriterion("test4count <=", value, "test4count");
            return (Criteria) this;
        }

        public Criteria andTest4countIn(List<Integer> values) {
            addCriterion("test4count in", values, "test4count");
            return (Criteria) this;
        }

        public Criteria andTest4countNotIn(List<Integer> values) {
            addCriterion("test4count not in", values, "test4count");
            return (Criteria) this;
        }

        public Criteria andTest4countBetween(Integer value1, Integer value2) {
            addCriterion("test4count between", value1, value2, "test4count");
            return (Criteria) this;
        }

        public Criteria andTest4countNotBetween(Integer value1, Integer value2) {
            addCriterion("test4count not between", value1, value2, "test4count");
            return (Criteria) this;
        }

        public Criteria andTest4rightcountIsNull() {
            addCriterion("test4rightcount is null");
            return (Criteria) this;
        }

        public Criteria andTest4rightcountIsNotNull() {
            addCriterion("test4rightcount is not null");
            return (Criteria) this;
        }

        public Criteria andTest4rightcountEqualTo(Integer value) {
            addCriterion("test4rightcount =", value, "test4rightcount");
            return (Criteria) this;
        }

        public Criteria andTest4rightcountNotEqualTo(Integer value) {
            addCriterion("test4rightcount <>", value, "test4rightcount");
            return (Criteria) this;
        }

        public Criteria andTest4rightcountGreaterThan(Integer value) {
            addCriterion("test4rightcount >", value, "test4rightcount");
            return (Criteria) this;
        }

        public Criteria andTest4rightcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("test4rightcount >=", value, "test4rightcount");
            return (Criteria) this;
        }

        public Criteria andTest4rightcountLessThan(Integer value) {
            addCriterion("test4rightcount <", value, "test4rightcount");
            return (Criteria) this;
        }

        public Criteria andTest4rightcountLessThanOrEqualTo(Integer value) {
            addCriterion("test4rightcount <=", value, "test4rightcount");
            return (Criteria) this;
        }

        public Criteria andTest4rightcountIn(List<Integer> values) {
            addCriterion("test4rightcount in", values, "test4rightcount");
            return (Criteria) this;
        }

        public Criteria andTest4rightcountNotIn(List<Integer> values) {
            addCriterion("test4rightcount not in", values, "test4rightcount");
            return (Criteria) this;
        }

        public Criteria andTest4rightcountBetween(Integer value1, Integer value2) {
            addCriterion("test4rightcount between", value1, value2, "test4rightcount");
            return (Criteria) this;
        }

        public Criteria andTest4rightcountNotBetween(Integer value1, Integer value2) {
            addCriterion("test4rightcount not between", value1, value2, "test4rightcount");
            return (Criteria) this;
        }

        public Criteria andTestcountIsNull() {
            addCriterion("testcount is null");
            return (Criteria) this;
        }

        public Criteria andTestcountIsNotNull() {
            addCriterion("testcount is not null");
            return (Criteria) this;
        }

        public Criteria andTestcountEqualTo(Integer value) {
            addCriterion("testcount =", value, "testcount");
            return (Criteria) this;
        }

        public Criteria andTestcountNotEqualTo(Integer value) {
            addCriterion("testcount <>", value, "testcount");
            return (Criteria) this;
        }

        public Criteria andTestcountGreaterThan(Integer value) {
            addCriterion("testcount >", value, "testcount");
            return (Criteria) this;
        }

        public Criteria andTestcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("testcount >=", value, "testcount");
            return (Criteria) this;
        }

        public Criteria andTestcountLessThan(Integer value) {
            addCriterion("testcount <", value, "testcount");
            return (Criteria) this;
        }

        public Criteria andTestcountLessThanOrEqualTo(Integer value) {
            addCriterion("testcount <=", value, "testcount");
            return (Criteria) this;
        }

        public Criteria andTestcountIn(List<Integer> values) {
            addCriterion("testcount in", values, "testcount");
            return (Criteria) this;
        }

        public Criteria andTestcountNotIn(List<Integer> values) {
            addCriterion("testcount not in", values, "testcount");
            return (Criteria) this;
        }

        public Criteria andTestcountBetween(Integer value1, Integer value2) {
            addCriterion("testcount between", value1, value2, "testcount");
            return (Criteria) this;
        }

        public Criteria andTestcountNotBetween(Integer value1, Integer value2) {
            addCriterion("testcount not between", value1, value2, "testcount");
            return (Criteria) this;
        }

        public Criteria andTestrightcountIsNull() {
            addCriterion("testrightcount is null");
            return (Criteria) this;
        }

        public Criteria andTestrightcountIsNotNull() {
            addCriterion("testrightcount is not null");
            return (Criteria) this;
        }

        public Criteria andTestrightcountEqualTo(Integer value) {
            addCriterion("testrightcount =", value, "testrightcount");
            return (Criteria) this;
        }

        public Criteria andTestrightcountNotEqualTo(Integer value) {
            addCriterion("testrightcount <>", value, "testrightcount");
            return (Criteria) this;
        }

        public Criteria andTestrightcountGreaterThan(Integer value) {
            addCriterion("testrightcount >", value, "testrightcount");
            return (Criteria) this;
        }

        public Criteria andTestrightcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("testrightcount >=", value, "testrightcount");
            return (Criteria) this;
        }

        public Criteria andTestrightcountLessThan(Integer value) {
            addCriterion("testrightcount <", value, "testrightcount");
            return (Criteria) this;
        }

        public Criteria andTestrightcountLessThanOrEqualTo(Integer value) {
            addCriterion("testrightcount <=", value, "testrightcount");
            return (Criteria) this;
        }

        public Criteria andTestrightcountIn(List<Integer> values) {
            addCriterion("testrightcount in", values, "testrightcount");
            return (Criteria) this;
        }

        public Criteria andTestrightcountNotIn(List<Integer> values) {
            addCriterion("testrightcount not in", values, "testrightcount");
            return (Criteria) this;
        }

        public Criteria andTestrightcountBetween(Integer value1, Integer value2) {
            addCriterion("testrightcount between", value1, value2, "testrightcount");
            return (Criteria) this;
        }

        public Criteria andTestrightcountNotBetween(Integer value1, Integer value2) {
            addCriterion("testrightcount not between", value1, value2, "testrightcount");
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