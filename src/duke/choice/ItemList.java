/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duke.choice;

import io.helidon.common.http.Http;
import io.helidon.webserver.Handler;
import io.helidon.webserver.ServerRequest;
import io.helidon.webserver.ServerResponse;

/**
 *
 * @author rvilches
 */
public class ItemList implements Handler{
    private Clothing[] items;

    public ItemList(Clothing[] items) {
        this.items = items;
    }

    @Override
    public void accept(ServerRequest req, ServerResponse res) {
        res.status(Http.Status.OK_200);
        res.headers().put("Content-Type", "Text/plain; charset=UTF-8");
        String salida = "";
        for (Clothing item : items) {
            salida += item + "\n";
        }
        res.send(salida);
    }
    
}
