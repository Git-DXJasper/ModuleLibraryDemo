package com.dongze.anagramlibrary

fun String.isAnagram(str2: String) :Boolean{
    if(this.length != str2.length) return false
    var count = HashMap<Char, Int>()
    for(i in 0 until this.length){
        count[this[i]] = count.getOrDefault(this[i],0)+1
    }
    for(i in 0 until str2.length){
        if(!count.containsKey(str2[i])) return false
        count[str2[i]] = count.get(str2[i])!!-1
    }
    for(ch in count.keys){
        if(count.get(ch)!=0) return false
    }
    return true
}