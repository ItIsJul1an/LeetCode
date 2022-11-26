const countOdds = (low: number, high: number): number => {
    return Math.floor((high - low) / 2) + (low % 2 || high % 2 ? 1 : 0)
}

console.log(countOdds(3, 7))