value=0
cost=float(input("enter lappy cost: "))
n=0
while value<cost:
    value=value+(0.5*value)/100+2000
    n=n+1
print("remain money",value-cost)
print("months to buy",n)    
    