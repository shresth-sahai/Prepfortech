"""
Tiger Zinda Hai

Rohan is downloading the movie Tiger Zinda Hai using a torrent website, but he is new to torrent, so he doesn't
know the difference between a fake download button and a real download button; therefore, he keeps pressing every
button in excitement.
Now he has clicked N  buttons, and many tabs are opened, if an opened tab is clicked again then it closes it.
Your task is to tell how many tabs are open at the end.

END means close everything
Example 1:

Input : Arr[] = {"1", "2", "1", "END", "2"}
Output : 1

arr–{“1”,”2”,”END”}
op–0
Explanation:
In the above test case, firstly tab
1st is opened then 2nd is opened then
1st is closed then all are closed
then again 2nd is opened.

"""

def solution(arr):
    open_tab = set()
    for i in arr:
        if i == "END":
            open_tab.clear()
        elif i in open_tab:
            open_tab.remove(i)
        else:
            open_tab.add(i)
    return len(open_tab)