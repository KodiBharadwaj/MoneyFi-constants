package com.moneyfi.constants.constants;

import com.moneyfi.constants.enums.ReasonEnum;
import com.moneyfi.constants.enums.UserRoles;

import java.util.Map;
import java.util.Random;

import static com.moneyfi.constants.enums.ReasonEnum.*;
import static com.moneyfi.constants.enums.ReasonEnum.ADMIN_RETRIEVAL;

public class CommonConstants {

    private CommonConstants() {}

    public static final String MONEYFI_APPLICATION_NAME = "MoneyFi";

    public static final Map<Integer, String> userRoleAssociation = Map.of(1, UserRoles.ADMIN.name(), 2, UserRoles.USER.name(), 3, UserRoles.DEVELOPER.name(), 4, UserRoles.MAINTAINER.name());
    public static final Map<ReasonEnum, Integer> reasonCodeIdAssociation =
            Map.ofEntries(
                    Map.entry(BLOCK_ACCOUNT, 1),
                    Map.entry(PASSWORD_CHANGE, 2),
                    Map.entry(NAME_CHANGE, 3),
                    Map.entry(UNBLOCK_ACCOUNT, 4),
                    Map.entry(DELETE_ACCOUNT, 5),
                    Map.entry(ACCOUNT_RETRIEVAL, 6),
                    Map.entry(PHONE_NUMBER_CHANGE, 7),
                    Map.entry(FORGOT_PASSWORD, 8),
                    Map.entry(USER_RAISED_REQUEST_IGNORED, 9),
                    Map.entry(FORGOT_USERNAME, 10),
                    Map.entry(ADMIN_CREATION, 11),
                    Map.entry(ADMIN_UPDATE, 12),
                    Map.entry(ADMIN_BLOCK, 13),
                    Map.entry(ADMIN_UNBLOCK, 14),
                    Map.entry(ADMIN_DELETE, 15),
                    Map.entry(ADMIN_RETRIEVAL, 16)
            );

    public static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    public static String generateVerificationCode() {
        Random random = new Random();
        int verificationCode = 100000 + random.nextInt(900000);
        return String.valueOf(verificationCode);
    }

    public static String generateAlphabetCode() {
        StringBuilder code = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int index = random.nextInt(ALPHABET.length());
            code.append(ALPHABET.charAt(index));
        }
        return code.toString();
    }
}
