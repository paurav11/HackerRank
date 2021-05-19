def is_leap(year):
    if year >= 1900 and year <= pow(10,5):
        leap = False
        if year%4 == 0:
            if year%100 == 0:
                if year%400 == 0:
                    leap = True
                else:
                    leap = False
            else:
                leap = True
        return leap
    else:
        return 'Enter valid year!'

if __name__ == '__main__':
    year = int(input())
    print(is_leap(year))