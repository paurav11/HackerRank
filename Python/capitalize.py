#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the solve function below.
def solve(s):
    if len(s) >= 0 and len(s) <= 1000:
        new_list = s.split()
        for i in range(len(new_list)):
            if new_list[i].isalpha():
                new_list[i] = new_list[i].capitalize()
            else:
                continue
        return ' '.join(new_list)
    else:
        return

if __name__ == '__main__':
    s = input()
    result = solve(s)
    print(result)