from itertools import permutations

if __name__ == '__main__':
    input_string = input().strip().split()
    if input_string[0].isupper() and (int(input_string[1]) > 0 and int(input_string[1]) <= len(input_string[0])):
        permutations_list = sorted(list(permutations(input_string[0],int(input_string[1]))))
        for value in permutations_list:
            print(''.join(list(value)))
