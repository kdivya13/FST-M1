
NoOfList = int(input("Enter the number of elements you want to add in the list: "))
ListOfData = []
for i in range(NoOfList):
    Data = input("Enter the data in the list: ")
    ListOfData.append(Data)

#print(ListOfData[0])
#print(ListOfData[-1])
#print(ListOfData[len(ListOfData)-1])
if(ListOfData[0] == ListOfData[len(ListOfData)-1]):
    #"first element in the list is matching with the last element:"
    print(True)
else:
    #"first element in the list is not matching with the last element:" +
    print(False)