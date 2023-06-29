def solution(strings, n):
    answer = strings
    answer=sorted(answer)
    answer=sorted(answer,key=lambda x : x[n])
    return answer