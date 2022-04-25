// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute;

import com.pulumi.azurenative.compute.enums.HyperVGeneration;
import com.pulumi.azurenative.compute.enums.OperatingSystemStateTypes;
import com.pulumi.azurenative.compute.enums.OperatingSystemTypes;
import com.pulumi.azurenative.compute.inputs.DisallowedArgs;
import com.pulumi.azurenative.compute.inputs.GalleryImageFeatureArgs;
import com.pulumi.azurenative.compute.inputs.GalleryImageIdentifierArgs;
import com.pulumi.azurenative.compute.inputs.ImagePurchasePlanArgs;
import com.pulumi.azurenative.compute.inputs.RecommendedMachineConfigurationArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GalleryImageArgs extends com.pulumi.resources.ResourceArgs {

    public static final GalleryImageArgs Empty = new GalleryImageArgs();

    /**
     * The description of this gallery image definition resource. This property is updatable.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of this gallery image definition resource. This property is updatable.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Describes the disallowed disk types.
     * 
     */
    @Import(name="disallowed")
    private @Nullable Output<DisallowedArgs> disallowed;

    /**
     * @return Describes the disallowed disk types.
     * 
     */
    public Optional<Output<DisallowedArgs>> disallowed() {
        return Optional.ofNullable(this.disallowed);
    }

    /**
     * The end of life date of the gallery image definition. This property can be used for decommissioning purposes. This property is updatable.
     * 
     */
    @Import(name="endOfLifeDate")
    private @Nullable Output<String> endOfLifeDate;

    /**
     * @return The end of life date of the gallery image definition. This property can be used for decommissioning purposes. This property is updatable.
     * 
     */
    public Optional<Output<String>> endOfLifeDate() {
        return Optional.ofNullable(this.endOfLifeDate);
    }

    /**
     * The Eula agreement for the gallery image definition.
     * 
     */
    @Import(name="eula")
    private @Nullable Output<String> eula;

    /**
     * @return The Eula agreement for the gallery image definition.
     * 
     */
    public Optional<Output<String>> eula() {
        return Optional.ofNullable(this.eula);
    }

    /**
     * A list of gallery image features.
     * 
     */
    @Import(name="features")
    private @Nullable Output<List<GalleryImageFeatureArgs>> features;

    /**
     * @return A list of gallery image features.
     * 
     */
    public Optional<Output<List<GalleryImageFeatureArgs>>> features() {
        return Optional.ofNullable(this.features);
    }

    /**
     * The name of the gallery image definition to be created or updated. The allowed characters are alphabets and numbers with dots, dashes, and periods allowed in the middle. The maximum length is 80 characters.
     * 
     */
    @Import(name="galleryImageName")
    private @Nullable Output<String> galleryImageName;

    /**
     * @return The name of the gallery image definition to be created or updated. The allowed characters are alphabets and numbers with dots, dashes, and periods allowed in the middle. The maximum length is 80 characters.
     * 
     */
    public Optional<Output<String>> galleryImageName() {
        return Optional.ofNullable(this.galleryImageName);
    }

    /**
     * The name of the Shared Image Gallery in which the Image Definition is to be created.
     * 
     */
    @Import(name="galleryName", required=true)
    private Output<String> galleryName;

    /**
     * @return The name of the Shared Image Gallery in which the Image Definition is to be created.
     * 
     */
    public Output<String> galleryName() {
        return this.galleryName;
    }

    /**
     * The hypervisor generation of the Virtual Machine. Applicable to OS disks only.
     * 
     */
    @Import(name="hyperVGeneration")
    private @Nullable Output<Either<String,HyperVGeneration>> hyperVGeneration;

    /**
     * @return The hypervisor generation of the Virtual Machine. Applicable to OS disks only.
     * 
     */
    public Optional<Output<Either<String,HyperVGeneration>>> hyperVGeneration() {
        return Optional.ofNullable(this.hyperVGeneration);
    }

    /**
     * This is the gallery image definition identifier.
     * 
     */
    @Import(name="identifier", required=true)
    private Output<GalleryImageIdentifierArgs> identifier;

    /**
     * @return This is the gallery image definition identifier.
     * 
     */
    public Output<GalleryImageIdentifierArgs> identifier() {
        return this.identifier;
    }

    /**
     * Resource location
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Resource location
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * This property allows the user to specify whether the virtual machines created under this image are &#39;Generalized&#39; or &#39;Specialized&#39;.
     * 
     */
    @Import(name="osState", required=true)
    private Output<OperatingSystemStateTypes> osState;

    /**
     * @return This property allows the user to specify whether the virtual machines created under this image are &#39;Generalized&#39; or &#39;Specialized&#39;.
     * 
     */
    public Output<OperatingSystemStateTypes> osState() {
        return this.osState;
    }

    /**
     * This property allows you to specify the type of the OS that is included in the disk when creating a VM from a managed image. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **Windows** &lt;br&gt;&lt;br&gt; **Linux**
     * 
     */
    @Import(name="osType", required=true)
    private Output<OperatingSystemTypes> osType;

    /**
     * @return This property allows you to specify the type of the OS that is included in the disk when creating a VM from a managed image. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **Windows** &lt;br&gt;&lt;br&gt; **Linux**
     * 
     */
    public Output<OperatingSystemTypes> osType() {
        return this.osType;
    }

    /**
     * The privacy statement uri.
     * 
     */
    @Import(name="privacyStatementUri")
    private @Nullable Output<String> privacyStatementUri;

    /**
     * @return The privacy statement uri.
     * 
     */
    public Optional<Output<String>> privacyStatementUri() {
        return Optional.ofNullable(this.privacyStatementUri);
    }

    /**
     * Describes the gallery image definition purchase plan. This is used by marketplace images.
     * 
     */
    @Import(name="purchasePlan")
    private @Nullable Output<ImagePurchasePlanArgs> purchasePlan;

    /**
     * @return Describes the gallery image definition purchase plan. This is used by marketplace images.
     * 
     */
    public Optional<Output<ImagePurchasePlanArgs>> purchasePlan() {
        return Optional.ofNullable(this.purchasePlan);
    }

    /**
     * The properties describe the recommended machine configuration for this Image Definition. These properties are updatable.
     * 
     */
    @Import(name="recommended")
    private @Nullable Output<RecommendedMachineConfigurationArgs> recommended;

    /**
     * @return The properties describe the recommended machine configuration for this Image Definition. These properties are updatable.
     * 
     */
    public Optional<Output<RecommendedMachineConfigurationArgs>> recommended() {
        return Optional.ofNullable(this.recommended);
    }

    /**
     * The release note uri.
     * 
     */
    @Import(name="releaseNoteUri")
    private @Nullable Output<String> releaseNoteUri;

    /**
     * @return The release note uri.
     * 
     */
    public Optional<Output<String>> releaseNoteUri() {
        return Optional.ofNullable(this.releaseNoteUri);
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
     * Resource tags
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Resource tags
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GalleryImageArgs() {}

    private GalleryImageArgs(GalleryImageArgs $) {
        this.description = $.description;
        this.disallowed = $.disallowed;
        this.endOfLifeDate = $.endOfLifeDate;
        this.eula = $.eula;
        this.features = $.features;
        this.galleryImageName = $.galleryImageName;
        this.galleryName = $.galleryName;
        this.hyperVGeneration = $.hyperVGeneration;
        this.identifier = $.identifier;
        this.location = $.location;
        this.osState = $.osState;
        this.osType = $.osType;
        this.privacyStatementUri = $.privacyStatementUri;
        this.purchasePlan = $.purchasePlan;
        this.recommended = $.recommended;
        this.releaseNoteUri = $.releaseNoteUri;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GalleryImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GalleryImageArgs $;

        public Builder() {
            $ = new GalleryImageArgs();
        }

        public Builder(GalleryImageArgs defaults) {
            $ = new GalleryImageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The description of this gallery image definition resource. This property is updatable.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of this gallery image definition resource. This property is updatable.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param disallowed Describes the disallowed disk types.
         * 
         * @return builder
         * 
         */
        public Builder disallowed(@Nullable Output<DisallowedArgs> disallowed) {
            $.disallowed = disallowed;
            return this;
        }

        /**
         * @param disallowed Describes the disallowed disk types.
         * 
         * @return builder
         * 
         */
        public Builder disallowed(DisallowedArgs disallowed) {
            return disallowed(Output.of(disallowed));
        }

        /**
         * @param endOfLifeDate The end of life date of the gallery image definition. This property can be used for decommissioning purposes. This property is updatable.
         * 
         * @return builder
         * 
         */
        public Builder endOfLifeDate(@Nullable Output<String> endOfLifeDate) {
            $.endOfLifeDate = endOfLifeDate;
            return this;
        }

        /**
         * @param endOfLifeDate The end of life date of the gallery image definition. This property can be used for decommissioning purposes. This property is updatable.
         * 
         * @return builder
         * 
         */
        public Builder endOfLifeDate(String endOfLifeDate) {
            return endOfLifeDate(Output.of(endOfLifeDate));
        }

        /**
         * @param eula The Eula agreement for the gallery image definition.
         * 
         * @return builder
         * 
         */
        public Builder eula(@Nullable Output<String> eula) {
            $.eula = eula;
            return this;
        }

        /**
         * @param eula The Eula agreement for the gallery image definition.
         * 
         * @return builder
         * 
         */
        public Builder eula(String eula) {
            return eula(Output.of(eula));
        }

        /**
         * @param features A list of gallery image features.
         * 
         * @return builder
         * 
         */
        public Builder features(@Nullable Output<List<GalleryImageFeatureArgs>> features) {
            $.features = features;
            return this;
        }

        /**
         * @param features A list of gallery image features.
         * 
         * @return builder
         * 
         */
        public Builder features(List<GalleryImageFeatureArgs> features) {
            return features(Output.of(features));
        }

        /**
         * @param features A list of gallery image features.
         * 
         * @return builder
         * 
         */
        public Builder features(GalleryImageFeatureArgs... features) {
            return features(List.of(features));
        }

        /**
         * @param galleryImageName The name of the gallery image definition to be created or updated. The allowed characters are alphabets and numbers with dots, dashes, and periods allowed in the middle. The maximum length is 80 characters.
         * 
         * @return builder
         * 
         */
        public Builder galleryImageName(@Nullable Output<String> galleryImageName) {
            $.galleryImageName = galleryImageName;
            return this;
        }

        /**
         * @param galleryImageName The name of the gallery image definition to be created or updated. The allowed characters are alphabets and numbers with dots, dashes, and periods allowed in the middle. The maximum length is 80 characters.
         * 
         * @return builder
         * 
         */
        public Builder galleryImageName(String galleryImageName) {
            return galleryImageName(Output.of(galleryImageName));
        }

        /**
         * @param galleryName The name of the Shared Image Gallery in which the Image Definition is to be created.
         * 
         * @return builder
         * 
         */
        public Builder galleryName(Output<String> galleryName) {
            $.galleryName = galleryName;
            return this;
        }

        /**
         * @param galleryName The name of the Shared Image Gallery in which the Image Definition is to be created.
         * 
         * @return builder
         * 
         */
        public Builder galleryName(String galleryName) {
            return galleryName(Output.of(galleryName));
        }

        /**
         * @param hyperVGeneration The hypervisor generation of the Virtual Machine. Applicable to OS disks only.
         * 
         * @return builder
         * 
         */
        public Builder hyperVGeneration(@Nullable Output<Either<String,HyperVGeneration>> hyperVGeneration) {
            $.hyperVGeneration = hyperVGeneration;
            return this;
        }

        /**
         * @param hyperVGeneration The hypervisor generation of the Virtual Machine. Applicable to OS disks only.
         * 
         * @return builder
         * 
         */
        public Builder hyperVGeneration(Either<String,HyperVGeneration> hyperVGeneration) {
            return hyperVGeneration(Output.of(hyperVGeneration));
        }

        /**
         * @param hyperVGeneration The hypervisor generation of the Virtual Machine. Applicable to OS disks only.
         * 
         * @return builder
         * 
         */
        public Builder hyperVGeneration(String hyperVGeneration) {
            return hyperVGeneration(Either.ofLeft(hyperVGeneration));
        }

        /**
         * @param hyperVGeneration The hypervisor generation of the Virtual Machine. Applicable to OS disks only.
         * 
         * @return builder
         * 
         */
        public Builder hyperVGeneration(HyperVGeneration hyperVGeneration) {
            return hyperVGeneration(Either.ofRight(hyperVGeneration));
        }

        /**
         * @param identifier This is the gallery image definition identifier.
         * 
         * @return builder
         * 
         */
        public Builder identifier(Output<GalleryImageIdentifierArgs> identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param identifier This is the gallery image definition identifier.
         * 
         * @return builder
         * 
         */
        public Builder identifier(GalleryImageIdentifierArgs identifier) {
            return identifier(Output.of(identifier));
        }

        /**
         * @param location Resource location
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Resource location
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param osState This property allows the user to specify whether the virtual machines created under this image are &#39;Generalized&#39; or &#39;Specialized&#39;.
         * 
         * @return builder
         * 
         */
        public Builder osState(Output<OperatingSystemStateTypes> osState) {
            $.osState = osState;
            return this;
        }

        /**
         * @param osState This property allows the user to specify whether the virtual machines created under this image are &#39;Generalized&#39; or &#39;Specialized&#39;.
         * 
         * @return builder
         * 
         */
        public Builder osState(OperatingSystemStateTypes osState) {
            return osState(Output.of(osState));
        }

        /**
         * @param osType This property allows you to specify the type of the OS that is included in the disk when creating a VM from a managed image. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **Windows** &lt;br&gt;&lt;br&gt; **Linux**
         * 
         * @return builder
         * 
         */
        public Builder osType(Output<OperatingSystemTypes> osType) {
            $.osType = osType;
            return this;
        }

        /**
         * @param osType This property allows you to specify the type of the OS that is included in the disk when creating a VM from a managed image. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **Windows** &lt;br&gt;&lt;br&gt; **Linux**
         * 
         * @return builder
         * 
         */
        public Builder osType(OperatingSystemTypes osType) {
            return osType(Output.of(osType));
        }

        /**
         * @param privacyStatementUri The privacy statement uri.
         * 
         * @return builder
         * 
         */
        public Builder privacyStatementUri(@Nullable Output<String> privacyStatementUri) {
            $.privacyStatementUri = privacyStatementUri;
            return this;
        }

        /**
         * @param privacyStatementUri The privacy statement uri.
         * 
         * @return builder
         * 
         */
        public Builder privacyStatementUri(String privacyStatementUri) {
            return privacyStatementUri(Output.of(privacyStatementUri));
        }

        /**
         * @param purchasePlan Describes the gallery image definition purchase plan. This is used by marketplace images.
         * 
         * @return builder
         * 
         */
        public Builder purchasePlan(@Nullable Output<ImagePurchasePlanArgs> purchasePlan) {
            $.purchasePlan = purchasePlan;
            return this;
        }

        /**
         * @param purchasePlan Describes the gallery image definition purchase plan. This is used by marketplace images.
         * 
         * @return builder
         * 
         */
        public Builder purchasePlan(ImagePurchasePlanArgs purchasePlan) {
            return purchasePlan(Output.of(purchasePlan));
        }

        /**
         * @param recommended The properties describe the recommended machine configuration for this Image Definition. These properties are updatable.
         * 
         * @return builder
         * 
         */
        public Builder recommended(@Nullable Output<RecommendedMachineConfigurationArgs> recommended) {
            $.recommended = recommended;
            return this;
        }

        /**
         * @param recommended The properties describe the recommended machine configuration for this Image Definition. These properties are updatable.
         * 
         * @return builder
         * 
         */
        public Builder recommended(RecommendedMachineConfigurationArgs recommended) {
            return recommended(Output.of(recommended));
        }

        /**
         * @param releaseNoteUri The release note uri.
         * 
         * @return builder
         * 
         */
        public Builder releaseNoteUri(@Nullable Output<String> releaseNoteUri) {
            $.releaseNoteUri = releaseNoteUri;
            return this;
        }

        /**
         * @param releaseNoteUri The release note uri.
         * 
         * @return builder
         * 
         */
        public Builder releaseNoteUri(String releaseNoteUri) {
            return releaseNoteUri(Output.of(releaseNoteUri));
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
         * @param tags Resource tags
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Resource tags
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public GalleryImageArgs build() {
            $.galleryName = Objects.requireNonNull($.galleryName, "expected parameter 'galleryName' to be non-null");
            $.identifier = Objects.requireNonNull($.identifier, "expected parameter 'identifier' to be non-null");
            $.osState = Objects.requireNonNull($.osState, "expected parameter 'osState' to be non-null");
            $.osType = Objects.requireNonNull($.osType, "expected parameter 'osType' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
