# Stack Implementations

### Expression Evaluation Using Stack

humans uses infix syntax to solve expressions but computers uses postfix(suffix or reverse polish notation) or prefix(polish notation)

infix : Disadvantage

- uses parentheses
- need precedence

- infix: 5+5
- postfix: 5 5 +
- prefix: + 5 5

ex. infix to postfix

- infix: 4+7 _2
  (4) +(7 2 _)
  (4) (7 2 \*) +
- postfix: 4 7 2 \* +

the computer will fist evaluate 7 2 \* then add the result to 4

ex.infix to postfix
infix: A/B +4
postfix: a b / 4 +

ex.infix to postfix
infix: (5+2)_3
postfix: 5 2 + 3 _

ex.infix to postfix
infix: (A*B)+(C/D)
(AB*)+(CD/)
(AB*)(CD/)+
postfix: A B * C D / +

ex.infix to postfix
infix: 5/5+2-1*9
(5 5 /) 2 + -(1 9 *)
(5 5 /) 2+ (1 9 \*) -

postfix: 5 5/ 2 + 1 9 _ -
prefix: - + / 5 5 2 _ 1 9

How the stack works to solve this? it starts from left to right pushing the elements until it find the first operant then it will pop the previous element and do the operant on them in the prev example it will push 5 then 5 [ 5,5] then it will find '/' so it will pop the two fives and find the expression evaluation for them 5/5=1 then it pushes the result back again into the stack
so the stack has 1 [1]
now it continuos with 2 added to the stack [1 , 2] then it finds the "+" so it pops the 1 and 2 and sum them and return the result 3 [3] then it continuos it pushed 1 then 9 [3,1,9] then it finds the "\*" operator so it pops the last two elements and multiplicate them and returns the result 9 [3,9] then it continuos finding "-" operator so it pops 3 and 9 and return the result -6 to the stack and this is the final answer.

## INFIX TO POSTFIX

how the compiler uses the stack to convert infix to postfix

ex.
infix:2 \* 4 - 2

the compiler only pushed the `operators` to the stack
starting from left to right it first finds 2 so id doesn't pushes it because it's not an operator so it keeps it aside, then it finds the _ operator so it pushes it to the stack then it finds 4 so it puts it aside with the 2 so we have {2 4} now the stack finds the - operator but the stack already has the _ operator in it which is higher order than the - operator so it pops the _ operator and puts it with the 2 4 {2 4 _} then it finds the 2 {2 4 _ 2} at the end it pops the operators from the stack so we have {2 4 _ 2-}

ex.
infix:8 / 2 + 7 - 4 \* 2

aside stack

1. 8 {8} []
2. / {8} [/] //pushes the first operator
3. 2 {8 2} [/]
4. - {8 2 /} [+] pops the / operator because the + operator is less priority than the /
5. 7 {8 2 / 7} [+]
6. - {8 2 / 7 +} [-] pops the + operator because the - operator is not higher priority than the + operator
7. 4 {8 2 / 7 + 4} [-]
8. - {8 2 / 7 + 4} [- *] pushed the \* operator because it's higher priority than the - operator
9. 2 {8 2 / 7 + 4 2 } [- *]
10. 2 {8 2 / 7 + 4 2 _ -} [] at the end it pops the remaining operator from the top
    postfix: 8 2 / 7 + 4 2 _ -

ex.
infix: 10 \* ( 2 + 1 + 5 ) / 2 - 1

aside { } , stack [ ]

1. 10 {10} []
2. "+" {10} [*]
3. ( {10} [* ( ] pushed the ( operator becaus it's higher priority than the \*
4. 2 {10 2} [ * ( ]
5. "+" {10 2 } [* ( +] the "(" is special case you don't pop it until you find its closing ")" and it behaves like a block
6. 1 {10 2 1} [* ( +]
7. "+" {10 2 1 +} [* ( +] pop the + and add the other one
8. 5 {10 2 1 +5} [* ( +]
9. ) {10 2 1 +5 + } [*] pop everything between the parentheses
10. / {10 2 1 +5 + \* } [/]
11. 2{10 2 1 +5 + \* 2} [/]
12. -{10 2 1 +5 + \* 2 / } [-]
13. 1{10 2 1 +5 + \* 2 / 1} [-]
14. {10 2 1 +5 + \* 2 / 1-} []
    postfix:10 2 1 +5 + \* 2 / 1-

infix: 2+8((8+2*3)/2)-1
postfix:2 8 2 3 * + 2 / + 1-
