import collections as col
def solution(participant, completion):
    
    
    cnt_p=col.Counter(participant+completion)
    
    for i in cnt_p:
        if cnt_p[i]%2==1:
            return i
    return 0