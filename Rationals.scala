object Rationals {import scala.runtime.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(62); 
  println("Welcome to the Scala worksheet");$skip(27); 
val x = new Rational1(1,3);System.out.println("""x  : Rational1 = """ + $show(x ));$skip(27); 
val y = new Rational1(5,7);System.out.println("""y  : Rational1 = """ + $show(y ));$skip(26); 
val z= new Rational1(3,2);System.out.println("""z  : Rational1 = """ + $show(z ));$skip(9); val res$0 = 
x.add(y);System.out.println("""res0: Rational1 = """ + $show(res$0));$skip(16); val res$1 = 
x.sub(y).sub(z);System.out.println("""res1: Rational1 = """ + $show(res$1));$skip(9); val res$2 = 
y.add(y);System.out.println("""res2: Rational1 = """ + $show(res$2));$skip(10); val res$3 = 
x.less(y);System.out.println("""res3: Boolean = """ + $show(res$3));$skip(9); val res$4 = 
x.max(y);System.out.println("""res4: Rational1 = """ + $show(res$4))}
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