const hammingWeight = (n: number): number => {
    return n.toString(2).split('').filter(n => n !== '0').length
}

console.log(hammingWeight(100000001111100000))