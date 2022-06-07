// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Limits.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetResourceAvailabilityArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetResourceAvailabilityArgs Empty = new GetResourceAvailabilityArgs();

    /**
     * This field is mandatory if the scopeType of the target resource limit is AD. Otherwise, this field should be omitted. If the above requirements are not met, the API returns a 400 - InvalidParameter response.
     * 
     */
    @Import(name="availabilityDomain")
    private @Nullable Output<String> availabilityDomain;

    /**
     * @return This field is mandatory if the scopeType of the target resource limit is AD. Otherwise, this field should be omitted. If the above requirements are not met, the API returns a 400 - InvalidParameter response.
     * 
     */
    public Optional<Output<String>> availabilityDomain() {
        return Optional.ofNullable(this.availabilityDomain);
    }

    /**
     * The OCID of the compartment for which data is being fetched.
     * 
     */
    @Import(name="compartmentId", required=true)
    private Output<String> compartmentId;

    /**
     * @return The OCID of the compartment for which data is being fetched.
     * 
     */
    public Output<String> compartmentId() {
        return this.compartmentId;
    }

    /**
     * The limit name for which to fetch the data.
     * 
     */
    @Import(name="limitName", required=true)
    private Output<String> limitName;

    /**
     * @return The limit name for which to fetch the data.
     * 
     */
    public Output<String> limitName() {
        return this.limitName;
    }

    /**
     * The service name of the target quota.
     * 
     */
    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    /**
     * @return The service name of the target quota.
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }

    private GetResourceAvailabilityArgs() {}

    private GetResourceAvailabilityArgs(GetResourceAvailabilityArgs $) {
        this.availabilityDomain = $.availabilityDomain;
        this.compartmentId = $.compartmentId;
        this.limitName = $.limitName;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetResourceAvailabilityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetResourceAvailabilityArgs $;

        public Builder() {
            $ = new GetResourceAvailabilityArgs();
        }

        public Builder(GetResourceAvailabilityArgs defaults) {
            $ = new GetResourceAvailabilityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param availabilityDomain This field is mandatory if the scopeType of the target resource limit is AD. Otherwise, this field should be omitted. If the above requirements are not met, the API returns a 400 - InvalidParameter response.
         * 
         * @return builder
         * 
         */
        public Builder availabilityDomain(@Nullable Output<String> availabilityDomain) {
            $.availabilityDomain = availabilityDomain;
            return this;
        }

        /**
         * @param availabilityDomain This field is mandatory if the scopeType of the target resource limit is AD. Otherwise, this field should be omitted. If the above requirements are not met, the API returns a 400 - InvalidParameter response.
         * 
         * @return builder
         * 
         */
        public Builder availabilityDomain(String availabilityDomain) {
            return availabilityDomain(Output.of(availabilityDomain));
        }

        /**
         * @param compartmentId The OCID of the compartment for which data is being fetched.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(Output<String> compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentId The OCID of the compartment for which data is being fetched.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            return compartmentId(Output.of(compartmentId));
        }

        /**
         * @param limitName The limit name for which to fetch the data.
         * 
         * @return builder
         * 
         */
        public Builder limitName(Output<String> limitName) {
            $.limitName = limitName;
            return this;
        }

        /**
         * @param limitName The limit name for which to fetch the data.
         * 
         * @return builder
         * 
         */
        public Builder limitName(String limitName) {
            return limitName(Output.of(limitName));
        }

        /**
         * @param serviceName The service name of the target quota.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName The service name of the target quota.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        public GetResourceAvailabilityArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            $.limitName = Objects.requireNonNull($.limitName, "expected parameter 'limitName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
