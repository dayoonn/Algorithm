def solution(k, score):
    answer = []
    mj=[]
    for s in score:
        mj.append(s)
        mj.sort(reverse=True)
        if len(mj)<k : answer.append(mj[-1])
        else : answer.append(mj[k-1])
        
    return answer