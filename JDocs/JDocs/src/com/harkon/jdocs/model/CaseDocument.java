/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.harkon.jdocs.model;

import com.harkon.jdocs.model.base.BaseCaseDocument;

/**
 *
 * @author tolis
 */
public class CaseDocument extends BaseCaseDocument {
    private static final long serialVersionUID = 1L;


    /*[CONSTRUCTOR MARKER BEGIN]*/
	public CaseDocument () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public CaseDocument (java.lang.Integer caseId, java.lang.Integer documentId) {
		super(caseId,documentId);
	}
            /*[CONSTRUCTOR MARKER END]*/



}
