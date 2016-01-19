package com.gestorvisitas.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TbTrClienteExample {
    
    protected String orderByClause;

    
    protected boolean distinct;

    
    protected List<Criteria> oredCriteria;

    
    public TbTrClienteExample() {
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

        public Criteria andCliRucIsNull() {
            addCriterion("cli_ruc is null");
            return (Criteria) this;
        }

        public Criteria andCliRucIsNotNull() {
            addCriterion("cli_ruc is not null");
            return (Criteria) this;
        }

        public Criteria andCliRucEqualTo(Integer value) {
            addCriterion("cli_ruc =", value, "cliRuc");
            return (Criteria) this;
        }

        public Criteria andCliRucNotEqualTo(Integer value) {
            addCriterion("cli_ruc <>", value, "cliRuc");
            return (Criteria) this;
        }

        public Criteria andCliRucGreaterThan(Integer value) {
            addCriterion("cli_ruc >", value, "cliRuc");
            return (Criteria) this;
        }

        public Criteria andCliRucGreaterThanOrEqualTo(Integer value) {
            addCriterion("cli_ruc >=", value, "cliRuc");
            return (Criteria) this;
        }

        public Criteria andCliRucLessThan(Integer value) {
            addCriterion("cli_ruc <", value, "cliRuc");
            return (Criteria) this;
        }

        public Criteria andCliRucLessThanOrEqualTo(Integer value) {
            addCriterion("cli_ruc <=", value, "cliRuc");
            return (Criteria) this;
        }

        public Criteria andCliRucIn(List<Integer> values) {
            addCriterion("cli_ruc in", values, "cliRuc");
            return (Criteria) this;
        }

        public Criteria andCliRucNotIn(List<Integer> values) {
            addCriterion("cli_ruc not in", values, "cliRuc");
            return (Criteria) this;
        }

        public Criteria andCliRucBetween(Integer value1, Integer value2) {
            addCriterion("cli_ruc between", value1, value2, "cliRuc");
            return (Criteria) this;
        }

        public Criteria andCliRucNotBetween(Integer value1, Integer value2) {
            addCriterion("cli_ruc not between", value1, value2, "cliRuc");
            return (Criteria) this;
        }

        public Criteria andCliRazonSocialIsNull() {
            addCriterion("cli_razon_social is null");
            return (Criteria) this;
        }

        public Criteria andCliRazonSocialIsNotNull() {
            addCriterion("cli_razon_social is not null");
            return (Criteria) this;
        }

        public Criteria andCliRazonSocialEqualTo(String value) {
            addCriterion("cli_razon_social =", value, "cliRazonSocial");
            return (Criteria) this;
        }

        public Criteria andCliRazonSocialNotEqualTo(String value) {
            addCriterion("cli_razon_social <>", value, "cliRazonSocial");
            return (Criteria) this;
        }

        public Criteria andCliRazonSocialGreaterThan(String value) {
            addCriterion("cli_razon_social >", value, "cliRazonSocial");
            return (Criteria) this;
        }

        public Criteria andCliRazonSocialGreaterThanOrEqualTo(String value) {
            addCriterion("cli_razon_social >=", value, "cliRazonSocial");
            return (Criteria) this;
        }

        public Criteria andCliRazonSocialLessThan(String value) {
            addCriterion("cli_razon_social <", value, "cliRazonSocial");
            return (Criteria) this;
        }

        public Criteria andCliRazonSocialLessThanOrEqualTo(String value) {
            addCriterion("cli_razon_social <=", value, "cliRazonSocial");
            return (Criteria) this;
        }

        public Criteria andCliRazonSocialLike(String value) {
            addCriterion("cli_razon_social like", value, "cliRazonSocial");
            return (Criteria) this;
        }

        public Criteria andCliRazonSocialNotLike(String value) {
            addCriterion("cli_razon_social not like", value, "cliRazonSocial");
            return (Criteria) this;
        }

        public Criteria andCliRazonSocialIn(List<String> values) {
            addCriterion("cli_razon_social in", values, "cliRazonSocial");
            return (Criteria) this;
        }

        public Criteria andCliRazonSocialNotIn(List<String> values) {
            addCriterion("cli_razon_social not in", values, "cliRazonSocial");
            return (Criteria) this;
        }

        public Criteria andCliRazonSocialBetween(String value1, String value2) {
            addCriterion("cli_razon_social between", value1, value2, "cliRazonSocial");
            return (Criteria) this;
        }

        public Criteria andCliRazonSocialNotBetween(String value1, String value2) {
            addCriterion("cli_razon_social not between", value1, value2, "cliRazonSocial");
            return (Criteria) this;
        }

        public Criteria andCliSectorIsNull() {
            addCriterion("cli_sector is null");
            return (Criteria) this;
        }

        public Criteria andCliSectorIsNotNull() {
            addCriterion("cli_sector is not null");
            return (Criteria) this;
        }

        public Criteria andCliSectorEqualTo(String value) {
            addCriterion("cli_sector =", value, "cliSector");
            return (Criteria) this;
        }

        public Criteria andCliSectorNotEqualTo(String value) {
            addCriterion("cli_sector <>", value, "cliSector");
            return (Criteria) this;
        }

        public Criteria andCliSectorGreaterThan(String value) {
            addCriterion("cli_sector >", value, "cliSector");
            return (Criteria) this;
        }

        public Criteria andCliSectorGreaterThanOrEqualTo(String value) {
            addCriterion("cli_sector >=", value, "cliSector");
            return (Criteria) this;
        }

        public Criteria andCliSectorLessThan(String value) {
            addCriterion("cli_sector <", value, "cliSector");
            return (Criteria) this;
        }

        public Criteria andCliSectorLessThanOrEqualTo(String value) {
            addCriterion("cli_sector <=", value, "cliSector");
            return (Criteria) this;
        }

        public Criteria andCliSectorLike(String value) {
            addCriterion("cli_sector like", value, "cliSector");
            return (Criteria) this;
        }

        public Criteria andCliSectorNotLike(String value) {
            addCriterion("cli_sector not like", value, "cliSector");
            return (Criteria) this;
        }

        public Criteria andCliSectorIn(List<String> values) {
            addCriterion("cli_sector in", values, "cliSector");
            return (Criteria) this;
        }

        public Criteria andCliSectorNotIn(List<String> values) {
            addCriterion("cli_sector not in", values, "cliSector");
            return (Criteria) this;
        }

        public Criteria andCliSectorBetween(String value1, String value2) {
            addCriterion("cli_sector between", value1, value2, "cliSector");
            return (Criteria) this;
        }

        public Criteria andCliSectorNotBetween(String value1, String value2) {
            addCriterion("cli_sector not between", value1, value2, "cliSector");
            return (Criteria) this;
        }

        public Criteria andCliGerenteGeneralIsNull() {
            addCriterion("cli_gerente_general is null");
            return (Criteria) this;
        }

        public Criteria andCliGerenteGeneralIsNotNull() {
            addCriterion("cli_gerente_general is not null");
            return (Criteria) this;
        }

        public Criteria andCliGerenteGeneralEqualTo(String value) {
            addCriterion("cli_gerente_general =", value, "cliGerenteGeneral");
            return (Criteria) this;
        }

        public Criteria andCliGerenteGeneralNotEqualTo(String value) {
            addCriterion("cli_gerente_general <>", value, "cliGerenteGeneral");
            return (Criteria) this;
        }

        public Criteria andCliGerenteGeneralGreaterThan(String value) {
            addCriterion("cli_gerente_general >", value, "cliGerenteGeneral");
            return (Criteria) this;
        }

        public Criteria andCliGerenteGeneralGreaterThanOrEqualTo(String value) {
            addCriterion("cli_gerente_general >=", value, "cliGerenteGeneral");
            return (Criteria) this;
        }

        public Criteria andCliGerenteGeneralLessThan(String value) {
            addCriterion("cli_gerente_general <", value, "cliGerenteGeneral");
            return (Criteria) this;
        }

        public Criteria andCliGerenteGeneralLessThanOrEqualTo(String value) {
            addCriterion("cli_gerente_general <=", value, "cliGerenteGeneral");
            return (Criteria) this;
        }

        public Criteria andCliGerenteGeneralLike(String value) {
            addCriterion("cli_gerente_general like", value, "cliGerenteGeneral");
            return (Criteria) this;
        }

        public Criteria andCliGerenteGeneralNotLike(String value) {
            addCriterion("cli_gerente_general not like", value, "cliGerenteGeneral");
            return (Criteria) this;
        }

        public Criteria andCliGerenteGeneralIn(List<String> values) {
            addCriterion("cli_gerente_general in", values, "cliGerenteGeneral");
            return (Criteria) this;
        }

        public Criteria andCliGerenteGeneralNotIn(List<String> values) {
            addCriterion("cli_gerente_general not in", values, "cliGerenteGeneral");
            return (Criteria) this;
        }

        public Criteria andCliGerenteGeneralBetween(String value1, String value2) {
            addCriterion("cli_gerente_general between", value1, value2, "cliGerenteGeneral");
            return (Criteria) this;
        }

        public Criteria andCliGerenteGeneralNotBetween(String value1, String value2) {
            addCriterion("cli_gerente_general not between", value1, value2, "cliGerenteGeneral");
            return (Criteria) this;
        }

        public Criteria andCliContactoIsNull() {
            addCriterion("cli_contacto is null");
            return (Criteria) this;
        }

        public Criteria andCliContactoIsNotNull() {
            addCriterion("cli_contacto is not null");
            return (Criteria) this;
        }

        public Criteria andCliContactoEqualTo(String value) {
            addCriterion("cli_contacto =", value, "cliContacto");
            return (Criteria) this;
        }

        public Criteria andCliContactoNotEqualTo(String value) {
            addCriterion("cli_contacto <>", value, "cliContacto");
            return (Criteria) this;
        }

        public Criteria andCliContactoGreaterThan(String value) {
            addCriterion("cli_contacto >", value, "cliContacto");
            return (Criteria) this;
        }

        public Criteria andCliContactoGreaterThanOrEqualTo(String value) {
            addCriterion("cli_contacto >=", value, "cliContacto");
            return (Criteria) this;
        }

        public Criteria andCliContactoLessThan(String value) {
            addCriterion("cli_contacto <", value, "cliContacto");
            return (Criteria) this;
        }

        public Criteria andCliContactoLessThanOrEqualTo(String value) {
            addCriterion("cli_contacto <=", value, "cliContacto");
            return (Criteria) this;
        }

        public Criteria andCliContactoLike(String value) {
            addCriterion("cli_contacto like", value, "cliContacto");
            return (Criteria) this;
        }

        public Criteria andCliContactoNotLike(String value) {
            addCriterion("cli_contacto not like", value, "cliContacto");
            return (Criteria) this;
        }

        public Criteria andCliContactoIn(List<String> values) {
            addCriterion("cli_contacto in", values, "cliContacto");
            return (Criteria) this;
        }

        public Criteria andCliContactoNotIn(List<String> values) {
            addCriterion("cli_contacto not in", values, "cliContacto");
            return (Criteria) this;
        }

        public Criteria andCliContactoBetween(String value1, String value2) {
            addCriterion("cli_contacto between", value1, value2, "cliContacto");
            return (Criteria) this;
        }

        public Criteria andCliContactoNotBetween(String value1, String value2) {
            addCriterion("cli_contacto not between", value1, value2, "cliContacto");
            return (Criteria) this;
        }

        public Criteria andCliDireccionIsNull() {
            addCriterion("cli_direccion is null");
            return (Criteria) this;
        }

        public Criteria andCliDireccionIsNotNull() {
            addCriterion("cli_direccion is not null");
            return (Criteria) this;
        }

        public Criteria andCliDireccionEqualTo(String value) {
            addCriterion("cli_direccion =", value, "cliDireccion");
            return (Criteria) this;
        }

        public Criteria andCliDireccionNotEqualTo(String value) {
            addCriterion("cli_direccion <>", value, "cliDireccion");
            return (Criteria) this;
        }

        public Criteria andCliDireccionGreaterThan(String value) {
            addCriterion("cli_direccion >", value, "cliDireccion");
            return (Criteria) this;
        }

        public Criteria andCliDireccionGreaterThanOrEqualTo(String value) {
            addCriterion("cli_direccion >=", value, "cliDireccion");
            return (Criteria) this;
        }

        public Criteria andCliDireccionLessThan(String value) {
            addCriterion("cli_direccion <", value, "cliDireccion");
            return (Criteria) this;
        }

        public Criteria andCliDireccionLessThanOrEqualTo(String value) {
            addCriterion("cli_direccion <=", value, "cliDireccion");
            return (Criteria) this;
        }

        public Criteria andCliDireccionLike(String value) {
            addCriterion("cli_direccion like", value, "cliDireccion");
            return (Criteria) this;
        }

        public Criteria andCliDireccionNotLike(String value) {
            addCriterion("cli_direccion not like", value, "cliDireccion");
            return (Criteria) this;
        }

        public Criteria andCliDireccionIn(List<String> values) {
            addCriterion("cli_direccion in", values, "cliDireccion");
            return (Criteria) this;
        }

        public Criteria andCliDireccionNotIn(List<String> values) {
            addCriterion("cli_direccion not in", values, "cliDireccion");
            return (Criteria) this;
        }

        public Criteria andCliDireccionBetween(String value1, String value2) {
            addCriterion("cli_direccion between", value1, value2, "cliDireccion");
            return (Criteria) this;
        }

        public Criteria andCliDireccionNotBetween(String value1, String value2) {
            addCriterion("cli_direccion not between", value1, value2, "cliDireccion");
            return (Criteria) this;
        }

        public Criteria andCliTelefonoIsNull() {
            addCriterion("cli_telefono is null");
            return (Criteria) this;
        }

        public Criteria andCliTelefonoIsNotNull() {
            addCriterion("cli_telefono is not null");
            return (Criteria) this;
        }

        public Criteria andCliTelefonoEqualTo(String value) {
            addCriterion("cli_telefono =", value, "cliTelefono");
            return (Criteria) this;
        }

        public Criteria andCliTelefonoNotEqualTo(String value) {
            addCriterion("cli_telefono <>", value, "cliTelefono");
            return (Criteria) this;
        }

        public Criteria andCliTelefonoGreaterThan(String value) {
            addCriterion("cli_telefono >", value, "cliTelefono");
            return (Criteria) this;
        }

        public Criteria andCliTelefonoGreaterThanOrEqualTo(String value) {
            addCriterion("cli_telefono >=", value, "cliTelefono");
            return (Criteria) this;
        }

        public Criteria andCliTelefonoLessThan(String value) {
            addCriterion("cli_telefono <", value, "cliTelefono");
            return (Criteria) this;
        }

        public Criteria andCliTelefonoLessThanOrEqualTo(String value) {
            addCriterion("cli_telefono <=", value, "cliTelefono");
            return (Criteria) this;
        }

        public Criteria andCliTelefonoLike(String value) {
            addCriterion("cli_telefono like", value, "cliTelefono");
            return (Criteria) this;
        }

        public Criteria andCliTelefonoNotLike(String value) {
            addCriterion("cli_telefono not like", value, "cliTelefono");
            return (Criteria) this;
        }

        public Criteria andCliTelefonoIn(List<String> values) {
            addCriterion("cli_telefono in", values, "cliTelefono");
            return (Criteria) this;
        }

        public Criteria andCliTelefonoNotIn(List<String> values) {
            addCriterion("cli_telefono not in", values, "cliTelefono");
            return (Criteria) this;
        }

        public Criteria andCliTelefonoBetween(String value1, String value2) {
            addCriterion("cli_telefono between", value1, value2, "cliTelefono");
            return (Criteria) this;
        }

        public Criteria andCliTelefonoNotBetween(String value1, String value2) {
            addCriterion("cli_telefono not between", value1, value2, "cliTelefono");
            return (Criteria) this;
        }

        public Criteria andCliCorreoIsNull() {
            addCriterion("cli_correo is null");
            return (Criteria) this;
        }

        public Criteria andCliCorreoIsNotNull() {
            addCriterion("cli_correo is not null");
            return (Criteria) this;
        }

        public Criteria andCliCorreoEqualTo(String value) {
            addCriterion("cli_correo =", value, "cliCorreo");
            return (Criteria) this;
        }

        public Criteria andCliCorreoNotEqualTo(String value) {
            addCriterion("cli_correo <>", value, "cliCorreo");
            return (Criteria) this;
        }

        public Criteria andCliCorreoGreaterThan(String value) {
            addCriterion("cli_correo >", value, "cliCorreo");
            return (Criteria) this;
        }

        public Criteria andCliCorreoGreaterThanOrEqualTo(String value) {
            addCriterion("cli_correo >=", value, "cliCorreo");
            return (Criteria) this;
        }

        public Criteria andCliCorreoLessThan(String value) {
            addCriterion("cli_correo <", value, "cliCorreo");
            return (Criteria) this;
        }

        public Criteria andCliCorreoLessThanOrEqualTo(String value) {
            addCriterion("cli_correo <=", value, "cliCorreo");
            return (Criteria) this;
        }

        public Criteria andCliCorreoLike(String value) {
            addCriterion("cli_correo like", value, "cliCorreo");
            return (Criteria) this;
        }

        public Criteria andCliCorreoNotLike(String value) {
            addCriterion("cli_correo not like", value, "cliCorreo");
            return (Criteria) this;
        }

        public Criteria andCliCorreoIn(List<String> values) {
            addCriterion("cli_correo in", values, "cliCorreo");
            return (Criteria) this;
        }

        public Criteria andCliCorreoNotIn(List<String> values) {
            addCriterion("cli_correo not in", values, "cliCorreo");
            return (Criteria) this;
        }

        public Criteria andCliCorreoBetween(String value1, String value2) {
            addCriterion("cli_correo between", value1, value2, "cliCorreo");
            return (Criteria) this;
        }

        public Criteria andCliCorreoNotBetween(String value1, String value2) {
            addCriterion("cli_correo not between", value1, value2, "cliCorreo");
            return (Criteria) this;
        }

        public Criteria andCliEstadoIsNull() {
            addCriterion("cli_estado is null");
            return (Criteria) this;
        }

        public Criteria andCliEstadoIsNotNull() {
            addCriterion("cli_estado is not null");
            return (Criteria) this;
        }

        public Criteria andCliEstadoEqualTo(Integer value) {
            addCriterion("cli_estado =", value, "cliEstado");
            return (Criteria) this;
        }

        public Criteria andCliEstadoNotEqualTo(Integer value) {
            addCriterion("cli_estado <>", value, "cliEstado");
            return (Criteria) this;
        }

        public Criteria andCliEstadoGreaterThan(Integer value) {
            addCriterion("cli_estado >", value, "cliEstado");
            return (Criteria) this;
        }

        public Criteria andCliEstadoGreaterThanOrEqualTo(Integer value) {
            addCriterion("cli_estado >=", value, "cliEstado");
            return (Criteria) this;
        }

        public Criteria andCliEstadoLessThan(Integer value) {
            addCriterion("cli_estado <", value, "cliEstado");
            return (Criteria) this;
        }

        public Criteria andCliEstadoLessThanOrEqualTo(Integer value) {
            addCriterion("cli_estado <=", value, "cliEstado");
            return (Criteria) this;
        }

        public Criteria andCliEstadoIn(List<Integer> values) {
            addCriterion("cli_estado in", values, "cliEstado");
            return (Criteria) this;
        }

        public Criteria andCliEstadoNotIn(List<Integer> values) {
            addCriterion("cli_estado not in", values, "cliEstado");
            return (Criteria) this;
        }

        public Criteria andCliEstadoBetween(Integer value1, Integer value2) {
            addCriterion("cli_estado between", value1, value2, "cliEstado");
            return (Criteria) this;
        }

        public Criteria andCliEstadoNotBetween(Integer value1, Integer value2) {
            addCriterion("cli_estado not between", value1, value2, "cliEstado");
            return (Criteria) this;
        }

        public Criteria andCliFecAltaIsNull() {
            addCriterion("cli_fec_alta is null");
            return (Criteria) this;
        }

        public Criteria andCliFecAltaIsNotNull() {
            addCriterion("cli_fec_alta is not null");
            return (Criteria) this;
        }

        public Criteria andCliFecAltaEqualTo(Date value) {
            addCriterionForJDBCDate("cli_fec_alta =", value, "cliFecAlta");
            return (Criteria) this;
        }

        public Criteria andCliFecAltaNotEqualTo(Date value) {
            addCriterionForJDBCDate("cli_fec_alta <>", value, "cliFecAlta");
            return (Criteria) this;
        }

        public Criteria andCliFecAltaGreaterThan(Date value) {
            addCriterionForJDBCDate("cli_fec_alta >", value, "cliFecAlta");
            return (Criteria) this;
        }

        public Criteria andCliFecAltaGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cli_fec_alta >=", value, "cliFecAlta");
            return (Criteria) this;
        }

        public Criteria andCliFecAltaLessThan(Date value) {
            addCriterionForJDBCDate("cli_fec_alta <", value, "cliFecAlta");
            return (Criteria) this;
        }

        public Criteria andCliFecAltaLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cli_fec_alta <=", value, "cliFecAlta");
            return (Criteria) this;
        }

        public Criteria andCliFecAltaIn(List<Date> values) {
            addCriterionForJDBCDate("cli_fec_alta in", values, "cliFecAlta");
            return (Criteria) this;
        }

        public Criteria andCliFecAltaNotIn(List<Date> values) {
            addCriterionForJDBCDate("cli_fec_alta not in", values, "cliFecAlta");
            return (Criteria) this;
        }

        public Criteria andCliFecAltaBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cli_fec_alta between", value1, value2, "cliFecAlta");
            return (Criteria) this;
        }

        public Criteria andCliFecAltaNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cli_fec_alta not between", value1, value2, "cliFecAlta");
            return (Criteria) this;
        }

        public Criteria andCliFecBajaIsNull() {
            addCriterion("cli_fec_baja is null");
            return (Criteria) this;
        }

        public Criteria andCliFecBajaIsNotNull() {
            addCriterion("cli_fec_baja is not null");
            return (Criteria) this;
        }

        public Criteria andCliFecBajaEqualTo(Date value) {
            addCriterionForJDBCDate("cli_fec_baja =", value, "cliFecBaja");
            return (Criteria) this;
        }

        public Criteria andCliFecBajaNotEqualTo(Date value) {
            addCriterionForJDBCDate("cli_fec_baja <>", value, "cliFecBaja");
            return (Criteria) this;
        }

        public Criteria andCliFecBajaGreaterThan(Date value) {
            addCriterionForJDBCDate("cli_fec_baja >", value, "cliFecBaja");
            return (Criteria) this;
        }

        public Criteria andCliFecBajaGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cli_fec_baja >=", value, "cliFecBaja");
            return (Criteria) this;
        }

        public Criteria andCliFecBajaLessThan(Date value) {
            addCriterionForJDBCDate("cli_fec_baja <", value, "cliFecBaja");
            return (Criteria) this;
        }

        public Criteria andCliFecBajaLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cli_fec_baja <=", value, "cliFecBaja");
            return (Criteria) this;
        }

        public Criteria andCliFecBajaIn(List<Date> values) {
            addCriterionForJDBCDate("cli_fec_baja in", values, "cliFecBaja");
            return (Criteria) this;
        }

        public Criteria andCliFecBajaNotIn(List<Date> values) {
            addCriterionForJDBCDate("cli_fec_baja not in", values, "cliFecBaja");
            return (Criteria) this;
        }

        public Criteria andCliFecBajaBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cli_fec_baja between", value1, value2, "cliFecBaja");
            return (Criteria) this;
        }

        public Criteria andCliFecBajaNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cli_fec_baja not between", value1, value2, "cliFecBaja");
            return (Criteria) this;
        }

        public Criteria andCliFecModificacionIsNull() {
            addCriterion("cli_fec_modificacion is null");
            return (Criteria) this;
        }

        public Criteria andCliFecModificacionIsNotNull() {
            addCriterion("cli_fec_modificacion is not null");
            return (Criteria) this;
        }

        public Criteria andCliFecModificacionEqualTo(Date value) {
            addCriterionForJDBCDate("cli_fec_modificacion =", value, "cliFecModificacion");
            return (Criteria) this;
        }

        public Criteria andCliFecModificacionNotEqualTo(Date value) {
            addCriterionForJDBCDate("cli_fec_modificacion <>", value, "cliFecModificacion");
            return (Criteria) this;
        }

        public Criteria andCliFecModificacionGreaterThan(Date value) {
            addCriterionForJDBCDate("cli_fec_modificacion >", value, "cliFecModificacion");
            return (Criteria) this;
        }

        public Criteria andCliFecModificacionGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cli_fec_modificacion >=", value, "cliFecModificacion");
            return (Criteria) this;
        }

        public Criteria andCliFecModificacionLessThan(Date value) {
            addCriterionForJDBCDate("cli_fec_modificacion <", value, "cliFecModificacion");
            return (Criteria) this;
        }

        public Criteria andCliFecModificacionLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cli_fec_modificacion <=", value, "cliFecModificacion");
            return (Criteria) this;
        }

        public Criteria andCliFecModificacionIn(List<Date> values) {
            addCriterionForJDBCDate("cli_fec_modificacion in", values, "cliFecModificacion");
            return (Criteria) this;
        }

        public Criteria andCliFecModificacionNotIn(List<Date> values) {
            addCriterionForJDBCDate("cli_fec_modificacion not in", values, "cliFecModificacion");
            return (Criteria) this;
        }

        public Criteria andCliFecModificacionBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cli_fec_modificacion between", value1, value2, "cliFecModificacion");
            return (Criteria) this;
        }

        public Criteria andCliFecModificacionNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cli_fec_modificacion not between", value1, value2, "cliFecModificacion");
            return (Criteria) this;
        }

        public Criteria andCliUsuAltaIsNull() {
            addCriterion("cli_usu_alta is null");
            return (Criteria) this;
        }

        public Criteria andCliUsuAltaIsNotNull() {
            addCriterion("cli_usu_alta is not null");
            return (Criteria) this;
        }

        public Criteria andCliUsuAltaEqualTo(String value) {
            addCriterion("cli_usu_alta =", value, "cliUsuAlta");
            return (Criteria) this;
        }

        public Criteria andCliUsuAltaNotEqualTo(String value) {
            addCriterion("cli_usu_alta <>", value, "cliUsuAlta");
            return (Criteria) this;
        }

        public Criteria andCliUsuAltaGreaterThan(String value) {
            addCriterion("cli_usu_alta >", value, "cliUsuAlta");
            return (Criteria) this;
        }

        public Criteria andCliUsuAltaGreaterThanOrEqualTo(String value) {
            addCriterion("cli_usu_alta >=", value, "cliUsuAlta");
            return (Criteria) this;
        }

        public Criteria andCliUsuAltaLessThan(String value) {
            addCriterion("cli_usu_alta <", value, "cliUsuAlta");
            return (Criteria) this;
        }

        public Criteria andCliUsuAltaLessThanOrEqualTo(String value) {
            addCriterion("cli_usu_alta <=", value, "cliUsuAlta");
            return (Criteria) this;
        }

        public Criteria andCliUsuAltaLike(String value) {
            addCriterion("cli_usu_alta like", value, "cliUsuAlta");
            return (Criteria) this;
        }

        public Criteria andCliUsuAltaNotLike(String value) {
            addCriterion("cli_usu_alta not like", value, "cliUsuAlta");
            return (Criteria) this;
        }

        public Criteria andCliUsuAltaIn(List<String> values) {
            addCriterion("cli_usu_alta in", values, "cliUsuAlta");
            return (Criteria) this;
        }

        public Criteria andCliUsuAltaNotIn(List<String> values) {
            addCriterion("cli_usu_alta not in", values, "cliUsuAlta");
            return (Criteria) this;
        }

        public Criteria andCliUsuAltaBetween(String value1, String value2) {
            addCriterion("cli_usu_alta between", value1, value2, "cliUsuAlta");
            return (Criteria) this;
        }

        public Criteria andCliUsuAltaNotBetween(String value1, String value2) {
            addCriterion("cli_usu_alta not between", value1, value2, "cliUsuAlta");
            return (Criteria) this;
        }

        public Criteria andCliUsuBajaIsNull() {
            addCriterion("cli_usu_baja is null");
            return (Criteria) this;
        }

        public Criteria andCliUsuBajaIsNotNull() {
            addCriterion("cli_usu_baja is not null");
            return (Criteria) this;
        }

        public Criteria andCliUsuBajaEqualTo(String value) {
            addCriterion("cli_usu_baja =", value, "cliUsuBaja");
            return (Criteria) this;
        }

        public Criteria andCliUsuBajaNotEqualTo(String value) {
            addCriterion("cli_usu_baja <>", value, "cliUsuBaja");
            return (Criteria) this;
        }

        public Criteria andCliUsuBajaGreaterThan(String value) {
            addCriterion("cli_usu_baja >", value, "cliUsuBaja");
            return (Criteria) this;
        }

        public Criteria andCliUsuBajaGreaterThanOrEqualTo(String value) {
            addCriterion("cli_usu_baja >=", value, "cliUsuBaja");
            return (Criteria) this;
        }

        public Criteria andCliUsuBajaLessThan(String value) {
            addCriterion("cli_usu_baja <", value, "cliUsuBaja");
            return (Criteria) this;
        }

        public Criteria andCliUsuBajaLessThanOrEqualTo(String value) {
            addCriterion("cli_usu_baja <=", value, "cliUsuBaja");
            return (Criteria) this;
        }

        public Criteria andCliUsuBajaLike(String value) {
            addCriterion("cli_usu_baja like", value, "cliUsuBaja");
            return (Criteria) this;
        }

        public Criteria andCliUsuBajaNotLike(String value) {
            addCriterion("cli_usu_baja not like", value, "cliUsuBaja");
            return (Criteria) this;
        }

        public Criteria andCliUsuBajaIn(List<String> values) {
            addCriterion("cli_usu_baja in", values, "cliUsuBaja");
            return (Criteria) this;
        }

        public Criteria andCliUsuBajaNotIn(List<String> values) {
            addCriterion("cli_usu_baja not in", values, "cliUsuBaja");
            return (Criteria) this;
        }

        public Criteria andCliUsuBajaBetween(String value1, String value2) {
            addCriterion("cli_usu_baja between", value1, value2, "cliUsuBaja");
            return (Criteria) this;
        }

        public Criteria andCliUsuBajaNotBetween(String value1, String value2) {
            addCriterion("cli_usu_baja not between", value1, value2, "cliUsuBaja");
            return (Criteria) this;
        }

        public Criteria andCliUsuModificacionIsNull() {
            addCriterion("cli_usu_modificacion is null");
            return (Criteria) this;
        }

        public Criteria andCliUsuModificacionIsNotNull() {
            addCriterion("cli_usu_modificacion is not null");
            return (Criteria) this;
        }

        public Criteria andCliUsuModificacionEqualTo(String value) {
            addCriterion("cli_usu_modificacion =", value, "cliUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andCliUsuModificacionNotEqualTo(String value) {
            addCriterion("cli_usu_modificacion <>", value, "cliUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andCliUsuModificacionGreaterThan(String value) {
            addCriterion("cli_usu_modificacion >", value, "cliUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andCliUsuModificacionGreaterThanOrEqualTo(String value) {
            addCriterion("cli_usu_modificacion >=", value, "cliUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andCliUsuModificacionLessThan(String value) {
            addCriterion("cli_usu_modificacion <", value, "cliUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andCliUsuModificacionLessThanOrEqualTo(String value) {
            addCriterion("cli_usu_modificacion <=", value, "cliUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andCliUsuModificacionLike(String value) {
            addCriterion("cli_usu_modificacion like", value, "cliUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andCliUsuModificacionNotLike(String value) {
            addCriterion("cli_usu_modificacion not like", value, "cliUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andCliUsuModificacionIn(List<String> values) {
            addCriterion("cli_usu_modificacion in", values, "cliUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andCliUsuModificacionNotIn(List<String> values) {
            addCriterion("cli_usu_modificacion not in", values, "cliUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andCliUsuModificacionBetween(String value1, String value2) {
            addCriterion("cli_usu_modificacion between", value1, value2, "cliUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andCliUsuModificacionNotBetween(String value1, String value2) {
            addCriterion("cli_usu_modificacion not between", value1, value2, "cliUsuModificacion");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_tr_cliente
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