def solution(n, m, section):
    answer = 0
    wall=[False]*n
    for i in section: wall[i-1]=True
    for i,paint in enumerate(wall):
        if paint==True:
            for j in range(m): 
                if i+j< n: 
                    wall[i+j]=False
            answer+=1
        
    return answer