x=int(input())
y=int(input())

def call(x,y):
    if x>0 and y>0:
        return 1
    elif x>0 and y<0:
        return 4
    elif x<0 and y>0:
        return 2
    elif x<0 and y<0:
        return 3
print(call(x,y))