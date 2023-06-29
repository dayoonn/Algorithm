def solution(name, yearning, photo):
    answer = []
    
    ny=dict(zip(name,yearning))
    
    for p in photo:
        s=0
        for n in p :
            if n in ny: s+=ny[n]
        answer.append(s)
    return answer