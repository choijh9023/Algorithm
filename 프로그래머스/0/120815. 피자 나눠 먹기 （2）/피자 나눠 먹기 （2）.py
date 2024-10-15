import math

def solution(n):
    answer = int((n * 6) // math.gcd(n, 6) / 6)
    return answer