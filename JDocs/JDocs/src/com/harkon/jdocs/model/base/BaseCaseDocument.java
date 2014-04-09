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
public abstract class BaseCaseDocument implements Comparable, Serializable {

    public static String REF = "CaseDocument";
    public static String PROP_CASEID = "caseid";
    public static String PROP_DOCUMENTID = "documentid";
    public static String PROP_CREATED_AT = "createdAt";
    public static String PROP_CREATED_BY = "createdBy";
    public static String PROP_MODIFIED_AT = "modifiedAt";
    public static String PROP_MODIFIED_BY = "modifiedBy";
    public static String PROP_TERMINAL_ID = "terminalId";
    public static String PROP_CASE_DOCUMENTCOL = "caseDocumentcol";

    // constructors
    public BaseCaseDocument() {
        initialize();
    }

    /**
     * Constructor for primary key
     */
    public BaseCaseDocument(java.lang.Integer caseId, java.lang.Integer documentId) {
        this.setCaseId(caseId);
        this.setDocumentId(documentId);
        initialize();
    }

//        public BaseCaseDocument (documentId) {
//		this.setDocumentId(documentId);
//		initialize();
//	}
    protected void initialize() {
    }
    private int hashCode = Integer.MIN_VALUE;
    // primary key
    private java.lang.Integer caseId;
    private java.lang.Integer documentId;
    // fields
    private java.util.Date createdAt;
    private java.lang.Integer createdBy;
    private java.util.Date modifiedAt;
    private java.lang.Integer modifiedBy;
    private java.lang.Integer terminalId;
    private java.lang.String caseDocumentcol;

    // many to one... Not yet!!
    /**
     * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="CASEID"
     */
    public java.lang.Integer getCaseId() {
        return caseId;
    }

    /**
     * Set the unique identifier of this class
     * @param id the new CASEID
     */
    public void setCaseId(java.lang.Integer caseId) {
        this.caseId = caseId;
        this.hashCode = Integer.MIN_VALUE;
    }

    /**
     * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="DOCUMENTID"
     */
    public java.lang.Integer getDocumentId() {
        return documentId;
    }

    /**
     * Set the unique identifier of this class
     * @param id the new DOCUMENTID
     */
    public void setDocumentId(java.lang.Integer documentId) {
        this.documentId = documentId;
        this.hashCode = Integer.MIN_VALUE;
    }

    /**
     * Return the value associated with the column: CREATED_AT
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    /**
     * Set the value related to the column: CREATED_AT
     * @param createdAt the CREATED_AT value
     */
    public void setClockInTime(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Return the value associated with the column: CREATED_BY
     */
    public java.util.Date getCreatedBy() {
        return createdAt;
    }

    /**
     * Set the value related to the column: CREATED_BY
     * @param createdBy the CREATED_BY value
     */
    public void setCreatedBy(java.lang.Integer createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * Return the value associated with the column: MODIFIED_AT
     */
    public java.util.Date getModifiedAt() {
        return createdAt;
    }

    /**
     * Set the value related to the column: MODIFIED_AT
     * @param modifiedAt the MODIFIED_AT value
     */
    public void setModifiedAt(java.util.Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    /**
     * Return the value associated with the column: MODIFIED_BY
     */
    public java.lang.Integer getModifiedBy() {
        return modifiedBy;
    }

    /**
     * Set the value related to the column: MODIFIED_BY
     * @param modifiedBy the MODIFIED_BY value
     */
    public void setModifiedBy(java.lang.Integer modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    /**
     * Return the value associated with the column: TERMINAL_ID
     */
    public java.lang.Integer getTerminalId() {
        return terminalId;
    }

    /**
     * Set the value related to the column: TERMINAL_ID
     * @param terminalId the TERMINAL_ID value
     */
    public void setTerminalId(java.lang.Integer terminalId) {
        this.terminalId = terminalId;
    }

    /**
     * Return the value associated with the column: CASE_DOCUMENTCOL
     */
    public java.lang.String getCaseDocumentcol() {
        return caseDocumentcol;
    }

    /**
     * Set the value related to the column: CASE_DOCUMENTCOL
     * @param caseDocumentcol the CASE_DOCUMENTCOL value
     */
    public void setCaseDocumentcol(java.lang.String caseDocumentcol) {
        this.caseDocumentcol = caseDocumentcol;
    }

    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String toString() {
        return super.toString();
    }
}
