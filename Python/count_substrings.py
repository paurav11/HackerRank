def count_substring(string,sub_string):
    if len(string) >= 1 and len(string) <= 200:
        count = 0

        for i in range(0, len(string)):
            count_flag = True
            if i != len(string) - len(sub_string) + 1:
                if string[i] == sub_string[0]:
                    index = i
                    for char in range(0, len(sub_string)):
                        if string[index] == sub_string[char]:
                            count_flag = True
                            index += 1
                            continue
                        else:
                            count_flag = False
                            break

                    if count_flag:
                        count += 1
                        continue
            else:
                break

        return count
    else:
        return

if __name__ == '__main__':
    string = input().strip()
    sub_string = input().strip()

    count = count_substring(string,sub_string)
    print(count)