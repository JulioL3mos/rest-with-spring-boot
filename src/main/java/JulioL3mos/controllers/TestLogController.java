package JulioL3mos.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping("/api/test/v1")
public class TestLogController {

    private Logger logger = Logger.getLogger(TestLogController.class.getName());

    @GetMapping
    public String testLogging() {
        logger.info("This is an info log message.");
        logger.warning("This is a warning log message.");
        logger.severe("This is a severe log message.");
        return "Logging test completed. Check the logs for messages.";
    }
}
