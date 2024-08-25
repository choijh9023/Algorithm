def solution(num_list):
    count = len(num_list)
    
    if count >= 11:
        total_sum = 0
        for a in num_list:
            total_sum += a
        return total_sum
    else:
        product = 1  # 곱셈이므로 초기값을 1로 설정
        for a in num_list:
            product *= a
        return product
