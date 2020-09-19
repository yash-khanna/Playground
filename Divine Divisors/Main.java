import math
n=int(input())
l=[]
i=1
while i<=math.sqrt(n):
    if n%i==0:
        if n/i==i:
            l.append(i)
        else:
            l.append(i)
            l.append(n//i)
    i+=1
a=set(l)
list1=list(a)
list1.sort()
for i in list1:
    print(str(i),end=" ")