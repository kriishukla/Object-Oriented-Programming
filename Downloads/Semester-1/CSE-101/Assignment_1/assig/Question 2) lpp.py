m=int(input("enter the value of m: "))
for i in range(0,400,1):
    for j in range(0,120,1):
        if 8*i+2*j==400 and 2*i+j==120:
            x=i
            x=j
            print("number of chairs",i)
            print("number of tables",j)
            
if m>i or m>j:
    print("outside max")
else:   
    print("max profit is",m*90+(x-m)*100+m*25+(x-m)*30)


    

    
        