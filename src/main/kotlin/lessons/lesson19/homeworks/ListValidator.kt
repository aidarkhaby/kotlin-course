package org.example.lessons.lesson19.homeworks

class ListValidator<N: Number>: Validator<List<N?> {
    override fun validate(element: List<N?>): Boolean {
        element.forEach { it ->
            if (it == null){
                return false
            }
            if (it.toDouble() == 0.0){
                return false
            }
        }
    }
}