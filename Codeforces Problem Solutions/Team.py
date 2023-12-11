problem_count = int(input())

team_count = 0

for _ in range(problem_count):
    user_input = input().split(" ")
    solution_count = [eval(i) for i in user_input]
    if sum(solution_count) == 2:
        team_count += 1
    
print(team_count)