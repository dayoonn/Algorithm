import numpy 
def solution(arr1, arr2):
    arrA=numpy.array(arr1)
    arrB=numpy.array(arr2)
    
    answer=arrA+arrB
    return answer.tolist()