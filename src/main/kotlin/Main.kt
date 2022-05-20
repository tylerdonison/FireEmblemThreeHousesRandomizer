class ChooseUnits{
    //Construct defaults, as well as the lists of avaiable units in the game.
    val units: MutableList<String> = mutableListOf() //units is the master list which units will be added onto according to user preference and randomization.
    var nonStudents: MutableList<String> = mutableListOf() //nonStudents is a list generated according to user preference and will be chosen from to choose random students.
    var otherStudents: MutableList<String> = mutableListOf() //otherStudents is the same as nonStudents except for units available from other in game classrooms.
    var bylethGender = "m" //byleth, as the main character can have a gender difference, their gender determines what classes they can be as there are gender-locked classes.
    var byleth = "Byleth" + "_" //default byleth string that will add the gender to the end.
    val blackEagles: List<String> = listOf( "Edelgard", "Hubert", "Ferdinand", "Linhardt",  //default list of students for the black eagles house and route
                                            "Caspar", "Bernadetta", "Dorothea", "Petra")
    val blueLions: List<String> = listOf(   "Dimitri", "Dedue", "Felix", "Ashe",            //default list of students for the blue lions house and route
                                            "Sylvain", "Mercedes", "Annette", "Ingrid")
    val goldenDeer: List<String> = listOf(  "Claude", "Lorenz", "Raphael", "Ignatz",        //default list of students for the golden deer house and route
                                            "Lysithea", "Marianne", "Hilda", "Leonie")
    val churchStudents: List<String> = listOf(  "Ferdinand", "Linhardt", "Caspar",          //default list of students for the church route, most from black eagles
                                                "Bernadetta", "Dorothea", "Petra")
    val ashenWolves: MutableList<String> = mutableListOf( "Yuri", "Balthus", "Constance", "Hapi")   //default list of the dlc students


    val blackEaglesOther: MutableList<String> = mutableListOf(  "Hanneman", "Manuela", "Alois", "Shamir")   //black eagles non-students differ greatly to other non-students
    val nonBlackEaglesOther: MutableList<String> = mutableListOf("Hanneman", "Manuela", "Alois", "Shamir", //all non-black eagle non-students. Blue Lions adds Gilbert
                                                                "Cyril", "Catherine", "Flayn", "Seteth")

    val gilbert = "Gilbert" //additional non-student for the blue lions route
    val jeritza = "Jeritza" //additional non-student for black eagles if dlc is allowed
    val anna = "Anna"       //additional non-student for all routes if dlc is allowed.

    fun bylethGender(gender: String){
        //Class to allow Byleth's gender to be chosen and added to the unit's list.
        bylethGender = gender
        byleth += bylethGender
        units.add(byleth)
        println("$byleth added")
        println()
    }

    fun addRouteStudents(route: Int){
        //Class to add all the available students for the chosen route. These are already recruited at the start of the game and therefore are all included in the randomizer.
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
        //generally the house leader and their co-captain cannot be recruited, but the rest of the class can. Hilda, or goldenDeer[6] is a special case
        if (DLC){
            otherStudents = ashenWolves
            println("DLC included")
        }else{}

        if (route == 0){ //black eagles route
            //recruitable blue lion students, not including Dimitri and Dedue as they are not recruitable.
            otherStudents.add(blueLions[2]) // add Felix
            otherStudents.add(blueLions[3]) // add Ashe
            otherStudents.add(blueLions[4]) // add Sylvain
            otherStudents.add(blueLions[5]) // add Mercedes
            otherStudents.add(blueLions[6]) // add Annette
            otherStudents.add(blueLions[7]) // add Ingrid
            
            //recruitable golden deer students, not including Claude and Hilda as they are not recruitable in this route.
            otherStudents.add(goldenDeer[1]) // add Lorenz
            otherStudents.add(goldenDeer[2]) // add Raphael
            otherStudents.add(goldenDeer[3]) // add Ignatz
            otherStudents.add(goldenDeer[4]) // add Lysithea
            otherStudents.add(goldenDeer[5]) // add Marianne (#6, Hilda, is not available in this route)
            otherStudents.add(goldenDeer[7]) // add Leonie

        }else if (route == 1){ //blue lions route
            //recruitable black eagles students, not including Edlegard and Hubert as they are not recruitable in this route.
            otherStudents.add(blackEagles[2]) // add Ferdinand
            otherStudents.add(blackEagles[3]) // add Linhardt
            otherStudents.add(blackEagles[4]) // add Caspar
            otherStudents.add(blackEagles[5]) // add Bernadetta
            otherStudents.add(blackEagles[6]) // add Dorothea
            otherStudents.add(blackEagles[7]) // add Petra
            
            //recruitable golden deer students, not including Claude as he is not recruitable in this route. Hilda is included.
            otherStudents.add(goldenDeer[1]) // add Lorenz
            otherStudents.add(goldenDeer[2]) // add Raphael
            otherStudents.add(goldenDeer[3]) // add Ignatz
            otherStudents.add(goldenDeer[4]) // add Lysithea
            otherStudents.add(goldenDeer[5]) // add Marianne
            otherStudents.add(goldenDeer[6]) // add Hilda
            otherStudents.add(goldenDeer[7]) // add Leonie

        }else if (route == 2){ //golden deer route
            //recruitable blue lion students, not including Dimitri and Dedue as they are not recruitable.
            otherStudents.add(blueLions[2]) // add Felix
            otherStudents.add(blueLions[3]) // add Ashe
            otherStudents.add(blueLions[4]) // add Sylvain
            otherStudents.add(blueLions[5]) // add Mercedes
            otherStudents.add(blueLions[6]) // add Annette
            otherStudents.add(blueLions[7]) // add Ingrid
            
             //recruitable black eagles students, not including Edlegard and Hubert as they are not recruitable in this route.
            otherStudents.add(blackEagles[2]) // add Ferdinand
            otherStudents.add(blackEagles[3]) // add Linhardt
            otherStudents.add(blackEagles[4]) // add Caspar
            otherStudents.add(blackEagles[5]) // add Bernadetta
            otherStudents.add(blackEagles[6]) // add Dorothea
            otherStudents.add(blackEagles[7]) // add Petra

        }else if (route == 3){ //church route
            //recruitable blue lion students, not including Dimitri and Dedue as they are not recruitable.
            otherStudents.add(blueLions[2]) // add Felix
            otherStudents.add(blueLions[3]) // add Ashe
            otherStudents.add(blueLions[4]) // add Sylvain
            otherStudents.add(blueLions[5]) // add Mercedes
            otherStudents.add(blueLions[6]) // add Annette
            otherStudents.add(blueLions[7]) // add Ingrid
            
            //recruitable golden deer students, not including Claude as he is not recruitable in this route. Hilda is included.
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
            numberOfStudents = otherStudents.size //this is both for error checking and allow 20 to select all students.
            println("Chosen amount great than pool of students, adding all $numberOfStudents students")
        }else{numberOfStudents = extraStudents}
        for (i in 1..numberOfStudents){ //using the pool of students created above, random students will be selected, added to the master list and removed from the pool.
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
        //this function allows for a non-student pool to be created and randomly chosen from. These nonstudents have unique recruitment criteria compared to the other
        //students and therefore are kept separate from them. This basically has the same logic as the previous function.
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
        if (userNonStudents > nonStudents.size){ //this is both for error checking and allow 20 to select all nonStudents.
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
    //This class will add randomly generated proficiencies to lists that coorespond with the indexes of the units from the previous class.
    val weaponProficiencies: MutableList<String> = mutableListOf("Swd", "Lnc",  //The weapons include swords, lances, axes, 
                                            "Axe","Bow", "Fst", "Rea", "Fth")   //bows, fists, reason magic, and faith magic
    val classProficiencies: List<String> = listOf("Rid", "Fly", "Arm")          //The class proficiencies consist of horse riding, wyvern/pegasus flying, and heavy armor
    val weaponProf1: MutableList<String> = mutableListOf()                      //These three are callable lists that will be used to display the information to the user
    val weaponProf2: MutableList<String> = mutableListOf()                      //This can be improved by using a map instead of depending on indexes
    val classProf: MutableList<String> = mutableListOf()

    fun getProficiencies(unitAmount: Int){
        //this function is the heart of the class. Using indexes it generates three coresponding lists to the units in the unit list.
        println("unitAmount is $unitAmount.")
        for (i in 0..unitAmount){
            var tempList: MutableList<String> = mutableListOf("Swd", "Lnc", "Axe",
                "Bow", "Fst", "Rea", "Fth") //reset the list for each iteration as we remove an item 3 lines below
            var randomNumber = (0..6).random()
            val profToAdd1 = tempList[randomNumber]
            tempList.removeAt(randomNumber) //remove the random choice so it cannot be repeated.
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
    //main function to display the welcome message and handle the user inputs
    println("Welcome to Doni's Fire Emblem: Three Houses Randomizer")
    println("This program will generate a list of recruits based off of")
    println("your chosen route for the game, then assign those recruits")
    println("weapon and class proficiencies that the user can self-impose")
    println("on their run of Fire Emblem: Three Houses.")
    println()
    
    val chosenUnits = ChooseUnits()
    
    //Byleth's Gender
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

    //Choose Route
    println("Please Choose a Route: ")
    println("0 Black Eagles")
    println("1 Blue Lions")
    println("2 Golden Deer")
    println("3 Church Route")
    val route = readLine()!!
    chosenUnits.addRouteStudents(route.toInt())
    
    //Choose Other Student Options
    println("How many other randomly chosen students should be added? (Type 20 for all)")
    var otherStudents = readLine()!!
    println("Include DLC recruits? (y/n)")
    val userDLC = readLine()!!
    var dlc = false //need to change y/n to true/false
    dlc = userDLC == "y"
    chosenUnits.addOtherStudents(route.toInt(), otherStudents.toInt(), dlc)
    //Choose Non-Student Options
    println("How many other randomly chosen non-students should be added? (Type 20 for all)")
    var userNonStudents = readLine()!!
    chosenUnits.addNonStudents(route.toInt(), dlc, userNonStudents.toInt())
    //Unit list is created, time to randomize
    println("Push enter to continue")
    readLine()

    val unitAmount = chosenUnits.units.size
    //Create three list of proficiencies.
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
        println("$j. $name: $prof1 $prof2 $prof3") //print proficiencies according to index, may be better to handle this with a map instead
    }
    println()
    println("Randomizer Complete")
}
