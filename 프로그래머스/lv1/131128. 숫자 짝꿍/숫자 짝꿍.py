def solution(X, Y):
    answer = ''
    cntx=[]
    cnty=[]
    comm=[]
    for i in range(10):

        if X.count(str(i))!=0 and Y.count(str(i))!=0 :
            for j in range(min(X.count(str(i)),Y.count(str(i)))):
                comm.append(str(i))
                
    if not comm: return "-1"
    comm.sort(reverse=True)
    answer=''.join(comm)
    if answer[-1]=='0'and answer[0]=='0':return "0"
    
    return answer