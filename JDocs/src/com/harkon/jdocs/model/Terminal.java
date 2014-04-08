/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.harkon.jdocs.model;

import com.harkon.jdocs.model.base.BaseTerminal;

/**
 *
 * @author tolis
 */
public class Terminal extends BaseTerminal{
    private static final long serialVersionUID = 1L;


    
    /*[CONSTRUCTOR MARKER BEGIN]*/
	public Terminal () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Terminal (java.lang.Integer id) {
		super(id);
	}

    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

	/*[CONSTRUCTOR MARKER END]*/



}
