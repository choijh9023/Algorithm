def solution(slice, n):
    answer = 0
    if n%slice!= 0:
        answer = int(n/slice)
        answer +=1
    elif n%slice ==0:
        answer = n/slice
    return answer