package pl.aionpb.aion.db.resources;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractMessageSource;
import org.springframework.stereotype.Component;
import pl.aionpb.aion.db.object.Settings;
import pl.aionpb.aion.translation.entity.TranslationEntity;
import pl.aionpb.aion.translation.repository.TranslationRepository;

import java.text.MessageFormat;
import java.util.Locale;

/**
 * @author Grzegorz Nowakowski
 */
@Component("messageSource")
public class DBMessageSource extends AbstractMessageSource {

    @Autowired
    private TranslationRepository translationRepository;


    @Override
    protected MessageFormat resolveCode(String name, Locale locale) {
        String code = locale.getLanguage();
        String loca;

        //if key was not found in the database (improssibruuuu~!!11), return the key
        //possibru if DB is changed.

        if (name.equalsIgnoreCase("loca_string")) {
            return new MessageFormat(code, locale);
        } else if (name.equalsIgnoreCase("server_id")) {
            return new MessageFormat(Settings.getServerId(), locale);
        }

        TranslationEntity message = translationRepository.findByName(name);

        if (message == null) {
            return new MessageFormat(name, locale);
        }


        switch (code) {
            case "en":
                loca = (message.getEn() != null) ? message.getEn() : message.getBody();
                break;
            case "fr":
                loca = (message.getFr() != null) ? message.getFr() : message.getBody();
                break;
            case "de":
                loca = (message.getDe() != null) ? message.getDe() : message.getBody();
                break;
            default:
                loca = message.getBody();
                break;
        }

        return new MessageFormat(loca, locale);
    }
}