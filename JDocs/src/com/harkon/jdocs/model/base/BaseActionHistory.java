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
public abstract class BaseActionHistory implements Comparable, Serializable {

    public static String REF = "ActionHistory";
    public static String PROP_USER = "user";
    public static String PROP_ACTION_TIME = "actionTime";
    public static String PROP_ACTION_NAME = "actionName";
    public static String PROP_DESC = "desc";
    public static String PROP_ID = "id";
    //in BaseHistory.java some other fields I'll see/ask about them later
    // primary key
    private java.lang.Integer id;
    // fields
    private java.util.Date actionTime;
    private java.lang.String actionName;
    private java.lang.String desc;
    private int hashCode = Integer.MIN_VALUE;

    //constructor
    public BaseActionHistory() {
        initialize();
    }

    private void initialize() {
    }

    /**
     * Constructor for primary key
     */
    public BaseActionHistory(java.lang.Integer id) {
        //this.setId(id);
        initialize();
    }

    /**
     * Set the unique identifier of this class
     * @param id the new ID
     */
    // public void setId (java.lang.Integer id) {
    //	this.id = id;
    //	this.hashCode = Integer.MIN_VALUE;
    //}
    /**
     * Return the value associated with the column: ACTION_TIME
     */
    public java.util.Date getActionTime() {
        return actionTime;
    }

    /**
     * Set the value related to the column: ACTION_TIME
     * @param clockInTime the ACTION_TIME value
     */
    public void setActionTime(java.util.Date actionTime) {
        this.actionTime = actionTime;
    }

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
     * Return the value associated with the column: ACTION_NAME
     */
    public java.lang.String getActionName() {
        return actionName;
    }

    /**
     * Set the value related to the column: ACTION_NAME
     * @param actionName the ACTION_NAME value
     */
    public void setActioName(java.lang.String actionName) {
        this.actionName = actionName;
    }

    /**
     * Return the value associated with the column: DESC
     */
    public java.lang.String getDesc() {
        return desc;
    }

    /**
     * Set the value related to the column: DESC
     * @param desc the DESC value
     */
    public void setDesc(java.lang.String desc) {
        this.desc = desc;
    }
}
