def solution(price):
    if price >= 500000:
        answer = price * 0.8  # 20% 할인
    elif price >= 300000:
        answer = price * 0.9  # 10% 할인
    elif price >= 100000:
        answer = price * 0.95  # 5% 할인
    else:
        answer = price  # 할인 없음
    
    return int(answer)  # 소수점 이하 버림
