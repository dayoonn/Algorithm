def solution(ingredient):
    answer = 0
    
    ham=''
    hamlist=[]
    for i in ingredient:
        hamlist.append(i)
        if len(hamlist)>=4:
            if hamlist[-4:]==[1,2,3,1]:
                hamlist.pop()
                hamlist.pop()
                hamlist.pop()
                hamlist.pop()
                answer+=1
            
            
    return answer
