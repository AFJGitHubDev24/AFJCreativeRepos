import random

def spin_row():
    symbols = ["🍒", "🍉", "🍋", "🔔", "⭐"]
    return [random.choice(symbols) for _ in range(3)]

def print_row(row):
    print("***********")
    print(" " + "|".join(row))
    print("***********")

def get_payout(row, bet):
    if row[0] == row[1] == row[2]:
        return {
            "🍒": bet * 3,
            "🍉": bet * 4,
            "🍋": bet * 5,
            "🔔": bet * 10,
            "⭐": bet * 20
        }.get(row[0], 0)
    elif row[0] == row[1]:
        return {
            "🍒": bet * 2,
            "🍉": bet * 3,
            "🍋": bet * 4,
            "🔔": bet * 5,
            "⭐": bet * 10
        }.get(row[0], 0)
    elif row[1] == row[2]:
        return {
            "🍒": bet * 2,
            "🍉": bet * 3,
            "🍋": bet * 4,
            "🔔": bet * 5,
            "⭐": bet * 10
        }.get(row[2], 0)
    return 0

def main():
    print("******************************")
    print("  🎰WELCOME TO PYTHON SLOTS🎰 ")
    print("Symbols: 🍒 🍉 🍋 🔔 ⭐")
    print("******************************")

    balance = int(input("Enter an amount for putting the base balance (in $): "))

    while balance > 0:
        print(f"\nCurrent balance: ${balance}")
        try:
            bet = int(input("Place your bet amount: "))
        except ValueError:
            print("Invalid input! Please enter a number.")
            continue

        if bet > balance:
            print("INSUFFICIENT BALANCE!")
            continue
        elif bet <= 0:
            print("Bet must be greater than 0!")
            continue

        balance -= bet

        print("Spinning...")
        row = spin_row()
        print_row(row)

        payout = get_payout(row, bet)
        if payout > 0:
            print(f"You won ${payout}")
            balance += payout
        else:
            print("Sorry! You lost this round!")

        play_again = input("\nDo you want to play again (yes/no): ").strip().lower()
        if play_again != "yes":
            break

    print("\nYou exited from the game!")
    print(f"Your final balance is ${balance}")
    print("THANK YOU! HAVE A NICE DAY!")

if __name__ == "__main__":
    main()
