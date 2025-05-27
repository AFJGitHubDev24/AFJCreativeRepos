def main():
    # PYTHON QUIZ GAME

    # Questions list
    questions = [
        "The INSPIRE Scheme is a flagship initiative of which organization?",
        "Which organization released the first State of the World's Animal Health report in May 2025?",
        "What is the name of the scheme launched by the Indian government for providing equity support to MSMEs?",
        "The ancient city of Nineveh, recently in the news, is located in which country?",
        "National Anti-Terrorism Day is observed in India on which date?"
    ]

    # Options list (list of lists)
    options = [
        ["1. Council of Scientific and Industrial Research", "2. Ministry of Education",
         "3. Reserve Bank of India", "4. Department of Science and Technology"],
        ["1. World Organisation for Animal Health (WOAH)", "2. Food and Agriculture Organization (FAO)",
         "3. International Union for Conservation of Nature (IUCN)", "4. World Wildlife Fund (WWF)"],
        ["1. Atmanirbhar MSME Yojana", "2. SRI Fund Scheme",
         "3. Bharat MSME Capital Scheme", "4. Startup India Fund"],
        ["1. China", "2. Russia", "3. Iraq", "4. Iran"],
        ["1. May 19", "2. May 20", "3. May 21", "4. May 22"]
    ]

    # Correct answers (1-based index like in the Java version)
    answers = [4, 1, 2, 3, 3]
    score = 0

    # Welcome message
    print("*************************")
    print("WELCOME TO PYTHON QUIZ GAME")
    print("*************************")

    # Question loop
    for i in range(len(questions)):
        print(f"\n{questions[i]}")
        for option in options[i]:
            print(option)

        try:
            guess = int(input("Enter your guess: "))
        except ValueError:
            print("Invalid input! Please enter a number between 1 and 4.")
            continue

        if guess == answers[i]:
            print("********")
            print("CORRECT!")
            print("********")
            score += 1
        else:
            print("********")
            print("WRONG!")
            print("********")

    # Final score
    print(f"\nYour final score is {score} out of {len(questions)}")

if __name__ == "__main__":
    main()
