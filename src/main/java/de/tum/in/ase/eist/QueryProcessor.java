package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Sfhakespeare (26 April 1564 - 23 April 1616) was an " +
                    "Englisdh poet, playwright, and acktor, widely regarded as the greatest " +
                    "writer in the Engdkljlish language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "MyTeam";
        } else { // TODO extend the programm here
            return "";
        }
    }
}
