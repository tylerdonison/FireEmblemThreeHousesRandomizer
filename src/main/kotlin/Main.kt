class ChooseUnits{
    val units: MutableList<String> = mutableListOf()
    var nonStudents: MutableList<String> = mutableListOf()
    var otherStudents: MutableList<String> = mutableListOf()
    var bylethGender = "m"
    var byleth = "Byleth" + "_"
    val blackEagles: List<String> = listOf( "Edelgard", "Hubert", "Ferdinand", "Linhardt",
                                            "Caspar", "Bernadetta", "Dorothea", "Petra")
    val blueLions: List<String> = listOf(   "Dimitri", "Dedue", "Felix", "Ashe",
                                            "Sylvain", "Mercedes", "Annette", "Ingrid")
    val goldenDeer: List<String> = listOf(  "Claude", "Lorenz", "Raphael", "Ignatz",
                                            "Lysithea", "Marianne", "Hilda", "Leonie")
    val churchStudents: List<String> = listOf(  "Ferdinand", "Linhardt", "Caspar",
                                                "Bernadetta", "Dorothea", "Petra")
    val ashenWolves: MutableList<String> = mutableListOf( "Yuri", "Balthus", "Constance", "Hapi")


    val blackEaglesOther: MutableList<String> = mutableListOf(  "Hanneman", "Manuela", "Alois", "Shamir")
    val nonBlackEaglesOther: MutableList<String> = mutableListOf("Hanneman", "Manuela", "Alois", "Shamir",
                                                                "Cyril", "Catherine", "Flayn", "Seteth")

    val gilbert = "Gilbert"
    val jeritza = "Jeritza"
    val anna = "Anna"

    fun bylethGender(gender: String){
        bylethGender = gender
        byleth += bylethGender
        units.add(byleth)
        println("$byleth added")
        println()
    }

    fun addRouteStudents(route: Int){
        if (route == 0){ //black eagles route
            blackEagles.forEach{i -> units.add(i)}
            println("Black Eagles added")

        }else if (route == 1){ //blue lions route
            blueLions.forEach{i -> units.add(i)}
            println("Blue Lions added")

        }else if (route == 2){ //golden deer route
            goldenDeer.forEach{i -> units.add(i)}
            println("Golden Deer added")

        }else if (route == 3){ //church route
            churchStudents.forEach{i -> units.add(i)}
            println("Church Students added")

        println(units)
    }}

    fun addOtherStudents(route: Int, extraStudents: Int, DLC: Boolean){
        //otherStudents is a list that this randomizer will choose from.
        //It is generated from the available students from the chosen route.
        if (DLC){
            otherStudents = ashenWolves
            println("DLC included")
        }else{}

        if (route == 0){ //black eagles route
            otherStudents.add(blueLions[2]) // add Felix
            otherStudents.add(blueLions[3]) // add Ashe
            otherStudents.add(blueLions[4]) // add Sylvain
            otherStudents.add(blueLions[5]) // add Mercedes
            otherStudents.add(blueLions[6]) // add Annette
            otherStudents.add(blueLions[7]) // add Ingrid

            otherStudents.add(goldenDeer[1]) // add Lorenz
            otherStudents.add(goldenDeer[2]) // add Raphael
            otherStudents.add(goldenDeer[3]) // add Ignatz
            otherStudents.add(goldenDeer[4]) // add Lysithea
            otherStudents.add(goldenDeer[5]) // add Marianne (#6, Hilda, is not available in this route)
            otherStudents.add(goldenDeer[7]) // add Leonie

        }else if (route == 1){ //blue lions route
            otherStudents.add(blackEagles[2]) // add Ferdinand
            otherStudents.add(blackEagles[3]) // add Linhardt
            otherStudents.add(blackEagles[4]) // add Caspar
            otherStudents.add(blackEagles[5]) // add Bernadetta
            otherStudents.add(blackEagles[6]) // add Dorothea
            otherStudents.add(blackEagles[7]) // add Petra

            otherStudents.add(goldenDeer[1]) // add Lorenz
            otherStudents.add(goldenDeer[2]) // add Raphael
            otherStudents.add(goldenDeer[3]) // add Ignatz
            otherStudents.add(goldenDeer[4]) // add Lysithea
            otherStudents.add(goldenDeer[5]) // add Marianne
            otherStudents.add(goldenDeer[6]) // add Hilda
            otherStudents.add(goldenDeer[7]) // add Leonie

        }else if (route == 2){ //golden deer route
            otherStudents.add(blueLions[2]) // add Felix
            otherStudents.add(blueLions[3]) // add Ashe
            otherStudents.add(blueLions[4]) // add Sylvain
            otherStudents.add(blueLions[5]) // add Mercedes
            otherStudents.add(blueLions[6]) // add Annette
            otherStudents.add(blueLions[7]) // add Ingrid

            otherStudents.add(blackEagles[2]) // add Ferdinand
            otherStudents.add(blackEagles[3]) // add Linhardt
            otherStudents.add(blackEagles[4]) // add Caspar
            otherStudents.add(blackEagles[5]) // add Bernadetta
            otherStudents.add(blackEagles[6]) // add Dorothea
            otherStudents.add(blackEagles[7]) // add Petra

        }else if (route == 3){ //church route
            otherStudents.add(blueLions[2]) // add Felix
            otherStudents.add(blueLions[3]) // add Ashe
            otherStudents.add(blueLions[4]) // add Sylvain
            otherStudents.add(blueLions[5]) // add Mercedes
            otherStudents.add(blueLions[6]) // add Annette
            otherStudents.add(blueLions[7]) // add Ingrid

            otherStudents.add(goldenDeer[1]) // add Lorenz
            otherStudents.add(goldenDeer[2]) // add Raphael
            otherStudents.add(goldenDeer[3]) // add Ignatz
            otherStudents.add(goldenDeer[4]) // add Lysithea
            otherStudents.add(goldenDeer[5]) // add Marianne
            otherStudents.add(goldenDeer[6]) // add Hilda
            otherStudents.add(goldenDeer[7]) // add Leonie

        }else{println("Invalid Route")}

        val numberOfStudents: Int
        if (extraStudents > otherStudents.size){
            numberOfStudents = otherStudents.size
            println("Chosen amount great than pool of students, adding all $numberOfStudents students")
        }else{numberOfStudents = extraStudents}
        for (i in 1..numberOfStudents){
            var randomMax = otherStudents.size - 1
            var randomNumber = (0..randomMax).random()
            val studentToAdd = otherStudents[randomNumber]
            units.add(studentToAdd)
            otherStudents.removeAt(randomNumber)
            println("$studentToAdd added ")
            }
        println()
        println(units)
    }

    fun addNonStudents(route:Int, DLC:Boolean, userNonStudents: Int){
        if (DLC){
            nonStudents.add(anna)
            if (route == 0){nonStudents.add(jeritza)}
            println("DLC included ")
        }
        if (route == 0){ //black eagles route
            blackEaglesOther.forEach{i -> nonStudents.add(i)}

        }else if (route == 1){ //blue lions route
            nonBlackEaglesOther.forEach{i -> nonStudents.add(i)}
            nonStudents.add(gilbert)

        }else if (route == 2){ //golden deer route
            nonBlackEaglesOther.forEach{i -> nonStudents.add(i)}

        }else if (route == 3){ //church route
            nonBlackEaglesOther.forEach{i -> nonStudents.add(i)}}

        val numberOfNonStudents: Int
        if (userNonStudents > nonStudents.size){
            numberOfNonStudents = nonStudents.size
            println("Chosen amount great than pool of non-students, adding all $numberOfNonStudents non-students")
        }else{numberOfNonStudents = userNonStudents}
        for (i in 1..numberOfNonStudents){
            var randomMax = nonStudents.size - 1
            var randomNumber = (0..randomMax).random()
            val nonStudentToAdd = nonStudents[randomNumber]
            units.add(nonStudentToAdd)
            nonStudents.removeAt(randomNumber)
            println("$nonStudentToAdd added ")
        }
        println()
        println(units)
    }
}

