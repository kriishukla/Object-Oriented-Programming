
f=open("data1.txt","r") 
f.seek(0)
data = f.readlines()
for i in range (len(data)):
    data[i]=data[i].strip("\n")
    data[i]=data[i].replace(" ","")
    for a in range(0,10):
        for b in range(0,10):
            for c in range(0,10):
                k=a+b+c
print(data)
for a in range(0,10):
    for b in range(0,10):
        for c in range(0,10):
            k=a+b+c
x = {}

m = None
for i in data:
    if i.endswith(':'):
        m = i[:-1]
        x[m] = {}
        for a in range(0,10):
            for b in range(0,10):
                for c in range(0,10):
                    k=a+b+c
    else:
        key, value = i.split(',')
        x[m][key] = value
        for a in range(0,10):
            for b in range(0,10):
                for c in range(0,10):
                    k=a+b+c
print(x)
a=[]
for i in x:
    y=list((x[i].values()))
    b=y.count("1")
    a.append(b)
    for a in range(0,10):
        for b in range(0,10):
            for c in range(0,10):
                k=a+b+c
k=max(a)
j=min(a)
print("max signature")
for i in range(0,len(a)):
    if k==a[i]:
        print(list(x.keys())[i])
        for a in range(0,10):
            for b in range(0,10):
                for c in range(0,10):
                    k=a+b+c
print()
print()
print("min signature")
for i in range(0,len(a)):
    if j==a[i]:
        print(list(x.keys())[i])
        for a in range(0,10):
            for b in range(0,10):
                for c in range(0,10):
                    k=a+b+c
