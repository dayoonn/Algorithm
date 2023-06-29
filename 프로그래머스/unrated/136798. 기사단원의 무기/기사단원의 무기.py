def solution(number, limit, power):
    answer = 0
    result=[]
    for num in range(1,number+1):
        dirtn=0
        for i in range (1,int(num**0.5)+1):
            if num%i==0: dirtn+=1
        if int(num**0.5)==num**0.5:
            if dirtn*2-1>limit:
                answer+=power
            else:answer+=dirtn*2-1
            
        else : 
            if dirtn*2>limit:
                answer+=power
            else:
                answer+=dirtn*2
        
            
    return answer