// call(), apply() and bind() methods are used for function borrowing.

// an object can use method belonging to other object.

// arguments can also be passed to the function with current data value.

// call() method

let student1={
    firstName:"bill",
    lastName:"gates",
    printFullName:function () {
        console.log(this.firstName+" "+this.lastName);
    }
}
let student2={
    firstName:"elon",
    lastName:"musk"
}
student1.printFullName();   // output: bill gates
student1.printFullName.call(student2);  // output: elon musk


// call() and apply() serves the same purpose except the way it accepts the arguments i.e. call() takes arguments individually while apply() takes an array of arguments.

let student1={
    firstName:"bill",
    lastName:"gates",
    printFullName:function (hometown,company) {
        console.log(this.firstName+" "+this.lastName+" "+hometown+" "+company);
    }
}
let student2={
    firstName:"elon",
    lastName:"musk"
}
student1.printFullName("seattle","microsoft");  // bill gates seattle microsoft
student1.printFullName.call(student2,"pretoria","spacex");  //elon musk pretoria spacex
student1.printFullName.apply(student2,["pretoria","spacex"]);   // elon musk pretoria spacex


// bind() method bind the borrowed function to given object by creating a copy as new function that can be invoked later any time.

let student1={
    firstName:"bill",
    lastName:"gates",
    printFullName:function (hometown,company) {
        console.log(this.firstName+" "+this.lastName+" "+hometown+" "+company);
    }
}
let student2={
    firstName:"elon",
    lastName:"musk"
}

let printFullName2=student1.printFullName.bind(student2,"pretoria","spacex");
printFullName2();   // elon musk pretoria spacex
