
def CalculateSum(num):
    if num:
        return num + CalculateSum(num-1)
    else:
        return 0

# Calling calculateSum() function
res = CalculateSum(10)
print(res)



# to print for a specific no
'''def CalculateSum(number):
    if number<=1:
        return number
    else:
        return number+CalculateSum(number-1)

number1=int(input("Enter a number: "))
print("sum of numbers: ",CalculateSum(number1))'''

