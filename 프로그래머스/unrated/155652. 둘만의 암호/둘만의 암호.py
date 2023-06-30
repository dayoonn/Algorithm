def solution(s, skip, index):
    answer = ''
    result=[chr(ord(c)+index) for c in s]
    
    for c in s:
        i=1
        change=c
        while i<=index:
            change=chr(ord(change)+1)
            if change>'z':
                change='a'
            if change not in skip:
                i+=1
                
        answer+=change
                
        
    return answer