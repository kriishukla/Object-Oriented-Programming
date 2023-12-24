sum=0
c=0
a=[]
transcript="Course name   Grades "
while True:
    x = list((input("enter COURSE NAME ,GRADES and CREDITS respectively ").split()))
    

    if len(x)!=3:
        print("THANK YOU")
        break
    elif len(x)==3:
        a=x[0]
        y=x[1]
        z=x[2]
        k=[]
        transcript=transcript+ '\n'+"  "+x[0].ljust(14)+x[1]
        for i in range(10):
            index = a.find(str(i))
            if index>0:
                k.append(index)
        f=min(k)
        for j in range(f+1,len(a)):
            s=ord(a[j])
            if not(48<=s<=57):
                print("Invalid course name but we will still calculate your grades")
                break

        if not(a[0].isupper) or not(a[-1].isdigit) or not(a.isupper) or not a.isalnum():
            print("Invalid course name")
            break

        elif not(( (y=="A-") or (y=="A+") or (y=="A") or(y=="B") or(y=="B-") or(y=="C-") or(y=="C") or(y=="D") or(y=="F") )):
            print ("Invalid grades")
            break
        
        elif z!="1" and z!="2" and z!="4":
            print("Invalid credits")
            break
        else:
            if y=="A-":
                y=9
            elif y=="A":
                y=10
            elif y=="A+":
                y=10
            elif y=="B":
                y=8
            elif y=="B-":
                y=7
            elif y=="C":
                y=6
            elif y=="C-":
                y=5
            elif y=="D":
                y=4
            elif y=="F":
                y=2

            c=c+int(z)
            sum=sum+int(y)*int(z)

print(transcript)
print(sum/c)