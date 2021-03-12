fun main() {
    val universitiesString = "[\"Junior College\",\"MCAST\",\"ITS\",\"Higher Secondary School\",\"St. " +
            "Aloysius College (16+)\",\"St. Edwards College (16+)\",\"De La Salle College (16+)\",\"St. " +
            "Thomas Institute (16+)\",\"University of Malta\"]"

    fun universityValuesToList(string: String): List<String> {
        return string.substring(1, string.length-1).split(",")
    }

    val universities = universityValuesToList(universitiesString)

}

