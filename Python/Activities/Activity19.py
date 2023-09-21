import pandas

data = {
    "FirstName": ["Katari", "Baddet", "Baddet"],
    "LastName": ["Divya", "Sivakum", "Yoshita"],
    "Email": ["kdivya13@example.com", "baddet.sivakum@example.com", "baddet.yoshita@example.com"],
    "PhoneNumber": ["9742687894", "56278156", "14256789876"],

}

dataframe=pandas.read_excel('employees.xlsx')

dataframe = pandas.DataFrame(data)
# Write the data to a csv file
dataframe.to_excel("employees.xlsx", index=False)
print(dataframe)
