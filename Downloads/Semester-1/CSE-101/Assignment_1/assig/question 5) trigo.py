x=float(input("please enter angle in degrees: "))
y=float(input("please enter horizontal distance in meters: "))
z=3.1415926535*x/180
def fac(x):
    if x==0:
        return 1
    fact = 1
    for i in range(1,x+1,1):
        fact=fact*i
    return fact
def cos(x):
    cos = 1
    for i in range(1,30):
        cos = cos+((-1)**i)*(x**(2*i))/(fac(2*i))
    return cos

t=y/cos(z)
print("value of hypotenuse is: ",t)
x=(t**2-y**2)**0.5
print("value of height is",x)