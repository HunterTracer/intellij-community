// "Replace with 'newFun(p)'" "true"

class X {
    @deprecated("", ReplaceWith("newFun(p)"))
    fun oldFun(p: Any) {
        newFun(p)
    }

    fun newFun(p: Any){}
}

fun X.foo() {
    this.<caret>oldFun(this.toString())
}
