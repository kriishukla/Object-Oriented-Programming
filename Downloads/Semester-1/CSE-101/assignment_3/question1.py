def pattern(a,k):
    print('* '*a+" "*(4*k)+"* "*a)
    if a > 1:
        pattern(a-1,k+1)
def design(a,k):
    print('* '*a+" "*(4*(k-2))+"* "*a)
    if k > 2:
        design(a+1,k-1)
n=int(input("enter n: "))
if n==1:
    print("* *")

else:
    pattern(n,0)
    design(2,n)