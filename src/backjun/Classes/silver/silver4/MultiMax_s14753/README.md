## MultiMax 출처다국어분류 Silver IV

난이도 제공: solved.ac

시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율

1 초	512 MB	2002	845	708	44.112%

문제

There are n cards, each with an integer on it where two or more cards can have the same integer. From these cards, we want to select two or three cards such that the product of numbers on the selected cards is maximum. For example, assume that there are 6 cards with numbers: 5, 10, -2, 3, 5, and 2. If we select three cards with numbers, 5, 10, and 5, then the product of the three numbers is 250, which is the maximum product. Let us consider another example of four cards with numbers: 10, 0, -5, 2. In this example, if we select two cards with numbers, 10 and 2, then the product of these two numbers is 20, which is the maximum product.

Given n numbers on cards, write a program to compute the maximum product of numbers on two or three cards.

입력

Your program is to read from standard input. The input starts with a line containing an integer, n (3 ≤ n ≤ 10,000), where n is the number of cards. In the following line, n numbers on the cards are given. These numbers are integers between -1,000 and 1,000 inclusively.

출력

Your program is to write to standard output. Print exactly one line which contains the maximum product.

예제 입력 1

6

5 10 -2 3 5 2

예제 출력 1

250

예제 입력 2

4

10 0 -5 2

예제 출력 2

20

출처

ICPC > Regionals > Asia Pacific > Korea > Nationwide Internet Competition > Daejeon Nationalwide Internet Competition 2017 H번

데이터를 만든 사람: ntopia