// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.customerinsights.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImageUploadUrlForEntityTypeArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetImageUploadUrlForEntityTypeArgs Empty = new GetImageUploadUrlForEntityTypeArgs();

    /**
     * Type of entity. Can be Profile or Interaction.
     * 
     */
    @Import(name="entityType")
    private @Nullable Output<String> entityType;

    /**
     * @return Type of entity. Can be Profile or Interaction.
     * 
     */
    public Optional<Output<String>> entityType() {
        return Optional.ofNullable(this.entityType);
    }

    /**
     * Name of the entity type.
     * 
     */
    @Import(name="entityTypeName")
    private @Nullable Output<String> entityTypeName;

    /**
     * @return Name of the entity type.
     * 
     */
    public Optional<Output<String>> entityTypeName() {
        return Optional.ofNullable(this.entityTypeName);
    }

    /**
     * The name of the hub.
     * 
     */
    @Import(name="hubName", required=true)
    private Output<String> hubName;

    /**
     * @return The name of the hub.
     * 
     */
    public Output<String> hubName() {
        return this.hubName;
    }

    /**
     * Relative path of the image.
     * 
     */
    @Import(name="relativePath")
    private @Nullable Output<String> relativePath;

    /**
     * @return Relative path of the image.
     * 
     */
    public Optional<Output<String>> relativePath() {
        return Optional.ofNullable(this.relativePath);
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

    private GetImageUploadUrlForEntityTypeArgs() {}

    private GetImageUploadUrlForEntityTypeArgs(GetImageUploadUrlForEntityTypeArgs $) {
        this.entityType = $.entityType;
        this.entityTypeName = $.entityTypeName;
        this.hubName = $.hubName;
        this.relativePath = $.relativePath;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImageUploadUrlForEntityTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImageUploadUrlForEntityTypeArgs $;

        public Builder() {
            $ = new GetImageUploadUrlForEntityTypeArgs();
        }

        public Builder(GetImageUploadUrlForEntityTypeArgs defaults) {
            $ = new GetImageUploadUrlForEntityTypeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param entityType Type of entity. Can be Profile or Interaction.
         * 
         * @return builder
         * 
         */
        public Builder entityType(@Nullable Output<String> entityType) {
            $.entityType = entityType;
            return this;
        }

        /**
         * @param entityType Type of entity. Can be Profile or Interaction.
         * 
         * @return builder
         * 
         */
        public Builder entityType(String entityType) {
            return entityType(Output.of(entityType));
        }

        /**
         * @param entityTypeName Name of the entity type.
         * 
         * @return builder
         * 
         */
        public Builder entityTypeName(@Nullable Output<String> entityTypeName) {
            $.entityTypeName = entityTypeName;
            return this;
        }

        /**
         * @param entityTypeName Name of the entity type.
         * 
         * @return builder
         * 
         */
        public Builder entityTypeName(String entityTypeName) {
            return entityTypeName(Output.of(entityTypeName));
        }

        /**
         * @param hubName The name of the hub.
         * 
         * @return builder
         * 
         */
        public Builder hubName(Output<String> hubName) {
            $.hubName = hubName;
            return this;
        }

        /**
         * @param hubName The name of the hub.
         * 
         * @return builder
         * 
         */
        public Builder hubName(String hubName) {
            return hubName(Output.of(hubName));
        }

        /**
         * @param relativePath Relative path of the image.
         * 
         * @return builder
         * 
         */
        public Builder relativePath(@Nullable Output<String> relativePath) {
            $.relativePath = relativePath;
            return this;
        }

        /**
         * @param relativePath Relative path of the image.
         * 
         * @return builder
         * 
         */
        public Builder relativePath(String relativePath) {
            return relativePath(Output.of(relativePath));
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

        public GetImageUploadUrlForEntityTypeArgs build() {
            $.hubName = Objects.requireNonNull($.hubName, "expected parameter 'hubName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
