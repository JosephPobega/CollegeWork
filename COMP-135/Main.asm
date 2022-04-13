INCLUDE Irvine32.inc

.data

//This is 32 Bit Signed Integer
prompt BYTE "Enter a 32-bit signed integer:",0
resultMsg BYTE "Sum of 2 integers is:",0
int1 DWORD ?
int2 DWORD ?
sum DWORD ?

.code
main PROC
   MOV ECX, 3
   L1:
       call Clrscr

       ;Move cursor to mid screen
       MOV DH, 13   ;y-coordinate range 0-24
       MOV DL, 40   ;x-coordinate range 0-79
       CALL GoToXY   ;locate cursor

       MOV EDX, OFFSET prompt   ;Display prompt
       CALL WriteString
       CALL ReadInt   ;Read integer
       MOV int1,EAX

       CALL WriteString
       CALL ReadInt   ;Read integer
       MOV int2,EAX

       ;calculate sum
       MOV EAX, int1
       ADD EAX, int2
       MOV sum, EAX

       ;display sum
       MOV EDX, OFFSET resultMsg
       call WriteString
       MOV EAX, sum
       call WriteInt
       call Crlf
       call WaitMsg

   LOOP L1

   exit
main ENDP

END main