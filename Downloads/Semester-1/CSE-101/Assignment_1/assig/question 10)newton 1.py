def value( x ):
    return x**3 - 10.5*x**2 + 34.5*x - 35 
def derivative( x ):
    return 3*x**2-21*x+34.5
def newton( x ):
    while (value(x))>0.2 or value(x)<-0.2:
        a=value(x)/derivative(x)
        x = x-a
    return (x)
c = (float(input("make an initial gueeses: ")))
print(newton(float(c)))
  