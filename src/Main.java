import transport.Car;
public class Main {
    public static void main(String[] args) {

        Human maxim = new Human(35,"Максим","Минск","бренд-менеджер");
        Human ania = new Human(29,"Аня","Москва","методист образовательных программ");
        Human katia = new Human(28,"Катя","Калининград","продакт-менеджер");
        Human artem = new Human(27,"Артём","Москва","директор по развитию бизнеса");
        Human vladimir = new Human(21,"Владимир","Казани","");


        System.out.println("Привет! Меня зовут " + maxim.getName() +
                ". Я из города " + maxim.getTown() +
                ". Мне " + maxim.getYearOfBirth() +
                " лет." + " Я работаю на должности " + maxim.getJob() +
                ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + ania.getName() +
                ". Я из города " + ania.getTown() +
                ". Мне " + ania.getYearOfBirth() +
                " лет." + " Я работаю на должности " + ania.getJob() +
                ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + katia.getName() +
                ". Я из города " + katia.getTown() +
                ". Мне " + katia.getYearOfBirth() +
                " лет." + " Я работаю на должности " + katia.getJob() +
                ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + artem.getName() +
                ". Я из города " + artem.getTown() +
                ". Мне " + artem.getYearOfBirth() +
                " лет." + " Я работаю на должности " + artem.getJob() +
                ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + vladimir.getName() +
                ". Я из города " + vladimir.getTown() +
                ". Мне " + vladimir.getYearOfBirth() +
                " лет." + " Я работаю на должности " + vladimir.getJob() +
                ". Будем знакомы!");

        System.out.println("Задание-2.");

        Car lada = new Car("Lada","Grande",1.7,"жёлтый",2015,"Россия","механическая","седан","р156ор078",5,"летняя",new Car.Key(false,false),new Car.Insurance(null,2_000,"325684265"));
        Car audi = new Car("Audi","A8 50 L TDI quattro",3.0,"черный",2020,"Германия","механическая","седан","р150ор078",4,"зимняя",new Car.Key(true,false),new Car.Insurance(null,7_000,"852456951"));
        Car bmw = new Car("BMW","Z8",3.0,"черный",2021,"Германия","механическая","седан","р656ор078",5,"летняя",new Car.Key(false,true),new Car.Insurance(null,2_000,null));
        Car kia = new Car("Kia","Sportage 4",2.4,"красный",2018,"Южная Корея","автомат","седан","р186ор078",4,"зимняя",new Car.Key(false,true),new Car.Insurance(null,6_000,null));
        Car hyundai = new Car("Hyundai","Avante",1.6,"оранжевый",2016,"Южная Корея","механическая","седан","р276ор078",5,"летняя",new Car.Key(true,true),new Car.Insurance(null,9_000,null));

        printCar(lada);
        printCar(audi);
        printCar(bmw);
        printCar(kia);
        printCar(hyundai);

        Flower rose = new Flower(null,"Голландия",35.59,0);
        Flower chrysanthemum = new Flower(null,null,15,5);
        Flower pion = new Flower(null,"Англия",69.9,1);
        Flower gypsophila = new Flower(null,"Турция",19.5,10);

        System.out.println("Задание-3.");
        printFlower(rose);
        printFlower(chrysanthemum);
        printFlower(pion);
        printFlower(gypsophila);

        System.out.println("Доп задание-3.");
        printBouquet(rose,rose,rose,
                chrysanthemum,chrysanthemum,chrysanthemum,chrysanthemum,chrysanthemum,
                gypsophila);
    }
    public static void printCar(Car car) {
        System.out.println(car.getBrand() + " " +
                car.getModel() + ", " +
                car.getProductionYear() + " год выпуска, страна сборки " +
                car.getProductionCountry() + "," +
                car.getColor() + " цвет, объем двигателя - " +
                car.getEngineVolume() + " литра. Коробка передач " +
                car.getTransmission() + ", тип кузова " +
                car.getBodyType() +  ". Регистрационный номер " +
                car.getRegistrationNumber() + " , мест " +
                car.getNumberOfSeats() + " , тип резины " +
                car.getRubberType() + " , тип запуска " +
                car.getKey().getRemoteEngineStart() + " , бесключевой доступ " +
                car.getKey().getKeylessAccess() + " , Срок действия страховки " +
                car.getInsurance().getInsuranceValidityPeriod() + " , Стоимость страховки " +
                car.getInsurance().getTheCostOfInsurance() + " , Номер страховки " +
                car.getInsurance().getInsuranceNumber());

    }
    public static void printFlower(Flower flower) {
        System.out.println("Цвет цветка: " + flower.getFlowerColor() +
                ", страна: " + flower.getCountry() +
                ", цена: " + flower.getCost() +
                "рублей. Срок стояния: " + flower.getLifeSpan() +
                "дней.");
    }
    public static void printBouquet(Flower... flowers) {
        double totalCost = 0;
        int minLifeSpan = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if (flower.getLifeSpan()<minLifeSpan) {
                minLifeSpan = flower.getLifeSpan();
            }
            totalCost += flower.getCost();
            printFlower(flower);
        }
        totalCost = totalCost * 1.1;
        String result = String.format("%.2f",totalCost);
        System.out.println("Стоимость букета: " + result + "рублей.");
        System.out.println("Срок стояния букета: " + minLifeSpan + "дня.");
    }
}