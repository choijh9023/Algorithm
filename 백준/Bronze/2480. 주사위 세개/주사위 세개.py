line = input()
numbers = line.split()
num1 = int(numbers[0])
num2 = int(numbers[1])
num3 = int(numbers[2])
same = 0

if num1==num2==num3:
    print(10000+num1*1000)
elif num1==num2 or num1==num3 or num2==num3:
    if num1==num2 or num1==num3:
        print(1000+num1*100)
    else:
        print(1000+num2*100)
else:
    max_num = max(num1, num2, num3)
    print(max_num*100)
    
        
        