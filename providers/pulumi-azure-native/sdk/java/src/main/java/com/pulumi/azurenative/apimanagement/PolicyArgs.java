// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement;

import com.pulumi.azurenative.apimanagement.enums.PolicyContentFormat;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final PolicyArgs Empty = new PolicyArgs();

    /**
     * Format of the policyContent.
     * 
     */
    @Import(name="format")
    private @Nullable Output<Either<String,PolicyContentFormat>> format;

    /**
     * @return Format of the policyContent.
     * 
     */
    public Optional<Output<Either<String,PolicyContentFormat>>> format() {
        return Optional.ofNullable(this.format);
    }

    /**
     * The identifier of the Policy.
     * 
     */
    @Import(name="policyId")
    private @Nullable Output<String> policyId;

    /**
     * @return The identifier of the Policy.
     * 
     */
    public Optional<Output<String>> policyId() {
        return Optional.ofNullable(this.policyId);
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    /**
     * @return The name of the API Management service.
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }

    /**
     * Contents of the Policy as defined by the format.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return Contents of the Policy as defined by the format.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private PolicyArgs() {}

    private PolicyArgs(PolicyArgs $) {
        this.format = $.format;
        this.policyId = $.policyId;
        this.resourceGroupName = $.resourceGroupName;
        this.serviceName = $.serviceName;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyArgs $;

        public Builder() {
            $ = new PolicyArgs();
        }

        public Builder(PolicyArgs defaults) {
            $ = new PolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param format Format of the policyContent.
         * 
         * @return builder
         * 
         */
        public Builder format(@Nullable Output<Either<String,PolicyContentFormat>> format) {
            $.format = format;
            return this;
        }

        /**
         * @param format Format of the policyContent.
         * 
         * @return builder
         * 
         */
        public Builder format(Either<String,PolicyContentFormat> format) {
            return format(Output.of(format));
        }

        /**
         * @param format Format of the policyContent.
         * 
         * @return builder
         * 
         */
        public Builder format(String format) {
            return format(Either.ofLeft(format));
        }

        /**
         * @param format Format of the policyContent.
         * 
         * @return builder
         * 
         */
        public Builder format(PolicyContentFormat format) {
            return format(Either.ofRight(format));
        }

        /**
         * @param policyId The identifier of the Policy.
         * 
         * @return builder
         * 
         */
        public Builder policyId(@Nullable Output<String> policyId) {
            $.policyId = policyId;
            return this;
        }

        /**
         * @param policyId The identifier of the Policy.
         * 
         * @return builder
         * 
         */
        public Builder policyId(String policyId) {
            return policyId(Output.of(policyId));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param serviceName The name of the API Management service.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName The name of the API Management service.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        /**
         * @param value Contents of the Policy as defined by the format.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Contents of the Policy as defined by the format.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public PolicyArgs build() {
            $.format = Codegen.stringProp("format").left(PolicyContentFormat.class).output().arg($.format).def("xml").getNullable();
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
