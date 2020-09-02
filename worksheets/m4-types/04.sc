class Quantity(val n:Int) extends AnyVal {
  def +(q: Quantity) = new Quantity(n + q.n)
}

val q1 = new Quantity(10)
val q2 = new Quantity(20)

val q3 = q1 + q2
q3.n