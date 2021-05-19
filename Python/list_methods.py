if __name__ == '__main__':
    result_list = []
    final_lists = []
    N = int(input())
    for _ in range(N):
        try:
            command = input().strip().split()
            if command[0].lower() == 'insert':
                result_list.insert(int(command[1]),int(command[2]))
            elif command[0].lower() == 'print':
                final_lists.append((tuple(result_list)))
            elif command[0].lower() == 'remove':
                result_list.remove(int(command[1]))
            elif command[0].lower() == 'append':
                result_list.append(int(command[1]))
            elif command[0].lower() == 'sort':
                result_list.sort()
            elif command[0].lower() == 'pop':
                result_list.pop()
            elif command[0].lower() == 'reverse':
                result_list.reverse()
            else:
                print('Command not recognized!')
                break
        except:
            continue

    for item in final_lists:
        print(list(item))