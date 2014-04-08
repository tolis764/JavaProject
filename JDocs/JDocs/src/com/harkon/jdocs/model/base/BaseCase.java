/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.harkon.jdocs.model.base;

import java.io.Serializable;

/**
 *
 * @author tolis
 */
public class BaseCase implements Comparable, Serializable {

    public static String REF = "Case";
    public static String PROP_ID = "id";
    public static String PROP_TITLE = "title";
    public static String PROP_DESC = "desc";
    public static String PROP_CLIENT_ENTITY_ID = "clientEntityId";
    public static String PROP_CASE_TYPE_ID = "caseTypeId";

    //Constructors
    public BaseCase() {
        initialize();
    }

    /**
     * Constructor for primary key
     */
    public BaseCase(java.lang.Integer id) {
        this.setId(id);
        initialize();
    }

    protected void initialize() {
    }
    private int hashCode = Integer.MIN_VALUE;
    // primary key
    private java.lang.Integer id;
    // fields
    private java.lang.String title;
    private java.lang.String desc;
    private java.lang.Integer clientEntityId;
    private java.lang.Integer caseTypeId;

    // many to one... not yet!
    /**
     * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="ID"
     */
    public java.lang.Integer getId() {
        return id;
    }

    /**
     * Set the unique identifier of this class
     * @param id the new ID
     */
    public void setId(java.lang.Integer id) {
        this.id = id;
        this.hashCode = Integer.MIN_VALUE;
    }

    /**
     * Return the value associated with the column: TITLE
     */
    public java.lang.String getTitle() {
        return title;
    }

    /**
     * Set the value related to the column: TITLE
     * @param name the TITLE value
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }

    /**
     * Return the value associated with the column: DESC
     */
    public java.lang.String getDesc() {
        return desc;
    }

    /**
     * Set the value related to the column: DESC
     * @param name the DESC value
     */
    public void setDesc(java.lang.String desc) {
        this.desc = desc;
    }

    /**
     * Return the value associated with the column: CLIENT_ENTITY_ID
     */
    public java.lang.Integer getClientEntityId() {
        return clientEntityId;
    }

    /**
     * Set the value related to the column: CLIENT_ENTITY_ID
     * @param clientEntityId the CLIENT_ENTITY_ID value
     */
    public void setClientEntityId(java.lang.Integer clientEntityId) {
        this.clientEntityId = clientEntityId;
    }

    /**
     * Return the value associated with the column: CASE_TYPE_ID
     */
    public java.lang.Integer getCaseTypeId() {
        return caseTypeId;
    }

    /**
     * Set the value related to the column: CASE_TYPE_ID
     * @param caseTypeId the CASE_TYPE_ID value
     */
    public void setCaseTypeId(java.lang.Integer caseTypeId) {
        this.caseTypeId = caseTypeId;
    }

    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String toString() {
        return super.toString();
    }
}
