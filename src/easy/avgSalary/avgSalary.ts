const average = (salary: number[]): number => {
    salary = salary.sort((a, b) => a - b)

    let sum = 0

    salary.forEach(value => sum += value)

    sum = sum - salary[0]
    sum = sum - salary[salary.length - 1]

    return sum / (salary.length - 2)
}

console.log(average([4000, 3000, 1000, 2000]))
console.log(average([1000, 2000, 3000]))