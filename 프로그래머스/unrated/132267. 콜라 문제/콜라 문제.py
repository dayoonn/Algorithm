def solution(a, b, n):
    answer = 0
    
    while n>=a:
        m,r=divmod(n,a)
        answer+=m*b
        n=m*b+r
        
    return answer