// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.automation;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertificateArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateArgs Empty = new CertificateArgs();

    /**
     * The name of the automation account.
     * 
     */
    @Import(name="automationAccountName", required=true)
    private Output<String> automationAccountName;

    /**
     * @return The name of the automation account.
     * 
     */
    public Output<String> automationAccountName() {
        return this.automationAccountName;
    }

    /**
     * Gets or sets the base64 encoded value of the certificate.
     * 
     */
    @Import(name="base64Value", required=true)
    private Output<String> base64Value;

    /**
     * @return Gets or sets the base64 encoded value of the certificate.
     * 
     */
    public Output<String> base64Value() {
        return this.base64Value;
    }

    /**
     * The parameters supplied to the create or update certificate operation.
     * 
     */
    @Import(name="certificateName")
    private @Nullable Output<String> certificateName;

    /**
     * @return The parameters supplied to the create or update certificate operation.
     * 
     */
    public Optional<Output<String>> certificateName() {
        return Optional.ofNullable(this.certificateName);
    }

    /**
     * Gets or sets the description of the certificate.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Gets or sets the description of the certificate.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Gets or sets the is exportable flag of the certificate.
     * 
     */
    @Import(name="isExportable")
    private @Nullable Output<Boolean> isExportable;

    /**
     * @return Gets or sets the is exportable flag of the certificate.
     * 
     */
    public Optional<Output<Boolean>> isExportable() {
        return Optional.ofNullable(this.isExportable);
    }

    /**
     * Gets or sets the name of the certificate.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Gets or sets the name of the certificate.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Name of an Azure Resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Name of an Azure Resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Gets or sets the thumbprint of the certificate.
     * 
     */
    @Import(name="thumbprint")
    private @Nullable Output<String> thumbprint;

    /**
     * @return Gets or sets the thumbprint of the certificate.
     * 
     */
    public Optional<Output<String>> thumbprint() {
        return Optional.ofNullable(this.thumbprint);
    }

    private CertificateArgs() {}

    private CertificateArgs(CertificateArgs $) {
        this.automationAccountName = $.automationAccountName;
        this.base64Value = $.base64Value;
        this.certificateName = $.certificateName;
        this.description = $.description;
        this.isExportable = $.isExportable;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.thumbprint = $.thumbprint;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateArgs $;

        public Builder() {
            $ = new CertificateArgs();
        }

        public Builder(CertificateArgs defaults) {
            $ = new CertificateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param automationAccountName The name of the automation account.
         * 
         * @return builder
         * 
         */
        public Builder automationAccountName(Output<String> automationAccountName) {
            $.automationAccountName = automationAccountName;
            return this;
        }

        /**
         * @param automationAccountName The name of the automation account.
         * 
         * @return builder
         * 
         */
        public Builder automationAccountName(String automationAccountName) {
            return automationAccountName(Output.of(automationAccountName));
        }

        /**
         * @param base64Value Gets or sets the base64 encoded value of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder base64Value(Output<String> base64Value) {
            $.base64Value = base64Value;
            return this;
        }

        /**
         * @param base64Value Gets or sets the base64 encoded value of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder base64Value(String base64Value) {
            return base64Value(Output.of(base64Value));
        }

        /**
         * @param certificateName The parameters supplied to the create or update certificate operation.
         * 
         * @return builder
         * 
         */
        public Builder certificateName(@Nullable Output<String> certificateName) {
            $.certificateName = certificateName;
            return this;
        }

        /**
         * @param certificateName The parameters supplied to the create or update certificate operation.
         * 
         * @return builder
         * 
         */
        public Builder certificateName(String certificateName) {
            return certificateName(Output.of(certificateName));
        }

        /**
         * @param description Gets or sets the description of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Gets or sets the description of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param isExportable Gets or sets the is exportable flag of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder isExportable(@Nullable Output<Boolean> isExportable) {
            $.isExportable = isExportable;
            return this;
        }

        /**
         * @param isExportable Gets or sets the is exportable flag of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder isExportable(Boolean isExportable) {
            return isExportable(Output.of(isExportable));
        }

        /**
         * @param name Gets or sets the name of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Gets or sets the name of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName Name of an Azure Resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Name of an Azure Resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param thumbprint Gets or sets the thumbprint of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder thumbprint(@Nullable Output<String> thumbprint) {
            $.thumbprint = thumbprint;
            return this;
        }

        /**
         * @param thumbprint Gets or sets the thumbprint of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder thumbprint(String thumbprint) {
            return thumbprint(Output.of(thumbprint));
        }

        public CertificateArgs build() {
            $.automationAccountName = Objects.requireNonNull($.automationAccountName, "expected parameter 'automationAccountName' to be non-null");
            $.base64Value = Objects.requireNonNull($.base64Value, "expected parameter 'base64Value' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
