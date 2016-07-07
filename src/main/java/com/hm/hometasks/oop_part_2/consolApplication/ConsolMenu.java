/*
 * Класс консольного меню
 */
package com.hm.hometasks.oop_part_2.consolApplication;
import com.hm.hometasks.oop_part_2.flower.FlowerShop;
import com.hm.hometasks.oop_part_2.newYearPresent.NewYearPresentDemo;
import com.hm.hometasks.oop_part_2.homeDevice.HomeDeviceDemo;
import com.hm.hometasks.oop_part_2.chief.ChiefDemo;
import com.hm.hometasks.oop_part_2.soundTreck.SoundTrekDemo;
import com.hm.hometasks.oop_part_2.stone.StoneDemo;
import com.hm.hometasks.oop_part_2.motocyclist.MotocyclistDemo;
import com.hm.hometasks.oop_part_2.transport.TransportDemo;
import com.hm.hometasks.oop_part_2.airCompany.AirCompanyDemo;
import com.hm.hometasks.oop_part_2.taxiPark.TaxiParkDemo;
import com.hm.hometasks.oop_part_2.InsuranceLiabilities.InsuranceLiabilitiesDemo;
import com.hm.hometasks.oop_part_2.mobileCommunication.MobileCommunicationDemo;
import com.hm.hometasks.oop_part_2.coffeeVan.CoffeeVanDemo;
import com.hm.hometasks.oop_part_2.gameRoom.GameRoomDemo;
import com.hm.hometasks.oop_part_2.taxes.TaxesDemo;
import com.hm.hometasks.oop_part_2.account.AccountDemo;
import com.hm.hometasks.oop_part_2.tourPackages.TourPackagesDemo;
import com.hm.hometasks.oop_part_2.credit.CreditDemo;



import java.util.Scanner;

/**
 *
 * @author Osin Vladimir
 */
public class ConsolMenu {
    public  void Initialisation(){
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println("WELCOME TO APPLICATION!! ");
            System.out.println("Enter number: ");
            System.out.println("1-FlowerShop ");
            System.out.println("2-NewYearPresent ");
            System.out.println("3-HomeDevice ");
            System.out.println("4-Chief ");
            System.out.println("5-SoundTrek ");
            System.out.println("6-Stone ");
            System.out.println("7-Motocyclist ");
            System.out.println("8-Transport ");
            System.out.println("9-AirCompany ");
            System.out.println("10-TaxiPark ");
            System.out.println("11-InsuranceLiabilities ");
            System.out.println("12-MobileCommunication ");
            System.out.println("13-CoffeeVan ");
            System.out.println("14-GameRoom ");
            System.out.println("15-Taxes ");
            System.out.println("16-Account ");
            System.out.println("17-TourPackages ");
            System.out.println("18-Credits ");
       try {
                int result = Integer.parseInt(sc.next());
                switch (result) {
                    case 1: {
                        FlowerShop flowerShop = new FlowerShop();
                        flowerShop.FlowerShopInit();
                    }  break;
                    case 2: {
                        NewYearPresentDemo newYearPresentDemo = new NewYearPresentDemo();
                        newYearPresentDemo.NewYearPresentInit();
                    }  break;
                     case 3: {
                        HomeDeviceDemo homeDeviceDemo = new HomeDeviceDemo();
                        homeDeviceDemo.HomeDeviceInit();
                    }  break;
                    case 4: {
                        ChiefDemo chiefDemo = new ChiefDemo();
                        chiefDemo.ChiefInit();
                    }  break;
                    case 5: {
                        SoundTrekDemo soundTrekDemo = new SoundTrekDemo();
                        soundTrekDemo.SoundTrekInit();
                    }  break;
                    case 6: {
                         StoneDemo stoneDemo = new StoneDemo();
                         stoneDemo.StoneInit();
                    }  break;
                     case 7: {
                        MotocyclistDemo motocyclistDemo = new MotocyclistDemo();
                        motocyclistDemo.MotocyclistInit();
                    }  break;
                    case 8: {
                        TransportDemo transportDemo = new TransportDemo();
                        transportDemo.TransportInit();
                    }  break;
                      case 9: {
                        AirCompanyDemo airCompanyDemo = new AirCompanyDemo();
                        airCompanyDemo.AirCompantInit();
                    }  break;
                    case 10: {
                       TaxiParkDemo taxiParkDemo = new TaxiParkDemo();
                       taxiParkDemo.TaxiParkInit();
                    }  break;
                    case 11: {
                       InsuranceLiabilitiesDemo insuranceLiabilitiesDemo = new InsuranceLiabilitiesDemo();
                       insuranceLiabilitiesDemo.InsuranceLiabilitiesInit();
                    }  break;
                    case 12 : {
                        MobileCommunicationDemo mobileCommunicationDemo = new MobileCommunicationDemo();
                        mobileCommunicationDemo.MobileCommunicationInit();
                    }  break;
                    case 13: {
                        CoffeeVanDemo coffeeVanDemo = new CoffeeVanDemo();
                        coffeeVanDemo.CoffeeVanInit();
                    }  break;
                     case 14: {
                        GameRoomDemo gameRoomDemo = new GameRoomDemo();
                        gameRoomDemo.GameRoomInit();
                    }  break;
                    case 15 : {
                        TaxesDemo taxesDemo = new TaxesDemo();
                        taxesDemo.TaxesInit();
                    }  break;
                    case 16: {
                       AccountDemo accountDemo = new AccountDemo();
                       accountDemo.AccountInit();
                    }  break;
                    case 17 : {
                       TourPackagesDemo tourPackagesDemo = new TourPackagesDemo();
                       tourPackagesDemo.TourPackagesInit();
                    }  break;
                    case 18: {
                      CreditDemo creditDemo = new CreditDemo();
                      creditDemo.CreditInit();
                        
                    }  break;
                    
                    default: {
                        end = true;
                    }
                }
              }catch (Exception e) {
                end = true;
            }

}end = true;
        }
    }
