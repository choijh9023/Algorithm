def solution(num_list, n):
    answer = []
    _n = num_list[:n] #n이전의 숫자 
    n_ = num_list[n:] #n이후의 숫자 
    c= n_+_n
    return c