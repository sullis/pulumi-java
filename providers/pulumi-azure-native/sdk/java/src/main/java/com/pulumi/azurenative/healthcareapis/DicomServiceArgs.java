// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.healthcareapis;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DicomServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final DicomServiceArgs Empty = new DicomServiceArgs();

    /**
     * The name of DICOM Service resource.
     * 
     */
    @Import(name="dicomServiceName")
    private @Nullable Output<String> dicomServiceName;

    /**
     * @return The name of DICOM Service resource.
     * 
     */
    public Optional<Output<String>> dicomServiceName() {
        return Optional.ofNullable(this.dicomServiceName);
    }

    /**
     * The resource location.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The resource location.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the resource group that contains the service instance.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group that contains the service instance.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
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
     * The name of workspace resource.
     * 
     */
    @Import(name="workspaceName", required=true)
    private Output<String> workspaceName;

    /**
     * @return The name of workspace resource.
     * 
     */
    public Output<String> workspaceName() {
        return this.workspaceName;
    }

    private DicomServiceArgs() {}

    private DicomServiceArgs(DicomServiceArgs $) {
        this.dicomServiceName = $.dicomServiceName;
        this.location = $.location;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DicomServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DicomServiceArgs $;

        public Builder() {
            $ = new DicomServiceArgs();
        }

        public Builder(DicomServiceArgs defaults) {
            $ = new DicomServiceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dicomServiceName The name of DICOM Service resource.
         * 
         * @return builder
         * 
         */
        public Builder dicomServiceName(@Nullable Output<String> dicomServiceName) {
            $.dicomServiceName = dicomServiceName;
            return this;
        }

        /**
         * @param dicomServiceName The name of DICOM Service resource.
         * 
         * @return builder
         * 
         */
        public Builder dicomServiceName(String dicomServiceName) {
            return dicomServiceName(Output.of(dicomServiceName));
        }

        /**
         * @param location The resource location.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The resource location.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the service instance.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the service instance.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
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
         * @param workspaceName The name of workspace resource.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(Output<String> workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        /**
         * @param workspaceName The name of workspace resource.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(String workspaceName) {
            return workspaceName(Output.of(workspaceName));
        }

        public DicomServiceArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
