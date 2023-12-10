function licz()
{
    let first=document.getElementById("first").value;
    let second=document.getElementById("second").value
    let lista=document.getElementById("lista").value;

    let first1=document.getElementById("first").value;
    let second2=document.getElementById("second").value
    let lista2=document.getElementById("lista").value;

let czas=document.getElementById("czas").value;
let dystans=document.getElementById("dystans").value;

let predkosc=dystans/czas;
if(lista==first &&lista2==first1 )
{
    let predkosc=dystans/czas;
document.getElementById("sum").innerHTML=predkosc;

document.getElementById("sum1").innerHTML=przeb/predkosc;
}

if(lista==second && lista2==second2)
{

    let dystans1=dystans*1000;
    let czas1=czas*3600;
    let predkosc1=dystans1/czas1;

    document.getElementById("sum").innerHTML=predkosc1;

    document.getElementById("sum1").innerHTML=przeb/predkosc1;

}
}