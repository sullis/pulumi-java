// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetIntegrationAccountPartnerArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetIntegrationAccountPartnerArgs Empty = new GetIntegrationAccountPartnerArgs();

    /**
     * The integration account name.
     * 
     */
    @Import(name="integrationAccountName", required=true)
    private String integrationAccountName;

    /**
     * @return The integration account name.
     * 
     */
    public String integrationAccountName() {
        return this.integrationAccountName;
    }

    /**
     * The integration account partner name.
     * 
     */
    @Import(name="partnerName", required=true)
    private String partnerName;

    /**
     * @return The integration account partner name.
     * 
     */
    public String partnerName() {
        return this.partnerName;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The resource group name.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetIntegrationAccountPartnerArgs() {}

    private GetIntegrationAccountPartnerArgs(GetIntegrationAccountPartnerArgs $) {
        this.integrationAccountName = $.integrationAccountName;
        this.partnerName = $.partnerName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetIntegrationAccountPartnerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetIntegrationAccountPartnerArgs $;

        public Builder() {
            $ = new GetIntegrationAccountPartnerArgs();
        }

        public Builder(GetIntegrationAccountPartnerArgs defaults) {
            $ = new GetIntegrationAccountPartnerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param integrationAccountName The integration account name.
         * 
         * @return builder
         * 
         */
        public Builder integrationAccountName(String integrationAccountName) {
            $.integrationAccountName = integrationAccountName;
            return this;
        }

        /**
         * @param partnerName The integration account partner name.
         * 
         * @return builder
         * 
         */
        public Builder partnerName(String partnerName) {
            $.partnerName = partnerName;
            return this;
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetIntegrationAccountPartnerArgs build() {
            $.integrationAccountName = Objects.requireNonNull($.integrationAccountName, "expected parameter 'integrationAccountName' to be non-null");
            $.partnerName = Objects.requireNonNull($.partnerName, "expected parameter 'partnerName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
