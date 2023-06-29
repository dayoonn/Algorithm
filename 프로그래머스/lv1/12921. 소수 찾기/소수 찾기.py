def solution(n):
    answer = 1 #2
    
    for i in range(3,n+1,2):
        thtn=True
        for j in range(3,int(i**0.5)+1):
            if i%j==0:
                thtn=False
                break
        if thtn:
            answer+=1
    
    
    return answer