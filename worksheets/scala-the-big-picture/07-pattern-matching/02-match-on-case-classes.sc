case class Book(title: String, yearPublished: Integer, author: String, isbn: String)

val progInScala = Book("Programming in Scala 3rd Edition", 2016, "Martin Odersky", "0981531687")
val funcProgInScala = Book("Functional Programming in Scala", 2014, "Paul Chiusano", "1617290653")
val scalaCookbook = Book("Scala Cookbook", 2013, "Alvin Alexander", "1449339611")

progInScala match {
  case Book(title, yearPublished, author, isbn) => println(s"$title <=> $yearPublished <=> $author <=> isbn")
  case _ => println("Did not match anything")
}

progInScala match {
  case Book(_, _, author, _) => author
  case _ => "No Author"
}