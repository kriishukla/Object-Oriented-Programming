x0=int(input("enter initial coordinates: "))
y0=int(input("enter initial coordinates: ")) 
x1=x0
y1=y0
t=0
while True:    
    n = int(input("enter no if wish to exit enter a negative no. "))
    if n <0:
        break  
    elif n<=25 and n>0:
        y1=y1+n
    elif 25<n<=50:
        y1=y1-n
    elif 50<n<=75:
        x1=x1+n
    else:
        x1=x1-n
    t=t+n

print(t)
print("coordinates respectively are",x1,",",y1)
a=(x1-x0)**2
b=(y1-y0)**2
t=(a+b)**(0.5)
print (t)
        
    
    
