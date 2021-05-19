from itertools import product

if __name__ == "__main__":
    A = list(map(int,input().split()))
    B = list(map(int,input().split()))
    AXB = list(product(A,B))
    string = ''
    for x,y in AXB:
        string = string + f'({x}, {y})' + ' '
    print(string)