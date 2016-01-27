package ck.solo

import groovy.transform.ToString

@ToString(includes = 'title')
class Lesson {

    String title

    static hasMany = [teachers : Teacher, auditoriums : Auditorium]

    static constraints = {
        title blank: false
    }
}
