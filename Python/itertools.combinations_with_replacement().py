from itertools import combinations_with_replacement

if __name__ == '__main__':
    input_string = input().strip().split()
    if input_string[0].isupper() and (int(input_string[1]) > 0 and int(input_string[1]) <= len(input_string[0])):
            combinations_list = sorted(list(combinations_with_replacement(sorted(input_string[0]), int(input_string[1]))))
            for value in combinations_list:
                print(''.join(list(value)))
