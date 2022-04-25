// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.operationalinsights;

import com.pulumi.azurenative.operationalinsights.enums.LinkedServiceEntityStatus;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LinkedServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final LinkedServiceArgs Empty = new LinkedServiceArgs();

    /**
     * Name of the linkedServices resource
     * 
     */
    @Import(name="linkedServiceName")
    private @Nullable Output<String> linkedServiceName;

    /**
     * @return Name of the linkedServices resource
     * 
     */
    public Optional<Output<String>> linkedServiceName() {
        return Optional.ofNullable(this.linkedServiceName);
    }

    /**
     * The provisioning state of the linked service.
     * 
     */
    @Import(name="provisioningState")
    private @Nullable Output<Either<String,LinkedServiceEntityStatus>> provisioningState;

    /**
     * @return The provisioning state of the linked service.
     * 
     */
    public Optional<Output<Either<String,LinkedServiceEntityStatus>>> provisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The resource id of the resource that will be linked to the workspace. This should be used for linking resources which require read access
     * 
     */
    @Import(name="resourceId")
    private @Nullable Output<String> resourceId;

    /**
     * @return The resource id of the resource that will be linked to the workspace. This should be used for linking resources which require read access
     * 
     */
    public Optional<Output<String>> resourceId() {
        return Optional.ofNullable(this.resourceId);
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The name of the workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
    private Output<String> workspaceName;

    /**
     * @return The name of the workspace.
     * 
     */
    public Output<String> workspaceName() {
        return this.workspaceName;
    }

    /**
     * The resource id of the resource that will be linked to the workspace. This should be used for linking resources which require write access
     * 
     */
    @Import(name="writeAccessResourceId")
    private @Nullable Output<String> writeAccessResourceId;

    /**
     * @return The resource id of the resource that will be linked to the workspace. This should be used for linking resources which require write access
     * 
     */
    public Optional<Output<String>> writeAccessResourceId() {
        return Optional.ofNullable(this.writeAccessResourceId);
    }

    private LinkedServiceArgs() {}

    private LinkedServiceArgs(LinkedServiceArgs $) {
        this.linkedServiceName = $.linkedServiceName;
        this.provisioningState = $.provisioningState;
        this.resourceGroupName = $.resourceGroupName;
        this.resourceId = $.resourceId;
        this.tags = $.tags;
        this.workspaceName = $.workspaceName;
        this.writeAccessResourceId = $.writeAccessResourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LinkedServiceArgs $;

        public Builder() {
            $ = new LinkedServiceArgs();
        }

        public Builder(LinkedServiceArgs defaults) {
            $ = new LinkedServiceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param linkedServiceName Name of the linkedServices resource
         * 
         * @return builder
         * 
         */
        public Builder linkedServiceName(@Nullable Output<String> linkedServiceName) {
            $.linkedServiceName = linkedServiceName;
            return this;
        }

        /**
         * @param linkedServiceName Name of the linkedServices resource
         * 
         * @return builder
         * 
         */
        public Builder linkedServiceName(String linkedServiceName) {
            return linkedServiceName(Output.of(linkedServiceName));
        }

        /**
         * @param provisioningState The provisioning state of the linked service.
         * 
         * @return builder
         * 
         */
        public Builder provisioningState(@Nullable Output<Either<String,LinkedServiceEntityStatus>> provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        /**
         * @param provisioningState The provisioning state of the linked service.
         * 
         * @return builder
         * 
         */
        public Builder provisioningState(Either<String,LinkedServiceEntityStatus> provisioningState) {
            return provisioningState(Output.of(provisioningState));
        }

        /**
         * @param provisioningState The provisioning state of the linked service.
         * 
         * @return builder
         * 
         */
        public Builder provisioningState(String provisioningState) {
            return provisioningState(Either.ofLeft(provisioningState));
        }

        /**
         * @param provisioningState The provisioning state of the linked service.
         * 
         * @return builder
         * 
         */
        public Builder provisioningState(LinkedServiceEntityStatus provisioningState) {
            return provisioningState(Either.ofRight(provisioningState));
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param resourceId The resource id of the resource that will be linked to the workspace. This should be used for linking resources which require read access
         * 
         * @return builder
         * 
         */
        public Builder resourceId(@Nullable Output<String> resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        /**
         * @param resourceId The resource id of the resource that will be linked to the workspace. This should be used for linking resources which require read access
         * 
         * @return builder
         * 
         */
        public Builder resourceId(String resourceId) {
            return resourceId(Output.of(resourceId));
        }

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param workspaceName The name of the workspace.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(Output<String> workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        /**
         * @param workspaceName The name of the workspace.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(String workspaceName) {
            return workspaceName(Output.of(workspaceName));
        }

        /**
         * @param writeAccessResourceId The resource id of the resource that will be linked to the workspace. This should be used for linking resources which require write access
         * 
         * @return builder
         * 
         */
        public Builder writeAccessResourceId(@Nullable Output<String> writeAccessResourceId) {
            $.writeAccessResourceId = writeAccessResourceId;
            return this;
        }

        /**
         * @param writeAccessResourceId The resource id of the resource that will be linked to the workspace. This should be used for linking resources which require write access
         * 
         * @return builder
         * 
         */
        public Builder writeAccessResourceId(String writeAccessResourceId) {
            return writeAccessResourceId(Output.of(writeAccessResourceId));
        }

        public LinkedServiceArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
