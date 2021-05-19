#!/bin/python3

import math
import os
import random
import re
import sys


def avg(*nums):
    return sum(nums)/len(nums)

if __name__ == '__main__':
    nums = list(map(int, input().split()))
    res = avg(*nums)
    print('%.2f' % res + '\n')
