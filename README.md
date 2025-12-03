https://adventofcode.com/2025

From Day 2 puzzle 
  1. String Manipulation & Parsing
     a. Since numbers in programming languages don't easily allow you to access repeating sequences, string operations are essential.
  2. Here I attempted bruteforce but the list of invalid Ids will always be a small set so generating those id's all at once and storing then in hashMap, O(RxM)     
  4. iterating thru the invalidId and then check  if the id is in the range [< && >] -> O(N)
From Day 3 puzzle :
  1. i used a sort of greedy strategy with O(NxM) where i first found the highest number and then started searching for the second highest from that place.
  2. i used the greedy strategy where i pick the highest numbers one by one from left.
