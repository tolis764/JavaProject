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
public abstract class BaseTerminal implements Comparable, Serializable {

    public static String REF = "Terminal";
    public static String PROP_ID = "id";
    public static String PROP_NAME = "name";
    public static String PROP_IP = "ip";

    //Constructors
    public BaseTerminal() {
        initialize();
    }

    private void initialize() {
    }

    /**
     * Constructor for primary key
     */
    public BaseTerminal(java.lang.Integer id) {
        this.setId(id);
        initialize();
    }
    private int hashCode = Integer.MIN_VALUE;
    // primary key
    private java.lang.Integer id;
    // fields
    private java.lang.String name;
    private java.lang.String ip;
    // I'll see later for more fields

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
     * Return the value associated with the column: NAME
     */
    public java.lang.String getName() {
        return name;
    }

    /**
     * Set the value related to the column: NAME
     * @param name the NAME value
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    /**
     * Return the value associated with the column: IP
     */
    public java.lang.String getIp() {
        return ip;
    }

    /**
     * Set the value related to the column: IP
     * @param name the IP value
     */
    public void setIp(java.lang.String ip) {
        this.ip = ip;
    }


}
