function and(a,b) {
  if (a === 1 && b === 1) {
    return 1
  } else {
    return 0
  }
}

function or(a,b) {
  if (a === 1)
    return 1
  if (b === 1)
    return 1
  else
    return 0
}

function xor(a,b) {
  if (and(a,b))
    return 0;
  return or(a,b);
}

function not(a) {
  if (a === 0)
    return 1
  else
    return 0
}

function nand(a,b) {
  return not(and(a, b))
}

function nor(a,b) {
  return not(or(a,b))
}

