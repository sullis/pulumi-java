// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.automation.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetCertificatePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCertificatePlainArgs Empty = new GetCertificatePlainArgs();

    /**
     * The name of the automation account.
     * 
     */
    @Import(name="automationAccountName", required=true)
    private String automationAccountName;

    /**
     * @return The name of the automation account.
     * 
     */
    public String automationAccountName() {
        return this.automationAccountName;
    }

    /**
     * The name of certificate.
     * 
     */
    @Import(name="certificateName", required=true)
    private String certificateName;

    /**
     * @return The name of certificate.
     * 
     */
    public String certificateName() {
        return this.certificateName;
    }

    /**
     * Name of an Azure Resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return Name of an Azure Resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetCertificatePlainArgs() {}

    private GetCertificatePlainArgs(GetCertificatePlainArgs $) {
        this.automationAccountName = $.automationAccountName;
        this.certificateName = $.certificateName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCertificatePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCertificatePlainArgs $;

        public Builder() {
            $ = new GetCertificatePlainArgs();
        }

        public Builder(GetCertificatePlainArgs defaults) {
            $ = new GetCertificatePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param automationAccountName The name of the automation account.
         * 
         * @return builder
         * 
         */
        public Builder automationAccountName(String automationAccountName) {
            $.automationAccountName = automationAccountName;
            return this;
        }

        /**
         * @param certificateName The name of certificate.
         * 
         * @return builder
         * 
         */
        public Builder certificateName(String certificateName) {
            $.certificateName = certificateName;
            return this;
        }

        /**
         * @param resourceGroupName Name of an Azure Resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetCertificatePlainArgs build() {
            $.automationAccountName = Objects.requireNonNull($.automationAccountName, "expected parameter 'automationAccountName' to be non-null");
            $.certificateName = Objects.requireNonNull($.certificateName, "expected parameter 'certificateName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
