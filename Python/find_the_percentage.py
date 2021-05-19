if __name__ == '__main__':
    student_records = int(input())
    name_with_marks = {}
    marks_valid = True
    if student_records >= 2 and student_records <= 10:
        for _ in range(student_records):
            name, *marks = input().strip().split()
            name = name.capitalize()
            all_marks = list(map(float,marks))
            name_with_marks[name] = all_marks

        for marks_list in name_with_marks.values():
            if len(marks_list) == 3:
                for value in marks_list:
                    if value >= 0 and value <= 100:
                        marks_valid = True
                    else:
                        marks_valid = False
                        break
            else:
                print('Enter only 3 values for marks!')
                break

        if marks_valid:
            name_for_average_marks = input().capitalize()
            if name_for_average_marks in name_with_marks.keys():
                sum = sum(name_with_marks[name_for_average_marks])
                avg_marks = sum/3
                print('{:.2f}'.format(avg_marks))
            else:
                print('Name not found!')