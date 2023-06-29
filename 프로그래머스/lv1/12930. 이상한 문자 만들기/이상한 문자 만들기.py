def solution(s):
    arr=s.split(' ')
    
    arranswer=[]
    for i in range(len(arr)):
        answer=''
        for j in range (len(arr[i])):
            if j%2==0: answer+=arr[i][j].upper()
            else : answer+=arr[i][j].lower()
        arranswer.append(answer)
    return " ".join(arranswer)