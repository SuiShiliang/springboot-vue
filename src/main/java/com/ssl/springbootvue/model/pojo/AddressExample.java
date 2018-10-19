package com.ssl.springbootvue.model.pojo;

import java.util.ArrayList;
import java.util.List;

public class AddressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AddressExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCountryIdIsNull() {
            addCriterion("country_id is null");
            return (Criteria) this;
        }

        public Criteria andCountryIdIsNotNull() {
            addCriterion("country_id is not null");
            return (Criteria) this;
        }

        public Criteria andCountryIdEqualTo(String value) {
            addCriterion("country_id =", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotEqualTo(String value) {
            addCriterion("country_id <>", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdGreaterThan(String value) {
            addCriterion("country_id >", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdGreaterThanOrEqualTo(String value) {
            addCriterion("country_id >=", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdLessThan(String value) {
            addCriterion("country_id <", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdLessThanOrEqualTo(String value) {
            addCriterion("country_id <=", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdLike(String value) {
            addCriterion("country_id like", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotLike(String value) {
            addCriterion("country_id not like", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdIn(List<String> values) {
            addCriterion("country_id in", values, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotIn(List<String> values) {
            addCriterion("country_id not in", values, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdBetween(String value1, String value2) {
            addCriterion("country_id between", value1, value2, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotBetween(String value1, String value2) {
            addCriterion("country_id not between", value1, value2, "countryId");
            return (Criteria) this;
        }

        public Criteria andProvenceIdIsNull() {
            addCriterion("provence_id is null");
            return (Criteria) this;
        }

        public Criteria andProvenceIdIsNotNull() {
            addCriterion("provence_id is not null");
            return (Criteria) this;
        }

        public Criteria andProvenceIdEqualTo(String value) {
            addCriterion("provence_id =", value, "provenceId");
            return (Criteria) this;
        }

        public Criteria andProvenceIdNotEqualTo(String value) {
            addCriterion("provence_id <>", value, "provenceId");
            return (Criteria) this;
        }

        public Criteria andProvenceIdGreaterThan(String value) {
            addCriterion("provence_id >", value, "provenceId");
            return (Criteria) this;
        }

        public Criteria andProvenceIdGreaterThanOrEqualTo(String value) {
            addCriterion("provence_id >=", value, "provenceId");
            return (Criteria) this;
        }

        public Criteria andProvenceIdLessThan(String value) {
            addCriterion("provence_id <", value, "provenceId");
            return (Criteria) this;
        }

        public Criteria andProvenceIdLessThanOrEqualTo(String value) {
            addCriterion("provence_id <=", value, "provenceId");
            return (Criteria) this;
        }

        public Criteria andProvenceIdLike(String value) {
            addCriterion("provence_id like", value, "provenceId");
            return (Criteria) this;
        }

        public Criteria andProvenceIdNotLike(String value) {
            addCriterion("provence_id not like", value, "provenceId");
            return (Criteria) this;
        }

        public Criteria andProvenceIdIn(List<String> values) {
            addCriterion("provence_id in", values, "provenceId");
            return (Criteria) this;
        }

        public Criteria andProvenceIdNotIn(List<String> values) {
            addCriterion("provence_id not in", values, "provenceId");
            return (Criteria) this;
        }

        public Criteria andProvenceIdBetween(String value1, String value2) {
            addCriterion("provence_id between", value1, value2, "provenceId");
            return (Criteria) this;
        }

        public Criteria andProvenceIdNotBetween(String value1, String value2) {
            addCriterion("provence_id not between", value1, value2, "provenceId");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNull() {
            addCriterion("city_id is null");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNotNull() {
            addCriterion("city_id is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdEqualTo(String value) {
            addCriterion("city_id =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(String value) {
            addCriterion("city_id <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(String value) {
            addCriterion("city_id >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(String value) {
            addCriterion("city_id >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(String value) {
            addCriterion("city_id <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(String value) {
            addCriterion("city_id <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLike(String value) {
            addCriterion("city_id like", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotLike(String value) {
            addCriterion("city_id not like", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<String> values) {
            addCriterion("city_id in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<String> values) {
            addCriterion("city_id not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(String value1, String value2) {
            addCriterion("city_id between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(String value1, String value2) {
            addCriterion("city_id not between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andStreetIdIsNull() {
            addCriterion("street_id is null");
            return (Criteria) this;
        }

        public Criteria andStreetIdIsNotNull() {
            addCriterion("street_id is not null");
            return (Criteria) this;
        }

        public Criteria andStreetIdEqualTo(String value) {
            addCriterion("street_id =", value, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdNotEqualTo(String value) {
            addCriterion("street_id <>", value, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdGreaterThan(String value) {
            addCriterion("street_id >", value, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdGreaterThanOrEqualTo(String value) {
            addCriterion("street_id >=", value, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdLessThan(String value) {
            addCriterion("street_id <", value, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdLessThanOrEqualTo(String value) {
            addCriterion("street_id <=", value, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdLike(String value) {
            addCriterion("street_id like", value, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdNotLike(String value) {
            addCriterion("street_id not like", value, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdIn(List<String> values) {
            addCriterion("street_id in", values, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdNotIn(List<String> values) {
            addCriterion("street_id not in", values, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdBetween(String value1, String value2) {
            addCriterion("street_id between", value1, value2, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdNotBetween(String value1, String value2) {
            addCriterion("street_id not between", value1, value2, "streetId");
            return (Criteria) this;
        }

        public Criteria andTownIdIsNull() {
            addCriterion("town_id is null");
            return (Criteria) this;
        }

        public Criteria andTownIdIsNotNull() {
            addCriterion("town_id is not null");
            return (Criteria) this;
        }

        public Criteria andTownIdEqualTo(String value) {
            addCriterion("town_id =", value, "townId");
            return (Criteria) this;
        }

        public Criteria andTownIdNotEqualTo(String value) {
            addCriterion("town_id <>", value, "townId");
            return (Criteria) this;
        }

        public Criteria andTownIdGreaterThan(String value) {
            addCriterion("town_id >", value, "townId");
            return (Criteria) this;
        }

        public Criteria andTownIdGreaterThanOrEqualTo(String value) {
            addCriterion("town_id >=", value, "townId");
            return (Criteria) this;
        }

        public Criteria andTownIdLessThan(String value) {
            addCriterion("town_id <", value, "townId");
            return (Criteria) this;
        }

        public Criteria andTownIdLessThanOrEqualTo(String value) {
            addCriterion("town_id <=", value, "townId");
            return (Criteria) this;
        }

        public Criteria andTownIdLike(String value) {
            addCriterion("town_id like", value, "townId");
            return (Criteria) this;
        }

        public Criteria andTownIdNotLike(String value) {
            addCriterion("town_id not like", value, "townId");
            return (Criteria) this;
        }

        public Criteria andTownIdIn(List<String> values) {
            addCriterion("town_id in", values, "townId");
            return (Criteria) this;
        }

        public Criteria andTownIdNotIn(List<String> values) {
            addCriterion("town_id not in", values, "townId");
            return (Criteria) this;
        }

        public Criteria andTownIdBetween(String value1, String value2) {
            addCriterion("town_id between", value1, value2, "townId");
            return (Criteria) this;
        }

        public Criteria andTownIdNotBetween(String value1, String value2) {
            addCriterion("town_id not between", value1, value2, "townId");
            return (Criteria) this;
        }

        public Criteria andVillageIdIsNull() {
            addCriterion("village_id is null");
            return (Criteria) this;
        }

        public Criteria andVillageIdIsNotNull() {
            addCriterion("village_id is not null");
            return (Criteria) this;
        }

        public Criteria andVillageIdEqualTo(String value) {
            addCriterion("village_id =", value, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdNotEqualTo(String value) {
            addCriterion("village_id <>", value, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdGreaterThan(String value) {
            addCriterion("village_id >", value, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdGreaterThanOrEqualTo(String value) {
            addCriterion("village_id >=", value, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdLessThan(String value) {
            addCriterion("village_id <", value, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdLessThanOrEqualTo(String value) {
            addCriterion("village_id <=", value, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdLike(String value) {
            addCriterion("village_id like", value, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdNotLike(String value) {
            addCriterion("village_id not like", value, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdIn(List<String> values) {
            addCriterion("village_id in", values, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdNotIn(List<String> values) {
            addCriterion("village_id not in", values, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdBetween(String value1, String value2) {
            addCriterion("village_id between", value1, value2, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdNotBetween(String value1, String value2) {
            addCriterion("village_id not between", value1, value2, "villageId");
            return (Criteria) this;
        }

        public Criteria andAnotherIsNull() {
            addCriterion("another is null");
            return (Criteria) this;
        }

        public Criteria andAnotherIsNotNull() {
            addCriterion("another is not null");
            return (Criteria) this;
        }

        public Criteria andAnotherEqualTo(String value) {
            addCriterion("another =", value, "another");
            return (Criteria) this;
        }

        public Criteria andAnotherNotEqualTo(String value) {
            addCriterion("another <>", value, "another");
            return (Criteria) this;
        }

        public Criteria andAnotherGreaterThan(String value) {
            addCriterion("another >", value, "another");
            return (Criteria) this;
        }

        public Criteria andAnotherGreaterThanOrEqualTo(String value) {
            addCriterion("another >=", value, "another");
            return (Criteria) this;
        }

        public Criteria andAnotherLessThan(String value) {
            addCriterion("another <", value, "another");
            return (Criteria) this;
        }

        public Criteria andAnotherLessThanOrEqualTo(String value) {
            addCriterion("another <=", value, "another");
            return (Criteria) this;
        }

        public Criteria andAnotherLike(String value) {
            addCriterion("another like", value, "another");
            return (Criteria) this;
        }

        public Criteria andAnotherNotLike(String value) {
            addCriterion("another not like", value, "another");
            return (Criteria) this;
        }

        public Criteria andAnotherIn(List<String> values) {
            addCriterion("another in", values, "another");
            return (Criteria) this;
        }

        public Criteria andAnotherNotIn(List<String> values) {
            addCriterion("another not in", values, "another");
            return (Criteria) this;
        }

        public Criteria andAnotherBetween(String value1, String value2) {
            addCriterion("another between", value1, value2, "another");
            return (Criteria) this;
        }

        public Criteria andAnotherNotBetween(String value1, String value2) {
            addCriterion("another not between", value1, value2, "another");
            return (Criteria) this;
        }
    }

    /**
     */
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