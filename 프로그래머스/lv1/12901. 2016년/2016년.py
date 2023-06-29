def solution(a, b):
    import datetime
    answer = ''
    week=['FRI','SAT','SUN','MON','TUE','WED','THU']
    before=datetime.date(2016,1,1)
    after=datetime.date(2016,a,b)
    dif=(after-before).days
    answer=week[dif%7]
    return answer