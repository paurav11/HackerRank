def simpleArraySum(arr):
    sum=0
    for x in arr:
        sum += x
    return sum

if __name__ == '__main__':
    n = int(input().strip())
    if (n>0):
        arrStr = input().split()
        arr = []
        flag=0
        for i in arrStr:
            if int(i)<=1000:
                arr.append(int(i))
                flag=0
            else:
                flag=1
                break

        if flag == 0:
            if len(arr) == n:
                result = simpleArraySum(arr)
                print(result)
            else:
                print('Values entered does not match total number of indexes.')
        else:
            print('Array value exceeds 1000!')
    else:
        print('Number of indexes should be positive.')
