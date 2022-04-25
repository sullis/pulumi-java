// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.virtualmachineimages.inputs;

import com.pulumi.azurenative.virtualmachineimages.enums.SharedImageStorageAccountType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Distribute via Shared Image Gallery.
 * 
 */
public final class ImageTemplateSharedImageDistributorArgs extends com.pulumi.resources.ResourceArgs {

    public static final ImageTemplateSharedImageDistributorArgs Empty = new ImageTemplateSharedImageDistributorArgs();

    /**
     * Tags that will be applied to the artifact once it has been created/updated by the distributor.
     * 
     */
    @Import(name="artifactTags")
    private @Nullable Output<Map<String,String>> artifactTags;

    /**
     * @return Tags that will be applied to the artifact once it has been created/updated by the distributor.
     * 
     */
    public Optional<Output<Map<String,String>>> artifactTags() {
        return Optional.ofNullable(this.artifactTags);
    }

    /**
     * Flag that indicates whether created image version should be excluded from latest. Omit to use the default (false).
     * 
     */
    @Import(name="excludeFromLatest")
    private @Nullable Output<Boolean> excludeFromLatest;

    /**
     * @return Flag that indicates whether created image version should be excluded from latest. Omit to use the default (false).
     * 
     */
    public Optional<Output<Boolean>> excludeFromLatest() {
        return Optional.ofNullable(this.excludeFromLatest);
    }

    /**
     * Resource Id of the Shared Image Gallery image
     * 
     */
    @Import(name="galleryImageId", required=true)
    private Output<String> galleryImageId;

    /**
     * @return Resource Id of the Shared Image Gallery image
     * 
     */
    public Output<String> galleryImageId() {
        return this.galleryImageId;
    }

    /**
     * A list of regions that the image will be replicated to
     * 
     */
    @Import(name="replicationRegions", required=true)
    private Output<List<String>> replicationRegions;

    /**
     * @return A list of regions that the image will be replicated to
     * 
     */
    public Output<List<String>> replicationRegions() {
        return this.replicationRegions;
    }

    /**
     * The name to be used for the associated RunOutput.
     * 
     */
    @Import(name="runOutputName", required=true)
    private Output<String> runOutputName;

    /**
     * @return The name to be used for the associated RunOutput.
     * 
     */
    public Output<String> runOutputName() {
        return this.runOutputName;
    }

    /**
     * Storage account type to be used to store the shared image. Omit to use the default (Standard_LRS).
     * 
     */
    @Import(name="storageAccountType")
    private @Nullable Output<Either<String,SharedImageStorageAccountType>> storageAccountType;

    /**
     * @return Storage account type to be used to store the shared image. Omit to use the default (Standard_LRS).
     * 
     */
    public Optional<Output<Either<String,SharedImageStorageAccountType>>> storageAccountType() {
        return Optional.ofNullable(this.storageAccountType);
    }

    /**
     * Type of distribution.
     * Expected value is &#39;SharedImage&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of distribution.
     * Expected value is &#39;SharedImage&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private ImageTemplateSharedImageDistributorArgs() {}

    private ImageTemplateSharedImageDistributorArgs(ImageTemplateSharedImageDistributorArgs $) {
        this.artifactTags = $.artifactTags;
        this.excludeFromLatest = $.excludeFromLatest;
        this.galleryImageId = $.galleryImageId;
        this.replicationRegions = $.replicationRegions;
        this.runOutputName = $.runOutputName;
        this.storageAccountType = $.storageAccountType;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ImageTemplateSharedImageDistributorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ImageTemplateSharedImageDistributorArgs $;

        public Builder() {
            $ = new ImageTemplateSharedImageDistributorArgs();
        }

        public Builder(ImageTemplateSharedImageDistributorArgs defaults) {
            $ = new ImageTemplateSharedImageDistributorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param artifactTags Tags that will be applied to the artifact once it has been created/updated by the distributor.
         * 
         * @return builder
         * 
         */
        public Builder artifactTags(@Nullable Output<Map<String,String>> artifactTags) {
            $.artifactTags = artifactTags;
            return this;
        }

        /**
         * @param artifactTags Tags that will be applied to the artifact once it has been created/updated by the distributor.
         * 
         * @return builder
         * 
         */
        public Builder artifactTags(Map<String,String> artifactTags) {
            return artifactTags(Output.of(artifactTags));
        }

