// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.enums.LinkedServiceLinkType;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * LinkedService specific properties.
 * 
 */
public final class LinkedServicePropsArgs extends io.pulumi.resources.ResourceArgs {

    public static final LinkedServicePropsArgs Empty = new LinkedServicePropsArgs();

    /**
     * The creation time of the linked service.
     * 
     */
    @InputImport(name="createdTime")
    private final @Nullable Input<String> createdTime;

    public Input<String> getCreatedTime() {
        return this.createdTime == null ? Input.empty() : this.createdTime;
    }

    /**
     * Type of the link target.
     * 
     */
    @InputImport(name="linkType")
    private final @Nullable Input<LinkedServiceLinkType> linkType;

    public Input<LinkedServiceLinkType> getLinkType() {
        return this.linkType == null ? Input.empty() : this.linkType;
    }

    /**
     * ResourceId of the link target of the linked service.
     * 
     */
    @InputImport(name="linkedServiceResourceId", required=true)
    private final Input<String> linkedServiceResourceId;

    public Input<String> getLinkedServiceResourceId() {
        return this.linkedServiceResourceId;
    }

    /**
     * The last modified time of the linked service.
     * 
     */
    @InputImport(name="modifiedTime")
    private final @Nullable Input<String> modifiedTime;

    public Input<String> getModifiedTime() {
        return this.modifiedTime == null ? Input.empty() : this.modifiedTime;
    }

    public LinkedServicePropsArgs(
        @Nullable Input<String> createdTime,
        @Nullable Input<LinkedServiceLinkType> linkType,
        Input<String> linkedServiceResourceId,
        @Nullable Input<String> modifiedTime) {
        this.createdTime = createdTime;
        this.linkType = linkType;
        this.linkedServiceResourceId = Objects.requireNonNull(linkedServiceResourceId, "expected parameter 'linkedServiceResourceId' to be non-null");
        this.modifiedTime = modifiedTime;
    }

    private LinkedServicePropsArgs() {
        this.createdTime = Input.empty();
        this.linkType = Input.empty();
        this.linkedServiceResourceId = Input.empty();
        this.modifiedTime = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinkedServicePropsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> createdTime;
        private @Nullable Input<LinkedServiceLinkType> linkType;
        private Input<String> linkedServiceResourceId;
        private @Nullable Input<String> modifiedTime;

        public Builder() {
    	      // Empty
        }

        public Builder(LinkedServicePropsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdTime = defaults.createdTime;
    	      this.linkType = defaults.linkType;
    	      this.linkedServiceResourceId = defaults.linkedServiceResourceId;
    	      this.modifiedTime = defaults.modifiedTime;
        }

        public Builder setCreatedTime(@Nullable Input<String> createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        public Builder setCreatedTime(@Nullable String createdTime) {
            this.createdTime = Input.ofNullable(createdTime);
            return this;
        }

        public Builder setLinkType(@Nullable Input<LinkedServiceLinkType> linkType) {
            this.linkType = linkType;
            return this;
        }

        public Builder setLinkType(@Nullable LinkedServiceLinkType linkType) {
            this.linkType = Input.ofNullable(linkType);
            return this;
        }

        public Builder setLinkedServiceResourceId(Input<String> linkedServiceResourceId) {
            this.linkedServiceResourceId = Objects.requireNonNull(linkedServiceResourceId);
            return this;
        }

        public Builder setLinkedServiceResourceId(String linkedServiceResourceId) {
            this.linkedServiceResourceId = Input.of(Objects.requireNonNull(linkedServiceResourceId));
            return this;
        }

        public Builder setModifiedTime(@Nullable Input<String> modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }

        public Builder setModifiedTime(@Nullable String modifiedTime) {
            this.modifiedTime = Input.ofNullable(modifiedTime);
            return this;
        }

        public LinkedServicePropsArgs build() {
            return new LinkedServicePropsArgs(createdTime, linkType, linkedServiceResourceId, modifiedTime);
        }
    }
}
