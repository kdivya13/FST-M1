fruit_shop = {
    "banana": 15,
    "orange": 8,
    "apple": 10,
    "goa":20
}

item_to_check = input("Check for the fruit you want: ").lower()

if(item_to_check in fruit_shop):
    print("Yes, this is available")
else:
    print("No, this is not available")