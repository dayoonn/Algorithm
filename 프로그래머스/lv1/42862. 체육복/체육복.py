def solution(n, lost, reserve):
    answer = n-len(lost)
    lost.sort()
    lo=[i for i in lost if i not in reserve]
    re=[i for i in reserve if i not in lost]
    answer+=len(lost)-len(lo)
    for lostN in lo:
        if lostN-1 in re:
            re.remove(lostN-1)
            answer+=1
        elif lostN+1 in re:
            re.remove(lostN+1)
            answer+=1
            
    return answer