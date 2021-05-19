from cmath import phase

complex_number = complex(input())
print(abs(complex(complex_number.real,complex_number.imag)))
print(phase(complex(complex_number.real,complex_number.imag)))