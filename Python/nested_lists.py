if __name__ == '__main__':
    total_students = int(input())
    if total_students >= 2 and total_students <= 5:
        student_with_grades = []
        grades = set()
        students_with_second_lowest_grade = []

        for _ in range(total_students):
            name = input()
            grade = float(input())
            grades.add(grade)
            student_with_grades.append([name, grade])

        distinct_grades = list(grades)
        distinct_grades.sort()
        second_lowest_grade = distinct_grades[1]

        for record in student_with_grades:
            if record[1] == second_lowest_grade:
                students_with_second_lowest_grade.append(record[0])

        students_with_second_lowest_grade.sort()
        for name in students_with_second_lowest_grade:
            print(name)