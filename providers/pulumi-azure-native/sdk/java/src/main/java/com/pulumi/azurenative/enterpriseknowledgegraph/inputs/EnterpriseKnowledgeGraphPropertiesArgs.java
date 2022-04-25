// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.enterpriseknowledgegraph.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The parameters to provide for the EnterpriseKnowledgeGraph.
 * 
 */
public final class EnterpriseKnowledgeGraphPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final EnterpriseKnowledgeGraphPropertiesArgs Empty = new EnterpriseKnowledgeGraphPropertiesArgs();

    /**
     * The description of the EnterpriseKnowledgeGraph
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the EnterpriseKnowledgeGraph
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Specifies the metadata  of the resource.
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<Object> metadata;

    /**
     * @return Specifies the metadata  of the resource.
     * 
     */
    public Optional<Output<Object>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * The state of EnterpriseKnowledgeGraph provisioning
     * 
     */
    @Import(name="provisioningState")
    private @Nullable Output<String> provisioningState;

    /**
     * @return The state of EnterpriseKnowledgeGraph provisioning
     * 
     */
    public Optional<Output<String>> provisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }

    private EnterpriseKnowledgeGraphPropertiesArgs() {}

    private EnterpriseKnowledgeGraphPropertiesArgs(EnterpriseKnowledgeGraphPropertiesArgs $) {
        this.description = $.description;
        this.metadata = $.metadata;
        this.provisioningState = $.provisioningState;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnterpriseKnowledgeGraphPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnterpriseKnowledgeGraphPropertiesArgs $;

        public Builder() {
            $ = new EnterpriseKnowledgeGraphPropertiesArgs();
        }

        public Builder(EnterpriseKnowledgeGraphPropertiesArgs defaults) {
            $ = new EnterpriseKnowledgeGraphPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The description of the EnterpriseKnowledgeGraph
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the EnterpriseKnowledgeGraph
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param metadata Specifies the metadata  of the resource.
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable Output<Object> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata Specifies the metadata  of the resource.
         * 
         * @return builder
         * 
         */
        public Builder metadata(Object metadata) {
            return metadata(Output.of(metadata));
        }

        /**
         * @param provisioningState The state of EnterpriseKnowledgeGraph provisioning
         * 
         * @return builder
         * 
         */
        public Builder provisioningState(@Nullable Output<String> provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        /**
         * @param provisioningState The state of EnterpriseKnowledgeGraph provisioning
         * 
         * @return builder
         * 
         */
        public Builder provisioningState(String provisioningState) {
            return provisioningState(Output.of(provisioningState));
        }

        public EnterpriseKnowledgeGraphPropertiesArgs build() {
            return $;
        }
    }

}
