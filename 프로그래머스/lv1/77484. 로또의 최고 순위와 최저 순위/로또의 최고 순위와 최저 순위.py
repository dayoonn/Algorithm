def solution(lottos, win_nums):
    answer = []
    zeronum=lottos.count(0)
    
    for _ in range(zeronum): lottos.remove(0)
    
    correct=len(lottos)+6-len(set(lottos+win_nums))
    if 7-(correct+zeronum)>6:
        answer.append(6)
    else:answer.append(7-(correct+zeronum)) #max
    if 7-correct>6: answer.append(6)
    
    else: answer.append(7-correct) #max
    return answer