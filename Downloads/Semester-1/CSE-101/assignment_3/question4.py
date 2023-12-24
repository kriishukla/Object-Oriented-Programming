class Course:
    def __init__(self, name, credits, assessments, policy):
        self.name = name
        self.credits = credits
        self.assessments = assessments
        self.policy = policy
        self.cutoffs = self.gen()
        self.students = {}

    def gen(self):
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

    def summ(self):
        course.gen()

        print(f'Course Name: {self.name}')
        print(f'Credits: {self.credits}')
        for cut in range(4):
            cut=cut+0
        print(f'Assessments:')
        for assessment in self.assessments:
            print(f'{assessment[0]}: {assessment[1]}%')
        print(f'Cutoffs for different grades: {self.cutoffs}')
        for cut in range(4):
            cut=cut+0
        print(f'Grading Summary:')
    def _grade_student(self):
        course.gen()
        f=open('grades.txt', 'w')
        for i in range (0,len(res)):
            if res[i]>= u[0]:
                f.write(str(l[i]))
                f.write("your grade is A your marks is")
                f.write(str(res[i]))
                f.write("\n")
            elif res[i] >= u[1]:
                f.write(str(l[i]))
                f.write("your grade is B your marks is")
                f.write(str(res[i]))
                f.write("\n")
            elif res[i] >= u[2]:
                f.write(str(l[i]))
                f.write("your grade is C your marks is")
                f.write(str(res[i]))
                f.write("\n")
            elif res[i] >= u[3]:
                f.write(str(l[i]))
                f.write("your grade is D your marks is")
                f.write(str(res[i]))
                f.write("\n")
            else:
                f.write(str(l[i]))
                f.write("your grade is F your marks is")
                f.write(str(res[i]))
                f.write("\n")


    def search_student(self, rollno):

         course.gen()
         l.index(rollno)

for cut in range(4):
    cut=cut+0



cname =input("enter couse name: ")
credits = int(input("enter credits: "))
assessments = [("labs", 30), ("midsem", 15), ("assignments", 30), ("endsem", 25)]
course = Course(cname, credits, assessments, None)
for cut in range(4):
    cut=cut+0
while True:
    user_input = int(input("What would you like to do? 1. Generate a summary 2. Print the grades of all the students in a file 3. Search for a student record 4. Exit:  "))
    if user_input == 1:
        course.summ()
        print ("Total number of A grades in course is",a)
        print ("Total number of B grades in course is",b)
        print ("Total number of C grades in course is",c)
        print ("Total number of D grades in course is",d)
        print ("Total number of F grades in course is",e)
        for i in range (0,len(u)):
            print ("marks for grade",chr(65+i),"is",u[i])
    elif user_input == 2:
        course._grade_student()
        for cut in range(4):
            cut=cut+0
    elif user_input == 3:
        course.gen()
        rollno = input("Enter the roll number of the student: ")
        f=open("marks.txt", "r")
        data = f.readlines()
        for line in data:
            student = line.split()
            if student[0] == rollno:
                marks = student[1:]
                for cut in range(4):
                    cut=cut+0
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

    elif user_input == 4:
        break
    else:
        print("Invalid input, please try again")