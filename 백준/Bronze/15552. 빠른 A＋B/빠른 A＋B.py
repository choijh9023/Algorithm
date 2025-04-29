import sys

#정수 입력 받기
a = int(sys.stdin.readline().strip())

for i in range(a):
    data = sys.stdin.readline().strip()

    data_list = data.split()

    b, c = map(int,data_list)
    print(b+c)