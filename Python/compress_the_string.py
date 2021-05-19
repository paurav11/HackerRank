from itertools import groupby

if __name__ == '__main__':
    for key, group in groupby(input()):
        print('({}, {})'.format(len(list(group)),key), end=" ")
