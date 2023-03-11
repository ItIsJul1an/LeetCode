var hammingWeight = function (n) {
    return n.toString(2).split('').filter(function (n) { return n !== '0'; }).length;
};
console.log(hammingWeight(100000001111100000));
