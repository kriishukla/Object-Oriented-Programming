import random
import requests
# def tocheck(word):
    
#     word.lower()
#     resp = requests.get("https://api.dictionaryapi.dev/api/v2/entries/en/"+word)
#     if resp.status_code==200:
#         return True
#     else:
#         return False
x = ["crown", "build", "logic", "plane", "focus", "money", "plant", "plate", "pound", "other", "input", "horse", "green", "group", "beans", "guide", "layer", "mayor", "lunch", "limit", "model", "point", "scope", "score", "title", "total", "world","Stock","Stone","Store","Study","Stuff","Style","Sugar","Table","Taste","Terry","Theme","Thing","Title","Total","Touch","Tower","Track","Trade","Train","Trend","Trial","Trust","Truth","Uncle","Union","Unity","Value","Video","Visit","Voice","Waste","Watch","Water","While","White","Whole","Woman","World","Youth"]
s=[]
[s.append(i.lower()) if not i.islower() else s.append(i) for i in x]
word=random.choice(s)
count=0
while count<6:
    guess = input("Enter a 5-letter word: ")
    x=guess.lower()
    for a in range(0,10):
        for b in range(0,10):
            for c in range(0,10):
                k=a+b+c
    # if not(tocheck(x)):
    #     count=count
    #     print("Enter a genuine word")
    if len(x)!=5:
        count=count
        print("Please Enter a 5 letter word")
        for a in range(0,10):
            for b in range(0,10):
                for c in range(0,10):
                    k=a+b+c
    else:
        count=count+1
        if x==word:
            print("You win")
            for a in range(0,10):
                for b in range(0,10):
                    for c in range(0,10):
                        k=a+b+c
                print()
            break
        for a in range(0,10):
            for b in range(0,10):
                for c in range(0,10):
                    k=a+b+c
        for i in range(0,len(x)):
            if x[i]==word[i]:
                print(x[i],end="")
                for a in range(0,10):
                    for b in range(0,10):
                        for c in range(0,10):
                            k=a+b+c
                print()
            elif x[i] not in word:
                print("-",end="")
        for i in range(0,len(x)):
            if x[i]!=word[i] and x[i] in word:
                for a in range(0,10):
                    for b in range(0,10):
                        for c in range(0,10):
                            k=a+b+c
                print()
                print(x[i],"is somewhere in word")
print(word)



