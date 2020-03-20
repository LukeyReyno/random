import random
import words

def main():
   guess_list = [] 
   secret_word = random.choice(words.word_list)
   chances = len(secret_word.string) + 2

   print("This is your word:")
   for letter in secret_word.string:
      print("_ ", end="")   

   while check_word(guess_list, secret_word) == False and chances > 0:
      if chances < 4:
        print("\n(Hint: %s)" % secret_word.hint)
      print("\nYou have %d chances." % chances)     
      guess = get_guesses(guess_list)
      if guess.lower() in secret_word.string.lower():
        print("Yes, (%s) is in the word." % guess)
      else:
        print("Nope, (%s) is not in the word." % guess)
        chances -= 1
      for letter in secret_word.string:
         if letter.lower() in guess_list:
           print(letter, end="")
         else:
           print("_ ", end="")
   if chances == 0:
      print("\n\nSorry, you lost. The word was %s" % secret_word)
   else:
      print("\n\nCongratulations, you are a super star!")
      print(secret_word)               

def get_guesses(guess_list):
   guess = input("\n\nWhat letter will you guess? ")
   while guess.isdigit() == True or len(guess) > 1 or guess in guess_list:
     guess = input("Please enter a single letter that was not already chosen. ")
   guess_list.append(guess.lower())
   return guess

def check_word(guess_list, secret_word):
   for letter in secret_word.string.lower():
      if not letter in guess_list:
        return False

choice = input("Do you want to play hangman? (y or n) ")

while choice != "y":
    if choice == "n":
      print("\nBYE!")
      exit()
    choice = input("You must type y or n ")
main()
exit()