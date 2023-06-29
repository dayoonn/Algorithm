def solution(s):
    
    answer=s
    en={"zero":0,"one":1,"two":2,"three":3,"four":4,"five":5,"six":6,"seven":7,"eight":8,"nine":9}
    
    for word in en :
        if word in answer :
            answer=answer.replace(word,str(en[word]))
    
    return int(answer)