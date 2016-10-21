package ua.gov.prozorro.contrib.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ExtractService {

    @Scheduled(cron = "${cron.expression}", zone = "${cron.timezone}")
    public void extract(){
        //TODO
    }

}
