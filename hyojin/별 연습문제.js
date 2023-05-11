//1.직사각형





for (let i = 0; i < 10; i++){ 
  for(let j = 0; j < 10; j++) {
    star = star + '*';
  }
  star = star + '\n'; //<br/>
}
console.log(star);


// [object SVGGElement]**********
// **********
// **********
// **********
// **********
// **********
// **********
// **********
// **********
// **********
// 2.직삼각형




for(let i = 1; i <= 10; i++){

    let star = '';
    for(let j = 1; j <= i; j++){

        star = star + '*';

    }

    console.log(star);

}


// instrument.ts:113 *
// instrument.ts:113 **
// instrument.ts:113 ***
// instrument.ts:113 ****
// instrument.ts:113 *****
// instrument.ts:113 ******
// instrument.ts:113 *******
// instrument.ts:113 ********
// instrument.ts:113 *********
// instrument.ts:113 **********

//3.역 직삼각형
for(let i = 1; i <= 10; i++){

    let star = '';

    for(let j = 1; j <= 10 -i + 1; j++){

        star = star + '*';

    }

    console.log(star);

}



// instrument.ts:113 **********
// instrument.ts:113 *********
// instrument.ts:113 ********
// instrument.ts:113 *******
// instrument.ts:113 ******
// instrument.ts:113 *****
// instrument.ts:113 ****
// instrument.ts:113 ***
// instrument.ts:113 **
// instrument.ts:113 *

// 4.역 직삼각형2


for(let i = 1; i <= 10; i++){

    let star = '';

    for(let j = 1; j <= i - 1; j++){

        star = star + ' '; 

    }

    for(let k = 1; k <= 10 - i + 1; k++){

        star = star + '*';

    }

    console.log(star);

}


// instrument.ts:113 **********
// instrument.ts:113  *********
// instrument.ts:113   ********
// instrument.ts:113    *******
// instrument.ts:113     ******
// instrument.ts:113      *****
// instrument.ts:113       ****
// instrument.ts:113        ***
// instrument.ts:113         **
// instrument.ts:113          *

for(let i = 1; i <= 10; i++){

    let star = '';

    for(let j = 1; j <= 10 - i; j++){

        star = star + ' ';

    }

    for(let k = 1; k <= i; k++){

        star = star + '*';

    }

    console.log(star);

}

// 5.피라미드



let line = 10;
let star = '';

for(i = 0; i < line; i++) {
	for(j = line; j > i; j--) {
        star = star + ' ';
    }
  	for(k = 0; k < (2*i)+1; k++){
        star = star + '*';
    }
    star = star + '\n'; //<br/>
}
console.log(star);





// 6. 다이아몬드/ */

let line = 10;
let star = '';

for(i = 0; i < line; i++) {
	for(j = line; j > i; j--) {
        star = star + ' ';
    }
  	for(k = 0; k < (2*i)+1; k++){
        star = star + '*';
    }
    star = star + '\n'; //<br/>
}


for (var i = (line*2) - 1 ; i >= 1; i -= 2) {
  for (var j = 1; j < ((line * 2) - i) / 2; j++) {
    star += " ";
}
  for (var l = i; l >= 1; l--) {
    star += "*";
  }
  for (var k = 1; k < ((line * 2) - i) / 2; k++) {
    star += " ";
  }
  star += "\n";
}
console.log(star);

//7.별

let line = 10;
let star = '';
let line2 = 20;

for(i = 0; i < line; i++) {
	for(j = line+9; j > i; j--) {
        star = star + ' ';
    }
  	for(k = 0; k < (2*i)+1; k++){
        star = star + '*';
    }
    star = star + '\n'; //<br/>
}


for (i = (line2*2) - 1 ; i >= 20; i -= 2) {
  for ( j = 1; j < ((line2 * 2) - i) / 2; j++) {
    star += " ";
}
  for ( l = i; l >= 1; l--) {
    star += "*";
  }
  for ( k = 1; k < ((line2 * 2) - i) / 2; k++) {
    star += " ";
  }
  star += "\n";
}
console.log(star);

let line3 = 15;

for (let i = 1; i <= line3; i++) {
    let star = "";
    for (let j = 1; j <= i; j++) {

        star  = star  + "*";
  
    }
  
    for (let k = 1; k <= line3 * 2 - 1 - 2 * i; k++) {
  
        star  = star + " ";
  
    }
  
    if (i < line3) {
  
      for (l = 1; l <= i; l++) {
  
        star  = star  + "*";
  
      }
  
    } else {
  
      for (l = 1; l < line3; l++) {
  
        star  = star  + "*";
  
      }
  
    }
  
    console.log(star);
  
  }

  for (i = (line2*2) - 1 ; i >= 20; i -= 2) {
    for ( j = 1; j < ((line2 * 2) - i) / 2; j++) {
      star += " ";
  }
    for ( l = i; l >= 1; l--) {
      star += "*";
    }
    for ( k = 1; k < ((line2 * 2) - i) / 2; k++) {
      star += " ";
      
      
    }
    
    
    
    star += "\n";
  }

  class Temp