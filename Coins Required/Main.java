
n = int(input())
coins5 = int((n-4)/5)
balance = n - (coins5*5)
if balance%2==0:
    coins1 = 2
else:
    coins1 = 1
balance-=coins1
coins2 = balance//2
# print(coins2)
print(str(coins1+coins2+coins5),str(coins5),str(coins2),str(coins1))