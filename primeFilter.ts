const nums = Array.from({ length: 999 }, (_, i) => i + 2);

const isPrimeNumber = (num: number): boolean => {
  for (let i = 2; i < num; i++) {
    if (num % i === 0) {
      return false;
    }
  }

  return true;
};

const cutOutPrimes = (numsArr: number[]) => {
  const primeNums: number[] = [];
  let nums = [...numsArr];

  for (let i = 0; i < nums.length; i++) {
    if (isPrimeNumber(nums[i])) {
      primeNums.push(nums[i]);
    }
  }

  primeNums.forEach((primeNum, index) => {
    for (const num of nums) {
      nums.forEach(() => {
        nums = nums.filter((num) => {
          return !(num !== primeNum && num % primeNum === 0);
        });
      });
    }
  });

  console.log(nums);
};

cutOutPrimes(nums);
