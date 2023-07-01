def solution(id_list, report, k):
    answer = [0]* len(id_list)
    
    cnt=dict()
    for id in id_list:
        cnt[id]=0
        
    report_list=[set() for _ in range(len(id_list))] #id list 순서대로
    report=list(set(report))
    for r in report:
        tlsrh=r.split()
        report_list[id_list.index(tlsrh[0])].add(tlsrh[1])
        cnt[tlsrh[1]]+=1
    
    for i,c in enumerate(cnt):
        if cnt[c]>=k:
            for j in range(len(report_list)):
                if c in report_list[j]:
                    answer[j]+=1
    
    
    return answer