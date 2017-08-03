
'''Proper way to handle file input
with statement handles open and close as well as exceptions'''
dict = {}

with open('input.txt') as f:
	for line in f:
		'''str.strip() returns a string with leading+trailing whitespace removed,
		 .lstrip and .rstrip for only leading and trailing respectively.'''
		fileLine = line.rstrip('\n')
		
		#if dict has key, add 1 to it's value
		if fileLine in dict:
			dict[fileLine] += 1
		#else set new key to 1
		else:
			dict[fileLine] = 1

#fetches the key with the highest value
#winner = max(dict, key=lambda k: dict[k])

'''alternative method
winnerVal = max(dict.values())
winner = ''

for key, value in dict.items():
	if value == winnerVal:
		winner = key'''

#checks if tie or if there is a winner
def checkTie(myDict):
	winner = ''
	tie = False
	max_val = max(myDict.values()) #gets max value from dict
	max_keys = [key for key, value in myDict.items() if value == max_val] #throws all keys with max value in list
	if len(max_keys) > 1: #if more than one, its tie
		tie = True
	if tie: 
		print('It\'s a Tie!')
	else: #else print key
		for key, value in dict.items():
			if value == max_val:
				winner = key
				print(winner)
	
checkTie(dict)