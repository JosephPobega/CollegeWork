INCLUDE Irvine32.inc
  

.386
.model flat, stdcall
.stack 4096
ExitProcess PROTO, deExitCode:DWORD

.data
	prompt byte "please enter your name: ",0
	myvar byte 20 DUP(?)
	bytecount DWORD ?

.code
main PROC
	mov edx, offset prompt
	call writestring

	mov edx, offset myvar
	mov ecx, sizeof myvar
	call readstring

	mov bytecount,eax

	call writestring
	call writedec
	

main ENDP
END main
