def aVeryBigSum(arr):
    sum=0
    for x in arr:
        sum += x
    return sum

if __name__ == '__main__':
    n = int(input().strip())
    if 1 <= n <= 10:
        arrStr = input().split()
        arr = []
        flag=0
        for i in arrStr:
            if 0 <= int(i) <= 10**10:
                arr.append(int(i))
                flag=0
            else:
                flag=1
                break

        if flag == 0:
            if len(arr) == n:
                result = aVeryBigSum(arr)
                print(result)
            else:
                print('No. of values entered does not match total number of indexes.')
        else:
            print('Array value is not within the range defined!')
    else:
        print('Total number of indexes should be between 1 to 10.')
