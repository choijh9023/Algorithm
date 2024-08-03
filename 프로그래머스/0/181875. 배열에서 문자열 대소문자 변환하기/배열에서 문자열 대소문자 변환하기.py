def solution(strArr):
    answer = []
    for num, word in enumerate(strArr):
        if num%2 !=0:
            answer.append(word.upper())
        else:
            answer.append(word.lower())
        
    return answer
# def solution(strArr):
#     return [s.lower() if i % 2 == 0 else s.upper() for i, s in enumerate(strArr)]
