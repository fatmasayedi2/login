package com.example.backend.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Permission {

    ADMIN_READ("admin:read"),
    ADMIN_UPDATE("admin:update"),
    ADMIN_CREATE("admin:create"),
    ADMIN_DELETE("admin:delete"),

    MANAGER_READ("management:read"),
    MANAGER_UPDATE("management:update"),
    MANAGER_CREATE("management:create"),
    MANAGER_DELETE("management:delete"),

    // Permissions spécifiques pour le rôle DOCTOR
    DOCTOR_READ("doctor:read"),    // Lire les informations des plannings de garde
    DOCTOR_UPDATE("doctor:update"), // Modifier les plannings ou proposer des changements
    DOCTOR_SWAP("doctor:swap");    // Echanger des gardes avec validation

    @Getter
    private final String permission;
}
