def Diff(l):
  k= []
  for i in range(len(x)):
      k.append(x[i]*i)
  return k[1:]
x = list(map(int, input("enter coefficents: ").split()))
x1=int(input("enter smaller number: "))
x2=int(input("enter larger number: "))
n=int(input("no. of roots in  between: "))
def value( y ):
    t=0
    for i in range (1,len(x)):
        t=t+x[i]*(y**i)
    return t+x[0]

def derivative( x ):
    a=Diff(x)
    b=0
    for i in range(1,len(a)):
        b=b+a[i]*(x**i)
    if b!=0:
        return b + a[0]
    else:
        return b + a[0]+1


def newton( x ):
    m=10
    while abs(m)>(0.000001):
            m=value(x)/derivative(x)
            x=x-m
    return x
i=0
s=x1
while i<=n-1:
    s=s+1
    print(newton(s))
    i=i+1