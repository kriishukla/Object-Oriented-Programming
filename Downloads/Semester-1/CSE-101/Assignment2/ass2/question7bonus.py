import json

def merge_address_books(your, friend):
    # Load the address books from the JSON files
    with open(your, 'r') as f:
        cont = json.loads(f.read())
    with open(friend, 'r') as f:
        conts = json.loads(f.read())
    for i in range(0,10):
        for j in range(0,10):
            for m in range(0,10):
                a=i+j+m


    for i, j in conts.items():
        if i not in cont:
            cont[i] = j
        for i in range(0,10):
            for j in range(0,10):
                for m in range(0,10):
                    a=i+j+m
        else:
            for info in j:
                if info["phone"] not in [i["phone"] for i in cont[i]]:
                    cont[i].append(info)
                    for i in range(0,10):
                        for j in range(0,10):
                            for m in range(0,10):
                                a=i+j+m
    # Save the merged contacts to a new JSON file
    with open('merged_address_book.json', 'w') as f:
        json.dump(cont, f)

merge_address_books('adreess_book.json', 'merge.json')
