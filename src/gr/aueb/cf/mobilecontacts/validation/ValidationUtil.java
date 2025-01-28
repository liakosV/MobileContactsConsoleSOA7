package gr.aueb.cf.mobilecontacts.validation;

import gr.aueb.cf.mobilecontacts.dto.MobileContactInsertDTO;
import gr.aueb.cf.mobilecontacts.dto.MobileContactUpdateDTO;
import gr.aueb.cf.mobilecontacts.model.MobileContact;

public class ValidationUtil {

    /**
     * No instances of this class should be available.
     */
    private  ValidationUtil() {

    }

    public static String validateDTO(MobileContactInsertDTO insertDTO) {
        String errorResponse = "";

        if (insertDTO.getPhoneNumber().length() <= 5)
            errorResponse += "Phone number must be greater than 5 symbols.\n";
        if (insertDTO.getFirstname().length() < 2)
            errorResponse += "Firstname must be greater than 2 symbols.\n";
        if (insertDTO.getLastname().length() < 2)
            errorResponse += "Lastname must be greater than 2 symbols.\n";
        return errorResponse;
    }

    public static String validateDTO(MobileContactUpdateDTO updateDTO) {
        String errorResponse = "";

        if (updateDTO.getPhoneNumber().length() <= 5)
            errorResponse += "Phone number must be greater than 5 symbols.\n";
        if (updateDTO.getFirstname().length() < 2)
            errorResponse += "Firstname must be greater than 2 symbols.\n";
        if (updateDTO.getLastname().length() < 2)
            errorResponse += "Lastname must be greater than 2 symbols.\n";
        return errorResponse;
    }
}
