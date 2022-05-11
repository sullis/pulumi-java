// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.machinelearning.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SynapseSparkIdentityArgs extends com.pulumi.resources.ResourceArgs {

    public static final SynapseSparkIdentityArgs Empty = new SynapseSparkIdentityArgs();

    /**
     * Specifies a list of User Assigned Managed Identity IDs to be assigned to this Machine Learning Synapse Spark.
     * 
     */
    @Import(name="identityIds")
    private @Nullable Output<List<String>> identityIds;

    /**
     * @return Specifies a list of User Assigned Managed Identity IDs to be assigned to this Machine Learning Synapse Spark.
     * 
     */
    public Optional<Output<List<String>>> identityIds() {
        return Optional.ofNullable(this.identityIds);
    }

    /**
     * The Principal ID for the Service Principal associated with the Managed Service Identity of this Machine Learning Synapse Spark.
     * 
     */
    @Import(name="principalId")
    private @Nullable Output<String> principalId;

    /**
     * @return The Principal ID for the Service Principal associated with the Managed Service Identity of this Machine Learning Synapse Spark.
     * 
     */
    public Optional<Output<String>> principalId() {
        return Optional.ofNullable(this.principalId);
    }

    /**
     * The Tenant ID for the Service Principal associated with the Managed Service Identity of this Machine Learning Synapse Spark.
     * 
     */
    @Import(name="tenantId")
    private @Nullable Output<String> tenantId;

    /**
     * @return The Tenant ID for the Service Principal associated with the Managed Service Identity of this Machine Learning Synapse Spark.
     * 
     */
    public Optional<Output<String>> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    /**
     * Specifies the type of Managed Service Identity that should be configured on this Machine Learning Synapse Spark. Possible values are `SystemAssigned`, `UserAssigned`, `SystemAssigned, UserAssigned` (to enable both).
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Specifies the type of Managed Service Identity that should be configured on this Machine Learning Synapse Spark. Possible values are `SystemAssigned`, `UserAssigned`, `SystemAssigned, UserAssigned` (to enable both).
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private SynapseSparkIdentityArgs() {}

    private SynapseSparkIdentityArgs(SynapseSparkIdentityArgs $) {
        this.identityIds = $.identityIds;
        this.principalId = $.principalId;
        this.tenantId = $.tenantId;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SynapseSparkIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SynapseSparkIdentityArgs $;

        public Builder() {
            $ = new SynapseSparkIdentityArgs();
        }

        public Builder(SynapseSparkIdentityArgs defaults) {
            $ = new SynapseSparkIdentityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param identityIds Specifies a list of User Assigned Managed Identity IDs to be assigned to this Machine Learning Synapse Spark.
         * 
         * @return builder
         * 
         */
        public Builder identityIds(@Nullable Output<List<String>> identityIds) {
            $.identityIds = identityIds;
            return this;
        }

        /**
         * @param identityIds Specifies a list of User Assigned Managed Identity IDs to be assigned to this Machine Learning Synapse Spark.
         * 
         * @return builder
         * 
         */
        public Builder identityIds(List<String> identityIds) {
            return identityIds(Output.of(identityIds));
        }

        /**
         * @param identityIds Specifies a list of User Assigned Managed Identity IDs to be assigned to this Machine Learning Synapse Spark.
         * 
         * @return builder
         * 
         */
        public Builder identityIds(String... identityIds) {
            return identityIds(List.of(identityIds));
        }

        /**
         * @param principalId The Principal ID for the Service Principal associated with the Managed Service Identity of this Machine Learning Synapse Spark.
         * 
         * @return builder
         * 
         */
        public Builder principalId(@Nullable Output<String> principalId) {
            $.principalId = principalId;
            return this;
        }

        /**
         * @param principalId The Principal ID for the Service Principal associated with the Managed Service Identity of this Machine Learning Synapse Spark.
         * 
         * @return builder
         * 
         */
        public Builder principalId(String principalId) {
            return principalId(Output.of(principalId));
        }

        /**
         * @param tenantId The Tenant ID for the Service Principal associated with the Managed Service Identity of this Machine Learning Synapse Spark.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(@Nullable Output<String> tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        /**
         * @param tenantId The Tenant ID for the Service Principal associated with the Managed Service Identity of this Machine Learning Synapse Spark.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(String tenantId) {
            return tenantId(Output.of(tenantId));
        }

        /**
         * @param type Specifies the type of Managed Service Identity that should be configured on this Machine Learning Synapse Spark. Possible values are `SystemAssigned`, `UserAssigned`, `SystemAssigned, UserAssigned` (to enable both).
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Specifies the type of Managed Service Identity that should be configured on this Machine Learning Synapse Spark. Possible values are `SystemAssigned`, `UserAssigned`, `SystemAssigned, UserAssigned` (to enable both).
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public SynapseSparkIdentityArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
