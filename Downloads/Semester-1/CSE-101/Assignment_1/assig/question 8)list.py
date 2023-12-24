l = [50, 1450, 1400, 1700, 1500, 600, 1200]
n=0
y=sum(l)
print("current sum is: ",y)
while True:
    for i in range(len(l)):
        l[i]=(l[i]+2.5/100*l[i]-0.4*i/100*l[i]-0.1/100*(n)*l[i])
        x=sum(l)
    if x<y:
        print("peak population",y)
        break
    else:
         y=x
    n=n+1
print("peak year:",n+1)