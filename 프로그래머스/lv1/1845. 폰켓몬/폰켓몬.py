def solution(nums):
    answer = 0
    n_set=set(nums)
    if len(n_set)>= len(nums)//2 : answer=len(nums)//2
    else : answer=len(n_set)
    return answer