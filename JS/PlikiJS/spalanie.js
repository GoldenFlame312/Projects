function licz()
{
let litr=document.getElementById("litr").value;
let odleglosc=document.getElementById("odleglosc").value;
let zuzycie=(litr/odleglosc)*100;
document.getElementById("sum").innerHTML=(litr/odleglosc)*100;

document.getElementById("sum1").innerHTML=(litr/zuzycie)*100;

document.getElementById("sum2").innerHTML=zuzycie*odleglosc;
}