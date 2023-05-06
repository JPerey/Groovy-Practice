// Practicing annotations using Internal groovy packages
// definition - annotations provide information to the compiler on what kind of class the following 
// class will be
// "def" keyword definition - way to define a variable or method/ function so that it cna be dynamically typed i.e. can change the type of data the variable holds or the type of data the method returns

// import groovy.transform.Sortable
import groovy.transform.Immutable
@Immutable
class Dog {

    String name
    String gender
    int age

    static void GoodDog(gender){
        if(gender == "male"){
            println("He is a good boy!")
        } else{
           println("She is a good girl!") 
        }
    }

}


Dog chloe = new Dog(name: "Chloe", gender: "female", age: 5)
Dog viking = new Dog(name: "Viking", gender: "male", age: 4)

chloe.GoodDog("female")
viking.GoodDog("male")

chloe.name = "new chloe"