package ck.solo

import groovy.transform.ToString

@ToString(includes = 'lastName, firstName, patronymic')
class Pupil {

    String lastName
    String firstName
    String patronymic

    static belongsTo = [group : Group]
    static hasMany = [lessons : Lesson]

    static constraints = {
        lastName blank: false
        firstName blank: false
        patronymic blank: false
    }
}
