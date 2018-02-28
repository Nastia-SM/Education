package EducateYourSelf;

public class PrettyWoman {

        public String name;
        public int height;
        public String lipstickName;

        public String setPrettyWomanName(String name){
            this.name = name;
            return name;
        }

        public String getMyFavouriteLipstick(String lipstickName){
            this.lipstickName = lipstickName;
            String strangeSentence = "Для " + this.name + " самая любимая помада это ";
            return strangeSentence + lipstickName;
        }

        public String getMyHeight(int height){
            return "Мой рост " + height + " сантиметров";
        }

    }
