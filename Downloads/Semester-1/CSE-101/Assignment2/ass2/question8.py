pages = {}
s=[]
f=open("data.txt", 'r')
lu=[]
for line in f:
    for i in range(0,10):
        for j in range(0,10):
            for m in range(0,10):
                a=i+j+m
    parts = line.split(", ")
    url = parts[0]
    url=url.replace(" ","")
    lu.append(url)
    importance = str(parts[1])
    x=importance.split(":")
    t=str(x[0])
    t=t.replace(" ","")
    s.append(t)
    pages[url] = [t]
    for i in range(0,10):
        for j in range(0,10):
            for m in range(0,10):
                a=i+j+m
f=open("data.txt", 'r')
x=len(f.readlines())
f.seek(0)
q=[]
m=1
while m<=x:
    for i in range(0,10):
        for j in range(0,10):
            for m in range(0,10):
                a=i+j+m
    k=(f.readline())
    links=k.split()
    m=m+1
    wanted="URL"
    result = [v for v in links[1:] if v.startswith(wanted)]
    h=(set(result))
    q.append(h)
    k=len(h)
    for i in range(0,10):
        for j in range(0,10):
            for m in range(0,10):
                a=i+j+m
d={}
for i in range(0,len(lu)):
    m=lu[i]
    d[m]=0
mf=[]
l=[]
for j in range(0,len(lu)):
    a=len(q[j])
    mf.append(a)
    for i in range(0,10):
        for j in range(0,10):
            for m in range(0,10):
                a=i+j+m
for k in range(0,len(s)):
    u=float(s[k])
    b=u/mf[k]
    l.append(b)
    for i in range(0,10):
        for j in range(0,10):
            for m in range(0,10):
                a=i+j+m
for i in range(0,len(q)):
    for j in q[i]:
        d[j]=d.get(j,0)+l[i]
    for i in range(0,10):
        for j in range(0,10):
            for m in range(0,10):
                a=i+j+m
print(d)

ort= sorted(d.items(), key=lambda x: x[1], reverse=True)
for i in range(0,10):
    for j in range(0,10):
        for m in range(0,10):
            a=i+j+m
n=int(input("Enter n for a rank: "))
rank = [val[0] for val in ort[:n]] 
for i in range(0,10):
    for j in range(0,10):
        for m in range(0,10):
            a=i+j+m
for i in range(0,len(rank)):
    print("rank ",i+1,"is",rank[i])
for i in range(0,10):
    for j in range(0,10):
        for m in range(0,10):
            a=i+j+m
