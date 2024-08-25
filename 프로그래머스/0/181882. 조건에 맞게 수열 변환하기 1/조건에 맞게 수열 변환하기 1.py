def solution(arr):
    answer = []
    for a in arr:
        if a>=50 and a%2==0:
            b=a/2
            answer.append(b)
        elif a<50 and a%2==1:
            b=a*2
            answer.append(b)
        else:
            answer.append(a)
   
    return answer