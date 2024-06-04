package fr.hamtec

import java.io.File
import kotlin.io.path.Path
import kotlin.io.path.listDirectoryEntries

//! https://kotlinandroid.org/kotlin/kotlin-check-if-a-directory-exists/
fun main() {
    println("Hello World!")

    val filePath = "src/main/resources/example.txt" // Replace with your file path
    val filePath2 = "src/main/resources" // Replace with your file path

    val myList = listOf( Path(filePath2).listDirectoryEntries())
    myList.forEach {
        println(it)
    }

//    lectureFichier(filePath)
//    chemAbs()
//    extentionFichier()
//    verifRepertoir()
//    verifRepExist(filePath2)
}

private fun lectureFichier(filePath: String) {
    try {
        //! val filePath = "src/main/resources/example.txt" // Replace with your file path
        val file = File(filePath)

        val content = file.readText()
        val fileName = file.name
        val fileSize = file.length()


        println("File Content: \n$content")

        println("Lecture confirmer ...")
        println(fileName)
        println("File size: $fileSize bytes")
    } catch(e: Exception) {
        println("Une erreur s'est produite lors de la lecture du fichier : ${e.message}")
    }
}

private fun chemAbs() {

    val relativeFilePath = "src/main/resources/example.txt"
    val file = File(relativeFilePath)
    val absolutePath = file.absolutePath
    println("The absolute file path is: $absolutePath")
}

private fun extentionFichier() {
    val filePath = "src/main/resources/example.txt" // Replace with your file path

    val file = File(filePath)
    val fileExtension = file.extension

    println("The file extension is: $fileExtension")
}

private fun verifRepertoir() {
    val directory = File("src/main/resources") // Replace with your directory path

    if(directory.isDirectory) {
        val files = directory.listFiles()
        if(files != null && files.isEmpty()) {
            println("The directory is empty.")
        } else {
            println("The directory is not empty.")
        }
    } else {
        println("The specified path is not a directory.")
    }
}
private fun verifRepExist(filePath: String){
    val directoryPath = filePath // Replace with your directory path

    val directory = File(directoryPath)
    if (directory.exists() && directory.isDirectory) {
        println("Directory exists.")
    } else {
        println("Directory does not exist.")
    }
}