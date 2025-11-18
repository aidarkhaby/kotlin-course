package org.example.lessons.lesson19.homeworks

import kotlin.math.max

class Container<A>(private val arg: A){
    fun getA(): A {
        return arg
    }
}

class PairBox<Q, T>(val arg1: Q, val arg2: T){
    fun getMap(): Map<Q, T>{
        return mapOf(arg1 to arg2)
    }
}

class Multiplier<M: Number>(){
    fun multipleByTwo(arg1: M): Double{
        return arg1.toDouble() * 2
    }
}

interface Storage<M> {
    fun save(arg: M)
    fun getArg(): M
}

interface Transformer<N, B> {
    fun transform(arg: N): B
}

interface PairProcessor<V, X> {
    fun action(arg1: V, arg2: X)
}

interface ConnectionDifferent<Z, Q, E>{
    fun connect(arg1: List<Z>, arg2: List<Q>): List<E>
}

fun <K> swap(arg1: MutableList<K>, index1: Int, index2: Int): List<K>{
    if (index1 in arg1.indices && index2 in arg1.indices){
        val temp = arg1[index1]
        arg1[index2] = arg1[index1]
        arg1[index1] = temp
    }
    return arg1.toList()
}

fun <L: Number> mergeLists(list1: List<L>, list2: List<L>): List<Double>{
    val result: MutableList<Double> = mutableListOf()
    val temp = max(list1.lastIndex, list2.lastIndex)
    for (i in 0..temp){
        val res = list1.getOrElse(i){0}.toDouble() + list2.getOrElse(i){0}.toDouble()
        result.add(res)
    }
    return result.toList()
}