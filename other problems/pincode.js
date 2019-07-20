// Extracting Pincode from Address String

function getPincode(address) {
  let pincode = address.match(/\d{6}/)[0];
  console.log(pincode);
}

getPincode("RC-181 Prem Vihar Khora colony Gzb, Uttar Pradesh-201309");
