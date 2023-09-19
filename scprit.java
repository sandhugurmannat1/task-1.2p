<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>JavaScript Concepts</title>
</head>
<body>
    <script>
        // String methods
        const str = "Hello, World!";
        console.log(str.length); 
        console.log(str.toUpperCase());
        console.log(str.indexOf("World")); 
        console.log(str.slice(0, 5));

        // Number methods
        const num = 42.6789;
        console.log(num.toFixed(2)); 
        console.log(parseInt("12345")); 
        console.log(parseFloat("3.14")); 
        console.log(num.toPrecision(3)); 

        // Array methods
        const arr = [1, 2, 3, 4, 5];
        console.log(arr.join(", ")); 
        console.log(arr.push(6)); 
        console.log(arr.pop()); 
        console.log(arr.reverse()); 
        console.log(arr.includes(3)); 

        // Date methods
        const date = new Date();
        console.log(date.getFullYear()); 
        console.log(date.getMonth()); 
        console.log(date.getDate()); 
        console.log(date.getHours()); 
        console.log(date.getMinutes()); 

        // Function methods
        function greet(name) {
            console.log(`Hello, ${name}!`);
        }
        const sayHi = greet.bind(null, "John");
        sayHi(); 
    </script>
</body>
</html>
