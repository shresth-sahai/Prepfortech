"""
Given an array of names of candidates in an election. A candidate name in the array represents a vote cast
to the candidate. Print the name of candidates who received the maximum vote. If there is a tie,
print a lexicographically smaller name.
Examples:
Input :  votes[] = {"john", "johnny", "jackie",
                    "johnny", "john", "jackie",
                    "jamie", "jamie", "john",
                    "johnny", "jamie", "johnny",
                    "john"};
Output : John
We have four Candidates with name as 'John',
'Johnny', 'jamie', 'jackie'. The candidates
John and Johny get maximum votes. Since John
is alphabetically smaller, we print it.
"""
from collections import defaultdict

def solution(votes):
    count = defaultdict(int)
    for i in votes:
        count[i] += 1

    max_vote = -1
    winner = ""

    for candidate, vote_count in count.items():
        if vote_count > max_vote:
            max_vote = vote_count
            winner = candidate
        elif vote_count == max_vote and candidate < winner:
            winner = candidate
    return winner

