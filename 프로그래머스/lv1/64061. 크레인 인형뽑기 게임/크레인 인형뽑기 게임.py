def solution(board, moves):
    answer = 0
    
    stack=[]
    top=-1
    for col in moves:
        row=0
        while row<len(board):
            if board[row][col-1]!=0:
                catch=board[row][col-1]
                board[row][col-1]=0
                if top==catch:
                    stack.pop()
                    if len(stack)==0: top=-1
                    else: top=stack[-1]
                    answer+=2
                else:
                    stack.append(catch)
                    top=stack[-1]
                break
            else:
                row+=1
    return answer