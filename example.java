class ExceptionThrow {
    public static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }
}

class Example {
    int salary;

    Example(int salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }
        this.salary = salary;
        System.out.println("Salary: " + salary);
    }
}

public class example {
    public static void main(String[] args) {
        // Static method call (no object needed)
        ExceptionThrow.checkAge(20); // ✅ works fine
        // ExceptionThrow.checkAge(16); // ❌ would throw ArithmeticException

        try {
            Example obj = new Example(-5000); // ❌ will throw exception
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Valid salary
        Example obj2 = new Example(30000); // ✅ works fine
    }
}
