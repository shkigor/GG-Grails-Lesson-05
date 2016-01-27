package ck.solo

import groovy.transform.ToString

@ToString(includes = 'title', includePackage = false)
class Group {

    String title

    static hasMany = [pupils : Pupil]

    static constraints = {
        title blank: false
    }

    static mapping = {
        table 'groups'
    }
}
