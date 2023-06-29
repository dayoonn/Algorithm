def solution(s, n):
    r=''
    for i,c in enumerate(s):
        if c.isalpha():
            if ord(c)+n > ord("z"):
                r+=chr(ord('a')+(ord(c)+n-ord("z")-1))
            elif c.isupper() and ord(c)+n > ord("Z"):
                  r+=chr(ord('A')+(ord(c)+n-ord("Z")-1))
            else:
                 r+=chr(ord(c)+n)
        else: r+=c
    return r