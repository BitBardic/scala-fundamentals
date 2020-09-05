case class Email(from: String, body: String)

val importantPeople = Set("wife@home.com", "boss@office.com")
val importantEmail = Email("boss@office.com", "We need to talk!")
val regularEmail = Email("marketing@google.com", "Read our transparency report")

def alertOrNoAlert(email: Email) = email match {
  case Email(from, _) if importantPeople.contains(from) => println("This email needs your attention")
  case Email(_, _) => println("do not disturb!")
}

alertOrNoAlert(regularEmail)
alertOrNoAlert(importantEmail)