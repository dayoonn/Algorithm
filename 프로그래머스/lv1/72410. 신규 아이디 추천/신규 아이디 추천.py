def solution(new_id):
    answer = ''
    
    new_id=new_id.lower() #1
    xmrtn="-_."
    for c in new_id:
        if c.isalpha() or c.isdigit() or c in xmrtn: #2
            if answer and answer[-1]=='.' and c=='.': #3
                pass
            else:
                answer+=c
    answer=answer.strip('.') #4
    if not answer: answer+='a' #5
    if len(answer)>=16 : answer=answer[:15] #6
    answer=answer.strip('.') #6-1
    while len(answer)<3:
        answer+=answer[-1]
        
    
    return answer