def compareTriplets(a,b):
    aScore = 0
    bScore = 0
    for i,j in zip(a,b):
        if i > j:
            aScore += 1
        elif i < j:
            bScore += 1
        elif i == j:
            aScore += 0
            bScore += 0
    return [aScore,bScore]


if __name__ == '__main__':
    arrStr1 = input().split()
    arrStr2 = input().split()
    a=[]
    b=[]
    flag1=0
    flag2=0
    for i in arrStr1:
        if 1 <= int(i) <= 100:
            a.append(int(i))
            flag1=0
        else:
            flag1=1
            break
    for i in arrStr2:
        if 1 <= int(i) <= 100:
            b.append(int(i))
            flag2 = 0
        else:
            flag2 = 1
            break
    if flag1 == 0 and flag2 == 0:
        finalScore = compareTriplets(a,b)
        print(finalScore[0],finalScore[1])
    else:
        print('Value entered in either array 1 or 2 is not within the range mentioned.')


