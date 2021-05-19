from itertools import combinations

if __name__ == '__main__':
    input_string = input().strip().split()
    if input_string[0].isupper() and (int(input_string[1]) > 0 and int(input_string[1]) <= len(input_string[0])):
        for i in range(1,int(input_string[1])+1):
            combinations_list = sorted(list(combinations(sorted(input_string[0]), i)))
            for value in combinations_list:
                print(''.join(list(value)))
