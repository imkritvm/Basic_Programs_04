import re

text = input("Enter your text for password. \n(The password should contain 4 char 3 numbers and 2 sign) :")

if(re.search(r'^[a-zA-Z][a-zA-Z0-9_@]{7,29}$',text)):
    print("This World Welcomes You Warm Hands.")

else:
    print("No World Exists for You.")
