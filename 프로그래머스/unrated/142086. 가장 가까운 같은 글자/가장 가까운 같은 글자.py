def solution(s):
    answer = []
    
    for i in range(len(s)):
        result=s[:i][::-1].find(s[i])
        if result>-1 :
            result+=1
        answer.append(result)
            
        
    return answer

#ananab