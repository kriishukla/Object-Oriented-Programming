wts = [(10, 5), (20, 5), (100, 15), (40, 10),(39,25),(69,20),(99,1),(1,19)]
c=len(wts)
f=open("marks.txt","r")
f2=open("IPgrades.txt","w")
x=len(f.readlines())
f.seek(0)
m=1
while m<=x:
    #s1=m,">"
    k=(f.readline())
    numbers = []
    sum=0
    for i in k.split():
        num = int(i)
        numbers.append(num)
    marks=numbers[1:len(numbers):1]
    r=numbers[0]
    for i in range(0,len(wts)):
        w=wts[i][0]
        w2=wts[i][1]
        g=marks[i]
        gr=(g/w)*w2
        sum=sum+gr
    s2="The Percentage is",sum
        
 #A is above 80%, A- from 70, B from 60, B- from 50, C from 40, C- from 35, D from 30, and below 30 is F   
    if sum>80:
        s3="A" 
    elif sum>70:
        s3="A-"
    elif sum>60:
        s3="B"
    elif sum>50:
        s3="B-"
    elif sum>40:
        s3="C"
    elif sum>35:
        s3="C-"
    elif sum>30:
        s3="D"
    else:
        s3=("F")
    m=m+1
    #f2.write(s1)'
    f2.write(str(r))
    f2.write("\t")
    f2.write(str(s2))
    f2.write("\t")
    f2.write(str(s3))
    f2.write("\n")
"""    i=0
while x<=c:
    x=[]
    for i in range(i,c):
        x.append(marks[i])
    i=i+c
    sum=0
for i in range(0,len(wts)):
    w=wts[i][0]
    w2=wts[i][1]
    g=marks[i]
    gr=(g/w)*w2
    sum=sum+gr
print("The Percentage is",sum)
        
 #A is above 80%, A- from 70, B from 60, B- from 50, C from 40, C- from 35, D from 30, and below 30 is F   
if sum>80:
    print("A") 
if sum>70:
    print("A-")
if sum>60:
    print("B")
if sum>50:
    print("B-")
if sum>40:
    print("C")
if sum>35:
    print("C-")
if sum>30:
    print("D")
else:
    print("F")
    """






