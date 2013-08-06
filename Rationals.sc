object Rationals {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
val x = new Rational1(1,3)                        //> x  : Rational1 = 1/3
val y = new Rational1(5,7)                        //> y  : Rational1 = 5/7
val z= new Rational1(3,2)                         //> z  : Rational1 = 3/2
x.add(y)                                          //> res0: Rational1 = 22/21
x.sub(y).sub(z)                                   //> res1: Rational1 = -79/42
y.add(y)                                          //> res2: Rational1 = 10/7
x.less(y)                                         //> res3: Boolean = true
x.max(y)                                          //> res4: Rational1 = 5/7
}


class Rational1(a:Int,b:Int) {
private def gcd(a:Int,b:Int):Int = if(b==0) a else gcd(b,a%b)

def numer = a/gcd(a,b)
def demon = b/gcd(a,b)

def less(that:Rational1) = numer*that.demon < that.numer*demon

def max(that:Rational1)= if(this.less(that)) that else this


def add(that:Rational1) =
new Rational1 (
numer*that.demon + that.numer*demon,demon*that.demon
)

def neg:Rational1 = new Rational1(-numer,demon)
def sub(that:Rational1) = add(that.neg)

override def toString = numer+ "/" +demon




}