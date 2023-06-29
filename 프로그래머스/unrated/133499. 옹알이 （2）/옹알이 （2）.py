def solution(babbling):
    answer = 0
    can=["aya", "ye", "woo", "ma"]
    for b in babbling:
        word=b
        word=word.replace(can[0],'1')
        word=word.replace(can[1],'2')
        word=word.replace(can[2],'3')
        word=word.replace(can[3],'4')
        if word.isdigit(): 
            conti=True
            for i in range(len(word)-1):
                if word[i]==word[i+1]:
                    conti=False
                    break
            if conti: answer+=1
    return answer