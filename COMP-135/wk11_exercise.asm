INCLUDE Irvine32.inc


.data

	array1 BYTE "Hello World", 0
	array2 BYTE SIZEOF array1 - 1 DUP(0)


.code

	main proc
	mov ecx, SIZEOF array1 - 1
	mov esi, OFFSET array1
	add esi, ecx
	dec esi
	mov edi, OFFSET array2
	LOOP1:
	mov eax, 0
	mov al, [esi]
	mov [edi], al
	dec esi
	inc edi
	Loop LOOP1
	mov edx, OFFSET array1
	call writestring
	call crlf
	mov edx, OFFSET array2
	call writestring


exit
main endp
end main
