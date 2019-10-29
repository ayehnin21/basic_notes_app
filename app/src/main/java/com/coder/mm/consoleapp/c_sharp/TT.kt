package com.coder.mm.consoleapp.c_sharp

fun main(){




    var str=":"
    var aa=str.split("\n")
    var test= mutableListOf<String>()
    println(aa.size)
    for(i in 0.until(aa.size)){
        var x=aa[i]
        //println(x)
        var p=x.split(":")
        //println(p[0])
        //println(p[1])
        var u=p[0].toUpperCase().trim()
        var q=p[1].trim()

       // println("SetColumn $u = new SetColumn(gridView1, \"$u\", \"$q\", aGridColumnStyle.Text, 100, false, true);")

        var sentence="SetColumn $u = new SetColumn(gridView1, \"$u\", \"$q\", aGridColumnStyle.Text, 100, false, true);"

        if(sentence.contains("AM")){
          var t=  sentence.replace("Text","Amount")
            println(t)
        }else if(sentence.contains("QT")){
            var t=sentence.replace("Text","Quantity")
            println(t)
        }
        else if(sentence.contains("DT")){
            var t=sentence.replace("Text","Date")
            println(t)
        }
        else if(sentence.contains("NO_LINE")){
            var t=sentence.replace("Text","Numeric")
            println(t)
        }
        else if(sentence.contains("RT")){
            var t=sentence.replace("Text","Rate")
            println(t)
        }
        else if(sentence.contains("UM")){
            var t=sentence.replace("Text","Price")
            println(t)
        }else if(sentence.contains("UM_SUPPLY")){
            var t=sentence.replace("Text","Price_K")
            println(t)
        }else if(sentence.contains("UK")){
            var t=sentence.replace("Text","Price_K")
            println(t)
        }else if(sentence.contains("TM")){
            var t=sentence.replace("Text","Date")
            println(t)
        }else if(sentence.contains("TM")){
            var t=sentence.replace("Text","Date")
            println(t)
        }else if(sentence.contains("DY")){
            var t=sentence.replace("Text","Date")
            println(t)
        }

        else{
            println("SetColumn $u = new SetColumn(gridView1, \"$u\", \"$q\", aGridColumnStyle.Text, 100, false, true);")

        }


    }
}