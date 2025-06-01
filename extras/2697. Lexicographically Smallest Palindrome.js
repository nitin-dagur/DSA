function makeSmallestPalindrome(s) {
    let arr = s.split('');
    let n = arr.length;
    let i = 0, j = n - 1;

    while (i < j) {
        if (arr[i] !== arr[j]) {
            // Replace the lexicographically larger character
            let smaller = arr[i] < arr[j] ? arr[i] : arr[j];
            arr[i] = arr[j] = smaller;
        }
        i++;
        j--;
    }
    return arr.join('');
}

// Example usage:
console.log(makeSmallestPalindrome("egcfe")); // Output: "efcfe"
console.log(makeSmallestPalindrome("abcd"));  // Output: "abba"
console.log(makeSmallestPalindrome("seven")); // Output: "neven"
