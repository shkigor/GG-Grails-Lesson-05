package ck.solo

import groovy.transform.ToString

@ToString(includes = 'lastName, firstName, patronymic')
class Teacher {

    String lastName
    String firstName
    String patronymic

    static belongsTo = [lesson: Lesson]

    static constraints = {
        lastName blank: false
        firstName blank: false
        patronymic blank: false
    }
}
