let startTime = new Date();
        let lastUpdateTime = startTime;

        

        function updateDateTime() {
            let elapsedTime = Math.floor((now - startTime) / 1000);

            let godzina = getHours();
            let minuta = getMinutes();
            let sekunda = getSeconds()
            
            document.getElementById("sum").innerHTML=godzina+":"+minuta+":"+sekunda;
         
        }