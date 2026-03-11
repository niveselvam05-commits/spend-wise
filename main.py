import database

database.connect()

while True:
    print("\n--- SpendWise ---")
    print("1 Add Expense")
    print("2 View Expenses")
    print("3 Exit")

    choice = input("Enter choice: ")

    if choice == "1":
        name = input("Expense name: ")
        amount = float(input("Amount: "))
        category = input("Category: ")
        date = input("Date: ")

        database.insert(name, amount, category, date)
        print("Expense Added!")

    elif choice == "2":
        for row in database.view():
            print(row)

    elif choice == "3":
        break
