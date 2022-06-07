// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetJitNetworkAccessPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetJitNetworkAccessPolicyPlainArgs Empty = new GetJitNetworkAccessPolicyPlainArgs();

    /**
     * The location where ASC stores the data of the subscription. can be retrieved from Get locations
     * 
     */
    @Import(name="ascLocation", required=true)
    private String ascLocation;

    /**
     * @return The location where ASC stores the data of the subscription. can be retrieved from Get locations
     * 
     */
    public String ascLocation() {
        return this.ascLocation;
    }

    /**
     * Name of a Just-in-Time access configuration policy.
     * 
     */
    @Import(name="jitNetworkAccessPolicyName", required=true)
    private String jitNetworkAccessPolicyName;

    /**
     * @return Name of a Just-in-Time access configuration policy.
     * 
     */
    public String jitNetworkAccessPolicyName() {
        return this.jitNetworkAccessPolicyName;
    }

    /**
     * The name of the resource group within the user&#39;s subscription. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group within the user&#39;s subscription. The name is case insensitive.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetJitNetworkAccessPolicyPlainArgs() {}

    private GetJitNetworkAccessPolicyPlainArgs(GetJitNetworkAccessPolicyPlainArgs $) {
        this.ascLocation = $.ascLocation;
        this.jitNetworkAccessPolicyName = $.jitNetworkAccessPolicyName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJitNetworkAccessPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJitNetworkAccessPolicyPlainArgs $;

        public Builder() {
            $ = new GetJitNetworkAccessPolicyPlainArgs();
        }

        public Builder(GetJitNetworkAccessPolicyPlainArgs defaults) {
            $ = new GetJitNetworkAccessPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ascLocation The location where ASC stores the data of the subscription. can be retrieved from Get locations
         * 
         * @return builder
         * 
         */
        public Builder ascLocation(String ascLocation) {
            $.ascLocation = ascLocation;
            return this;
        }

        /**
         * @param jitNetworkAccessPolicyName Name of a Just-in-Time access configuration policy.
         * 
         * @return builder
         * 
         */
        public Builder jitNetworkAccessPolicyName(String jitNetworkAccessPolicyName) {
            $.jitNetworkAccessPolicyName = jitNetworkAccessPolicyName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group within the user&#39;s subscription. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetJitNetworkAccessPolicyPlainArgs build() {
            $.ascLocation = Objects.requireNonNull($.ascLocation, "expected parameter 'ascLocation' to be non-null");
            $.jitNetworkAccessPolicyName = Objects.requireNonNull($.jitNetworkAccessPolicyName, "expected parameter 'jitNetworkAccessPolicyName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
