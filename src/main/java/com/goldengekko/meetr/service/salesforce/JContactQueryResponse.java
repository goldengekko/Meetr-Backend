/*
 * INSERT COPYRIGHT HERE
 */

package com.goldengekko.meetr.service.salesforce;

import java.util.Collection;

/**
 *
 * @author sosandstrom
 */
public class JContactQueryResponse {
    private int totalSize;
    private Boolean done;
    private Collection<JSalesforceContact> records;

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

    public Collection<JSalesforceContact> getRecords() {
        return records;
    }

    public void setRecords(Collection<JSalesforceContact> records) {
        this.records = records;
    }
    
    
}
