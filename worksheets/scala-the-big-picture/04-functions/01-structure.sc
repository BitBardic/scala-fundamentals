def plusOneOrZero(number: Int): Int = {
  if (number < 0) 0
  else number + 1
}

plusOneOrZero(-1)
plusOneOrZero(99)
//plusOneOrZero("hello")

def plusOneOrZero(number: Int) = {
  if (number < 0) 0
  else number + 1
}

plusOneOrZero(-1)
plusOneOrZero(99)

def product(a: Int, b: Int) = {
  if (a == 0 || b == 0) 0
  else a * b
}

product(2, 10)
product(2, 0)

def product(a: Int, b: Int) = a * b