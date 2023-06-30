def solution(survey, choices):
    answer = ''
    score=dict()
    for c in "RTCFJMAN":
        score[c]=0
    
    for s,ch in zip(survey,choices):
        if ch<4:
            score[s[0]]+=4-ch
        elif ch>4:
            score[s[1]]+=ch-4

    if score['R']>=score['T']:answer+='R'
    else: answer+='T'
    
    if score['C']>=score['F']:answer+='C'
    else: answer+='F'
    
    if score['J']>=score['M']:answer+='J'
    else: answer+='M'
    
    if score['A']>=score['N']:answer+='A'
    else: answer+='N'
    return answer