def solution(numbers):
    from itertools import combinations
    answer = []
    answer=sorted(list(set(map(sum,combinations(numbers,2)))))
    return answer