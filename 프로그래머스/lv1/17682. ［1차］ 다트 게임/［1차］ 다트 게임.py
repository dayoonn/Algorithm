def solution(dartResult):
    answer = 0
    n=[]
    for i,c in enumerate(dartResult):
        if c.isalpha():
            if dartResult[i-2].isdigit(): 
                    n.append(int(dartResult[i-2:i]))
            else : n.append(int(dartResult[i-1]))
        if c=='D':
            n[-1]=n[-1]**2
        if c=='T':
            n[-1]=n[-1]**3
        elif c=='*':
            n[-1]=n[-1]*2
            if len(n)>=2: n[-2]=n[-2]*2
        elif c=='#':
            n[-1]=-n[-1]
            
    return sum(n)