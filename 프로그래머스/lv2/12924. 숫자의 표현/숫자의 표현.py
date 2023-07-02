def solution(n):
    answer = 0
    
    num=[i for i in range(1,n+1)]
    
    s=0
    e=1
    if n==1: 
        s,e=0,0
    while s<=e:
        if sum(num[s:e+1])==n:
            answer+=1
            s+=1
            e+=1
        elif sum(num[s:e+1])<n:
            e+=1
        else:
            s+=1
        
        if e==n : 
            break
        
        
    
    return answer