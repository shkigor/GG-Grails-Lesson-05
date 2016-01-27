import ck.solo.Group
import ck.solo.Lesson
import ck.solo.Pupil
import ck.solo.Teacher

class BootStrap {

    def init = { servletContext ->
        if (!Pupil.count()) createSampleData()
    }
    def destroy = {
    }

    private void createSampleData() {
        Group gr1a = new Group(title: "1-A").save(failOnError: true, flush: true)
        Group gr2a = new Group(title: "2-A").save(failOnError: true, flush: true)
        Group gr3a = new Group(title: "3-A").save(failOnError: true, flush: true)
        Group gr4a = new Group(title: "4-A").save(failOnError: true, flush: true)
        Group gr1b = new Group(title: "1-B").save(failOnError: true, flush: true)
        Group gr2b = new Group(title: "2-B").save(failOnError: true, flush: true)
        Group gr3b = new Group(title: "3-B").save(failOnError: true, flush: true)
        Group gr4b = new Group(title: "4-B").save(failOnError: true, flush: true)

        Pupil pupilIvanov = new Pupil(lastName: "Иванов", firstName: "Иван", patronymic: "Иванович", group: gr1a).save(failOnError: true, flush: true)
        Pupil pupilSidorov = new Pupil(lastName: "Сидоров", firstName: "Олександр", patronymic: "Олександрович", group: gr1a).save(failOnError: true, flush: true)
        Pupil pupilTaran = new Pupil(lastName: "Таран", firstName: "Роман", patronymic: "Романович", group: gr1a).save(failOnError: true, flush: true)
        Pupil pupilShkl = new Pupil(lastName: "Шкляр", firstName: "Назарий", patronymic: "Игорьевич", group: gr3a).save(failOnError: true, flush: true)
        Pupil pupilKovalev = new Pupil(lastName: "Ковалев", firstName: "Константин", patronymic: "Игорьевич", group: gr3a).save(failOnError: true, flush: true)

        Lesson lessonPhis = new Lesson(title: "Физика").save(failOnError: true, flush: true)
        Lesson lessonAlge = new Lesson(title: "Алгебра").save(failOnError: true, flush: true)
        Lesson lessonGeom = new Lesson(title: "Геометрия").save(failOnError: true, flush: true)
        Lesson lessonHist = new Lesson(title: "История").save(failOnError: true, flush: true)
        Lesson lessonEngl = new Lesson(title: "Английский язык").save(failOnError: true, flush: true)
        Lesson lessonNativeLang = new Lesson(title: "Украинский язык").save(failOnError: true, flush: true)

        Teacher teacherLisak = new Teacher(lastName: "Лысак", firstName: "Василий", patronymic: "Филиппович", lesson: lessonAlge).save(failOnError: true, flush: true)
        Teacher teacherKorn1 = new Teacher(lastName: "Корниенко", firstName: "Семен", patronymic: "Викторович", lesson: lessonPhis).save(failOnError: true, flush: true)
        Teacher teacherKorn2 = new Teacher(lastName: "Корниенко", firstName: "Оксана", patronymic: "Викторовна", lesson: lessonGeom).save(failOnError: true, flush: true)
        Teacher teacherHist = new Teacher(lastName: "Онищенко", firstName: "Василий", patronymic: "Павлович", lesson: lessonHist).save(failOnError: true, flush: true)



    }
}
