// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Quota contains the essential parameters needed that can be applied on the resources, methods, API source combination associated with this API product. While Quota is optional, setting it prevents requests from exceeding the provisioned parameters.
 * 
 */
public final class GoogleCloudApigeeV1QuotaResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudApigeeV1QuotaResponse Empty = new GoogleCloudApigeeV1QuotaResponse();

    /**
     * Time interval over which the number of request messages is calculated.
     * 
     */
    @Import(name="interval", required=true)
    private String interval;

    /**
     * @return Time interval over which the number of request messages is calculated.
     * 
     */
    public String interval() {
        return this.interval;
    }

    /**
     * Upper limit allowed for the time interval and time unit specified. Requests exceeding this limit will be rejected.
     * 
     */
    @Import(name="limit", required=true)
    private String limit;

    /**
     * @return Upper limit allowed for the time interval and time unit specified. Requests exceeding this limit will be rejected.
     * 
     */
    public String limit() {
        return this.limit;
    }

    /**
     * Time unit defined for the `interval`. Valid values include `minute`, `hour`, `day`, or `month`. If `limit` and `interval` are valid, the default value is `hour`; otherwise, the default is null.
     * 
     */
    @Import(name="timeUnit", required=true)
    private String timeUnit;

    /**
     * @return Time unit defined for the `interval`. Valid values include `minute`, `hour`, `day`, or `month`. If `limit` and `interval` are valid, the default value is `hour`; otherwise, the default is null.
     * 
     */
    public String timeUnit() {
        return this.timeUnit;
    }

    private GoogleCloudApigeeV1QuotaResponse() {}

    private GoogleCloudApigeeV1QuotaResponse(GoogleCloudApigeeV1QuotaResponse $) {
        this.interval = $.interval;
        this.limit = $.limit;
        this.timeUnit = $.timeUnit;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudApigeeV1QuotaResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudApigeeV1QuotaResponse $;

        public Builder() {
            $ = new GoogleCloudApigeeV1QuotaResponse();
        }

        public Builder(GoogleCloudApigeeV1QuotaResponse defaults) {
            $ = new GoogleCloudApigeeV1QuotaResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param interval Time interval over which the number of request messages is calculated.
         * 
         * @return builder
         * 
         */
        public Builder interval(String interval) {
            $.interval = interval;
            return this;
        }

        /**
         * @param limit Upper limit allowed for the time interval and time unit specified. Requests exceeding this limit will be rejected.
         * 
         * @return builder
         * 
         */
        public Builder limit(String limit) {
            $.limit = limit;
            return this;
        }

        /**
         * @param timeUnit Time unit defined for the `interval`. Valid values include `minute`, `hour`, `day`, or `month`. If `limit` and `interval` are valid, the default value is `hour`; otherwise, the default is null.
         * 
         * @return builder
         * 
         */
        public Builder timeUnit(String timeUnit) {
            $.timeUnit = timeUnit;
            return this;
        }

        public GoogleCloudApigeeV1QuotaResponse build() {
            $.interval = Objects.requireNonNull($.interval, "expected parameter 'interval' to be non-null");
            $.limit = Objects.requireNonNull($.limit, "expected parameter 'limit' to be non-null");
            $.timeUnit = Objects.requireNonNull($.timeUnit, "expected parameter 'timeUnit' to be non-null");
            return $;
        }
    }

}
