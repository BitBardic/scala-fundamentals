class Person(firstName: String, lastName: String)

case class Course(title: String, author: String)
val scalaCourse = Course("Scala The Big Picture", "Harit Himanshu")
val anotherScalaCourse = Course("Scala The Big Picture", "Harit Himanshu")

scalaCourse == anotherScalaCourse
scalaCourse.title
scalaCourse.author

val newScalaCourse = scalaCourse.copy(title = "New Scala Course")
scalaCourse