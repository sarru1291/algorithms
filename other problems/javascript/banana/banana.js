console.log(('b'+'a'+ +'a'+'a').toLowerCase()); 
// output: banana

/* 
  +'a' resolves to NaN ("Not a Number") because 
  it attempts to convert 'a' character to a number 
  using unary plus operator, while 'a' is not a 
  number the result is NaN ("Not a Number"). 
*/

// here, 
	console.log('ba'+(+'a')+'a') // output: 'baNaNa'

// then, 'baNaNa'.toLowerCase() => 'banana'