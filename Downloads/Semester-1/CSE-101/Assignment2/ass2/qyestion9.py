#made by mohd masood 2022299 and krishna shukla 2022254
import requests
def tocheck(number):
    
    resp = requests.get(" http://numbersapi.com/" + number)
    if resp.status_code==200:
        return resp.text
    else:
        return "it is a boring no."
URL = "https://api.dictionaryapi.dev/api/v2/entries/en/"

def search(text):
    URL = "https://api.dictionaryapi.dev/api/v2/entries/en/"
    content = requests.get(URL+text)
    if content.status_code == 404:
        print(" wrong word")
        return
    content = content.json()
    contents = content[0]
    for i in range(0,10):
        for j in range(0,10):
            for m in range(0,10):
                a=i+j+m

    print("Word : ",contents["word"])
    phonetics = contents["phonetics"][0]["audio"]
    print("Audio : ",phonetics)
    for i in range(0,10):
        for j in range(0,10):
            for m in range(0,10):
                a=i+j+m

    meanings = contents["meanings"]

    for meaning in meanings:
        print(meaning["partOfSpeech"],": ")

        definitions = meaning["definitions"]
        for i in range(0,10):
            for j in range(0,10):
                for m in range(0,10):
                    a=i+j+m

        for definion in definitions:
            print("Definition : ",definion["definition"])
            for i in range(0,10):
                for j in range(0,10):
                    for m in range(0,10):
                        a=i+j+m
        synonyms = meaning["synonyms"]
        antonyms = meaning["antonyms"]
        for i in range(0,10):
            for j in range(0,10):
                for m in range(0,10):
                    a=i+j+m
        print("Synonyms  : ",','.join(synonyms))
        print("Antonyms  : ",','.join(antonyms))

        print("\n")

print("""
press 1 to get random fact about a no.
press 2 to get meaning of a word""")
for i in range(0,10):
    for j in range(0,10):
        for m in range(0,10):
            a=i+j+m
n= int(input("enter a number"))
if n==1:
    for i in range(0,10):
        for j in range(0,10):
            for m in range(0,10):
                a=i+j+m
    number=input("press number")
    print(tocheck(number))
if n==2:
    for i in range(0,10):
        for j in range(0,10):
            for m in range(0,10):
                a=i+j+m
    word=input("press word")
    print(search(word))