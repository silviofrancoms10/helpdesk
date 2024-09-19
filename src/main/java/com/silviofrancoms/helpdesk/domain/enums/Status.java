package com.silviofrancoms.helpdesk.domain.enums;

public enum Status {
    ABERTO(0, "ABERTO"),
    ANDAMENTO(1, "ANDAMENTO"),
    ENCERRADO(2, "ENCERRADO");

    private int code;
    private String description;

    Status(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static Status toEnum(Integer code) {
        if (code == null) {
            return null;
        }

        for (Status x : Status.values()) {
            if (code.equals(x.getCode())) {
                return x;
            }
        }

        throw new IllegalArgumentException("Status inválido: " + code);
    }
}
