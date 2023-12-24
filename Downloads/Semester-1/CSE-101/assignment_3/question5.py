def generate_cutoffs():
    f=open("marks.txt", "r")
    data = f.readlines()
    global res
    res = []
    global l
    l=[]
    for i in data:
        line = i.split()
        for cut in range(4):
            cut=cut+0
        res.append(sum(map(float, line[1:])))
        l.append(line[0])
    list1 = []
    list2 = []
    list3 = []
    list4 = []
    for i in res:
        if 78 <= i <= 82:
            list1.append(i)
        elif 63 <= i <= 67:
            list2.append(i)
        elif 48 <= i <= 52:
            list3.append(i)
        elif 38 <= i <= 42:
            list4.append(i)
    list1.sort()
    global u
    u=[]
    x=[]
    if len(list1)>1:

        for i in range(0,len(list1)-1):
            x.append(list1[i+1]-list1[i])
        maxp = x.index(max(x))
        u.append((list1[maxp+1]+list1[maxp])/2)

    else:
        u.append(80)

    list2.sort()
    y=[]
    if len(list2)>1:
        for i in range(0,len(list2)-1):
            y.append(list2[i+1]-list2[i])
        maxp = y.index(max(y))
        u.append((list2[maxp+1]+list2[maxp])/2)
    else:
        u.append(65)
    list3.sort()
    t=[]
    if len(list3)>1:
        for i in range(0,len(list3)-1):
            t.append(list3[i+1]-list3[i])
        maxp = t.index(max(t))
        u.append((list3[maxp+1]+list3[maxp])/2)
    else:
        u.append(50)
    list4.sort()

    p=[]
    if len(list4)>1:
        for i in range(0,len(list4)-1):
            p.append(list4[i+1]-list4[i])
        maxp = p.index(max(p))
        u.append((list4[maxp+1]+list4[maxp])/2)
    else:
            
        u.append(40)
    global a,b,c,d,e
    a,b,c,d,e=0,0,0,0,0
    for i in res:
        if i>u[0]:
            a=a+1
        elif i>u[1]:
            b=b+1
        elif i>u[2]:
            c=c+1
        elif i>u[3]:
            d=d+1
        else:
            e=e+1
    return u

def generate_summary():
    cutoffs = generate_cutoffs()

    print(f'Course Name: {cname}')
    print(f'Credits: {credits}')
    for cut in range(4):
        cut=cut+0
    print(f'Assessments:')
    for assessment in assessments:
        print(f'{assessment[0]}: {assessment[1]}%')
    print(f'Cutoffs for different grades: {cutoffs}')
    for cut in range(4):
        cut=cut+0
    print(f'Grading Summary:')

def grade_student():
    cutoffs = generate_cutoffs()
    f=open('grades.txt', 'w')
    for i in range (0,len(res)):
        if res[i]>= cutoffs[0]:
            f.write(str(l[i]))
            f.write("your grade is A your marks is")
            f.write(str(res[i]))
            f.write("\n")
        elif res[i] >= cutoffs[1]:
            f.write(str(l[i]))
            f.write("your grade is B your marks is")
            f.write(str(res[i]))
            f.write("\n")
        elif res[i] >= cutoffs[2]:
            f.write(str(l[i]))
            f.write("your grade is C your marks is")
            f.write(str(res[i]))
            f.write("\n")
        elif res[i] >= cutoffs[3]:
            f.write(str(l[i]))
            f.write("your grade is D your marks is")
            f.write(str(res[i]))
            f.write("\n")
        else:
            f.write(str(l[i]))
            f.write("your grade is F your marks is")
            f.write(str(res[i]))
            f.write("\n")
    f.close()

cname =input("enter couse name: ")
credits = int(input("enter credits: "))
assessments = [("labs", 30), ("midsem", 15), ("assignments", 30), ("endsem", 25)]
for cut in range(4):
    cut=cut+0
while True:
    user_input = int(input("What would you like to do? 1. Generate a summary 2. Print the grades of all the students in a file 3. Search for a student record 4. Exit:  "))
    if user_input == 1:
        generate_summary()
        print ("Total number of A grades in course is",a)
        print ("Total number of B grades in course is",b)
        print ("Total number of C grades in course is",c)
        print ("Total number of D grades in course is",d)
        print ("Total number of F grades in course is",e)
        for i in range (0,len(u)):
            print ("marks for grade",chr(65+i),"is",u[i])
    elif user_input == 2:
        grade_student()
    elif user_input == 3:
        generate_cutoffs()
        rollno = input("Enter the roll number of the student: ")
        f=open("marks.txt", "r")
        data = f.readlines()
        for cut in range(4):
            cut=cut+0
        for line in data:
            student = line.split()
            if student[0] == rollno:
                marks = student[1:]
                total_marks = sum(map(int, marks))
                print("Marks:", marks)
                print("Total Marks:", total_marks)
                if total_marks>= u[0]:
                    print("your grade is A ")
                elif total_marks >= u[1]:
                    print("your grade is B ")
                elif total_marks >= u[2]:
                    print("your grade is C ")
                elif total_marks >= u[3]:
                    print("your grade is D ")
                else:
                    print("your grade is F ")
        for cut in range(4):
            cut=cut+0
    elif user_input == 4:
        break
    else:
        print("Invalid input, please try again")