/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.harkon.jdocs.model;

import com.harkon.jdocs.model.base.BaseActionHistory;

/**
 *
 * @author tolis
 */
public class ActionHistory extends BaseActionHistory {

    private static final long serialVersionUID = 1L;

    public ActionHistory() {
        super();
    }

    /**
     * Constructor for primary key
     */
    public ActionHistory(java.lang.Integer id) {
        super(id);
    }

    //I had to implement this method because of abstract class extension
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }


}
