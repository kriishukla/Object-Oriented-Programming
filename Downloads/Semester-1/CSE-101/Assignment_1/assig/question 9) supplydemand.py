import math
def demand(p):
    x=math.exp(10-1.05*p)
    return x
def supply(p):
    y=math.exp(1+1.06*p)
    return y
count=0
p=1
while demand(p)>supply(p):
    p=p+0.05*p
    count=count+1
    if count>1000:
        print("no result")
print(p)
print(demand(p))   
print(supply(p))
a=10
b=1.05
c=1
d=1.06
k=(a-c)/(b+d)
print("exact equilibrium",k)
print("exact equilibrium supply",supply(k))
print("exact equilibrium demand",demand(k))




