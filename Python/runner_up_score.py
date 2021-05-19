if __name__ == '__main__':
    n = int(input())
    arr = list(map(int, input().split()))
    if len(arr) == n:
        new_list = list(set(arr))
        new_list.sort()
        print(new_list[-2])
    else:
        print('Number of values entered are not equal to total values to be entered!')