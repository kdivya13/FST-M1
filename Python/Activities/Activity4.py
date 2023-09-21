
player1 = input("Enter Player 1's Name: ")
player2 = input("Enter Player 2's Name: ")

while True:
    user1_answer = input(player1 + ", do you want to choose rock, paper or scissors? ").lower()
    user2_answer = input(player2 + ", do you want to choose rock, paper or scissors? ").lower()
    if user1_answer == user2_answer:
        print("It's a tie!")
    elif user1_answer == 'rock':
        if user2_answer == 'scissors':
            print("Rock wins!")
        else:
            print("Paper wins!")
    elif user1_answer == 'scissors':
        if user2_answer == 'paper':
            print("Scissors win!")
        else:
            print("Rock wins!")
    elif user1_answer == 'paper':
        if user2_answer == 'rock':
            print("Paper wins!")
        else:
            print("Scissors win!")
    else:
        print("Invalid Input Provided, try again.")

    repeat = input("Do you want to continue? Yes/No: ").lower()
    if(repeat == "yes"):
        pass
    elif(repeat == "no"):
        raise SystemExit
    else:
        print("You entered an invalid option. Exitting now.")
        raise SystemExit