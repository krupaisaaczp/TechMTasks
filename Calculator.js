document.addEventListener("DOMContentLoaded", function () {
    
    function getValues() {
        let a = parseFloat(document.getElementById("num1").value) || 0;
        let b = parseFloat(document.getElementById("num2").value) || 0;
        return { a, b };
    }

    
    function updateResult(text) {
        document.getElementById("result").innerText = text;
    }

    
    document.getElementById("add").addEventListener("click", function () {
        let { a, b } = getValues();
        updateResult(`Result: ${a + b}`);
    });

    document.getElementById("sub").addEventListener("click", function () {
        let { a, b } = getValues();
        updateResult(`Result: ${a - b}`);
    });

    document.getElementById("mul").addEventListener("click", function () {
        let { a, b } = getValues();
        updateResult(`Result: ${a * b}`);
    });

    document.getElementById("div").addEventListener("click", function () {
        let { a, b } = getValues();
        if (b === 0) {
            updateResult("Cannot divide by zero!");
        } else {
            updateResult(`Result: ${a / b}`);
        }
    });

    document.getElementById("reverse").addEventListener("click", function () {
        let { a } = getValues();
        updateResult(`Reversed: ${a.toString().split("").reverse().join("")}`);
    });
});
