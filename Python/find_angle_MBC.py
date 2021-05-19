import math

if __name__ == '__main__':
    AB = float(input())
    BC = float(input())
    if (AB > 0 and AB <= 100) and (BC > 0  and BC <= 100):
        MBC = math.degrees(math.atan2(AB,BC))
        degree_sign = u"\N{DEGREE SIGN}"
        print(str(round(MBC)) + degree_sign)
