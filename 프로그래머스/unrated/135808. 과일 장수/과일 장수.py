def solution(k, m, score):
    answer = 0
    score.sort()
    
    
    while len(score)>=m:
        answer+=score[-m]*m
        for _ in range(m):
            score.pop()
    return answer