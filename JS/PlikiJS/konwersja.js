function licz()
{
let uzy =document.getElementById("uzy").value;
let first=document.getElementById("first").value;
let second=document.getElementById("second").value;
let third=document.getElementById("third").value;
let fourth=document.getElementById("fourth").value;
let fifth=document.getElementById("fifth").value;
let lista=document.getElementById("lista").value;


if(lista==first)
{
let met=uzy*1000;
let decy=uzy*10000;
let centy=uzy*100000;
let mili=uzy*1000000;
document.getElementById("sum").innerHTML=met;
document.getElementById("sum1").innerHTML=decy;
document.getElementById("sum2").innerHTML=centy;
document.getElementById("sum3").innerHTML=mili;
}
if(lista==second)
{
    let kil=uzy/1000;
   // let met=uzy*1000;
    let decy=uzy*10;
    let centy=uzy*100;
    let mili=uzy*1000;
    //document.getElementById("sum").innerHTML=met;
    document.getElementById("sum1").innerHTML=decy;
    document.getElementById("sum2").innerHTML=centy;
    document.getElementById("sum3").innerHTML=mili;
    document.getElementById("sum4").innerHTML=kil;

}
if(lista==third)
{
    let kil=uzy/10000;
    let met=uzy/10;
    //let decy=uzy*10;
    let centy=uzy*10;
    let mili=uzy*100;
    document.getElementById("sum").innerHTML=met;
    //document.getElementById("sum1").innerHTML=;
    document.getElementById("sum2").innerHTML=centy;
    document.getElementById("sum3").innerHTML=mili;
    document.getElementById("sum4").innerHTML=kil;

}
if(lista==fourth)
{
    let kil=uzy/100000;
    let met=uzy/100;
    let decy=uzy/10;
    //let centy=uzy*10;
    let mili=uzy*10;
    document.getElementById("sum").innerHTML=met;
    document.getElementById("sum1").innerHTML=decy;
    //document.getElementById("sum2").innerHTML=centy;
    document.getElementById("sum3").innerHTML=mili;
    document.getElementById("sum4").innerHTML=kil;

}
if(lista==fifth)
{
    let kil=uzy*0.000001;
    let met=uzy/1000;
    let decy=uzy/100;
    let centy=uzy*0.1;
    //let mili=uzy*10;
    document.getElementById("sum").innerHTML=met;
    document.getElementById("sum1").innerHTML=decy;
    document.getElementById("sum2").innerHTML=centy;
    //document.getElementById("sum3").innerHTML=mili;
    document.getElementById("sum4").innerHTML=kil;

}
}