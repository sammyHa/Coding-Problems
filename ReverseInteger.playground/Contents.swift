import UIKit

func reverseInteger(number: inout Int) -> Int {
    var revered = 0
    
    while number > 0 {
        let reminder = number % 10
        revered = (revered * 10) + reminder
        number = number/10
    }
    return revered
}

var num = 123
print(reverseInteger(number: &num))
