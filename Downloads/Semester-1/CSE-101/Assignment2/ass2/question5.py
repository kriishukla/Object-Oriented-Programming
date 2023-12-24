x=int(input("enter n: "))
matrix=[]
y=[]
for i in range(x):
    a, b = input("Enter a two value: ").split()
    y.append(int(a))
    y.append(int(b))
    y.append(1)
    matrix.append(y)
    y=[]
cx=int(input("input cx: "))
cy=int(input("enter cy: "))
t = [[cx,0,0],[0,cy,0],[0,0,0]]

for i in range(0,len(matrix)):
    x=matrix[i][0]*cx ,matrix[i][1]*cy,1
    print("[",x,"]")

