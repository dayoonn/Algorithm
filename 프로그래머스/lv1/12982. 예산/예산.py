def solution(d, budget):
    d.sort()
    total=sum(d)
    result=len(d)
    if total>budget:
        while total>budget:
            total-=d.pop()
            result-=1
    
    return result