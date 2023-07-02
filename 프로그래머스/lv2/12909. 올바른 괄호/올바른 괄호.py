def solution(s):
    answer = True
    
    stack=[]
    for c in s:
        if c=='(':
            stack.append(c)
        else:
            if len(stack)<1:
                answer=False
                break
            else: stack.pop()
    if stack: answer=False

    return answer