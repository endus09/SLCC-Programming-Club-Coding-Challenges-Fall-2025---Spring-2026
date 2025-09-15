#include <stdio.h>
#include <stdbool.h>

bool validPhoneNumber(const char* phoneNumber){
    // WRITE YOUR CODE HERE
    return false;
}

void test(const char* x, bool t){
    printf("%s\n\texpected: %s\n\tactual: %s\n", x, t ? "true" : "false", validPhoneNumber(x) ? "true" : "false");
}

int main() {
    const char* p1 = "(1234) 213-5543";  // false
    const char* p2 = "(123)-456-7890";   // false
    const char* p3 = "Hello world";      // false
    const char* p4 = "(123) 456-78901";  // false
    const char* p5 = "100 780-8999"; 	 // false
    const char* p6 = "1207908797"; 		 // false
    const char* p7 = "(120)7908797"; 	 // false
    const char* p8 = "(120)423-8888"; 	 // false
    const char* p9 = "520-999-7856"; 	 // false
    const char* p10 = "(321) 654-9870";  // true
    const char* p11 = "(123) 456-7890";  // true

    test(p1, false);
    test(p2, false);
    test(p3, false);
    test(p4, false);
    test(p5, false);
    test(p6, false);
    test(p7, false);
    test(p8, false);
    test(p9, false);
    test(p10, true);
    test(p11, true);
}
