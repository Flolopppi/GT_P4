const nums = [2, 3, 4, 5, 6, 7, 8, 9, 10];

const isPrimeNumber = (num: number): boolean => {
  for (let i = 2; i < num; i++) {
    if (num % i === 0) {
      return false;
    }
  }

  return true;
};

const cutOutPrimes = (numsArr: number[]) => {
  // mache nums zu einem array OHNE vielfache der aktuellen PrimZahl
  const primeNums: number[] = [];
  let nums = [...numsArr];

  for (let i = 0; i < nums.length; i++) {
    if (isPrimeNumber(nums[i])) {
      primeNums.push(nums[i]);
    }
  }

  console.log("start primeNums: ", primeNums);
  console.log("start nums: ", nums);
  console.log("----------");

  primeNums.forEach((primeNum, index) => {
    for (const num of nums) {
      console.log(nums);

      if (num !== primeNum && num % primeNum === 0) {
        nums.splice(nums.indexOf(num, 1));
      }

      //   nums.forEach(() => {
      //     console.log(nums);

      //     nums = nums.filter((num) => {
      //       return !(num !== primeNum && num % primeNum === 0);
      //     });
      //   });
    }

    if (index === 0) {
      console.log(nums);
    }

    console.log(
      nums,
      "after iteration: " + index + " with primeNumber: ",
      primeNum
    );
  });

  console.log("----------");
  console.log("end primeNumber: ", primeNums);
  console.log("end nums: ", nums);
  console.log("\n");
};

cutOutPrimes(nums);
