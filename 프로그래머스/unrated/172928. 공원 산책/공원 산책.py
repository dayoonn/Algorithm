def solution(park, routes):
    xmax=len(park[0])-1
    ymax=len(park)-1
    cur_x=0 #ㅎㅕㄴㅈㅐㅇㅜㅣㅊㅣ
    cur_y=0
    
    for i,row in enumerate(park):
        if 'S' in row:
            cur_y=i
            for j,col in enumerate(row):
                if col=='S':
                    cur_x=j
                    break
            break
    
    for r in routes:
        rlist=r.split()
        rlist[-1]=int(rlist[-1])
        if rlist[0]=='E' and rlist[1]+cur_x<=xmax:
            if 'X' not in park[cur_y][cur_x:rlist[1]+cur_x+1]:
                cur_x+=rlist[1]
                
        elif rlist[0]=='W' and cur_x-rlist[1]>=0:
            if 'X' not in park[cur_y][cur_x-rlist[1]:cur_x]:
                cur_x-=rlist[1]
                
        elif rlist[0]=='N' and cur_y-rlist[1]>=0:
            move=True
            for i in range(1,rlist[1]+1):
                if park[cur_y-i][cur_x]=='X':
                    move=False
                    break
            if move:
                cur_y-=rlist[1]
                
        elif rlist[0]=='S' and cur_y+rlist[1]<=ymax:
            move=True
            for i in range(1,rlist[1]+1):
                if park[cur_y+i][cur_x]=='X':
                    move=False
                    break
            if move:
                cur_y+=rlist[1]
            
            
                
                
    return [cur_y,cur_x]