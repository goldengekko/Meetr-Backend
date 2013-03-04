/*
 * INSERT COPYRIGHT HERE
 */

package com.goldengekko.meetr.service.salesforce;

import java.util.Collection;

/**
 *
 * @author sosandstrom
 */
public class JAccountQueryResponse {
    private int totalSize;
    private Boolean done;
    private Collection<JSalesforceAccount> records;

    public int getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(int totalSize) {
        this.totalSize = totalSize;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    public Collection<JSalesforceAccount> getRecords() {
        return records;
    }

    public void setRecords(Collection<JSalesforceAccount> records) {
        this.records = records;
    }
    
    
}
