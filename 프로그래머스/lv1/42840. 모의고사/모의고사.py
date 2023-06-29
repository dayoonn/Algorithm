def solution(answers):
    answer = []
    
    a1=[1,2,3,4,5]
    a2=[2, 1, 2, 3, 2, 4, 2, 5]
    a3=[3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    
    score=dict()
    score['1']=0
    score['2']=0
    score['3']=0
    
    for i,an in enumerate(answers):
        if an==a1[i%len(a1)] : score['1']+=1
        if an==a2[i%len(a2)] :score['2']+=1
        if an==a3[i%len(a3)] : score['3']+=1
        
    maxval=max(sorted(score.values()))
    for key,value in score.items():
                   if maxval==value :answer.append(int(key))
    return answer