class ChooseProficiencies{
    val weaponProficiencies: MutableList<String> = mutableListOf("Swd", "Lnc", "Axe",
                                            "Bow", "Fst", "Rea", "Fth")
    val classProficiencies: List<String> = listOf("Rid", "Fly", "Arm")
    val weaponProf1: MutableList<String> = mutableListOf()
    val weaponProf2: MutableList<String> = mutableListOf()
    val classProf: MutableList<String> = mutableListOf()

    fun getProficiencies(unitAmount: Int){
        println("unitAmount is $unitAmount.")
        for (i in 0..unitAmount){
            var tempList: MutableList<String> = mutableListOf("Swd", "Lnc", "Axe",
                "Bow", "Fst", "Rea", "Fth")
            var randomNumber = (0..6).random()
            val profToAdd1 = tempList[randomNumber]
            tempList.removeAt(randomNumber)
            println(tempList)
            randomNumber = (0..5).random()
            val profToAdd2 = tempList[randomNumber]
            randomNumber = (0..2).random()
            val profToAdd3 = classProficiencies[randomNumber]
            weaponProf1.add(profToAdd1)
            weaponProf2.add(profToAdd2)
            classProf.add(profToAdd3)
            println("$i. $profToAdd1 $profToAdd2 $profToAdd3 added")
        }
    }
}

fun main() {
    println("Welcome to Doni's Fire Emblem: Three Houses Randomizer")
    println("This program will generate a list of recruits based off of")
    println("your chosen route for the game, then assign those recruits")
    println("weapon and class proficiencies that the user can self-impose")
    println("on their run of Fire Emblem: Three Houses.")
    println()

    val chosenUnits = ChooseUnits()
    println("What gender is Byleth? (m/f/r for random)")
    var gender = readLine()!!
    //Random gender selection
    if (gender == "r"){
        val randomGender = (1..2).random()
        if (randomGender == 1){
            gender = "m"
        }else{
            gender = "f"}
    }
    chosenUnits.bylethGender(gender)

    //choose route
    println("Please Choose a Route: ")
    println("0 Black Eagles")
    println("1 Blue Lions")
    println("2 Golden Deer")
    println("3 Church Route")
    val route = readLine()!!
    chosenUnits.addRouteStudents(route.toInt())
    println("How many other randomly chosen students should be added? (Type 20 for all)")
    var otherStudents = readLine()!!
    println("Include DLC recruits? (y/n)")
    val userDLC = readLine()!!
    var dlc = false
    dlc = userDLC == "y"
    chosenUnits.addOtherStudents(route.toInt(), otherStudents.toInt(), dlc)
    println("How many other randomly chosen non-students should be added? (Type 20 for all)")
    var userNonStudents = readLine()!!
    chosenUnits.addNonStudents(route.toInt(), dlc, userNonStudents.toInt())

    println("Push enter to continue")
    readLine()

    val unitAmount = chosenUnits.units.size
    val proficiencies = ChooseProficiencies()
    proficiencies.getProficiencies(unitAmount)
    println()
    val printSize = unitAmount - 1
    for (i in 0..printSize) {
        var j = i + 1
        var name = chosenUnits.units[i]
        var prof1 = proficiencies.weaponProf1[i]
        var prof2 = proficiencies.weaponProf2[i]
        var prof3 = proficiencies.classProf[i]
        println("$j. $name: $prof1 $prof2 $prof3")
    }
    println()
    println("Randomizer Complete")
}