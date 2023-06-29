def solution(food):
    answer = ''
    for i,f in enumerate(food):
        for _ in range (f//2):
            answer+=str(i)
    answer_re=answer[::-1]
    answer+='0'+answer_re
            
    return answer