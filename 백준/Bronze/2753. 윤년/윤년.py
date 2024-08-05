def year(n):
    if (n%4==0 and n%100!=0) or (n%400==0):
        return 1
    else:
        return 0
n = int(input())
print(year(n))