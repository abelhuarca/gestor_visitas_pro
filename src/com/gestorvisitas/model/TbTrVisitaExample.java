package com.gestorvisitas.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TbTrVisitaExample {
     
    protected String orderByClause;

     
    protected boolean distinct;

     
    protected List<Criteria> oredCriteria;

     
    public TbTrVisitaExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andVisCodigoIsNull() {
            addCriterion("vis_codigo is null");
            return (Criteria) this;
        }

        public Criteria andVisCodigoIsNotNull() {
            addCriterion("vis_codigo is not null");
            return (Criteria) this;
        }

        public Criteria andVisCodigoEqualTo(Integer value) {
            addCriterion("vis_codigo =", value, "visCodigo");
            return (Criteria) this;
        }

        public Criteria andVisCodigoNotEqualTo(Integer value) {
            addCriterion("vis_codigo <>", value, "visCodigo");
            return (Criteria) this;
        }

        public Criteria andVisCodigoGreaterThan(Integer value) {
            addCriterion("vis_codigo >", value, "visCodigo");
            return (Criteria) this;
        }

        public Criteria andVisCodigoGreaterThanOrEqualTo(Integer value) {
            addCriterion("vis_codigo >=", value, "visCodigo");
            return (Criteria) this;
        }

        public Criteria andVisCodigoLessThan(Integer value) {
            addCriterion("vis_codigo <", value, "visCodigo");
            return (Criteria) this;
        }

        public Criteria andVisCodigoLessThanOrEqualTo(Integer value) {
            addCriterion("vis_codigo <=", value, "visCodigo");
            return (Criteria) this;
        }

        public Criteria andVisCodigoIn(List<Integer> values) {
            addCriterion("vis_codigo in", values, "visCodigo");
            return (Criteria) this;
        }

        public Criteria andVisCodigoNotIn(List<Integer> values) {
            addCriterion("vis_codigo not in", values, "visCodigo");
            return (Criteria) this;
        }

        public Criteria andVisCodigoBetween(Integer value1, Integer value2) {
            addCriterion("vis_codigo between", value1, value2, "visCodigo");
            return (Criteria) this;
        }

        public Criteria andVisCodigoNotBetween(Integer value1, Integer value2) {
            addCriterion("vis_codigo not between", value1, value2, "visCodigo");
            return (Criteria) this;
        }

        public Criteria andCliCodigoIsNull() {
            addCriterion("cli_codigo is null");
            return (Criteria) this;
        }

        public Criteria andCliCodigoIsNotNull() {
            addCriterion("cli_codigo is not null");
            return (Criteria) this;
        }

        public Criteria andCliCodigoEqualTo(Integer value) {
            addCriterion("cli_codigo =", value, "cliCodigo");
            return (Criteria) this;
        }

        public Criteria andCliCodigoNotEqualTo(Integer value) {
            addCriterion("cli_codigo <>", value, "cliCodigo");
            return (Criteria) this;
        }

        public Criteria andCliCodigoGreaterThan(Integer value) {
            addCriterion("cli_codigo >", value, "cliCodigo");
            return (Criteria) this;
        }

        public Criteria andCliCodigoGreaterThanOrEqualTo(Integer value) {
            addCriterion("cli_codigo >=", value, "cliCodigo");
            return (Criteria) this;
        }

        public Criteria andCliCodigoLessThan(Integer value) {
            addCriterion("cli_codigo <", value, "cliCodigo");
            return (Criteria) this;
        }

        public Criteria andCliCodigoLessThanOrEqualTo(Integer value) {
            addCriterion("cli_codigo <=", value, "cliCodigo");
            return (Criteria) this;
        }

        public Criteria andCliCodigoIn(List<Integer> values) {
            addCriterion("cli_codigo in", values, "cliCodigo");
            return (Criteria) this;
        }

        public Criteria andCliCodigoNotIn(List<Integer> values) {
            addCriterion("cli_codigo not in", values, "cliCodigo");
            return (Criteria) this;
        }

        public Criteria andCliCodigoBetween(Integer value1, Integer value2) {
            addCriterion("cli_codigo between", value1, value2, "cliCodigo");
            return (Criteria) this;
        }

        public Criteria andCliCodigoNotBetween(Integer value1, Integer value2) {
            addCriterion("cli_codigo not between", value1, value2, "cliCodigo");
            return (Criteria) this;
        }

        public Criteria andProCodigoIsNull() {
            addCriterion("pro_codigo is null");
            return (Criteria) this;
        }

        public Criteria andProCodigoIsNotNull() {
            addCriterion("pro_codigo is not null");
            return (Criteria) this;
        }

        public Criteria andProCodigoEqualTo(Integer value) {
            addCriterion("pro_codigo =", value, "proCodigo");
            return (Criteria) this;
        }

        public Criteria andProCodigoNotEqualTo(Integer value) {
            addCriterion("pro_codigo <>", value, "proCodigo");
            return (Criteria) this;
        }

        public Criteria andProCodigoGreaterThan(Integer value) {
            addCriterion("pro_codigo >", value, "proCodigo");
            return (Criteria) this;
        }

        public Criteria andProCodigoGreaterThanOrEqualTo(Integer value) {
            addCriterion("pro_codigo >=", value, "proCodigo");
            return (Criteria) this;
        }

        public Criteria andProCodigoLessThan(Integer value) {
            addCriterion("pro_codigo <", value, "proCodigo");
            return (Criteria) this;
        }

        public Criteria andProCodigoLessThanOrEqualTo(Integer value) {
            addCriterion("pro_codigo <=", value, "proCodigo");
            return (Criteria) this;
        }

        public Criteria andProCodigoIn(List<Integer> values) {
            addCriterion("pro_codigo in", values, "proCodigo");
            return (Criteria) this;
        }

        public Criteria andProCodigoNotIn(List<Integer> values) {
            addCriterion("pro_codigo not in", values, "proCodigo");
            return (Criteria) this;
        }

        public Criteria andProCodigoBetween(Integer value1, Integer value2) {
            addCriterion("pro_codigo between", value1, value2, "proCodigo");
            return (Criteria) this;
        }

        public Criteria andProCodigoNotBetween(Integer value1, Integer value2) {
            addCriterion("pro_codigo not between", value1, value2, "proCodigo");
            return (Criteria) this;
        }

        public Criteria andMotCodigoIsNull() {
            addCriterion("mot_codigo is null");
            return (Criteria) this;
        }

        public Criteria andMotCodigoIsNotNull() {
            addCriterion("mot_codigo is not null");
            return (Criteria) this;
        }

        public Criteria andMotCodigoEqualTo(Integer value) {
            addCriterion("mot_codigo =", value, "motCodigo");
            return (Criteria) this;
        }

        public Criteria andMotCodigoNotEqualTo(Integer value) {
            addCriterion("mot_codigo <>", value, "motCodigo");
            return (Criteria) this;
        }

        public Criteria andMotCodigoGreaterThan(Integer value) {
            addCriterion("mot_codigo >", value, "motCodigo");
            return (Criteria) this;
        }

        public Criteria andMotCodigoGreaterThanOrEqualTo(Integer value) {
            addCriterion("mot_codigo >=", value, "motCodigo");
            return (Criteria) this;
        }

        public Criteria andMotCodigoLessThan(Integer value) {
            addCriterion("mot_codigo <", value, "motCodigo");
            return (Criteria) this;
        }

        public Criteria andMotCodigoLessThanOrEqualTo(Integer value) {
            addCriterion("mot_codigo <=", value, "motCodigo");
            return (Criteria) this;
        }

        public Criteria andMotCodigoIn(List<Integer> values) {
            addCriterion("mot_codigo in", values, "motCodigo");
            return (Criteria) this;
        }

        public Criteria andMotCodigoNotIn(List<Integer> values) {
            addCriterion("mot_codigo not in", values, "motCodigo");
            return (Criteria) this;
        }

        public Criteria andMotCodigoBetween(Integer value1, Integer value2) {
            addCriterion("mot_codigo between", value1, value2, "motCodigo");
            return (Criteria) this;
        }

        public Criteria andMotCodigoNotBetween(Integer value1, Integer value2) {
            addCriterion("mot_codigo not between", value1, value2, "motCodigo");
            return (Criteria) this;
        }

        public Criteria andUsuCodigoIsNull() {
            addCriterion("usu_codigo is null");
            return (Criteria) this;
        }

        public Criteria andUsuCodigoIsNotNull() {
            addCriterion("usu_codigo is not null");
            return (Criteria) this;
        }

        public Criteria andUsuCodigoEqualTo(Integer value) {
            addCriterion("usu_codigo =", value, "usuCodigo");
            return (Criteria) this;
        }

        public Criteria andUsuCodigoNotEqualTo(Integer value) {
            addCriterion("usu_codigo <>", value, "usuCodigo");
            return (Criteria) this;
        }

        public Criteria andUsuCodigoGreaterThan(Integer value) {
            addCriterion("usu_codigo >", value, "usuCodigo");
            return (Criteria) this;
        }

        public Criteria andUsuCodigoGreaterThanOrEqualTo(Integer value) {
            addCriterion("usu_codigo >=", value, "usuCodigo");
            return (Criteria) this;
        }

        public Criteria andUsuCodigoLessThan(Integer value) {
            addCriterion("usu_codigo <", value, "usuCodigo");
            return (Criteria) this;
        }

        public Criteria andUsuCodigoLessThanOrEqualTo(Integer value) {
            addCriterion("usu_codigo <=", value, "usuCodigo");
            return (Criteria) this;
        }

        public Criteria andUsuCodigoIn(List<Integer> values) {
            addCriterion("usu_codigo in", values, "usuCodigo");
            return (Criteria) this;
        }

        public Criteria andUsuCodigoNotIn(List<Integer> values) {
            addCriterion("usu_codigo not in", values, "usuCodigo");
            return (Criteria) this;
        }

        public Criteria andUsuCodigoBetween(Integer value1, Integer value2) {
            addCriterion("usu_codigo between", value1, value2, "usuCodigo");
            return (Criteria) this;
        }

        public Criteria andUsuCodigoNotBetween(Integer value1, Integer value2) {
            addCriterion("usu_codigo not between", value1, value2, "usuCodigo");
            return (Criteria) this;
        }

        public Criteria andAreCodigoIsNull() {
            addCriterion("are_codigo is null");
            return (Criteria) this;
        }

        public Criteria andAreCodigoIsNotNull() {
            addCriterion("are_codigo is not null");
            return (Criteria) this;
        }

        public Criteria andAreCodigoEqualTo(Integer value) {
            addCriterion("are_codigo =", value, "areCodigo");
            return (Criteria) this;
        }

        public Criteria andAreCodigoNotEqualTo(Integer value) {
            addCriterion("are_codigo <>", value, "areCodigo");
            return (Criteria) this;
        }

        public Criteria andAreCodigoGreaterThan(Integer value) {
            addCriterion("are_codigo >", value, "areCodigo");
            return (Criteria) this;
        }

        public Criteria andAreCodigoGreaterThanOrEqualTo(Integer value) {
            addCriterion("are_codigo >=", value, "areCodigo");
            return (Criteria) this;
        }

        public Criteria andAreCodigoLessThan(Integer value) {
            addCriterion("are_codigo <", value, "areCodigo");
            return (Criteria) this;
        }

        public Criteria andAreCodigoLessThanOrEqualTo(Integer value) {
            addCriterion("are_codigo <=", value, "areCodigo");
            return (Criteria) this;
        }

        public Criteria andAreCodigoIn(List<Integer> values) {
            addCriterion("are_codigo in", values, "areCodigo");
            return (Criteria) this;
        }

        public Criteria andAreCodigoNotIn(List<Integer> values) {
            addCriterion("are_codigo not in", values, "areCodigo");
            return (Criteria) this;
        }

        public Criteria andAreCodigoBetween(Integer value1, Integer value2) {
            addCriterion("are_codigo between", value1, value2, "areCodigo");
            return (Criteria) this;
        }

        public Criteria andAreCodigoNotBetween(Integer value1, Integer value2) {
            addCriterion("are_codigo not between", value1, value2, "areCodigo");
            return (Criteria) this;
        }

        public Criteria andVisFecInicioIsNull() {
            addCriterion("vis_fec_inicio is null");
            return (Criteria) this;
        }

        public Criteria andVisFecInicioIsNotNull() {
            addCriterion("vis_fec_inicio is not null");
            return (Criteria) this;
        }

        public Criteria andVisFecInicioEqualTo(Date value) {
            addCriterionForJDBCDate("vis_fec_inicio =", value, "visFecInicio");
            return (Criteria) this;
        }

        public Criteria andVisFecInicioNotEqualTo(Date value) {
            addCriterionForJDBCDate("vis_fec_inicio <>", value, "visFecInicio");
            return (Criteria) this;
        }

        public Criteria andVisFecInicioGreaterThan(Date value) {
            addCriterionForJDBCDate("vis_fec_inicio >", value, "visFecInicio");
            return (Criteria) this;
        }

        public Criteria andVisFecInicioGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("vis_fec_inicio >=", value, "visFecInicio");
            return (Criteria) this;
        }

        public Criteria andVisFecInicioLessThan(Date value) {
            addCriterionForJDBCDate("vis_fec_inicio <", value, "visFecInicio");
            return (Criteria) this;
        }

        public Criteria andVisFecInicioLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("vis_fec_inicio <=", value, "visFecInicio");
            return (Criteria) this;
        }

        public Criteria andVisFecInicioIn(List<Date> values) {
            addCriterionForJDBCDate("vis_fec_inicio in", values, "visFecInicio");
            return (Criteria) this;
        }

        public Criteria andVisFecInicioNotIn(List<Date> values) {
            addCriterionForJDBCDate("vis_fec_inicio not in", values, "visFecInicio");
            return (Criteria) this;
        }

        public Criteria andVisFecInicioBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("vis_fec_inicio between", value1, value2, "visFecInicio");
            return (Criteria) this;
        }

        public Criteria andVisFecInicioNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("vis_fec_inicio not between", value1, value2, "visFecInicio");
            return (Criteria) this;
        }

        public Criteria andVisLatitudIsNull() {
            addCriterion("vis_latitud is null");
            return (Criteria) this;
        }

        public Criteria andVisLatitudIsNotNull() {
            addCriterion("vis_latitud is not null");
            return (Criteria) this;
        }

        public Criteria andVisLatitudEqualTo(String value) {
            addCriterion("vis_latitud =", value, "visLatitud");
            return (Criteria) this;
        }

        public Criteria andVisLatitudNotEqualTo(String value) {
            addCriterion("vis_latitud <>", value, "visLatitud");
            return (Criteria) this;
        }

        public Criteria andVisLatitudGreaterThan(String value) {
            addCriterion("vis_latitud >", value, "visLatitud");
            return (Criteria) this;
        }

        public Criteria andVisLatitudGreaterThanOrEqualTo(String value) {
            addCriterion("vis_latitud >=", value, "visLatitud");
            return (Criteria) this;
        }

        public Criteria andVisLatitudLessThan(String value) {
            addCriterion("vis_latitud <", value, "visLatitud");
            return (Criteria) this;
        }

        public Criteria andVisLatitudLessThanOrEqualTo(String value) {
            addCriterion("vis_latitud <=", value, "visLatitud");
            return (Criteria) this;
        }

        public Criteria andVisLatitudLike(String value) {
            addCriterion("vis_latitud like", value, "visLatitud");
            return (Criteria) this;
        }

        public Criteria andVisLatitudNotLike(String value) {
            addCriterion("vis_latitud not like", value, "visLatitud");
            return (Criteria) this;
        }

        public Criteria andVisLatitudIn(List<String> values) {
            addCriterion("vis_latitud in", values, "visLatitud");
            return (Criteria) this;
        }

        public Criteria andVisLatitudNotIn(List<String> values) {
            addCriterion("vis_latitud not in", values, "visLatitud");
            return (Criteria) this;
        }

        public Criteria andVisLatitudBetween(String value1, String value2) {
            addCriterion("vis_latitud between", value1, value2, "visLatitud");
            return (Criteria) this;
        }

        public Criteria andVisLatitudNotBetween(String value1, String value2) {
            addCriterion("vis_latitud not between", value1, value2, "visLatitud");
            return (Criteria) this;
        }

        public Criteria andVisLongitudIsNull() {
            addCriterion("vis_longitud is null");
            return (Criteria) this;
        }

        public Criteria andVisLongitudIsNotNull() {
            addCriterion("vis_longitud is not null");
            return (Criteria) this;
        }

        public Criteria andVisLongitudEqualTo(String value) {
            addCriterion("vis_longitud =", value, "visLongitud");
            return (Criteria) this;
        }

        public Criteria andVisLongitudNotEqualTo(String value) {
            addCriterion("vis_longitud <>", value, "visLongitud");
            return (Criteria) this;
        }

        public Criteria andVisLongitudGreaterThan(String value) {
            addCriterion("vis_longitud >", value, "visLongitud");
            return (Criteria) this;
        }

        public Criteria andVisLongitudGreaterThanOrEqualTo(String value) {
            addCriterion("vis_longitud >=", value, "visLongitud");
            return (Criteria) this;
        }

        public Criteria andVisLongitudLessThan(String value) {
            addCriterion("vis_longitud <", value, "visLongitud");
            return (Criteria) this;
        }

        public Criteria andVisLongitudLessThanOrEqualTo(String value) {
            addCriterion("vis_longitud <=", value, "visLongitud");
            return (Criteria) this;
        }

        public Criteria andVisLongitudLike(String value) {
            addCriterion("vis_longitud like", value, "visLongitud");
            return (Criteria) this;
        }

        public Criteria andVisLongitudNotLike(String value) {
            addCriterion("vis_longitud not like", value, "visLongitud");
            return (Criteria) this;
        }

        public Criteria andVisLongitudIn(List<String> values) {
            addCriterion("vis_longitud in", values, "visLongitud");
            return (Criteria) this;
        }

        public Criteria andVisLongitudNotIn(List<String> values) {
            addCriterion("vis_longitud not in", values, "visLongitud");
            return (Criteria) this;
        }

        public Criteria andVisLongitudBetween(String value1, String value2) {
            addCriterion("vis_longitud between", value1, value2, "visLongitud");
            return (Criteria) this;
        }

        public Criteria andVisLongitudNotBetween(String value1, String value2) {
            addCriterion("vis_longitud not between", value1, value2, "visLongitud");
            return (Criteria) this;
        }

        public Criteria andVisLicitacionIsNull() {
            addCriterion("vis_licitacion is null");
            return (Criteria) this;
        }

        public Criteria andVisLicitacionIsNotNull() {
            addCriterion("vis_licitacion is not null");
            return (Criteria) this;
        }

        public Criteria andVisLicitacionEqualTo(Integer value) {
            addCriterion("vis_licitacion =", value, "visLicitacion");
            return (Criteria) this;
        }

        public Criteria andVisLicitacionNotEqualTo(Integer value) {
            addCriterion("vis_licitacion <>", value, "visLicitacion");
            return (Criteria) this;
        }

        public Criteria andVisLicitacionGreaterThan(Integer value) {
            addCriterion("vis_licitacion >", value, "visLicitacion");
            return (Criteria) this;
        }

        public Criteria andVisLicitacionGreaterThanOrEqualTo(Integer value) {
            addCriterion("vis_licitacion >=", value, "visLicitacion");
            return (Criteria) this;
        }

        public Criteria andVisLicitacionLessThan(Integer value) {
            addCriterion("vis_licitacion <", value, "visLicitacion");
            return (Criteria) this;
        }

        public Criteria andVisLicitacionLessThanOrEqualTo(Integer value) {
            addCriterion("vis_licitacion <=", value, "visLicitacion");
            return (Criteria) this;
        }

        public Criteria andVisLicitacionIn(List<Integer> values) {
            addCriterion("vis_licitacion in", values, "visLicitacion");
            return (Criteria) this;
        }

        public Criteria andVisLicitacionNotIn(List<Integer> values) {
            addCriterion("vis_licitacion not in", values, "visLicitacion");
            return (Criteria) this;
        }

        public Criteria andVisLicitacionBetween(Integer value1, Integer value2) {
            addCriterion("vis_licitacion between", value1, value2, "visLicitacion");
            return (Criteria) this;
        }

        public Criteria andVisLicitacionNotBetween(Integer value1, Integer value2) {
            addCriterion("vis_licitacion not between", value1, value2, "visLicitacion");
            return (Criteria) this;
        }

        public Criteria andVisCompetenciaIsNull() {
            addCriterion("vis_competencia is null");
            return (Criteria) this;
        }

        public Criteria andVisCompetenciaIsNotNull() {
            addCriterion("vis_competencia is not null");
            return (Criteria) this;
        }

        public Criteria andVisCompetenciaEqualTo(Integer value) {
            addCriterion("vis_competencia =", value, "visCompetencia");
            return (Criteria) this;
        }

        public Criteria andVisCompetenciaNotEqualTo(Integer value) {
            addCriterion("vis_competencia <>", value, "visCompetencia");
            return (Criteria) this;
        }

        public Criteria andVisCompetenciaGreaterThan(Integer value) {
            addCriterion("vis_competencia >", value, "visCompetencia");
            return (Criteria) this;
        }

        public Criteria andVisCompetenciaGreaterThanOrEqualTo(Integer value) {
            addCriterion("vis_competencia >=", value, "visCompetencia");
            return (Criteria) this;
        }

        public Criteria andVisCompetenciaLessThan(Integer value) {
            addCriterion("vis_competencia <", value, "visCompetencia");
            return (Criteria) this;
        }

        public Criteria andVisCompetenciaLessThanOrEqualTo(Integer value) {
            addCriterion("vis_competencia <=", value, "visCompetencia");
            return (Criteria) this;
        }

        public Criteria andVisCompetenciaIn(List<Integer> values) {
            addCriterion("vis_competencia in", values, "visCompetencia");
            return (Criteria) this;
        }

        public Criteria andVisCompetenciaNotIn(List<Integer> values) {
            addCriterion("vis_competencia not in", values, "visCompetencia");
            return (Criteria) this;
        }

        public Criteria andVisCompetenciaBetween(Integer value1, Integer value2) {
            addCriterion("vis_competencia between", value1, value2, "visCompetencia");
            return (Criteria) this;
        }

        public Criteria andVisCompetenciaNotBetween(Integer value1, Integer value2) {
            addCriterion("vis_competencia not between", value1, value2, "visCompetencia");
            return (Criteria) this;
        }

        public Criteria andVisDetalleOportunidadIsNull() {
            addCriterion("vis_detalle_oportunidad is null");
            return (Criteria) this;
        }

        public Criteria andVisDetalleOportunidadIsNotNull() {
            addCriterion("vis_detalle_oportunidad is not null");
            return (Criteria) this;
        }

        public Criteria andVisDetalleOportunidadEqualTo(String value) {
            addCriterion("vis_detalle_oportunidad =", value, "visDetalleOportunidad");
            return (Criteria) this;
        }

        public Criteria andVisDetalleOportunidadNotEqualTo(String value) {
            addCriterion("vis_detalle_oportunidad <>", value, "visDetalleOportunidad");
            return (Criteria) this;
        }

        public Criteria andVisDetalleOportunidadGreaterThan(String value) {
            addCriterion("vis_detalle_oportunidad >", value, "visDetalleOportunidad");
            return (Criteria) this;
        }

        public Criteria andVisDetalleOportunidadGreaterThanOrEqualTo(String value) {
            addCriterion("vis_detalle_oportunidad >=", value, "visDetalleOportunidad");
            return (Criteria) this;
        }

        public Criteria andVisDetalleOportunidadLessThan(String value) {
            addCriterion("vis_detalle_oportunidad <", value, "visDetalleOportunidad");
            return (Criteria) this;
        }

        public Criteria andVisDetalleOportunidadLessThanOrEqualTo(String value) {
            addCriterion("vis_detalle_oportunidad <=", value, "visDetalleOportunidad");
            return (Criteria) this;
        }

        public Criteria andVisDetalleOportunidadLike(String value) {
            addCriterion("vis_detalle_oportunidad like", value, "visDetalleOportunidad");
            return (Criteria) this;
        }

        public Criteria andVisDetalleOportunidadNotLike(String value) {
            addCriterion("vis_detalle_oportunidad not like", value, "visDetalleOportunidad");
            return (Criteria) this;
        }

        public Criteria andVisDetalleOportunidadIn(List<String> values) {
            addCriterion("vis_detalle_oportunidad in", values, "visDetalleOportunidad");
            return (Criteria) this;
        }

        public Criteria andVisDetalleOportunidadNotIn(List<String> values) {
            addCriterion("vis_detalle_oportunidad not in", values, "visDetalleOportunidad");
            return (Criteria) this;
        }

        public Criteria andVisDetalleOportunidadBetween(String value1, String value2) {
            addCriterion("vis_detalle_oportunidad between", value1, value2, "visDetalleOportunidad");
            return (Criteria) this;
        }

        public Criteria andVisDetalleOportunidadNotBetween(String value1, String value2) {
            addCriterion("vis_detalle_oportunidad not between", value1, value2, "visDetalleOportunidad");
            return (Criteria) this;
        }

        public Criteria andVisNumeroLineasIsNull() {
            addCriterion("vis_numero_lineas is null");
            return (Criteria) this;
        }

        public Criteria andVisNumeroLineasIsNotNull() {
            addCriterion("vis_numero_lineas is not null");
            return (Criteria) this;
        }

        public Criteria andVisNumeroLineasEqualTo(Integer value) {
            addCriterion("vis_numero_lineas =", value, "visNumeroLineas");
            return (Criteria) this;
        }

        public Criteria andVisNumeroLineasNotEqualTo(Integer value) {
            addCriterion("vis_numero_lineas <>", value, "visNumeroLineas");
            return (Criteria) this;
        }

        public Criteria andVisNumeroLineasGreaterThan(Integer value) {
            addCriterion("vis_numero_lineas >", value, "visNumeroLineas");
            return (Criteria) this;
        }

        public Criteria andVisNumeroLineasGreaterThanOrEqualTo(Integer value) {
            addCriterion("vis_numero_lineas >=", value, "visNumeroLineas");
            return (Criteria) this;
        }

        public Criteria andVisNumeroLineasLessThan(Integer value) {
            addCriterion("vis_numero_lineas <", value, "visNumeroLineas");
            return (Criteria) this;
        }

        public Criteria andVisNumeroLineasLessThanOrEqualTo(Integer value) {
            addCriterion("vis_numero_lineas <=", value, "visNumeroLineas");
            return (Criteria) this;
        }

        public Criteria andVisNumeroLineasIn(List<Integer> values) {
            addCriterion("vis_numero_lineas in", values, "visNumeroLineas");
            return (Criteria) this;
        }

        public Criteria andVisNumeroLineasNotIn(List<Integer> values) {
            addCriterion("vis_numero_lineas not in", values, "visNumeroLineas");
            return (Criteria) this;
        }

        public Criteria andVisNumeroLineasBetween(Integer value1, Integer value2) {
            addCriterion("vis_numero_lineas between", value1, value2, "visNumeroLineas");
            return (Criteria) this;
        }

        public Criteria andVisNumeroLineasNotBetween(Integer value1, Integer value2) {
            addCriterion("vis_numero_lineas not between", value1, value2, "visNumeroLineas");
            return (Criteria) this;
        }

        public Criteria andVisFecFinalizacionIsNull() {
            addCriterion("vis_fec_finalizacion is null");
            return (Criteria) this;
        }

        public Criteria andVisFecFinalizacionIsNotNull() {
            addCriterion("vis_fec_finalizacion is not null");
            return (Criteria) this;
        }

        public Criteria andVisFecFinalizacionEqualTo(Date value) {
            addCriterionForJDBCDate("vis_fec_finalizacion =", value, "visFecFinalizacion");
            return (Criteria) this;
        }

        public Criteria andVisFecFinalizacionNotEqualTo(Date value) {
            addCriterionForJDBCDate("vis_fec_finalizacion <>", value, "visFecFinalizacion");
            return (Criteria) this;
        }

        public Criteria andVisFecFinalizacionGreaterThan(Date value) {
            addCriterionForJDBCDate("vis_fec_finalizacion >", value, "visFecFinalizacion");
            return (Criteria) this;
        }

        public Criteria andVisFecFinalizacionGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("vis_fec_finalizacion >=", value, "visFecFinalizacion");
            return (Criteria) this;
        }

        public Criteria andVisFecFinalizacionLessThan(Date value) {
            addCriterionForJDBCDate("vis_fec_finalizacion <", value, "visFecFinalizacion");
            return (Criteria) this;
        }

        public Criteria andVisFecFinalizacionLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("vis_fec_finalizacion <=", value, "visFecFinalizacion");
            return (Criteria) this;
        }

        public Criteria andVisFecFinalizacionIn(List<Date> values) {
            addCriterionForJDBCDate("vis_fec_finalizacion in", values, "visFecFinalizacion");
            return (Criteria) this;
        }

        public Criteria andVisFecFinalizacionNotIn(List<Date> values) {
            addCriterionForJDBCDate("vis_fec_finalizacion not in", values, "visFecFinalizacion");
            return (Criteria) this;
        }

        public Criteria andVisFecFinalizacionBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("vis_fec_finalizacion between", value1, value2, "visFecFinalizacion");
            return (Criteria) this;
        }

        public Criteria andVisFecFinalizacionNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("vis_fec_finalizacion not between", value1, value2, "visFecFinalizacion");
            return (Criteria) this;
        }

        public Criteria andVisFecComprometidaIsNull() {
            addCriterion("vis_fec_comprometida is null");
            return (Criteria) this;
        }

        public Criteria andVisFecComprometidaIsNotNull() {
            addCriterion("vis_fec_comprometida is not null");
            return (Criteria) this;
        }

        public Criteria andVisFecComprometidaEqualTo(Date value) {
            addCriterionForJDBCDate("vis_fec_comprometida =", value, "visFecComprometida");
            return (Criteria) this;
        }

        public Criteria andVisFecComprometidaNotEqualTo(Date value) {
            addCriterionForJDBCDate("vis_fec_comprometida <>", value, "visFecComprometida");
            return (Criteria) this;
        }

        public Criteria andVisFecComprometidaGreaterThan(Date value) {
            addCriterionForJDBCDate("vis_fec_comprometida >", value, "visFecComprometida");
            return (Criteria) this;
        }

        public Criteria andVisFecComprometidaGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("vis_fec_comprometida >=", value, "visFecComprometida");
            return (Criteria) this;
        }

        public Criteria andVisFecComprometidaLessThan(Date value) {
            addCriterionForJDBCDate("vis_fec_comprometida <", value, "visFecComprometida");
            return (Criteria) this;
        }

        public Criteria andVisFecComprometidaLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("vis_fec_comprometida <=", value, "visFecComprometida");
            return (Criteria) this;
        }

        public Criteria andVisFecComprometidaIn(List<Date> values) {
            addCriterionForJDBCDate("vis_fec_comprometida in", values, "visFecComprometida");
            return (Criteria) this;
        }

        public Criteria andVisFecComprometidaNotIn(List<Date> values) {
            addCriterionForJDBCDate("vis_fec_comprometida not in", values, "visFecComprometida");
            return (Criteria) this;
        }

        public Criteria andVisFecComprometidaBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("vis_fec_comprometida between", value1, value2, "visFecComprometida");
            return (Criteria) this;
        }

        public Criteria andVisFecComprometidaNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("vis_fec_comprometida not between", value1, value2, "visFecComprometida");
            return (Criteria) this;
        }

        public Criteria andVisResponsableIsNull() {
            addCriterion("vis_responsable is null");
            return (Criteria) this;
        }

        public Criteria andVisResponsableIsNotNull() {
            addCriterion("vis_responsable is not null");
            return (Criteria) this;
        }

        public Criteria andVisResponsableEqualTo(String value) {
            addCriterion("vis_responsable =", value, "visResponsable");
            return (Criteria) this;
        }

        public Criteria andVisResponsableNotEqualTo(String value) {
            addCriterion("vis_responsable <>", value, "visResponsable");
            return (Criteria) this;
        }

        public Criteria andVisResponsableGreaterThan(String value) {
            addCriterion("vis_responsable >", value, "visResponsable");
            return (Criteria) this;
        }

        public Criteria andVisResponsableGreaterThanOrEqualTo(String value) {
            addCriterion("vis_responsable >=", value, "visResponsable");
            return (Criteria) this;
        }

        public Criteria andVisResponsableLessThan(String value) {
            addCriterion("vis_responsable <", value, "visResponsable");
            return (Criteria) this;
        }

        public Criteria andVisResponsableLessThanOrEqualTo(String value) {
            addCriterion("vis_responsable <=", value, "visResponsable");
            return (Criteria) this;
        }

        public Criteria andVisResponsableLike(String value) {
            addCriterion("vis_responsable like", value, "visResponsable");
            return (Criteria) this;
        }

        public Criteria andVisResponsableNotLike(String value) {
            addCriterion("vis_responsable not like", value, "visResponsable");
            return (Criteria) this;
        }

        public Criteria andVisResponsableIn(List<String> values) {
            addCriterion("vis_responsable in", values, "visResponsable");
            return (Criteria) this;
        }

        public Criteria andVisResponsableNotIn(List<String> values) {
            addCriterion("vis_responsable not in", values, "visResponsable");
            return (Criteria) this;
        }

        public Criteria andVisResponsableBetween(String value1, String value2) {
            addCriterion("vis_responsable between", value1, value2, "visResponsable");
            return (Criteria) this;
        }

        public Criteria andVisResponsableNotBetween(String value1, String value2) {
            addCriterion("vis_responsable not between", value1, value2, "visResponsable");
            return (Criteria) this;
        }

        public Criteria andVisDescripcionIsNull() {
            addCriterion("vis_descripcion is null");
            return (Criteria) this;
        }

        public Criteria andVisDescripcionIsNotNull() {
            addCriterion("vis_descripcion is not null");
            return (Criteria) this;
        }

        public Criteria andVisDescripcionEqualTo(String value) {
            addCriterion("vis_descripcion =", value, "visDescripcion");
            return (Criteria) this;
        }

        public Criteria andVisDescripcionNotEqualTo(String value) {
            addCriterion("vis_descripcion <>", value, "visDescripcion");
            return (Criteria) this;
        }

        public Criteria andVisDescripcionGreaterThan(String value) {
            addCriterion("vis_descripcion >", value, "visDescripcion");
            return (Criteria) this;
        }

        public Criteria andVisDescripcionGreaterThanOrEqualTo(String value) {
            addCriterion("vis_descripcion >=", value, "visDescripcion");
            return (Criteria) this;
        }

        public Criteria andVisDescripcionLessThan(String value) {
            addCriterion("vis_descripcion <", value, "visDescripcion");
            return (Criteria) this;
        }

        public Criteria andVisDescripcionLessThanOrEqualTo(String value) {
            addCriterion("vis_descripcion <=", value, "visDescripcion");
            return (Criteria) this;
        }

        public Criteria andVisDescripcionLike(String value) {
            addCriterion("vis_descripcion like", value, "visDescripcion");
            return (Criteria) this;
        }

        public Criteria andVisDescripcionNotLike(String value) {
            addCriterion("vis_descripcion not like", value, "visDescripcion");
            return (Criteria) this;
        }

        public Criteria andVisDescripcionIn(List<String> values) {
            addCriterion("vis_descripcion in", values, "visDescripcion");
            return (Criteria) this;
        }

        public Criteria andVisDescripcionNotIn(List<String> values) {
            addCriterion("vis_descripcion not in", values, "visDescripcion");
            return (Criteria) this;
        }

        public Criteria andVisDescripcionBetween(String value1, String value2) {
            addCriterion("vis_descripcion between", value1, value2, "visDescripcion");
            return (Criteria) this;
        }

        public Criteria andVisDescripcionNotBetween(String value1, String value2) {
            addCriterion("vis_descripcion not between", value1, value2, "visDescripcion");
            return (Criteria) this;
        }

        public Criteria andVisNoVisitaIsNull() {
            addCriterion("vis_no_visita is null");
            return (Criteria) this;
        }

        public Criteria andVisNoVisitaIsNotNull() {
            addCriterion("vis_no_visita is not null");
            return (Criteria) this;
        }

        public Criteria andVisNoVisitaEqualTo(Integer value) {
            addCriterion("vis_no_visita =", value, "visNoVisita");
            return (Criteria) this;
        }

        public Criteria andVisNoVisitaNotEqualTo(Integer value) {
            addCriterion("vis_no_visita <>", value, "visNoVisita");
            return (Criteria) this;
        }

        public Criteria andVisNoVisitaGreaterThan(Integer value) {
            addCriterion("vis_no_visita >", value, "visNoVisita");
            return (Criteria) this;
        }

        public Criteria andVisNoVisitaGreaterThanOrEqualTo(Integer value) {
            addCriterion("vis_no_visita >=", value, "visNoVisita");
            return (Criteria) this;
        }

        public Criteria andVisNoVisitaLessThan(Integer value) {
            addCriterion("vis_no_visita <", value, "visNoVisita");
            return (Criteria) this;
        }

        public Criteria andVisNoVisitaLessThanOrEqualTo(Integer value) {
            addCriterion("vis_no_visita <=", value, "visNoVisita");
            return (Criteria) this;
        }

        public Criteria andVisNoVisitaIn(List<Integer> values) {
            addCriterion("vis_no_visita in", values, "visNoVisita");
            return (Criteria) this;
        }

        public Criteria andVisNoVisitaNotIn(List<Integer> values) {
            addCriterion("vis_no_visita not in", values, "visNoVisita");
            return (Criteria) this;
        }

        public Criteria andVisNoVisitaBetween(Integer value1, Integer value2) {
            addCriterion("vis_no_visita between", value1, value2, "visNoVisita");
            return (Criteria) this;
        }

        public Criteria andVisNoVisitaNotBetween(Integer value1, Integer value2) {
            addCriterion("vis_no_visita not between", value1, value2, "visNoVisita");
            return (Criteria) this;
        }

        public Criteria andVisEstadoIsNull() {
            addCriterion("vis_estado is null");
            return (Criteria) this;
        }

        public Criteria andVisEstadoIsNotNull() {
            addCriterion("vis_estado is not null");
            return (Criteria) this;
        }

        public Criteria andVisEstadoEqualTo(Integer value) {
            addCriterion("vis_estado =", value, "visEstado");
            return (Criteria) this;
        }

        public Criteria andVisEstadoNotEqualTo(Integer value) {
            addCriterion("vis_estado <>", value, "visEstado");
            return (Criteria) this;
        }

        public Criteria andVisEstadoGreaterThan(Integer value) {
            addCriterion("vis_estado >", value, "visEstado");
            return (Criteria) this;
        }

        public Criteria andVisEstadoGreaterThanOrEqualTo(Integer value) {
            addCriterion("vis_estado >=", value, "visEstado");
            return (Criteria) this;
        }

        public Criteria andVisEstadoLessThan(Integer value) {
            addCriterion("vis_estado <", value, "visEstado");
            return (Criteria) this;
        }

        public Criteria andVisEstadoLessThanOrEqualTo(Integer value) {
            addCriterion("vis_estado <=", value, "visEstado");
            return (Criteria) this;
        }

        public Criteria andVisEstadoIn(List<Integer> values) {
            addCriterion("vis_estado in", values, "visEstado");
            return (Criteria) this;
        }

        public Criteria andVisEstadoNotIn(List<Integer> values) {
            addCriterion("vis_estado not in", values, "visEstado");
            return (Criteria) this;
        }

        public Criteria andVisEstadoBetween(Integer value1, Integer value2) {
            addCriterion("vis_estado between", value1, value2, "visEstado");
            return (Criteria) this;
        }

        public Criteria andVisEstadoNotBetween(Integer value1, Integer value2) {
            addCriterion("vis_estado not between", value1, value2, "visEstado");
            return (Criteria) this;
        }

        public Criteria andVisFecAltaIsNull() {
            addCriterion("vis_fec_alta is null");
            return (Criteria) this;
        }

        public Criteria andVisFecAltaIsNotNull() {
            addCriterion("vis_fec_alta is not null");
            return (Criteria) this;
        }

        public Criteria andVisFecAltaEqualTo(Date value) {
            addCriterionForJDBCDate("vis_fec_alta =", value, "visFecAlta");
            return (Criteria) this;
        }

        public Criteria andVisFecAltaNotEqualTo(Date value) {
            addCriterionForJDBCDate("vis_fec_alta <>", value, "visFecAlta");
            return (Criteria) this;
        }

        public Criteria andVisFecAltaGreaterThan(Date value) {
            addCriterionForJDBCDate("vis_fec_alta >", value, "visFecAlta");
            return (Criteria) this;
        }

        public Criteria andVisFecAltaGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("vis_fec_alta >=", value, "visFecAlta");
            return (Criteria) this;
        }

        public Criteria andVisFecAltaLessThan(Date value) {
            addCriterionForJDBCDate("vis_fec_alta <", value, "visFecAlta");
            return (Criteria) this;
        }

        public Criteria andVisFecAltaLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("vis_fec_alta <=", value, "visFecAlta");
            return (Criteria) this;
        }

        public Criteria andVisFecAltaIn(List<Date> values) {
            addCriterionForJDBCDate("vis_fec_alta in", values, "visFecAlta");
            return (Criteria) this;
        }

        public Criteria andVisFecAltaNotIn(List<Date> values) {
            addCriterionForJDBCDate("vis_fec_alta not in", values, "visFecAlta");
            return (Criteria) this;
        }

        public Criteria andVisFecAltaBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("vis_fec_alta between", value1, value2, "visFecAlta");
            return (Criteria) this;
        }

        public Criteria andVisFecAltaNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("vis_fec_alta not between", value1, value2, "visFecAlta");
            return (Criteria) this;
        }

        public Criteria andVisFecBajaIsNull() {
            addCriterion("vis_fec_baja is null");
            return (Criteria) this;
        }

        public Criteria andVisFecBajaIsNotNull() {
            addCriterion("vis_fec_baja is not null");
            return (Criteria) this;
        }

        public Criteria andVisFecBajaEqualTo(Date value) {
            addCriterionForJDBCDate("vis_fec_baja =", value, "visFecBaja");
            return (Criteria) this;
        }

        public Criteria andVisFecBajaNotEqualTo(Date value) {
            addCriterionForJDBCDate("vis_fec_baja <>", value, "visFecBaja");
            return (Criteria) this;
        }

        public Criteria andVisFecBajaGreaterThan(Date value) {
            addCriterionForJDBCDate("vis_fec_baja >", value, "visFecBaja");
            return (Criteria) this;
        }

        public Criteria andVisFecBajaGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("vis_fec_baja >=", value, "visFecBaja");
            return (Criteria) this;
        }

        public Criteria andVisFecBajaLessThan(Date value) {
            addCriterionForJDBCDate("vis_fec_baja <", value, "visFecBaja");
            return (Criteria) this;
        }

        public Criteria andVisFecBajaLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("vis_fec_baja <=", value, "visFecBaja");
            return (Criteria) this;
        }

        public Criteria andVisFecBajaIn(List<Date> values) {
            addCriterionForJDBCDate("vis_fec_baja in", values, "visFecBaja");
            return (Criteria) this;
        }

        public Criteria andVisFecBajaNotIn(List<Date> values) {
            addCriterionForJDBCDate("vis_fec_baja not in", values, "visFecBaja");
            return (Criteria) this;
        }

        public Criteria andVisFecBajaBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("vis_fec_baja between", value1, value2, "visFecBaja");
            return (Criteria) this;
        }

        public Criteria andVisFecBajaNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("vis_fec_baja not between", value1, value2, "visFecBaja");
            return (Criteria) this;
        }

        public Criteria andVisFecModificacionIsNull() {
            addCriterion("vis_fec_modificacion is null");
            return (Criteria) this;
        }

        public Criteria andVisFecModificacionIsNotNull() {
            addCriterion("vis_fec_modificacion is not null");
            return (Criteria) this;
        }

        public Criteria andVisFecModificacionEqualTo(Date value) {
            addCriterionForJDBCDate("vis_fec_modificacion =", value, "visFecModificacion");
            return (Criteria) this;
        }

        public Criteria andVisFecModificacionNotEqualTo(Date value) {
            addCriterionForJDBCDate("vis_fec_modificacion <>", value, "visFecModificacion");
            return (Criteria) this;
        }

        public Criteria andVisFecModificacionGreaterThan(Date value) {
            addCriterionForJDBCDate("vis_fec_modificacion >", value, "visFecModificacion");
            return (Criteria) this;
        }

        public Criteria andVisFecModificacionGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("vis_fec_modificacion >=", value, "visFecModificacion");
            return (Criteria) this;
        }

        public Criteria andVisFecModificacionLessThan(Date value) {
            addCriterionForJDBCDate("vis_fec_modificacion <", value, "visFecModificacion");
            return (Criteria) this;
        }

        public Criteria andVisFecModificacionLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("vis_fec_modificacion <=", value, "visFecModificacion");
            return (Criteria) this;
        }

        public Criteria andVisFecModificacionIn(List<Date> values) {
            addCriterionForJDBCDate("vis_fec_modificacion in", values, "visFecModificacion");
            return (Criteria) this;
        }

        public Criteria andVisFecModificacionNotIn(List<Date> values) {
            addCriterionForJDBCDate("vis_fec_modificacion not in", values, "visFecModificacion");
            return (Criteria) this;
        }

        public Criteria andVisFecModificacionBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("vis_fec_modificacion between", value1, value2, "visFecModificacion");
            return (Criteria) this;
        }

        public Criteria andVisFecModificacionNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("vis_fec_modificacion not between", value1, value2, "visFecModificacion");
            return (Criteria) this;
        }

        public Criteria andVisUsuAltaIsNull() {
            addCriterion("vis_usu_alta is null");
            return (Criteria) this;
        }

        public Criteria andVisUsuAltaIsNotNull() {
            addCriterion("vis_usu_alta is not null");
            return (Criteria) this;
        }

        public Criteria andVisUsuAltaEqualTo(String value) {
            addCriterion("vis_usu_alta =", value, "visUsuAlta");
            return (Criteria) this;
        }

        public Criteria andVisUsuAltaNotEqualTo(String value) {
            addCriterion("vis_usu_alta <>", value, "visUsuAlta");
            return (Criteria) this;
        }

        public Criteria andVisUsuAltaGreaterThan(String value) {
            addCriterion("vis_usu_alta >", value, "visUsuAlta");
            return (Criteria) this;
        }

        public Criteria andVisUsuAltaGreaterThanOrEqualTo(String value) {
            addCriterion("vis_usu_alta >=", value, "visUsuAlta");
            return (Criteria) this;
        }

        public Criteria andVisUsuAltaLessThan(String value) {
            addCriterion("vis_usu_alta <", value, "visUsuAlta");
            return (Criteria) this;
        }

        public Criteria andVisUsuAltaLessThanOrEqualTo(String value) {
            addCriterion("vis_usu_alta <=", value, "visUsuAlta");
            return (Criteria) this;
        }

        public Criteria andVisUsuAltaLike(String value) {
            addCriterion("vis_usu_alta like", value, "visUsuAlta");
            return (Criteria) this;
        }

        public Criteria andVisUsuAltaNotLike(String value) {
            addCriterion("vis_usu_alta not like", value, "visUsuAlta");
            return (Criteria) this;
        }

        public Criteria andVisUsuAltaIn(List<String> values) {
            addCriterion("vis_usu_alta in", values, "visUsuAlta");
            return (Criteria) this;
        }

        public Criteria andVisUsuAltaNotIn(List<String> values) {
            addCriterion("vis_usu_alta not in", values, "visUsuAlta");
            return (Criteria) this;
        }

        public Criteria andVisUsuAltaBetween(String value1, String value2) {
            addCriterion("vis_usu_alta between", value1, value2, "visUsuAlta");
            return (Criteria) this;
        }

        public Criteria andVisUsuAltaNotBetween(String value1, String value2) {
            addCriterion("vis_usu_alta not between", value1, value2, "visUsuAlta");
            return (Criteria) this;
        }

        public Criteria andVisUsuBajaIsNull() {
            addCriterion("vis_usu_baja is null");
            return (Criteria) this;
        }

        public Criteria andVisUsuBajaIsNotNull() {
            addCriterion("vis_usu_baja is not null");
            return (Criteria) this;
        }

        public Criteria andVisUsuBajaEqualTo(String value) {
            addCriterion("vis_usu_baja =", value, "visUsuBaja");
            return (Criteria) this;
        }

        public Criteria andVisUsuBajaNotEqualTo(String value) {
            addCriterion("vis_usu_baja <>", value, "visUsuBaja");
            return (Criteria) this;
        }

        public Criteria andVisUsuBajaGreaterThan(String value) {
            addCriterion("vis_usu_baja >", value, "visUsuBaja");
            return (Criteria) this;
        }

        public Criteria andVisUsuBajaGreaterThanOrEqualTo(String value) {
            addCriterion("vis_usu_baja >=", value, "visUsuBaja");
            return (Criteria) this;
        }

        public Criteria andVisUsuBajaLessThan(String value) {
            addCriterion("vis_usu_baja <", value, "visUsuBaja");
            return (Criteria) this;
        }

        public Criteria andVisUsuBajaLessThanOrEqualTo(String value) {
            addCriterion("vis_usu_baja <=", value, "visUsuBaja");
            return (Criteria) this;
        }

        public Criteria andVisUsuBajaLike(String value) {
            addCriterion("vis_usu_baja like", value, "visUsuBaja");
            return (Criteria) this;
        }

        public Criteria andVisUsuBajaNotLike(String value) {
            addCriterion("vis_usu_baja not like", value, "visUsuBaja");
            return (Criteria) this;
        }

        public Criteria andVisUsuBajaIn(List<String> values) {
            addCriterion("vis_usu_baja in", values, "visUsuBaja");
            return (Criteria) this;
        }

        public Criteria andVisUsuBajaNotIn(List<String> values) {
            addCriterion("vis_usu_baja not in", values, "visUsuBaja");
            return (Criteria) this;
        }

        public Criteria andVisUsuBajaBetween(String value1, String value2) {
            addCriterion("vis_usu_baja between", value1, value2, "visUsuBaja");
            return (Criteria) this;
        }

        public Criteria andVisUsuBajaNotBetween(String value1, String value2) {
            addCriterion("vis_usu_baja not between", value1, value2, "visUsuBaja");
            return (Criteria) this;
        }

        public Criteria andVisUsuModificacionIsNull() {
            addCriterion("vis_usu_modificacion is null");
            return (Criteria) this;
        }

        public Criteria andVisUsuModificacionIsNotNull() {
            addCriterion("vis_usu_modificacion is not null");
            return (Criteria) this;
        }

        public Criteria andVisUsuModificacionEqualTo(String value) {
            addCriterion("vis_usu_modificacion =", value, "visUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andVisUsuModificacionNotEqualTo(String value) {
            addCriterion("vis_usu_modificacion <>", value, "visUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andVisUsuModificacionGreaterThan(String value) {
            addCriterion("vis_usu_modificacion >", value, "visUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andVisUsuModificacionGreaterThanOrEqualTo(String value) {
            addCriterion("vis_usu_modificacion >=", value, "visUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andVisUsuModificacionLessThan(String value) {
            addCriterion("vis_usu_modificacion <", value, "visUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andVisUsuModificacionLessThanOrEqualTo(String value) {
            addCriterion("vis_usu_modificacion <=", value, "visUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andVisUsuModificacionLike(String value) {
            addCriterion("vis_usu_modificacion like", value, "visUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andVisUsuModificacionNotLike(String value) {
            addCriterion("vis_usu_modificacion not like", value, "visUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andVisUsuModificacionIn(List<String> values) {
            addCriterion("vis_usu_modificacion in", values, "visUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andVisUsuModificacionNotIn(List<String> values) {
            addCriterion("vis_usu_modificacion not in", values, "visUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andVisUsuModificacionBetween(String value1, String value2) {
            addCriterion("vis_usu_modificacion between", value1, value2, "visUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andVisUsuModificacionNotBetween(String value1, String value2) {
            addCriterion("vis_usu_modificacion not between", value1, value2, "visUsuModificacion");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_tr_visita
     *
     * @mbggenerated do_not_delete_during_merge Mon Jan 18 10:48:19 COT 2016
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