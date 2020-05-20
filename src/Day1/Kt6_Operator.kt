package Day1

fun main() {
//1.Arithmetic Operator
//2.Relation Operator
//3.Assignment Operator
//4.Unary Operator
//5.Bitwise Operator
//6.Logical Operator
//7.in Operator
//8.Index access Operator
//9.Range Operator

//1.Arithmetic Operator
//    Operator	Description	    Expression	Translate to
//    +	        Addition	    a+b	        a.plus(b)
//    -	        Subtraction	    a-b	        a.minus(b)
//    *	        Multiply	    a*b	        a.times(b)
//    /	        Division	    a/b	        a.div(b)
//    %	        Modulus	        a%b	        a.rem(b)

    var a = 5
    var b = 10
    println(a+b) //plus
    println(a-b) //minus
    println(a*b) //times
    println(a/b) //div
    println(a%b) //rem

//2.Relation Operator
//    Operator	Description	            Expression	Translate to
//    >	    greater than	            a>b	    a.compateTo(b)>0
//    <	    Less than	                a<b	    a.compateTo(b)<0
//    >=	greater than or equal to	a>=b	a.compateTo(b)>=0
//    <=	less than or equal to	    a<=b	a?.equals(b)?:(b===null)
//    ==	is equal to	                a==b	a?.equals(b)?:(b===null)
//    !=	not equal to	            a!=b	!(a?.equals(b)?:(b===null))

    val max = if (a>b){
        println(" a is greater than b")
        a
    }else{
        println("a is less than b")
        b
    }
    println("max = $max")

//Assignment Operator
//    Operator	Description	            Expression	Convert to
//    +=	    add and assign	        a+=b	    a.plusAssign(b)
//    -=	    subtract and assign	    a-=b	    a.minusAssign(b)
//    *=	    multiply and assign	    a*=b	    a.timesAssign(b)
//    /=	    divide and assign	    a/=b	    a.divAssign(b)
//    %=	    mod and assign	        a%=b	    a.remAssign(b)
}