package sd1920.trab1.helpers;


import sd1920.trab1.api.Message;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;

public class RequestHelperRest implements RequestHelper{

    private String domain;
    private String url;
    private Client client;
    private WebTarget target;
    private Message msg;
    private Long mid;
    private String method;

    public RequestHelperRest(String url, Client client, WebTarget target, Message msg, String domain){
        this.domain = domain;
        this.client = client;
        this.msg = msg;
        this.target = target;
        this.url = url;
        this.method = "POST";
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public RequestHelperRest(String url, Client client, WebTarget target, Long mid, String domain){
        this.domain = domain;
        this.client = client;
        this.mid = mid;
        this.target = target;
        this.url = url;
        this.method = "DELETE";
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public WebTarget getTarget() {
        return target;
    }

    public void setTarget(WebTarget target) {
        this.target = target;
    }

    public Message getMsg() {
        return msg;
    }

    public void setMsg(Message msg) {
        this.msg = msg;
    }

    public Long getMid() {
        return mid;
    }

    public void setMid(Long mid) {
        this.mid = mid;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
}