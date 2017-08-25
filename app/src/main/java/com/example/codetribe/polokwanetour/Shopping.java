package com.example.codetribe.polokwanetour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Shopping extends AppCompatActivity {
    private final String name[] = {
            "ThornHill",
            "Mall Of North",
            "Savannah Mall",
            "Flora Park Centre",
            "Limpopo Mall",
            "Cycad center"


    };

    private final String url[] = {
            "http://www.thornhillshoppingcentre.co.za/data1/images/banner1.jpg",
            "http://www.fgprop.com/images/gallery/mall-north/mall-of-the-north-big-05.jpg?width=550&height=363",
            "http://2.bp.blogspot.com/_UJQzmnjudgM/Swl3RjMEhoI/AAAAAAAACeE/8LikHBYPRHU/s1600/svhmall_8.jpg",
            "https://s-media-cache-ak0.pinimg.com/236x/8d/9e/cf/8d9ecf3c68e5e108c74b63cc941f3478--shopping-center-wuhan.jpg",
            "https://photo1.hotelsclick.com/dubai/45292/wide/flora-park-deluxe-apartments-entrance.22.jpg",
            "https://igx.4sqi.net/img/general/width960/3230113_fEitKYSesSWxjMJhunHiafWcaKEovF4nbCLLsknTOgE.jpg",
            "http://www.cmsignition.co.za/uploadimages/images_1045/_MG_1410_1_2_3_4_5_thumbnail.jpg",


    };
    private final String description[] = {
            "This centre is located in one of Polokwane’s most affluent areas, right next to Cycad Estate and walking distance from Bendor Village. It is a mere 3 minute drive from many of Polokwane’s biggest pre-primary, primary and high schools. Located just down the road from Cycad Centre you will find one of Polokwane's biggest office parks. If you are looking for a upmarket convenience centre in Polokwane this is the place to be.",
            "This centre is located in one of Polokwane’s most affluent areas, right next to Cycad Estate and walking distance from Bendor Village. It is a mere 3 minute drive from many of Polokwane’s biggest pre-primary, primary and high schools. Located just down the road from Cycad Centre you will find one of Polokwane's biggest office parks. If you are looking for a upmarket convenience centre in Polokwane this is the place to be.",
            "This centre is located in one of Polokwane’s most affluent areas, right next to Cycad Estate and walking distance from Bendor Village. It is a mere 3 minute drive from many of Polokwane’s biggest pre-primary, primary and high schools. Located just down the road from Cycad Centre you will find one of Polokwane's biggest office parks. If you are looking for a upmarket convenience centre in Polokwane this is the place to be.",
            "This centre is located in one of Polokwane’s most affluent areas, right next to Cycad Estate and walking distance from Bendor Village. It is a mere 3 minute drive from many of Polokwane’s biggest pre-primary, primary and high schools. Located just down the road from Cycad Centre you will find one of Polokwane's biggest office parks. If you are looking for a upmarket convenience centre in Polokwane this is the place to be.",
            "This centre is located in one of Polokwane’s most affluent areas, right next to Cycad Estate and walking distance from Bendor Village. It is a mere 3 minute drive from many of Polokwane’s biggest pre-primary, primary and high schools. Located just down the road from Cycad Centre you will find one of Polokwane's biggest office parks. If you are looking for a upmarket convenience centre in Polokwane this is the place to be.",
            "This centre is located in one of Polokwane’s most affluent areas, right next to Cycad Estate and walking distance from Bendor Village. It is a mere 3 minute drive from many of Polokwane’s biggest pre-primary, primary and high schools. Located just down the road from Cycad Centre you will find one of Polokwane's biggest office parks. If you are looking for a upmarket convenience centre in Polokwane this is the place to be.",
            "This centre is located in one of Polokwane’s most affluent areas, right next to Cycad Estate and walking distance from Bendor Village. It is a mere 3 minute drive from many of Polokwane’s biggest pre-primary, primary and high schools. Located just down the road from Cycad Centre you will find one of Polokwane's biggest office parks. If you are looking for a upmarket convenience centre in Polokwane this is the place to be.",
            "This centre is located in one of Polokwane’s most affluent areas, right next to Cycad Estate and walking distance from Bendor Village. It is a mere 3 minute drive from many of Polokwane’s biggest pre-primary, primary and high schools. Located just down the road from Cycad Centre you will find one of Polokwane's biggest office parks. If you are looking for a upmarket convenience centre in Polokwane this is the place to be.",
            "This centre is located in one of Polokwane’s most affluent areas, right next to Cycad Estate and walking distance from Bendor Village. It is a mere 3 minute drive from many of Polokwane’s biggest pre-primary, primary and high schools. Located just down the road from Cycad Centre you will find one of Polokwane's biggest office parks. If you are looking for a upmarket convenience centre in Polokwane this is the place to be."
    };

    public final String address[] = {
            "ADDRESS\n" +
                    "Corner of General maritz & Viljoen street, Polokwane\n" +
                    "SIZE\n" +
                    "5,880 m²\n" +
                    "ANCHOR TENANT/S\n" +
                    "Pick 'n Pay\n",
            "ADDRESS\n" +
                    "Corner of General maritz & Viljoen street, Polokwane\n" +
                    "SIZE\n" +
                    "5,880 m²\n" +
                    "ANCHOR TENANT/S\n" +
                    "Pick 'n Pay\n",
            "ADDRESS\n" +
                    "Corner of General maritz & Viljoen street, Polokwane\n" +
                    "SIZE\n" +
                    "5,880 m²\n" +
                    "ANCHOR TENANT/S\n" +
                    "Pick 'n Pay\n",
            "ADDRESS\n" +
                    "Corner of General maritz & Viljoen street, Polokwane\n" +
                    "SIZE\n" +
                    "5,880 m²\n" +
                    "ANCHOR TENANT/S\n" +
                    "Pick 'n Pay\n",
            "ADDRESS\n" +
                    "Corner of General maritz & Viljoen street, Polokwane\n" +
                    "SIZE\n" +
                    "5,880 m²\n" +
                    "ANCHOR TENANT/S\n" +
                    "Pick 'n Pay\n",
            "ADDRESS\n" +
                    "Corner of General maritz & Viljoen street, Polokwane\n" +
                    "SIZE\n" +
                    "5,880 m²\n" +
                    "ANCHOR TENANT/S\n" +
                    "Pick 'n Pay\n",
            "ADDRESS\n" +
                    "Corner of General maritz & Viljoen street, Polokwane\n" +
                    "SIZE\n" +
                    "5,880 m²\n" +
                    "ANCHOR TENANT/S\n" +
                    "Pick 'n Pay\n",
            "ADDRESS\n" +
                    "Corner of General maritz & Viljoen street, Polokwane\n" +
                    "SIZE\n" +
                    "5,880 m²\n" +
                    "ANCHOR TENANT/S\n" +
                    "Pick 'n Pay\n",
            "ADDRESS\n" +
                    "Corner of General maritz & Viljoen street, Polokwane\n" +
                    "SIZE\n" +
                    "5,880 m²\n" +
                    "ANCHOR TENANT/S\n" +
                    "Pick 'n Pay\n"
    };
    public final String contacts[] = {
            "CONTACT DETAILS\n" +
                    "Peter Pratt\n" +
                    "TEL\n" +
                    "015 291 4700\n" +
                    "CONTACT DETAILS EMAIL\n" +
                    "peter@moolmangroup.co.za\n" +
                    "GPS COORDINATES\n" +
                    "S 23° 53' 35.88'' E 29° 28' 22.90''\n",
            "CONTACT DETAILS\n" +
                    "Peter Pratt\n" +
                    "TEL\n" +
                    "015 291 4700\n" +
                    "CONTACT DETAILS EMAIL\n" +
                    "peter@moolmangroup.co.za\n" +
                    "GPS COORDINATES\n" +
                    "S 23° 53' 35.88'' E 29° 28' 22.90''\n",
            "CONTACT DETAILS\n" +
                    "Peter Pratt\n" +
                    "TEL\n" +
                    "015 291 4700\n" +
                    "CONTACT DETAILS EMAIL\n" +
                    "peter@moolmangroup.co.za\n" +
                    "GPS COORDINATES\n" +
                    "S 23° 53' 35.88'' E 29° 28' 22.90''\n",
            "CONTACT DETAILS\n" +
                    "Peter Pratt\n" +
                    "TEL\n" +
                    "015 291 4700\n" +
                    "CONTACT DETAILS EMAIL\n" +
                    "peter@moolmangroup.co.za\n" +
                    "GPS COORDINATES\n" +
                    "S 23° 53' 35.88'' E 29° 28' 22.90''\n",
            "CONTACT DETAILS\n" +
                    "Peter Pratt\n" +
                    "TEL\n" +
                    "015 291 4700\n" +
                    "CONTACT DETAILS EMAIL\n" +
                    "peter@moolmangroup.co.za\n" +
                    "GPS COORDINATES\n" +
                    "S 23° 53' 35.88'' E 29° 28' 22.90''\n",
            "CONTACT DETAILS\n" +
                    "Peter Pratt\n" +
                    "TEL\n" +
                    "015 291 4700\n" +
                    "CONTACT DETAILS EMAIL\n" +
                    "peter@moolmangroup.co.za\n" +
                    "GPS COORDINATES\n" +
                    "S 23° 53' 35.88'' E 29° 28' 22.90''\n",
            "CONTACT DETAILS\n" +
                    "Peter Pratt\n" +
                    "TEL\n" +
                    "015 291 4700\n" +
                    "CONTACT DETAILS EMAIL\n" +
                    "peter@moolmangroup.co.za\n" +
                    "GPS COORDINATES\n" +
                    "S 23° 53' 35.88'' E 29° 28' 22.90''\n",
            "CONTACT DETAILS\n" +
                    "Peter Pratt\n" +
                    "TEL\n" +
                    "015 291 4700\n" +
                    "CONTACT DETAILS EMAIL\n" +
                    "peter@moolmangroup.co.za\n" +
                    "GPS COORDINATES\n" +
                    "S 23° 53' 35.88'' E 29° 28' 22.90''\n",
            "CONTACT DETAILS\n" +
                    "Peter Pratt\n" +
                    "TEL\n" +
                    "015 291 4700\n" +
                    "CONTACT DETAILS EMAIL\n" +
                    "peter@moolmangroup.co.za\n" +
                    "GPS COORDINATES\n" +
                    "S 23° 53' 35.88'' E 29° 28' 22.90''\n",

    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inforlist);

        initViews();
    }
    private void initViews(){
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.card_recycler_view);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        List<Information> hotels = prepareData();
        InformationAdapter adapter = new InformationAdapter(Shopping.this,hotels);
        recyclerView.setAdapter(adapter);

    }
    private List prepareData(){
        List<Information> hotelses = new ArrayList<>();
        for(int i=0;i<name.length;i++){
            Information information = new Information();
            information.setName(name[i]);
            information.setDescription(description[i]);
            information.setAddress(address[i]);
            information.setContacts(contacts[i]);
            information.setUrl(url[i]);
            hotelses.add(information);
        }
        return hotelses;
    }
}
