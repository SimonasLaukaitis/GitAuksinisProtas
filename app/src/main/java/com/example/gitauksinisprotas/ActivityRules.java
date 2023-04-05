package com.example.gitauksinisprotas;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityRules extends AppCompatActivity {

    private TextView rulesTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_rules);

        rulesTextView = findViewById(R.id.txtRules);

        //https://www.youtube.com/watch?v=h6g4NpiC0i4&ab_channel=TechizVibe

        rulesTextView.setText(String.valueOf("I turas\n" +
                "Žaidimą pradeda 6 žaidėjai, pasidaliję į V ir T komandas. Kiekviena komanda, pasirenka po žaidimo figūrėlę ir pastato ant lentos auksinėje zonoje. I ture naudojamos kortelės, kuriose yra po 2 klausimus su 3 atsakymu variantais (kortelės nuo 1001 iki 1050). Į korteliu kaladę įmaišykite 5 džokerio korteles.\n" +
                "\tPastaba: šiame ture taip pat galima naudoti žaidimų ,,Auksinis Startas\" Nr. 1 ir Nr. 2 I turo korteles (Nr. 1 nuo 1 iki 50; Nr. 2 nuo 101 iki 150) bei džokerio korteles. Atsakymu į šių kortelių klausimus ieškokite žaidimų „Auksinis protas. Startas\" Nr. 1 ir Nr. 2 atsakymu knygelėse.\n" +
                "\tVienas asmuo, nepriklausantis jokiai komandai, veda žaidimą. Ištraukia kortelę užduota V komandau klausimą. Kai žaidėjai nežiūrėdami į komandos draugų atsakymus, užrašo pasirinktą variantą ant lapuko, patikrina atsakymus knygelėje. Užpildo taškų žymėjimo lentelę. Jei visi komandos nariai atsakė teisingai, žaidimo figūrėlė perkeliama per vieną aukso luitą. Tada vedėjas klausimą iš tos pačios kortelės perskaito T komandai. Žaidimo scenarijus kartojasi.\n" +
                "\tPastaba: jei žaidžia tik 6 žaidėjai be vedėjo, klausimus viena kitai užduoda priešininkų komandos. Žaidimo eiga tokia pati (iš pradžių atsakinėja viena komanda, kai atsakymai patikrinami ir užfiksuojami, į antrą tos pačios kortelės klausimą atsakinėja kita komanda). Kiekvienas žaidėjas taškus žymi individualiai. \n" +
                "Iš viso šiame ture traukiamos 4 kortelės. Laimi komanda, surinkusi daugiausiai taškų arba įgijusi tokj pranašumą, kurio varžovai atsakę į likusius klausimus nepanaikintų.Iš pralaimėjusios komandos į kitą etapą patenka žaidėjas, pateikęs daugiausia teisingų atsakymų. \n" +
                "Pastaba: lentelių su asmeninėmis kiekvieno žaidėjo taškų įskaitomis neišmeskite, jų prireiks III ture.\n" +
                "Lygiosios. Jei tiek pat taškų surinko keli žaidėjai, turas pratęsiamas: burtais nustatoma, į kurj klausimą ( ar ) reikės atsakyti, traukiama kortelė ir užduodamas klausimas. Kortelės traukiamos tol, kol nuskamba teisingas atsakymas. \n" +
                "Pastaba: lygiąsias galima spręsti ir kitaip, pavyzdžiui, į kitą etapą patenka tas žaidėjas, kuris pateikė daugiausia teisingų atsakymu iš eilės; arba tas žaidėjas, kuris į paskutinj klausimą atsakė teisingai. Paprasčiausias būdas - traukti burtus. \n" +
                "\n" +
                "II Turas. \n" +
                "II turą pradeda 4 žaidėjai, pasidaliję į V ir T komandas. Iškritę žaidėjai tampa sirgaliais (arba vedėjais, jei žaidimą pradėjote be jo). Kiekviena komanda pasirenka po žaidimo figūrėlę ir pastato ant lentos auksinėje zonoje. II ture naudojamos kortelės, kuriose yra po 2 klausimus su 4 atsakymų variantais (kortelės nuo 1051 iki 1100). Į kortelių kaladę įmaišykite 5 džokerio korteles. \n" +
                "Pastaba: šiame ture taip pat galima naudoti žaidimų ,,Auksinis protas. Startas\" Nr. 1 ir Nr. 2 II turo korteles (Nr. 1 nuo 51 iki 100; Nr. 2 nuo 151 iki 200) bei džokerio korteles. Atsakymų j šių kortelių klausimus ieškokite žaidimų  „Auksinis protas. Startas\" Nr. 1 ir Nr. 2 atsakymų knygelėse. \n" +
                "Iš Pradžių skaitomas V klausimas. Poros tariasi 1 minutę. Atsakymai užrašomi ant lapelio ir paduodami vedėjui. šis juos patikrina atsakymų knygelėje, teisingai atsakiusi pora paeina per 1 aukso luitą. Tada skaitomas T klausimas. Žaidimo scenarijus kartojasi.\n" +
                "Iš viso II ture traukiamos 3 kortelės (užduodami 6 klausimai). Laimi daugiausia taškų surinkusi komanda. Laimėjusi komanda iš priešininkų komandos pašalina vieną žaidėią. Į III turą patenka 3 žaidėjai, kurie varžysis tarpusavyje. \n" +
                "Lygiosios. Jei abiejų komandų rezultatas lygus, traukiama papildoma kortelė su klausimais. lš pradžiu skaitomas klausimas. Komanda, kuri nori atsakyti pirmoji, pakelia ranką. Jei nuskamba teisingas atsakymas, pereina į kitą turą. Jei atsakymas neteisingas, atsakyti į tą patį klausimą gali kita komanda. Papildomos kortelės traukiamos tol, kol nuskamba teisingas atsakymas. \n" +
                "III turas \n" +
                "3 žaidėjai pasirenka po žaidimo figūrėlę ir pastato ant lentos auksinėje zonoje. Žaidėjų eiliškumas nustatomas pagal asmeninę I turo taškų įskaitą: surinkęs daugiausia taškų - pirmas ir t. t. Pralaimėjusios poros žaidėjas visada bus trečias. Jei laimėjusios poros abiejų žaidėjų rezultatai vienodi, pirmasis nustatomas burtais. III ture naudojamos kortelės su 20 teiginių (nuo 2001 iki 2032). Kortelės sumaišomos, padedamos ant stalo. Vedėjas ima kortelę nuo viršaus. Perskaitomas klausimas. Paleidžiamas laikrodis. Per 1 minutę žaidėjas turi pateikti kuo daugiau teisingų atsakymų į klausimą. Pasibaigus laikui, suskaičiuojami teisingi atsakymai. Paeinama į priekj per tiek aukso luitų, kiek buvo teisingų atsakymų. \n" +
                "Pastaba: kad žaidimas vyktų greičiau, tikrinti atsakymus ir fiksuoti laiką vedėjui gali padėti žaidėjai, nepatekę į tolesnius turus.\n" +
                "Tas pats scenarijus kartojamas su antru ir trečiu žaidėju. 2 daugiausia taškų surinkę žaidėjai patenka į finalą, trečiasis tampa finalo vedėju. Jei 2 ar daugiau žaidėjų šiame etape surenka po lygiai taškų, laimi tas, kuris atsakinėjo pirmesnis. \n" +
                "Finalas\n" +
                "2 žaidėjai pasirenka po žaidimo figūrėlę ir pastato ant lentos auksinėje zonoje. Vedėjas iš finalinio turo kortelių (nuo 3001 iki 3032) ištraukia vieną su 10 klausimų. Skaitoma po vieną klausimą. Pirmas atsakinėja anksčiau pakėlęs ranką žaidėjas. Teisingai atsakęs gauna tašką, jei neatsako, atsakyti į tą patj klausimą turi teisę kitas finalininkas. Finalą laimi dalyvis, pirmas surinkęs 5 taškus arba įgijęs pranašumą, kurio varžovas atsakęs likusius klausimus nepanaikinta. Jei po 10 klausimų rezultatas lygus, sprendžiama žodžiu grandinėlė. Žaidėjas, pirmas teisingai issprendęs žodžių grandinėlę, tampa nugalėtoju. \n" +
                "\n"));

    }
}