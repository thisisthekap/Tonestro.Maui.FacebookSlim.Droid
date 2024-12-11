package com.tonestro.facebookslim;

import androidx.annotation.NonNull;

import java.util.Date;

class AccessTokenSlimImpl implements AccessTokenSlim {

    private final Date expires;
    private final String[] permissions;
    private final String[] declinedPermissions;
    private final String[] expiredPermissions;
    private final String token;
    private final Date lastRefresh;
    private final String applicationId;
    private final String userId;
    private final Date dataAccessExpirationTime;
    private final String graphDomain;

    public AccessTokenSlimImpl(Date expires, String[] permissions, String[] declinedPermissions, String[] expiredPermissions, String token, Date lastRefresh, String applicationId, String userId, Date dataAccessExpirationTime, String graphDomain) {
        this.expires = expires;
        this.permissions = permissions;
        this.declinedPermissions = declinedPermissions;
        this.expiredPermissions = expiredPermissions;
        this.token = token;
        this.lastRefresh = lastRefresh;
        this.applicationId = applicationId;
        this.userId = userId;
        this.dataAccessExpirationTime = dataAccessExpirationTime;
        this.graphDomain = graphDomain;
    }

    @NonNull
    @Override
    public Date getExpires() {
        return expires;
    }

    @NonNull
    @Override
    public String[] getPermissions() {
        return permissions;
    }

    @NonNull
    @Override
    public String[] getDeclinedPermissions() {
        return declinedPermissions;
    }

    @NonNull
    @Override
    public String[] getExpiredPermissions() {
        return expiredPermissions;
    }

    @NonNull
    @Override
    public String getToken() {
        return token;
    }

    @NonNull
    @Override
    public Date getLastRefresh() {
        return lastRefresh;
    }

    @NonNull
    @Override
    public String getApplicationId() {
        return applicationId;
    }

    @NonNull
    @Override
    public String getUserId() {
        return userId;
    }

    @NonNull
    @Override
    public Date getDataAccessExpirationTime() {
        return dataAccessExpirationTime;
    }

    @NonNull
    @Override
    public String getGraphDomain() {
        return graphDomain;
    }
}
