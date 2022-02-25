import UIKit

/// linkedList is used to create our stack
/// lets create a node with a value and a next node
class Node<T> {
    let value: T
    var next: Node?
    
    // initialize the node class with a self.value
    init(value: T){
        self.value = value
    }
}

class Stack<T> {
    
    /// creata a top node
    var top: Node<T>?
    
    /// push a value to the stack
    func push(_ value: T) {
        
        let oldTop = top
        top = Node(value: value)
        top?.next = oldTop
    }
    
    // remote the value from the top of the stack
    /// the return value can be optional since the stack can be nil
    func pop() -> T? {
        let currentTop = top
        top = top?.next
        return currentTop?.value
    }
    
    
    /// peek to get the top value from the stack
    func peek()->T? {
        return top?.value
    }
    
}

struct User {
    let name: String
    let age: Int
}

let userStack = Stack<User>()
let me = User(name: "Joe", age: 30)
let you = User(name: "Alex", age: 23)
userStack.push(me)
userStack.push(you)

let firstuser = userStack.pop()
let secondUser = userStack.pop()

///using the nil coalescing for default value
print(firstuser?.name ?? "No user found!")
print(firstuser?.age ?? "")

print(secondUser?.name ?? "No name")
print(secondUser?.age ?? "")




let stack = Stack<Int>()
stack.push(1)
stack.push(2)
stack.push(3)

let firstPop = stack.pop() // this should return 3 since 3 is the top of the stack
let secondPop = stack.pop()
stack.peek()
let thirdPop = stack.pop()
let fourthPop = stack.pop()



///Binary Search tree
///

