package com.simba.fitmanager.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FitExample() {
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

        public Criteria andFitIdIsNull() {
            addCriterion("fit_id is null");
            return (Criteria) this;
        }

        public Criteria andFitIdIsNotNull() {
            addCriterion("fit_id is not null");
            return (Criteria) this;
        }

        public Criteria andFitIdEqualTo(Long value) {
            addCriterion("fit_id =", value, "fitId");
            return (Criteria) this;
        }

        public Criteria andFitIdNotEqualTo(Long value) {
            addCriterion("fit_id <>", value, "fitId");
            return (Criteria) this;
        }

        public Criteria andFitIdGreaterThan(Long value) {
            addCriterion("fit_id >", value, "fitId");
            return (Criteria) this;
        }

        public Criteria andFitIdGreaterThanOrEqualTo(Long value) {
            addCriterion("fit_id >=", value, "fitId");
            return (Criteria) this;
        }

        public Criteria andFitIdLessThan(Long value) {
            addCriterion("fit_id <", value, "fitId");
            return (Criteria) this;
        }

        public Criteria andFitIdLessThanOrEqualTo(Long value) {
            addCriterion("fit_id <=", value, "fitId");
            return (Criteria) this;
        }

        public Criteria andFitIdIn(List<Long> values) {
            addCriterion("fit_id in", values, "fitId");
            return (Criteria) this;
        }

        public Criteria andFitIdNotIn(List<Long> values) {
            addCriterion("fit_id not in", values, "fitId");
            return (Criteria) this;
        }

        public Criteria andFitIdBetween(Long value1, Long value2) {
            addCriterion("fit_id between", value1, value2, "fitId");
            return (Criteria) this;
        }

        public Criteria andFitIdNotBetween(Long value1, Long value2) {
            addCriterion("fit_id not between", value1, value2, "fitId");
            return (Criteria) this;
        }

        public Criteria andFitNumIsNull() {
            addCriterion("fit_num is null");
            return (Criteria) this;
        }

        public Criteria andFitNumIsNotNull() {
            addCriterion("fit_num is not null");
            return (Criteria) this;
        }

        public Criteria andFitNumEqualTo(String value) {
            addCriterion("fit_num =", value, "fitNum");
            return (Criteria) this;
        }

        public Criteria andFitNumNotEqualTo(String value) {
            addCriterion("fit_num <>", value, "fitNum");
            return (Criteria) this;
        }

        public Criteria andFitNumGreaterThan(String value) {
            addCriterion("fit_num >", value, "fitNum");
            return (Criteria) this;
        }

        public Criteria andFitNumGreaterThanOrEqualTo(String value) {
            addCriterion("fit_num >=", value, "fitNum");
            return (Criteria) this;
        }

        public Criteria andFitNumLessThan(String value) {
            addCriterion("fit_num <", value, "fitNum");
            return (Criteria) this;
        }

        public Criteria andFitNumLessThanOrEqualTo(String value) {
            addCriterion("fit_num <=", value, "fitNum");
            return (Criteria) this;
        }

        public Criteria andFitNumLike(String value) {
            addCriterion("fit_num like", value, "fitNum");
            return (Criteria) this;
        }

        public Criteria andFitNumNotLike(String value) {
            addCriterion("fit_num not like", value, "fitNum");
            return (Criteria) this;
        }

        public Criteria andFitNumIn(List<String> values) {
            addCriterion("fit_num in", values, "fitNum");
            return (Criteria) this;
        }

        public Criteria andFitNumNotIn(List<String> values) {
            addCriterion("fit_num not in", values, "fitNum");
            return (Criteria) this;
        }

        public Criteria andFitNumBetween(String value1, String value2) {
            addCriterion("fit_num between", value1, value2, "fitNum");
            return (Criteria) this;
        }

        public Criteria andFitNumNotBetween(String value1, String value2) {
            addCriterion("fit_num not between", value1, value2, "fitNum");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andCreacteTimeIsNull() {
            addCriterion("creacte_time is null");
            return (Criteria) this;
        }

        public Criteria andCreacteTimeIsNotNull() {
            addCriterion("creacte_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreacteTimeEqualTo(Date value) {
            addCriterion("creacte_time =", value, "creacteTime");
            return (Criteria) this;
        }

        public Criteria andCreacteTimeNotEqualTo(Date value) {
            addCriterion("creacte_time <>", value, "creacteTime");
            return (Criteria) this;
        }

        public Criteria andCreacteTimeGreaterThan(Date value) {
            addCriterion("creacte_time >", value, "creacteTime");
            return (Criteria) this;
        }

        public Criteria andCreacteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("creacte_time >=", value, "creacteTime");
            return (Criteria) this;
        }

        public Criteria andCreacteTimeLessThan(Date value) {
            addCriterion("creacte_time <", value, "creacteTime");
            return (Criteria) this;
        }

        public Criteria andCreacteTimeLessThanOrEqualTo(Date value) {
            addCriterion("creacte_time <=", value, "creacteTime");
            return (Criteria) this;
        }

        public Criteria andCreacteTimeIn(List<Date> values) {
            addCriterion("creacte_time in", values, "creacteTime");
            return (Criteria) this;
        }

        public Criteria andCreacteTimeNotIn(List<Date> values) {
            addCriterion("creacte_time not in", values, "creacteTime");
            return (Criteria) this;
        }

        public Criteria andCreacteTimeBetween(Date value1, Date value2) {
            addCriterion("creacte_time between", value1, value2, "creacteTime");
            return (Criteria) this;
        }

        public Criteria andCreacteTimeNotBetween(Date value1, Date value2) {
            addCriterion("creacte_time not between", value1, value2, "creacteTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeIsNull() {
            addCriterion("active_time is null");
            return (Criteria) this;
        }

        public Criteria andActiveTimeIsNotNull() {
            addCriterion("active_time is not null");
            return (Criteria) this;
        }

        public Criteria andActiveTimeEqualTo(Date value) {
            addCriterion("active_time =", value, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeNotEqualTo(Date value) {
            addCriterion("active_time <>", value, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeGreaterThan(Date value) {
            addCriterion("active_time >", value, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("active_time >=", value, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeLessThan(Date value) {
            addCriterion("active_time <", value, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeLessThanOrEqualTo(Date value) {
            addCriterion("active_time <=", value, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeIn(List<Date> values) {
            addCriterion("active_time in", values, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeNotIn(List<Date> values) {
            addCriterion("active_time not in", values, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeBetween(Date value1, Date value2) {
            addCriterion("active_time between", value1, value2, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeNotBetween(Date value1, Date value2) {
            addCriterion("active_time not between", value1, value2, "activeTime");
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