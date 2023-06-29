def solution(cards1, cards2, goal):
    answer="Yes"
    for g in goal:
        if cards1 and g==cards1[0] :
            cards1.remove(g)
        elif cards2 and g==cards2[0]:
            cards2.remove(g)
        else :
            answer="No"
        
    return answer