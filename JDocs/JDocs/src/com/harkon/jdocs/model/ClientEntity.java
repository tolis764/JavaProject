/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.harkon.jdocs.model;

import com.harkon.jdocs.model.base.BaseClientEntity;
/**
 *
 * @author tolis
 */
public class ClientEntity extends BaseClientEntity {
    private static final long serialVersionUID = 1L;

	/*[CONSTRUCTOR MARKER BEGIN]*/
	public ClientEntity () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public ClientEntity (java.lang.Integer id) {
		super(id);
	}




}
