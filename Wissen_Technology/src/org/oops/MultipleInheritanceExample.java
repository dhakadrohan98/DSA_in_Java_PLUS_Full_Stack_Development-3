package org.oops;

interface Flying {
    String getName();
}

interface Swimming {
    String getName();
}

interface Running {
    String getName();
}

class Bird implements Flying, Swimming, Running {
    @Override
    public String getName() {
        return "I am a bird, who is flying, swimming and then running";
    }
}

public class MultipleInheritanceExample {
    public static void main(String[] args) {
        Bird bird = new Bird();
        
        // Calling the common method from both interfaces
        System.out.println(bird.getName());  // Outputs: I am a bird.
    }
}
