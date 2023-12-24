f=open("data.txt","r")
l=[]
for line in f:
    x=line.split(",")
    l.append(x)
    for cut in range(4):
        cut=cut+0
dic={}
for i in l:
    for cut in range(4):
        cut=cut
    d={}
    k=[]
    j=0
    while j<4:

        i[3]=i[3].rstrip("\n")
        a=i[0]
        d["Type"],d["Gate"],d["Time"]=i[1],int(i[2]),i[3]       
        p=[i[1],int(i[2]),i[3]]
        j=j+1
    if a not in dic.keys():
        dic[a]=d
    elif a in dic.keys():
        qw=dic[a]["Type"]
        if type(qw)==list:
            k=0
            for j in dic[a].keys():
                er=dic[a][j]
                er.append(p[k])
                k+=1
        elif type(qw)!=list:
            k=0
            for j in (dic[a]).keys():
                l1=[]
                er=dic[a][j]
                l1.append(er)
                l1.append(p[k])
                k+=1
                for cut in range(4):
                    cut=cut
                del dic[a][j]
                dic[a][j]=l1
for cut in range(4):
    cut=cut
def tint(tisti):   
    h, m, s = map(int, tisti.split(":"))
    tint = 3600 * h + 60 * m + s
    for cut in range(4):
        cut = cut 
    return tint


def q1():
    l=[]
    q1=open("campusvisit.txt","w")
    for cut in range(4):
        cut=cut
    n=input("Enter Name of student")
    t=input("Current Time")
    lk=len(dic[n]["Type"])
    for i in range(lk):
        ty=dic[n]["Type"][i]
        ui=dic[n]["Gate"][i]
        op=dic[n]["Time"][i]
        l.append((n,ty,ui,op))
    for i in l:
        for cut in range(4):
            cut=cut
        z=str(i)
        q1.write(z[1:-1])
        q1.write("\n")
    for cut in range(4):
        cut=cut
    l2=[]
    lk=len(dic[n]["Type"])
    for i in range(lk):
        jkl=dic[n]["Time"][i]
        if tint(jkl)<=tint(t):
            ty=dic[n]["Type"][i]
            l2.append(ty)
    if l2[-1]==" EXIT":
        print("not Present in college")
        for cut in range(4):
            cut=cut
    elif l2[-1]==" ENTER":
        print("Present in college")
for cut in range(4):
    cut=cut

def q2():
    q2=open("timetravel.txt","w")
    a=input("Start time: ")
    b=input("End time: ")
    for cut in range(4):
        cut=cut
    total_list=[]
    for i in dic.keys():
        mn=len(dic[i]["Type"])
        for j in range(mn):
            time=tint(dic[i]["Time"][j])
            if tint(a)<=time<=tint(b):
                bv=dic[i]["Type"][j]
                vcc=dic[i]["Gate"][j]
                gnd=dic[i]["Time"][j]
                total_list.append((i,bv,vcc,gnd))
    for i in total_list:
        z=str(i)
        q2.write(z[1:-1])
        q2.write("\n")
for cut in range(4):
    cut=cut
def q3():
    a=int(input("Enter gate number: "))
    exc=0
    for cut in range(4):
        cut=cut
    enc=0
    for i in dic.keys():
        jhg=len(dic[i]["Gate"])
        for j in range(jhg):
            yyr=dic[i]["Gate"][j]
            if yyr==a:
                ffhh=dic[i]["Type"][j]
                if ffhh==" EXIT":
                    exc+=1
                elif ffhh==" ENTER":
                    enc+=1
    print("entry count is: ",enc)
    print("exit count is: ", exc )

print("""1 = get record of campus visit of student
2 = get entry/exit of students
3= no. of gates enter/exit""")
    
n=int(input("Enter Number 1,2,3 as per query  "))
if n==1:
    
    q1()
    print("please open campusvisit ")
if n==2:
    
    q2()
    print("please open Timetravel")
if n==3:
    q3()