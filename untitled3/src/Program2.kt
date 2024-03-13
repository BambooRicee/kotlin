fun main() {
    val students: MutableList<Student> = mutableListOf<Student>()
    students.add(Student("Акинина Ольга", "331"))
    students.add(Student("Викулов Михаил", "331"))
    students.add(Student("Анисимова Наталья", "321"))
    students.add(Student("Квасов Виктор", "321"))
    students.add(Student("Илларионов Евнений", "334"))
    students.add(Student("Кузнецова Татьяна", "334"))
    students.filter { it.group == "321" }.forEach { println(it) }
    //students.sortBy{ it.fullName }
        //students.forEach { println(it) }
        // students.sortedWith(compareBy<Student> { it.fullName }.thenBy { it.group })
       // .forEach { println(it) }
}
