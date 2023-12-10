
// stworzylem zmienne // 
let nazwa; 
let godzina;
let minuta;
let nr = 0;
let id = 1;
// stworzylem tablice ktora ma w sobie wszystkie Lekcje ktore sa nie zmienne //
let table = ['Lekcja 1 - 07:40', 'Lekcja 2 - 08:20', 'Lekcja 3 - 09:10', 'Lekcja 4 - 10:10', 'Lekcja 5 - 11:10', 'Lekcja 6 - 12:10'];

// tworze fukcje w ktorej za pomoca klikniecia Przycisku OK wyswietlam wpisane dane // 
document.getElementById('acc').addEventListener('click', ()=>{
    nazwa = document.getElementById('nazwa').value;
    godzina = document.getElementById('godzina').value;
    minuta = document.getElementById('minuta').value;

    text = (nazwa+' - '+godzina+':'+minuta);
    table.push(text);
    ladowanie();
});
// tworze fukcje ktora bedzie dopisywala zawsze jedno wiecej id przy kazdej lekcji // 
function ladowanie(){
    while(table.length > nr){
        document.getElementById('lekcje').innerHTML += ('<h3>  '+id+': '+table[nr]+'</h3>');

        id++;
        nr++;
    }
}


