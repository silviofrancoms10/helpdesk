package com.silviofrancoms.helpdesk.domain.enums;

public enum Prioridade {
    BAIXA(0, "BAIXA"),
    MEDIA(1, "MEDIA"),
    ALTA(2, "ALTA");

    private int code;
    private String description;

    Prioridade(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static Prioridade toEnum(Integer code) {
        if (code == null) {
            return null;
        }

        for (Prioridade x : Prioridade.values()) {
            if (code.equals(x.getCode())) {
                return x;
            }
        }

        throw new IllegalArgumentException("Prioridade inválido: " + code);
    }
}
