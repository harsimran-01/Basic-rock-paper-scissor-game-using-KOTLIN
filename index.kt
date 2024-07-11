fun main(){
    var computer_choice = ""
    var user_choice = ""

    println("Please enter your choice : Rock, Paper, Scissor")
    user_choice = readln()
//    println(user_choice)

    var random_choice = (1..3).random()
//    println(random_choice)

    when(random_choice){
        1 -> {
            computer_choice = "Rock"
        }
        2 -> {
            computer_choice = "Paper"
        }
        3 -> {
            computer_choice = "Scissor"
        }

    }

    println("Computer chooses $computer_choice")

    val winner = when{
        user_choice == computer_choice -> "Tie"
        user_choice == "Rock" && computer_choice == "Scissor" -> "Player"
        user_choice == "Scissor" && computer_choice == "Paper" -> "Player"
        user_choice == "Paper" && computer_choice == "Rock" -> "Player"
        else-> "Computer"

    }

    if(winner == "Tie"){
        println("It's an Tie")
    }else if(winner == "Player"){
        println("You WON the Game")
    }else{
        println("You LOSE the Game")
    }
    
}
