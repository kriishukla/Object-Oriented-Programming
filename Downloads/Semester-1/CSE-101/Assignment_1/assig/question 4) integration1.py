import math
def y(t):
    x=math.log(140000/(140000 - 2100*t),math.e)
    return 2000*x - 9.8*t

a = float(input("enter lower limit: "))
b = (float(input("enter upper limit: ")))
x=0
while b>a:
	c=(y(a)+y(a+0.25))/2
	a=a+0.25
	x=x+c*0.25
print(x)


