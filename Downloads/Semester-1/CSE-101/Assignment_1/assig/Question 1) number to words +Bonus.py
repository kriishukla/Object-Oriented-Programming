n=int(input("Enter the number: "))
unit = ['','one','two','three','four','five','six','seven','eight','nine',"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"]
tens =["","","twenty ","thirty ","forty ","fifty ","sixty ","seventy ","eighty ","ninety "]
hundreds=["",'one hundred ','two hundred ','three hundred ','four hundred ','five hundred ','six hundred ','seven hundred ','eight hundred ','nine hundred ']
Thousands=["thousand ",'one Thousands ','two Thousands ','three Thousands ','four Thousands ','five Thousands ','six Thousands ','seven Thousands ','eight Thousands ','nine Thousands ','ten Thousands ','eleven Thousands ','twelve Thousands ','thirteen Thousands ','fourteen Thousands ','fifeteen Thousands ','sixteen Thousands ','seventeen Thousands ','eighteen Thousands ',"nineteen Thousands "]
lakhs=["lakh ",'one lakhs ','two lakhs ','three lakhs ','four lakhs ','five lakhs ','six lakhs ','seven lakhs ','eight lakhs ','nine lakhs ',"ten lakh ","eleven lakh ","twelve lakh ","thirteen lakh ",'fourteen lakh ',"fifteen lakh ",'sixteen lakh ','seventeen lakh ','eighteen lakh ',"nineteen lakh "]
crores=["crore",'one crores ','two crores ','three crores ','four crores ','five crores ','six crores ','seven crores ','eight crores ','nine crores ',"ten lakh","eleven crore ","twelve crore ","thirteen crore ",'fourteen crore ',"fifteen crore ",'sixteen crore ','seventeen crore ','eighteen crore ',"nineteen crore "]
def ka(x):
    if x<20:
        return unit[x]
        
    elif x<=99:
        return tens[x//10 ] + unit[x%10]
        
    elif x>99 and x<1000:
        return hundreds[x//100]+tens[(x%100)//10]+unit[x%10]
    elif x>20000 and x<100000: 
        return tens[x//10000 ]+Thousands[(x%10000)//1000 ]+hundreds[((x%10000)%1000)//100 ]+tens[(((x%10000)%1000)%100)//10 ]+unit[x%10]

    elif x<20000 and x>9999:
        return Thousands[x//1000 ]+hundreds[(x%1000)//100 ]+tens[((x%1000)%100)//10 ]+unit[x%10]

def la(a):
    if a<20:
        return unit[a]
        
    elif a<=99:
        return tens[a//10 ] + unit[a%10]
        
    elif a>99 and a<1000:
        return hundreds[a//100]+tens[(a%100)//10]+unit[a%10]
        
    elif a>999 and a<10000: 
        return Thousands[a//1000 ]+hundreds[(a%1000)//100 ]+tens[((a%1000)%100)//10 ]+unit[a%10]
        
    elif a>20000 and a<100000: 
        return tens[a//10000 ]+Thousands[(a%10000)//1000 ]+hundreds[((a%10000)%1000)//100 ]+tens[(((a%10000)%1000)%100)//10 ]+unit[a%10]

    elif a<20000 and a>9999:
        return Thousands[a//1000 ]+hundreds[(a%1000)//100 ]+tens[((a%1000)%100)//10 ]+unit[a%10]
    elif a>99999 and a<2000000:
        x=a%100000
        return lakhs[a//100000]+ka(x)
    elif a>1999999 and a<10000000:
        y=a%100000
        return tens[a//1000000]+lakhs[(a%1000000)//100000]+ka(y)

if n<20:
    print(unit[n])
    
elif n<=99:
    print(tens[n//10 ] + unit[n%10])
    
elif n>99 and n<1000:
    print(hundreds[n//100]+tens[(n%100)//10]+unit[n%10])
    
elif n>999 and n<10000: 
    print(Thousands[n//1000 ]+hundreds[(n%1000)//100 ]+tens[((n%1000)%100)//10 ]+unit[n%10])
    
elif n>20000 and n<100000: 
    print(tens[n//10000 ]+Thousands[(n%10000)//1000 ]+hundreds[((n%10000)%1000)//100 ]+tens[(((n%10000)%1000)%100)//10 ]+unit[n%10])

elif n<20000 and n>9999:
    print(Thousands[n//1000 ]+hundreds[(n%1000)//100 ]+tens[((n%1000)%100)//10 ]+unit[n%10])
elif n>99999 and n<2000000:
    x=n%100000
    print(lakhs[n//100000]+ka(x))
elif n>1999999 and n<10000000:
    y=n%100000
    print(tens[n//1000000]+lakhs[(n%1000000)//100000]+ka(y))
elif n>999999 and n<200000000:
    a=n%10000000
    print(crores[n//10000000]+la(a))
elif n>199999999 and n<1000000000:
    z=n%10000000
    print(tens[n//100000000]+crores[(n%100000000)//10000000]+la(z))
else:
    ("only for 1-100 crore")