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
public class BaseDocument implements Comparable, Serializable {

    public static String REF = "Document";
    public static String PROP_ID = "id";
    public static String PROP_NAME = "name";
    public static String PROP_DESC = "desc";
    public static String PROP_DOC_TYPE = "docType";

    // constructors
    public BaseDocument() {
        initialize();
    }

    /**
     * Constructor for primary key
     */
    public BaseDocument(java.lang.Integer id) {
        this.setId(id);
        initialize();
    }

    protected void initialize() {
    }
    private int hashCode = Integer.MIN_VALUE;
    // primary key
    private java.lang.Integer id;
    // fields
    private java.lang.String name;
    private java.lang.String desc;
    private java.lang.Integer docType;

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
     * Return the value associated with the column: DOC_TYPE
     */
    public java.lang.Integer getDocType() {
        return docType;
    }

    /**
     * Set the value related to the column: DOC_TYPE
     * @param name the DOC_TYPE value
     */
    public void setDocType(java.lang.Integer docType) {
        this.docType = docType;
    }

    //I had to override this because of Comparable implementation
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String toString () {
		return super.toString();
	}

}
