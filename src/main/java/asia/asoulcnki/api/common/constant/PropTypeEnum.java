package asia.asoulcnki.api.common.constant;

import lombok.Setter;


public enum PropTypeEnum {
    IMAGE("image"),
    ;
    private final String type;

    PropTypeEnum(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

}
