def solution(nums):
    from itertools import combinations
    answer = 0
    
    lst=list(combinations(nums,3))
    
    for n in lst:
        thtn=0
        for i in range(1,(sum(n)//2)+1):
            if sum(n)%i==0:
                thtn+=1
        if thtn==1:
            answer+=1
            
            
    return answer