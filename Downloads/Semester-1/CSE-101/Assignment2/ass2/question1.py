menu = { 1:15 , 2:30 , 3:50 , 4:70, 5:10 , 6:20 , 7:35 , 8:25 }
sum=0
a=[("Samosa",15),("Idli",30),("Maggie",50),("Dosa",70),("Tea",10),("Coffee",20),("Sandwich",35),("Cold Drink" ,25)]
st=""
print("""
                          KODECHEF    
                          
                          
       FOOD                              PRICE

 1     Samosa                             15

 2     Idli                               30

 3     Maggie                             50

 4     Dosa                               70

 5     Tea                                10

 6     Coffee                             20
 
 7     Sandwich                           35
 
 8     Cold Drink                         25
 
""")
print("Enter alphabet to exit from loop or a blank entry remember to give both entry ")
print()
print()
item =0
while True:
        x = list(map(int,input("enter item no. and quantity respectively ").split()))
        
        if len(x)!=2 :
            break
        else:
            item = item+x[1]
            st=st+"\n"+str(a[x[0]-1][0])+"\t"+str(x[1])+"\t"+str(x[1]*a[x[0]-1][1])
            sum=sum + int(x[1])*menu[int(x[0])]
print(st)
print("Total item",item)
print("total bill=",sum)