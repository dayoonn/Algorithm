def solution(arr):
    answer=[]
    for i,n in enumerate(arr):
        if not answer or not answer[-1]==n:
            answer.append(n)
    return answer