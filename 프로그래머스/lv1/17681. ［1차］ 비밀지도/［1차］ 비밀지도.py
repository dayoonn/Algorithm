def solution(n, arr1, arr2):
    answer = []
    
    for a1,a2 in zip(arr1,arr2):
        st=''
        map1=(bin(a1)[2:].zfill(n))
        map2=(bin(a2)[2:].zfill(n))
        for i in range(n):
            if map1[i]=='1' or map2[i]=='1' :
                st+='#'
            else:
                st+=' '
        answer.append(st)
    return answer