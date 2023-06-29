def solution(n):
    answer = 0
    n3=[]
    while n>=3:
        n,r=divmod(n,3)
        n3.append(r)
    n3.append(n)
    n3.reverse()
    for i,num in enumerate(n3):
        answer+=num*3**i
    return answer