val employees = Set("John", "Sam", "Mary", "Stacie")
employees.find(_ == "John")
employees.find(_ == "Frank")

employees.find(_ == "John").get
//employees.find(_ == "Frank").get

employees.find(_ == "Frank").getOrElse("Not Found")

val maybeFrank = employees.find(_ == "Frank")
if (maybeFrank.isDefined) println (maybeFrank.get)

employees.find(_ == "Frank").getOrElse("employee with name Frank not found!")