        /**
         * @param excludeFromLatest Flag that indicates whether created image version should be excluded from latest. Omit to use the default (false).
         * 
         * @return builder
         * 
         */
        public Builder excludeFromLatest(@Nullable Output<Boolean> excludeFromLatest) {
            $.excludeFromLatest = excludeFromLatest;
            return this;
        }

        /**
         * @param excludeFromLatest Flag that indicates whether created image version should be excluded from latest. Omit to use the default (false).
         * 
         * @return builder
         * 
         */
        public Builder excludeFromLatest(Boolean excludeFromLatest) {
            return excludeFromLatest(Output.of(excludeFromLatest));
        }

        /**
         * @param galleryImageId Resource Id of the Shared Image Gallery image
         * 
         * @return builder
         * 
         */
        public Builder galleryImageId(Output<String> galleryImageId) {
            $.galleryImageId = galleryImageId;
            return this;
        }

        /**
         * @param galleryImageId Resource Id of the Shared Image Gallery image
         * 
         * @return builder
         * 
         */
        public Builder galleryImageId(String galleryImageId) {
            return galleryImageId(Output.of(galleryImageId));
        }

        /**
         * @param replicationRegions A list of regions that the image will be replicated to
         * 
         * @return builder
         * 
         */
        public Builder replicationRegions(Output<List<String>> replicationRegions) {
            $.replicationRegions = replicationRegions;
            return this;
        }

        /**
         * @param replicationRegions A list of regions that the image will be replicated to
         * 
         * @return builder
         * 
         */
        public Builder replicationRegions(List<String> replicationRegions) {
            return replicationRegions(Output.of(replicationRegions));
        }

        /**
         * @param replicationRegions A list of regions that the image will be replicated to
         * 
         * @return builder
         * 
         */
        public Builder replicationRegions(String... replicationRegions) {
            return replicationRegions(List.of(replicationRegions));
        }

        /**
         * @param runOutputName The name to be used for the associated RunOutput.
         * 
         * @return builder
         * 
         */
        public Builder runOutputName(Output<String> runOutputName) {
            $.runOutputName = runOutputName;
            return this;
        }

        /**
         * @param runOutputName The name to be used for the associated RunOutput.
         * 
         * @return builder
         * 
         */
        public Builder runOutputName(String runOutputName) {
            return runOutputName(Output.of(runOutputName));
        }

        /**
         * @param storageAccountType Storage account type to be used to store the shared image. Omit to use the default (Standard_LRS).
         * 
         * @return builder
         * 
         */
        public Builder storageAccountType(@Nullable Output<Either<String,SharedImageStorageAccountType>> storageAccountType) {
            $.storageAccountType = storageAccountType;
            return this;
        }

        /**
         * @param storageAccountType Storage account type to be used to store the shared image. Omit to use the default (Standard_LRS).
         * 
         * @return builder
         * 
         */
        public Builder storageAccountType(Either<String,SharedImageStorageAccountType> storageAccountType) {
            return storageAccountType(Output.of(storageAccountType));
        }

        /**
         * @param storageAccountType Storage account type to be used to store the shared image. Omit to use the default (Standard_LRS).
         * 
         * @return builder
         * 
         */
        public Builder storageAccountType(String storageAccountType) {
            return storageAccountType(Either.ofLeft(storageAccountType));
        }

        /**
         * @param storageAccountType Storage account type to be used to store the shared image. Omit to use the default (Standard_LRS).
         * 
         * @return builder
         * 
         */
        public Builder storageAccountType(SharedImageStorageAccountType storageAccountType) {
            return storageAccountType(Either.ofRight(storageAccountType));
        }

        /**
         * @param type Type of distribution.
         * Expected value is &#39;SharedImage&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of distribution.
         * Expected value is &#39;SharedImage&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ImageTemplateSharedImageDistributorArgs build() {
            $.excludeFromLatest = Codegen.booleanProp("excludeFromLatest").output().arg($.excludeFromLatest).def(false).getNullable();
            $.galleryImageId = Objects.requireNonNull($.galleryImageId, "expected parameter 'galleryImageId' to be non-null");
            $.replicationRegions = Objects.requireNonNull($.replicationRegions, "expected parameter 'replicationRegions' to be non-null");
            $.runOutputName = Objects.requireNonNull($.runOutputName, "expected parameter 'runOutputName' to be non-null");
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
