def solution(sizes):
    answer = 0
    m=[max(x) for x in sizes]
    n=[min(x) for x in sizes]
    answer=max(m)*max(n)
    return answer