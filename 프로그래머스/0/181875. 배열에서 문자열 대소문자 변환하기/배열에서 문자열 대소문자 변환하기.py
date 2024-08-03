def solution(strArr):
    answer = []
    for num, word in enumerate(strArr):
        if num%2 !=0:
            answer.append(word.upper())
        else:
            answer.append(word.lower())
        
    return answer