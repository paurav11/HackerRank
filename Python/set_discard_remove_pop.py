if __name__ == '__main__':
    n = int(input())
    s = set(map(int, input().split()))
    N = int(input())
    if (n > 0 and n < 20) and (N > 0 and N < 20):
        for _ in range(N):
            try:
                command = input().strip().split()
                if command[0].lower() == 'discard':
                    s.discard(int(command[1]))
                elif command[0].lower() == 'remove':
                    s.remove(int(command[1]))
                elif command[0].lower() == 'pop':
                    s.pop()
                else:
                    print('Command not recognized!')
                    break
            except:
                continue

        print(sum(list(s)))
    else:
        print('Values entered are not valid!')