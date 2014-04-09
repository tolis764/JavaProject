/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.harkon.jdocs.model.base;

import java.io.Serializable;
import org.omg.CORBA.INITIALIZE;

/**
 *
 * @author tolis
 */
public abstract class BaseDocumentType implements Comparable, Serializable {

    public static String REF = "DocumentType";
    public static String PROP_DESC = "desc";
    public static String PROP_EXTENSION = "extension";
    public static String PROP_DOCUMENT_TYPECOL = "documentTypecol";
    public static String PROP_ID = "id";

    //constructors
    public BaseDocumentType() {
        initialize();
    }

    /**
     * Constructor for primary key
     */
    public BaseDocumentType(java.lang.Integer id) {
        this.setId(id);
        initialize();
    }

    protected void initialize() {
    }
    private int hashCode = Integer.MIN_VALUE;
    // primary key
    private java.lang.Integer id;
    // fields
    private java.lang.String desc;
    private java.lang.String extension;
    private java.lang.String documentTypecol;

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
     * Return the value associated with the column: EXTENSION
     */
    public java.lang.String getExtension() {
        return extension;
    }

    /**
     * Set the value related to the column: EXTENSION
     * @param name the EXTENSION value
     */
    public void setExtension(java.lang.String extension) {
        this.extension = extension;
    }

    /**
     * Return the value associated with the column: DOCUMENT_TYPECOL
     */
    public java.lang.String getDocumentTypecol() {
        return documentTypecol;
    }

    /**
     * Set the value related to the column: DOCUMENT_TYPECOL
     * @param name the DOCUMENT_TYPECOL value
     */
    public void setDocumentTypecol(java.lang.String documentTypecol) {
        this.documentTypecol = documentTypecol;
    }

    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String toString() {
        return super.toString();
    }
}
