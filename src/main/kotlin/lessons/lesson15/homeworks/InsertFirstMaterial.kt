package org.example.lessons.lesson15.homeworks

class InsertFirstMaterial: Materials() {
    fun insert(material: String){
        val extracted = extractMaterials()
        addMaterial(material)
        extracted.forEach {
            addMaterial(it)
        }
    }
}