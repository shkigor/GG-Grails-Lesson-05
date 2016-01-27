package ck.solo

import groovy.transform.ToString

@ToString(includes = 'title')
class Auditorium {

    String title

    static belongsTo = [Lesson]
    static hasMany = [lessons : Lesson]

    static constraints = {
        title blank: false
    }
}
