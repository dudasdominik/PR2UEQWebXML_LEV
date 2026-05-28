let orarend = {
  "orarend": {
    "ora": [
      {
        "id": "01",
        "tipus": "Előadás",
        "datum": "2026.04.10",
        "targy": "Webkönyvtárak",
        "idopont": {
          "nap": "péntek",
          "tol": "13:30",
          "ig": "17:30"
        },
        "helyszin": "Informatikaterem 124-es",
        "oktato": "Dr. Bednarik László",
        "szak": "Programtervező informatikus levelező"
      },
      {
        "id": "02",
        "tipus": "Elmélet",
        "datum": "2026.04.17",
        "targy": "Valószínűségszámítás és statisztika",
        "idopont": {
          "nap": "péntek",
          "tol": "13:30",
          "ig": "17:30"
        },
        "helyszin": "Tanterem 130-as",
        "oktato": "Kucsinka Katalin",
        "szak": "Programtervező informatikus levelező"
      },
      {
        "id": "03",
        "tipus": "Gyakorlat",
        "datum": "2026.04.24",
        "targy": "Fordítóprogramok",
        "idopont": {
          "nap": "péntek",
          "tol": "13:30",
          "ig": "17:30"
        },
        "helyszin": "Online",
        "oktato": "Dr. Túri József Attila",
        "szak": "Programtervező informatikus levelező"
      },
      {
        "id": "04",
        "tipus": "Elmélet",
        "datum": "2026.04.24",
        "targy": "Hálózati architektúrák és protokollok",
        "idopont": {
          "nap": "szombat",
          "tol": "13:30",
          "ig": "17:30"
        },
        "helyszin": "Online",
        "oktato": "Dr. Mileff Péter",
        "szak": "Programtervező informatikus levelező"
      }
    ]
  }
}

function JSONReader(json) {
  let ora = json.orarend.ora;

    for (let i = 0; i < ora.length; i++) {
        console.log("\n")
        console.log("---------------");
        console.log("Típus: " + ora[i].tipus);
        console.log("Dátum: " + ora[i].datum);
        console.log("Tárgy: " + ora[i].targy);
        console.log("Időpont: " + ora[i].idopont.nap + " " + ora[i].idopont.tol + "-" + ora[i].idopont.ig);
        console.log("Helyszín: " + ora[i].helyszin);
        console.log("Oktató: " + ora[i].oktato);
        console.log("Szak: " + ora[i].szak);
    }
}

JSONReader(orarend);


