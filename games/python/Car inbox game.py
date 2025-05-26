command = ""
started = False
while command != "quit":
    command = input("> ").lower()
    if command == "start":
        if started:
            print("Car has already started!")
        else:
            started = True
            print("Car started...! Let's go!")
    elif command == "stop":
        if not started:
            print("Car has already stopped!")
        else:
            started = False
            print("Car stopped!")
    elif command == "help":
        print("""
start - to start
stop - to stop
quit - to quit
        """)
    elif command == "quit":
        break

else:
    print("I don't understand this!")

print("Done")
