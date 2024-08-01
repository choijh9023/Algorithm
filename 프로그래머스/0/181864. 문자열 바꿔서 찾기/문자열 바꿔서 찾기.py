def solution(myString, pat):
    answer = ""
    for i in myString:
        if i == "A":
            answer+="B"
        elif i == "B":
            answer+="A"
        else:
            answer+=i

    if pat in answer:
        return 1 
    else:
        return 0