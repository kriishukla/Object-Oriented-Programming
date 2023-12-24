def fact(n):
        fact = 1
        while(n > 1):
            fact *= n
            n = n-1
        return fact

cost=float(input("enter lappy cost: "))
n=float(input("enter no. of months: "))
i=1
j=0
t=0
while i-2<n:
    t=t+(fact(n)/fact(n-i))*(5/1000)**j
    j=j+1
    i=i+1
a=(cost/t)
print("money to save each month",a)
print("saving fraction",a/20000)