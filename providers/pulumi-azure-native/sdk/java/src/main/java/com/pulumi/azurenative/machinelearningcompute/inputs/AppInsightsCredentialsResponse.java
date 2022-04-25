// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningcompute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * AppInsights credentials.
 * 
 */
public final class AppInsightsCredentialsResponse extends com.pulumi.resources.InvokeArgs {

    public static final AppInsightsCredentialsResponse Empty = new AppInsightsCredentialsResponse();

    /**
     * The AppInsights application ID.
     * 
     */
    @Import(name="appId")
    private @Nullable String appId;

    /**
     * @return The AppInsights application ID.
     * 
     */
    public Optional<String> appId() {
        return Optional.ofNullable(this.appId);
    }

    /**
     * The AppInsights instrumentation key. This is not returned in response of GET/PUT on the resource. To see this please call listKeys API.
     * 
     */
    @Import(name="instrumentationKey")
    private @Nullable String instrumentationKey;

    /**
     * @return The AppInsights instrumentation key. This is not returned in response of GET/PUT on the resource. To see this please call listKeys API.
     * 
     */
    public Optional<String> instrumentationKey() {
        return Optional.ofNullable(this.instrumentationKey);
    }

    private AppInsightsCredentialsResponse() {}

    private AppInsightsCredentialsResponse(AppInsightsCredentialsResponse $) {
        this.appId = $.appId;
        this.instrumentationKey = $.instrumentationKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppInsightsCredentialsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppInsightsCredentialsResponse $;

        public Builder() {
            $ = new AppInsightsCredentialsResponse();
        }

        public Builder(AppInsightsCredentialsResponse defaults) {
            $ = new AppInsightsCredentialsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param appId The AppInsights application ID.
         * 
         * @return builder
         * 
         */
        public Builder appId(@Nullable String appId) {
            $.appId = appId;
            return this;
        }

        /**
         * @param instrumentationKey The AppInsights instrumentation key. This is not returned in response of GET/PUT on the resource. To see this please call listKeys API.
         * 
         * @return builder
         * 
         */
        public Builder instrumentationKey(@Nullable String instrumentationKey) {
            $.instrumentationKey = instrumentationKey;
            return this;
        }

        public AppInsightsCredentialsResponse build() {
            return $;
        }
    }

}
