def solveMeFirst(a,b):
    if a>=1 and a<=1000 and b>=1 and b<=1000:
        return a+b
    else:
        print('Values entered are not within the range!')
        return

if __name__ == '__main__':
    a = int(input().strip())
    b = int(input().strip())
    sum = solveMeFirst(a,b)
    if sum != None:
        print(sum)
