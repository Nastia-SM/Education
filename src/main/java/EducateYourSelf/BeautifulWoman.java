package EducateYourSelf;

public class BeautifulWoman extends PrettyWoman {

        @Override
        public String getMyFavouriteLipstick(String lipstickName){
            this.lipstickName = lipstickName;
            String strangeSentence = "Для женщины с именем " + this.name + " самой любимой помадой может быть только ";
            return strangeSentence + lipstickName;
        }

    }
