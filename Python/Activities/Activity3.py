
player1 = input("Enter Player 1's name: ")
player2 = input("Enter Player 2's name: ")


user1_answer = input(player1 + ", choose one among: rock, paper or scissors? ").lower()
user2_answer = input(player2 + ", choose one among: rock, paper or scissors? ").lower()


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
    print("Invalid input! try again.")