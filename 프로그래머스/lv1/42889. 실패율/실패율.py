def solution(N, stages):
    d=dict()
    p=len(stages)
    
    for l in range(1,N+1):
        if stages.count(l)==0 : d[l]=0
        else : d[l]=stages.count(l)/p
        p-=stages.count(l)
        
    answer=sorted(d,key=lambda x : -d[x])
        
        
    
    return answer