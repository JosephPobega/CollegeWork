INCLUDE Irvine32.inc
.data
        prompt1 BYTE "Array3 after addition:",0
        prompt2 BYTE "Array3 after subtraction:",0
        array1 BYTE 10,11,12
        array2 BYTE 7,9,11
        array3 BYTE 3 DUP(0)
.code
main PROC
        
        mov esi,OFFSET array1                                   
        mov edi,OFFSET array2                                   
        mov ebp,OFFSET array3                                   
                                                                                        
        mov eax,0
        add al,[esi]
        add al,[edi]
        mov [ebp],al
                                                        
        mov eax,0
        add al,[esi+1]
        add al,[edi+1]
        mov [ebp+1],al                                                                          
        mov eax,0
        add al,[esi+2]
        add al,[edi+2]
        mov [ebp+2],al
                                
        mov edx, OFFSET prompt1                                                 
        call WriteString
        call Crlf                                                                                                     
        mov eax,0                                                               
        mov al,[ebp]
        call WriteInt
        call Crlf                                                              

        mov eax,0                                                              
        mov al,[ebp+1]
        call WriteInt
        call Crlf                                                                      
                                                        
        mov eax,0                                                               
        mov al,[ebp+2]
        call WriteInt
        call Crlf                                                               

        mov eax,0                                                               
        add al,[esi]
        sub al,[edi]
        mov [ebp],al

        mov eax,0                                                                                                                     
        add al,[esi+1]
        sub al,[edi+1]
        mov [ebp+1],al

        mov eax,0                                                                             
        add al,[esi+2]
        sub al,[edi+2]
        mov [ebp+2],al

        mov edx, OFFSET prompt2                                              
        call WriteString
        call Crlf                                                             

        mov eax,0                                                               
        mov al,[ebp]
        call WriteInt
        call Crlf                                                              

        mov eax,0                                                               
        mov al,[ebp+1]
        call WriteInt
        call Crlf                                                               

        mov eax,0                                                               
        mov al,[ebp+2]
        call WriteInt
        call Crlf                                                              

        call WaitMsg                                                           
exit

main ENDP

END main
