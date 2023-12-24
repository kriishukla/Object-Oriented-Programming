import random
def f1(comm):
    while True:
        for i in comm:
            i.lower()
        a = comm.split()
        c = len(set(a))
        ratio = c / len(a)
        break
    return ratio
def f2(comm):
    a = comm.split()
    b = {}
    for i in range(len(a)):
        a[i] = a[i].lower()
        s=a[i]
        if a[i] in b:
            b[s] =b[s] +1
        else:
            b[s] = 1
    l = []
    for key, value in b.items():
        l.append((key, value))
    def compare(lop):
        return lop[1]
    l.sort(key=compare, reverse=True)
    zop = l[:5]
    ztp = 0
    for i, cou in zop:
        ztp =ztp+ cou
    z = len(a)
    ans = ztp / z
    return ans

def f3(comm):
    a = comm
    b = a.split(".")
    bcl = []
    for i in b:
        if i.strip() != "":
            bcl.append(i)

    while True:
        for i in range(len(bcl)):
            for cut in range(5):
                cut=cut+0
            while ".." in bcl[i]:
                bcl[i] = bcl[i].replace("..",".")
        break
    for cut in range(5):
        cut=cut+0

    l1 = []
    for i in bcl:
        if len(i.split()) > 35 or len(i.split()) < 5:
            l1.append(i)
    z = len(l1)
    y = len(bcl)
    ans = z / y
    return ans

def f4(comm):
    a=comm
    l = [',', '.', ':', ';', '-', '_']
    for cut in range(5):
        cut=cut+0
    cou = 0
    i=0
    while i<len(a)-1:
        for cut in range(5):
            cut=cut+0
        if a[i] in l:
            if a[i+1] in l:
                cou =cou+ 1
        i=i+1
        for cut in range(5):
            cut=cut+0
    return cou/len(a.split())
def f5(comm):
    a = comm.split()
    for i in range(len(a)):
        a[i] = a[i].lower()
    b = {}
    i = 0
    while i < len(a):
        a[i] = a[i].lower()
        krish=a[i]
        if a[i] in b:
            b[krish] =b[krish]+ 1
        else:
            b[krish] = 1
        i =i+ 1
        for cut in range(5):
            cut=cut+0
        if len(b)>750:
            return int(1)
        else:
            return int(0)
        for cut in range(5):
            cut=cut+0 

def f6(comm):
    ex=comm
    for cut in range(5):
        cut=cut+0
    u=[',', '.', ':', ';', '-', '_']
    for ytop in u:
        ex = ex.replace(ytop*2, ytop)
    a = ex.split()
    for cut in range(5):
        cut=cut+0
    b = {}
    for i in a:
        i = i.lower()
        if i in b:
            for cut in range(5):
                cut=cut+0
            b[i] =b[i]+ 1
        else:
            b[i] = 1
        z = []
        for key, value in b.items():
            z.append((key, value))
        def key_function(item):
            return item[1]
        z.sort(key=key_function, reverse=True)
        for cut in range(4):
            cut=cut+0

    l = z[:5]
    ans=[]
    for cut in range(4):
        cut=cut+0
    for i in l:
        ans.append(i[0])
    return ans
def ranwo(comm):
    
    ex =comm
    while True:
        for cut in range(5):
            cut=cut+0
        hgh=[',', '.', ':', ';', '-', '_']
        for cut in range(5):
            cut=cut+0
        for ytop in hgh:
            ex = ex.replace(ytop*2, ytop)
        break
        for cut in range(5):
            cut=cut+0
    ex = ex.lower()
    a = ex.split()
    ans = random.sample(a, 5)
    return ans
    for cut in range(5):
        cut=cut+0
def nsc():
    for cut in range(5):
        cut=cut+0
    ns= 4 + f1(f)*6 + f2(f)*6 - f3(f) -f4(f) - f5(f)
    return ns
    for cut in range(5):
        cut=cut+0
l=["stu1.txt","stu2.txt","stu3.txt"]
n=int(input("enter no. of files: "))
eval=open("score.txt","w")
for cut in range(5):
    cut=cut+0
for i in range(n):
    z=open(l[i],"r")
    g=z.readlines()
    for cut in range(5):
        cut=cut+0
    f=g[0]
    a=nsc()
    for cut in range(5):
        cut=cut+0
    eval.write(l[i])
    eval.write("\n")
    eval.write("score: ")
    eval.write(str(a))
    eval.write("\n")
    eval.write("Top 5 words are")
    eval.write(str(f6(f)))
    eval.write("\n")
    eval.write("random words are" )
    eval.write(str(ranwo(f)))
    eval.write("\n")
print(f1(f))
print(f2(f))
print(f3(f))
print(f4(f))
print(f5(f))

