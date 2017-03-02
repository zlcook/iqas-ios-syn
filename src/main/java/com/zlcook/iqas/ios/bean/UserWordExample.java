package com.zlcook.iqas.ios.bean;

import java.util.ArrayList;
import java.util.List;

public class UserWordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserWordExample() {
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

        public Criteria andUserWordIdIsNull() {
            addCriterion("user_word_id is null");
            return (Criteria) this;
        }

        public Criteria andUserWordIdIsNotNull() {
            addCriterion("user_word_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserWordIdEqualTo(Integer value) {
            addCriterion("user_word_id =", value, "userWordId");
            return (Criteria) this;
        }

        public Criteria andUserWordIdNotEqualTo(Integer value) {
            addCriterion("user_word_id <>", value, "userWordId");
            return (Criteria) this;
        }

        public Criteria andUserWordIdGreaterThan(Integer value) {
            addCriterion("user_word_id >", value, "userWordId");
            return (Criteria) this;
        }

        public Criteria andUserWordIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_word_id >=", value, "userWordId");
            return (Criteria) this;
        }

        public Criteria andUserWordIdLessThan(Integer value) {
            addCriterion("user_word_id <", value, "userWordId");
            return (Criteria) this;
        }

        public Criteria andUserWordIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_word_id <=", value, "userWordId");
            return (Criteria) this;
        }

        public Criteria andUserWordIdIn(List<Integer> values) {
            addCriterion("user_word_id in", values, "userWordId");
            return (Criteria) this;
        }

        public Criteria andUserWordIdNotIn(List<Integer> values) {
            addCriterion("user_word_id not in", values, "userWordId");
            return (Criteria) this;
        }

        public Criteria andUserWordIdBetween(Integer value1, Integer value2) {
            addCriterion("user_word_id between", value1, value2, "userWordId");
            return (Criteria) this;
        }

        public Criteria andUserWordIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_word_id not between", value1, value2, "userWordId");
            return (Criteria) this;
        }

        public Criteria andTopiIsNull() {
            addCriterion("topi is null");
            return (Criteria) this;
        }

        public Criteria andTopiIsNotNull() {
            addCriterion("topi is not null");
            return (Criteria) this;
        }

        public Criteria andTopiEqualTo(Integer value) {
            addCriterion("topi =", value, "topi");
            return (Criteria) this;
        }

        public Criteria andTopiNotEqualTo(Integer value) {
            addCriterion("topi <>", value, "topi");
            return (Criteria) this;
        }

        public Criteria andTopiGreaterThan(Integer value) {
            addCriterion("topi >", value, "topi");
            return (Criteria) this;
        }

        public Criteria andTopiGreaterThanOrEqualTo(Integer value) {
            addCriterion("topi >=", value, "topi");
            return (Criteria) this;
        }

        public Criteria andTopiLessThan(Integer value) {
            addCriterion("topi <", value, "topi");
            return (Criteria) this;
        }

        public Criteria andTopiLessThanOrEqualTo(Integer value) {
            addCriterion("topi <=", value, "topi");
            return (Criteria) this;
        }

        public Criteria andTopiIn(List<Integer> values) {
            addCriterion("topi in", values, "topi");
            return (Criteria) this;
        }

        public Criteria andTopiNotIn(List<Integer> values) {
            addCriterion("topi not in", values, "topi");
            return (Criteria) this;
        }

        public Criteria andTopiBetween(Integer value1, Integer value2) {
            addCriterion("topi between", value1, value2, "topi");
            return (Criteria) this;
        }

        public Criteria andTopiNotBetween(Integer value1, Integer value2) {
            addCriterion("topi not between", value1, value2, "topi");
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

        public Criteria andWordlearnIsNull() {
            addCriterion("wordlearn is null");
            return (Criteria) this;
        }

        public Criteria andWordlearnIsNotNull() {
            addCriterion("wordlearn is not null");
            return (Criteria) this;
        }

        public Criteria andWordlearnEqualTo(Integer value) {
            addCriterion("wordlearn =", value, "wordlearn");
            return (Criteria) this;
        }

        public Criteria andWordlearnNotEqualTo(Integer value) {
            addCriterion("wordlearn <>", value, "wordlearn");
            return (Criteria) this;
        }

        public Criteria andWordlearnGreaterThan(Integer value) {
            addCriterion("wordlearn >", value, "wordlearn");
            return (Criteria) this;
        }

        public Criteria andWordlearnGreaterThanOrEqualTo(Integer value) {
            addCriterion("wordlearn >=", value, "wordlearn");
            return (Criteria) this;
        }

        public Criteria andWordlearnLessThan(Integer value) {
            addCriterion("wordlearn <", value, "wordlearn");
            return (Criteria) this;
        }

        public Criteria andWordlearnLessThanOrEqualTo(Integer value) {
            addCriterion("wordlearn <=", value, "wordlearn");
            return (Criteria) this;
        }

        public Criteria andWordlearnIn(List<Integer> values) {
            addCriterion("wordlearn in", values, "wordlearn");
            return (Criteria) this;
        }

        public Criteria andWordlearnNotIn(List<Integer> values) {
            addCriterion("wordlearn not in", values, "wordlearn");
            return (Criteria) this;
        }

        public Criteria andWordlearnBetween(Integer value1, Integer value2) {
            addCriterion("wordlearn between", value1, value2, "wordlearn");
            return (Criteria) this;
        }

        public Criteria andWordlearnNotBetween(Integer value1, Integer value2) {
            addCriterion("wordlearn not between", value1, value2, "wordlearn");
            return (Criteria) this;
        }

        public Criteria andWordtestIsNull() {
            addCriterion("wordtest is null");
            return (Criteria) this;
        }

        public Criteria andWordtestIsNotNull() {
            addCriterion("wordtest is not null");
            return (Criteria) this;
        }

        public Criteria andWordtestEqualTo(Integer value) {
            addCriterion("wordtest =", value, "wordtest");
            return (Criteria) this;
        }

        public Criteria andWordtestNotEqualTo(Integer value) {
            addCriterion("wordtest <>", value, "wordtest");
            return (Criteria) this;
        }

        public Criteria andWordtestGreaterThan(Integer value) {
            addCriterion("wordtest >", value, "wordtest");
            return (Criteria) this;
        }

        public Criteria andWordtestGreaterThanOrEqualTo(Integer value) {
            addCriterion("wordtest >=", value, "wordtest");
            return (Criteria) this;
        }

        public Criteria andWordtestLessThan(Integer value) {
            addCriterion("wordtest <", value, "wordtest");
            return (Criteria) this;
        }

        public Criteria andWordtestLessThanOrEqualTo(Integer value) {
            addCriterion("wordtest <=", value, "wordtest");
            return (Criteria) this;
        }

        public Criteria andWordtestIn(List<Integer> values) {
            addCriterion("wordtest in", values, "wordtest");
            return (Criteria) this;
        }

        public Criteria andWordtestNotIn(List<Integer> values) {
            addCriterion("wordtest not in", values, "wordtest");
            return (Criteria) this;
        }

        public Criteria andWordtestBetween(Integer value1, Integer value2) {
            addCriterion("wordtest between", value1, value2, "wordtest");
            return (Criteria) this;
        }

        public Criteria andWordtestNotBetween(Integer value1, Integer value2) {
            addCriterion("wordtest not between", value1, value2, "wordtest");
            return (Criteria) this;
        }

        public Criteria andWrongtesttimesIsNull() {
            addCriterion("wrongtesttimes is null");
            return (Criteria) this;
        }

        public Criteria andWrongtesttimesIsNotNull() {
            addCriterion("wrongtesttimes is not null");
            return (Criteria) this;
        }

        public Criteria andWrongtesttimesEqualTo(Integer value) {
            addCriterion("wrongtesttimes =", value, "wrongtesttimes");
            return (Criteria) this;
        }

        public Criteria andWrongtesttimesNotEqualTo(Integer value) {
            addCriterion("wrongtesttimes <>", value, "wrongtesttimes");
            return (Criteria) this;
        }

        public Criteria andWrongtesttimesGreaterThan(Integer value) {
            addCriterion("wrongtesttimes >", value, "wrongtesttimes");
            return (Criteria) this;
        }

        public Criteria andWrongtesttimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("wrongtesttimes >=", value, "wrongtesttimes");
            return (Criteria) this;
        }

        public Criteria andWrongtesttimesLessThan(Integer value) {
            addCriterion("wrongtesttimes <", value, "wrongtesttimes");
            return (Criteria) this;
        }

        public Criteria andWrongtesttimesLessThanOrEqualTo(Integer value) {
            addCriterion("wrongtesttimes <=", value, "wrongtesttimes");
            return (Criteria) this;
        }

        public Criteria andWrongtesttimesIn(List<Integer> values) {
            addCriterion("wrongtesttimes in", values, "wrongtesttimes");
            return (Criteria) this;
        }

        public Criteria andWrongtesttimesNotIn(List<Integer> values) {
            addCriterion("wrongtesttimes not in", values, "wrongtesttimes");
            return (Criteria) this;
        }

        public Criteria andWrongtesttimesBetween(Integer value1, Integer value2) {
            addCriterion("wrongtesttimes between", value1, value2, "wrongtesttimes");
            return (Criteria) this;
        }

        public Criteria andWrongtesttimesNotBetween(Integer value1, Integer value2) {
            addCriterion("wrongtesttimes not between", value1, value2, "wrongtesttimes");
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