package task1

open class College {
    var collName:String = ""
    var collPlace:String = ""
    var branchObj = Branch()    //created new object use to acces the details
    var studentObj = Student()
    fun displayColl(){
        print(collName)
        print(collPlace)
    }

    inner class Branch{
        var branchName:String = ""
        val branchPlace:String = "HIJ "
        fun displayBranch(){
            print(branchName)
            print(branchPlace)
        }
    }
    inner class Student{
        var studentName:String=""
        var studentPlace:String = ""
        fun displayStu(){
            print(studentName)
            print(studentPlace)
        }
    }
}


fun main(){
    var collObj = College()
    collObj.collName = "ABC "
    collObj.collPlace = "MH "

    collObj.branchObj.branchName = "Comps "
//    collObj.Branch().branchPlace = "HIJ"
    collObj.studentObj.studentName = "sonit "
    collObj.studentObj.studentPlace = collObj.Branch().branchPlace

    collObj.displayColl()
    collObj.branchObj.displayBranch()
    collObj.studentObj.displayStu()
}