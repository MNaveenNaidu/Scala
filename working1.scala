object working1 {




class working(a:Int,b:Int) {
def numer = a
def demon = b

}import scala.runtime.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(198); 
def addworking(r:working,s:working):working =
new working(
r.numer * s.demon + s.numer * r.demon,r.demon + r.numer
);System.out.println("""addworking: (r: working1.working, s: working1.working)working1.working""");$skip(52); 

def makeString(r:working)=
r.numer + "/" + r.demon;System.out.println("""makeString: (r: working1.working)java.lang.String""");$skip(64); 
val b=makeString(addworking(new working(1,2),new working(3,4)));System.out.println("""b  : java.lang.String = """ + $show(b ))}

}