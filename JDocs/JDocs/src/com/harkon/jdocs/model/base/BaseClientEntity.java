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
public abstract class BaseClientEntity implements Comparable, Serializable {

    public static String REF = "ClientEntity";
    public static String PROP_ID = "id";
    public static String PROP_CHARGE_PER_HOUR = "chargePerHour";
    public static String PROP_CLIENT_ID = "clientId";

    // constructors
    public BaseClientEntity() {
        initialize();
    }

    /**
     * Constructor for primary key
     */
    public BaseClientEntity(java.lang.Integer id) {
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
    private java.lang.Double chargePerHour;
    private java.lang.Integer clientId;

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
     * Set the unique identifier of this class
     * @param id the new TITLE
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }

    /**
     * Return the value associated with the column: CHARGE_PER_HOUR
     */
    public java.lang.Double getChargePerHour() {
        return chargePerHour;
    }

    /**
     * Set the unique identifier of this class
     * @param id the new CHARGE_PER_HOUR
     */
    public void setChargePerHour(java.lang.Double chargePerHour) {
        this.chargePerHour = chargePerHour;
    }

    /**
     * Return the value associated with the column: CLIENT_ID
     */
    public java.lang.Integer getClientId() {
        return clientId;
    }

    /**
     * Set the unique identifier of this class
     * @param id the new CLIENT_ID
     */
    public void setClientId(java.lang.Integer clientId) {
        this.clientId = clientId;
    }

    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String toString() {
        return super.toString();
    }
}
