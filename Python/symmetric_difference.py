if __name__ == '__main__':
    na = int(input())
    a = list(map(int,input().split()))
    nb = int(input())
    b = list(map(int, input().split()))

    if len(a) == na and len(b) == nb:
        set_a = set(a)
        set_b = set(b)

        symmetric_diff = list(set_a.symmetric_difference(set_b))
        symmetric_diff.sort()
        for num in symmetric_diff:
            print(num)
    else:
        print('Number of values entered are not equal to total values to be entered!')
