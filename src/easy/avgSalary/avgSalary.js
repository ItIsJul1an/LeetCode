var average = function (salary) {
    salary = salary.sort(function (a, b) { return a - b; });
    var sum = 0;
    salary.forEach(function (value) { return sum += value; });
    sum = sum - salary[0];
    sum = sum - salary[salary.length - 1];
    return sum / (salary.length - 2);
};
console.log(average([4000, 3000, 1000, 2000]));
console.log(average([1000, 2000, 3000]));
