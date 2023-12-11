# Failed on tests
wordsCount = int(input())

wordsInput = []

for _ in range(wordsCount):
    wordsInput.append(input())

for eachWord in wordsInput:
    if len(eachWord) > 10:
        newString = eachWord[1:-1]
        print(f"{eachWord[0]}{len(newString)}{eachWord[-1]}")
    else:
        print(f"{eachWord}")