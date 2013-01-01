package com.nerderg.goodForm

import grails.util.GrailsUtil

/**
 * Handles persisting the form definition in the database.
 */
class FormDefinition {

    String formDefinition
    /**
     * The name of the form.  Must be unique.
     */
    String name

    /**
     * Incrementing integer that represents the version number of the underlying form.
     */
    int formVersion

    static mapping = {
        if (GrailsUtil.getEnvironment() != 'test') {
            formDefinition column: "formDefinition", sqlType: "text"
        }
    }

    static constraints = {
       name unique: true
    }
}
