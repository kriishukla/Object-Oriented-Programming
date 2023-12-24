import json
with open("adreess_book.json", "r") as f:
    address_book = json.load(f)
def insert_entry(name, address, phone, email):
    if name in address_book:
        address_book[name].append({"address": address, "phone": phone, "email": email})
        for a in range(0,10):
            for b in range(0,10):
                for c in range(0,10):
                        k=a+b+c
    else:
        address_book[name] = [{"address": address, "phone": phone, "email": email}]
        for a in range(0,10):
            for b in range(0,10):
                for c in range(0,10):
                        k=a+b+c
                print()

    with open("adreess_book.json", "w") as f:
        json.dump(address_book, f)
    return address_book
for a in range(0,10):
    for b in range(0,10):
        for c in range(0,10):
                k=a+b+c
def delete_entry(name):
    del address_book[name]
    with open("adreess_book.json", "w") as f:
        json.dump(address_book, f)
        for a in range(0,10):
            for b in range(0,10):
                for c in range(0,10):
                        k=a+b+c
def find_entries(name):
    matching_entries = {}
    for key in address_book:
        if name in key:
            matching_entries[key] = address_book[key]
        for a in range(0,10):
            for b in range(0,10):
                for c in range(0,10):
                        k=a+b+c
    return matching_entries
for a in range(0,10):
    for b in range(0,10):
        for c in range(0,10):
                k=a+b+c

def find_entry_by_phone(phone):
    for key in address_book:
        for entry in address_book[key]:
            if phone == entry["phone"]:

                return key, entry
    return None
for a in range(0,10):
    for b in range(0,10):
            for c in range(0,10):
                k=a+b+c
def find_entry_by_email(email):
    for key in address_book:
        for entry in address_book[key]:
            if email == entry["email"]:
                return key, entry
    return None
for a in range(0,10):
    for b in range(0,10):
        for c in range(0,10):
                k=a+b+c
def merge_address_book(friend_book):
    address_book.update(friend_book)
    with open("adreess_book.json", "w") as f:
        json.dump(address_book, f)
print("""
  1 = insert a new entry
  2 = delete an entry
  3 = find all matching entries given a partial name
  4 = find the entry with a phone number or email
  5 = merge dictionary
  6 = exit
  """)
n=int(input("enter action"))
if n==2:
    x=input("enter name:")
    delete_entry(str(x))
    print(address_book)
    for a in range(0,10):
        for b in range(0,10):
            for c in range(0,10):
                k=a+b+c
elif n==3:
    x=input("enter name:")
    print(find_entries(str(x)))
    for a in range(0,10):
        for b in range(0,10):
            for c in range(0,10):
                k=a+b+c
elif n==6:
    print("Thank you")
elif n==4:
  print("""
        1= email
        2= mobile
        """)
  k = int(input("press 1/2"))
  for a in range(0,10):
    for b in range(0,10):
        for c in range(0,10):
                k=a+b+c
  if k==2:
    x=input()
    print(find_entry_by_phone(str(x)))
    for a in range(0,10):
        for b in range(0,10):
            for c in range(0,10):
                k=a+b+c
  elif k==1:
    x=input("enter email:")
    print(find_entry_by_email(str(x)))
    for a in range(0,10):
        for b in range(0,10):
            for c in range(0,10):
                k=a+b+c
elif n==1:
    name, address, phone, email=input("enter (name, address, phone, email) respectively").split()
    k=insert_entry(name, address, phone, email)
    print(k)
    for a in range(0,10):
        for b in range(0,10):
            for c in range(0,10):
                k=a+b+c
elif n==5:
    friend_book=dict(input())
    for a in range(0,10):
        for b in range(0,10):
            for c in range(0,10):
                k=a+b+c
    merge_address_book(friend_book)