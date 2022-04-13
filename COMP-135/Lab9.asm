INCLUDE Irvine32.inc


.data

prompt1 BYTE "This is array1",0
prompt2 BYTE "This is array2",0
prompt3 BYTE "This is array3",0
array1 BYTE 253,254,255
array2 WORD 1000h,2000h,3000h
array3 DWORD 0FFFFFFFDh,0FFFFFFFEh,0FFFFFFFFh


.code

main PROC

   xor eax,eax
   xor ebx,ebx
   xor ecx,ecx
   xor edx,edx
  

   mov edx,offset prompt1
   call writestring
   call crlf       


   mov ecx,3      
   lea esi,array1   
disp1:
   mov al,[esi]   
   call writedec   
   call crlf       
   inc esi           
   loop disp1       

   call crlf       

   mov edx,offset prompt2
   call writestring
   call crlf       

   mov ecx,3       
   lea esi,array2   
disp2:
   mov ax,[esi]   
   call writehex   
   call crlf       
   add esi,2       
   loop disp2       

   call crlf       

   mov edx,offset prompt3
   call writestring
   call crlf       

   mov ecx,3       
   lea esi,array3   
disp3:
   mov eax,[esi]   
   call writehex  
   call crlf      
   add esi,4       
   loop disp3       

   call crlf       
   call waitmsg   
INVOKE ExitProcess, 0
main ENDP
END main
