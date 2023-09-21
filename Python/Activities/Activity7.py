DataList = [8, 20, 11, 32, 55,89,97]
sum=0
for i in DataList:
    sum = sum + int(i)
print(sum)

NoOfList = int(input("Add the list of elements you want:"))
DataList = []

for i in range(NoOfList):
    Data = input("Enter The Data in the list ")
    DataList.append(Data)
sum=0
for i in DataList:
    sum = sum + int(i)
print("The Sum Is " , sum)




