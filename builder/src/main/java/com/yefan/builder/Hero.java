package com.yefan.builder;

public class Hero {

    private final String profession;

    private final String name;

    private final String weapon;

    private final String hairType;

    private final String hairColor;

    private Hero(Builder builder) {
        this.profession = builder.profession;
        this.name = builder.name;
        this.hairColor = builder.hairColor;
        this.hairType = builder.hairType;
        this.weapon = builder.weapon;
    }

    public static class Builder {
        private final String profession;

        private final String name;

        private String weapon;

        private String hairType;

        private String hairColor;

        public Builder(String name, String profession) {
            if (name == null || profession == null) {
                throw new IllegalArgumentException("profession and name can not be null");
            }
            this.profession = profession;
            this.name = name;
        }

        public Builder withHairType(String hairType) {
            this.hairType = hairType;
            return this;
        }

        public Builder withHairColor(String hairColor) {
            this.hairColor = hairColor;
            return this;
        }

        public Builder withWeapon(String weapon) {
            this.weapon = weapon;
            return this;
        }

        public Hero build() {
            return new Hero(this);
        }
    }

    @Override
    public String toString() {
        return "Hero{" +
                "profession='" + profession + '\'' +
                ", name='" + name + '\'' +
                ", weapon='" + weapon + '\'' +
                ", hairType='" + hairType + '\'' +
                ", hairColor='" + hairColor + '\'' +
                '}';
    }
}
