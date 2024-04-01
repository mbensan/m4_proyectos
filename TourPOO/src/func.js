// 2, 3, 5, 7, 11, 13, 17, 19, 23, ...
// 1, 2, 3, 4, 5, 6, 7

function get_divisores (num) {
  let divisores = 0
  for (let i=1; i<=num; i++) {
    if ( (num / i) == Math.floor(num/i) ) {
      num++
    }
  }
  return divisores
}

function is_primo (num) {
  return get_divisores(num) === 2
}

console.log(is_primo(31));
console.log(is_primo(21));