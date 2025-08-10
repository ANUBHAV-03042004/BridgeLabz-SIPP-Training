package aidrivenresumescreeningsystem;

//Generic Resume class
class Resume<T extends JobRole> {
 private T role;

 public Resume(T role) {
     this.role = role;
 }

 public T getRole() {
     return role;
 }
}

